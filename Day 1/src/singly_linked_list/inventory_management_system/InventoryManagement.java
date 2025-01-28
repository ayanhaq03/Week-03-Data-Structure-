package singly_linked_list.inventory_management_system;


class InventoryManagement {
    private InventoryItem head;

    // Add an item at the beginning
    public void addItemAtBeginning(String itemName, int itemID, int quantity, double price) {
        InventoryItem newItem = new InventoryItem(itemName, itemID, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add an item at the end
    public void addItemAtEnd(String itemName, int itemID, int quantity, double price) {
        InventoryItem newItem = new InventoryItem(itemName, itemID, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        InventoryItem current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newItem;
    }

    // Add an item at a specific position
    public void addItemAtPosition(String itemName, int itemID, int quantity, double price, int position) {
        InventoryItem newItem = new InventoryItem(itemName, itemID, quantity, price);
        if (position == 0) {
            addItemAtBeginning(itemName, itemID, quantity, price);
            return;
        }
        InventoryItem current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newItem.next = current.next;
        current.next = newItem;
    }

    // Remove an item based on Item ID
    public void removeItemByID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemID == itemID) {
            head = head.next;
            return;
        }
        InventoryItem current = head;
        while (current.next != null && current.next.itemID != itemID) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Item with ID " + itemID + " not found.");
        } else {
            current.next = current.next.next;
        }
    }

    // Update the quantity of an item by Item ID
    public void updateQuantityByID(int itemID, int newQuantity) {
        InventoryItem current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    // Search for an item by Item ID or Item Name
    public void searchItem(int itemID, String itemName) {
        InventoryItem current = head;
        boolean found = false;
        while (current != null) {
            if (current.itemID == itemID || current.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Found: " + current.itemName + " (ID: " + current.itemID + "), Quantity: " + current.quantity + ", Price: " + current.price);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // Calculate and display total value of inventory
    public void calculateTotalValue() {
        InventoryItem current = head;
        double totalValue = 0;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    // Sort inventory by Item Name (ascending order)
    public void sortInventoryByName() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, "name");
    }

    // Sort inventory by Price (ascending order)
    public void sortInventoryByPrice() {
        if (head == null || head.next == null) return;
        head = mergeSort(head, "price");
    }

    private InventoryItem mergeSort(InventoryItem node, String criteria) {
        if (node == null || node.next == null) return node;

        InventoryItem middle = getMiddle(node);
        InventoryItem nextOfMiddle = middle.next;
        middle.next = null;

        InventoryItem left = mergeSort(node, criteria);
        InventoryItem right = mergeSort(nextOfMiddle, criteria);

        return merge(left, right, criteria);
    }

    private InventoryItem merge(InventoryItem left, InventoryItem right, String criteria) {
        if (left == null) return right;
        if (right == null) return left;

        InventoryItem result;
        if (criteria.equals("name")) {
            if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
                result = left;
                result.next = merge(left.next, right, criteria);
            } else {
                result = right;
                result.next = merge(left, right.next, criteria);
            }
        } else { // "price"
            if (left.price <= right.price) {
                result = left;
                result.next = merge(left.next, right, criteria);
            } else {
                result = right;
                result.next = merge(left, right.next, criteria);
            }
        }
        return result;
    }

    private InventoryItem getMiddle(InventoryItem node) {
        if (node == null) return node;

        InventoryItem slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display inventory
    public void displayInventory() {
        InventoryItem current = head;
        System.out.println("Inventory List:");
        while (current != null) {
            System.out.println(current.itemName + " (ID: " + current.itemID + "), Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}