package org.bukkit.craftbukkit.entity;


import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreeperPowerEvent;

import net.minecraft.server.v1_5_R3.EntityCreeper;
import net.minecraft.server.v1_5_R3.EntityNetherCreeper;

public class CraftNetherCreeper extends CraftMonster implements Creeper {

    public CraftNetherCreeper(CraftServer server, EntityNetherCreeper entity) {
        super(server, entity);
    }

    public boolean isPowered() {
        return getHandle().isPowered();
    }

    public void setPowered(boolean powered) {
        CraftServer server = this.server;
        Creeper entity = (Creeper) this.getHandle().getBukkitEntity();

        if (powered) {
            CreeperPowerEvent event = new CreeperPowerEvent(entity, CreeperPowerEvent.PowerCause.SET_ON);
            server.getPluginManager().callEvent(event);

            if (!event.isCancelled()) {
                getHandle().setPowered(true);
            }
        } else {
            CreeperPowerEvent event = new CreeperPowerEvent(entity, CreeperPowerEvent.PowerCause.SET_OFF);
            server.getPluginManager().callEvent(event);

            if (!event.isCancelled()) {
                getHandle().setPowered(false);
            }
        }
    }

    @Override
    public EntityCreeper getHandle() {
        return (EntityCreeper) entity;
    }

    @Override
    public String toString() {
        return "CraftCreeper";
    }

    public EntityType getType() {
        return EntityType.NETHERCREEPER;
    }
}