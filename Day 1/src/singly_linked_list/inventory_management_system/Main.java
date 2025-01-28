package singly_linked_list.inventory_management_system;

public class Main {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addItemAtEnd("Item1", 101, 10, 20.5);
        inventory.addItemAtEnd("Item2", 102, 5, 50.0);
        inventory.addItemAtBeginning("Item3", 103, 8, 30.0);
        inventory.displayInventory();

        inventory.removeItemByID(102);
        inventory.updateQuantityByID(101, 15);
        inventory.displayInventory();

        inventory.sortInventoryByName();
        inventory.displayInventory();

        inventory.calculateTotalValue();
    }
}
