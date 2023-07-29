package net.altarise.game.items;

import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public interface IItem {


    String getDisplayName();
    List<String> getLore();
    Material getMaterial();

    int getCritChance();
    int getCritDamage();
    int getStrength();
    int getDefense();
    int getSpeed();

    HashMap<Action, Consumer<PlayerInteractEvent>> getActions();

    enum Action {
        RIGHT_CLICK, LEFT_CLICK, SHIFT_RIGHT_CLICK, SHIFT_LEFT_CLICK, SHIFT_CLICK, CLICK, SHIFT, JUMP, DROP, PICKUP, PASSIVE;
    }
}
