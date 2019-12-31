package org.bukkit.entity;

/**
 * Represents a Creeper
 */
public interface NetherCreeper extends Creeper {

    /**
     * Checks if this Creeper is powered (Electrocuted)
     *
     * @return true if this creeper is powered
     */
    public boolean isPowered();

    /**
     * Sets the Powered status of this Creeper
     *
     * @param value New Powered status
     */
    public void setPowered(boolean value);
}