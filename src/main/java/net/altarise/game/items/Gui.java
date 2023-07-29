package net.altarise.game.items;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class Gui implements InventoryHolder {


    private final Inventory inventory;


    public Gui() {
        this.inventory = Bukkit.createInventory(this, 9, "§6§lMenu Items");
    }

    public void addItem(ItemStack item) {
        inventory.addItem(item);
    }





    @Override
    public Inventory getInventory() {
        return inventory;
    }


    public void open(Player player) {

    }



}
