package net.altarise.game.items.weapons;

import net.altarise.game.items.IItem;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class WoodenSword implements IItem {

    @Override
    public String getDisplayName() {
        return "Epee en bois";
    }

    @Override
    public List<String> getLore() {
        return Arrays.asList("Une épée en bois", "C'est pas très puissant", "Mais c'est mieux que rien");
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_SWORD;
    }

    @Override
    public int getCritChance() {
        return 0;
    }

    @Override
    public int getCritDamage() {
        return 10;
    }

    @Override
    public int getStrength() {
        return 14;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public HashMap<Action, Consumer<PlayerInteractEvent>> getActions() {
        return null;
    }
}
