package singly_linked_list.inventory_management_system;

class InventoryItem {
    String itemName;
    int itemID;
    int quantity;
    double price;
    InventoryItem next;

    InventoryItem(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}