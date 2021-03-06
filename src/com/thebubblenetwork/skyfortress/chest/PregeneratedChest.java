package com.thebubblenetwork.skyfortress.chest;

import com.thebubblenetwork.skyfortress.chest.gen.__INVLAID__ChestGeneration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * The Bubble Network 2016
 * SkyFortress
 * 20/02/2016 {15:41}
 * Created February 2016
 */

public class PregeneratedChest {
    private __INVALID__ChestType type;
    private __INVLAID__ChestGeneration gen;
    private List<ItemStack[]> pregen = new ArrayList<>();

    public PregeneratedChest(__INVALID__ChestType type, __INVLAID__ChestGeneration gen, int uses) {
        this.type = type;
        this.gen = gen;
        gen(uses);
    }

    public void gen(int uses) {
        for (; uses > 0; uses--) {
            pregen.add(getGen().generate(getType()));
        }
    }

    public void apply(InventoryHolder holder) {
        apply(holder.getInventory());
    }

    public void apply(Inventory inventory) {
        if (inventory.getSize() != getSize()) {
            throw new IllegalArgumentException("Inventory not compatible");
        }
        if (getUses() == 0) {
            throw new IllegalArgumentException("No uses left");
        }
        inventory.setContents(pregen.remove(0));
    }

    public int getUses() {
        return pregen.size();
    }

    public __INVLAID__ChestGeneration getGen() {
        return gen;
    }

    public __INVALID__ChestType getType() {
        return type;
    }

    public int getSize() {
        return getType().getSize();
    }

}
