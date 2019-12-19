package org.bukkit.craftbukkit.block;

import java.util.Random;
import net.minecraft.server.v1_5_R3.BlockDispenser;
import net.minecraft.server.v1_5_R3.TileEntityDispenser;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Dispenser;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.inventory.Inventory;

public class CraftDispenser extends CraftBlockState implements Dispenser {
    private final CraftWorld world;
    private final TileEntityDispenser dispenser;

    public CraftDispenser(final Block block) {
        super(block);

        world = (CraftWorld) block.getWorld();
        dispenser = (TileEntityDispenser) world.getTileEntityAt(getX(), getY(), getZ());
    }

    public Inventory getInventory() {
        return new CraftInventory(dispenser);
    }

    public boolean dispense() {
        Block block = getBlock();

        if (block.getType() == Material.DISPENSER) {
            BlockDispenser dispense = (BlockDispenser) net.minecraft.server.v1_5_R3.Block.DISPENSER;

            dispense.dispense(world.getHandle(), getX(), getY(), getZ());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        boolean result = super.update(force, applyPhysics);

        if (result) {
            dispenser.update();
        }

        return result;
    }
}
