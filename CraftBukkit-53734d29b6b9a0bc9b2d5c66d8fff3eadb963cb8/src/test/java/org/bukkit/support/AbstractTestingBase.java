package org.bukkit.support;

import net.minecraft.server.v1_5_R3.StatisticList;

import org.junit.BeforeClass;

/**
 *  If you are getting: java.lang.ExceptionInInitializerError
 *    at net.minecraft.server.v1_5_R3.StatisticList.<clinit>(SourceFile:58)
 *    at net.minecraft.server.v1_5_R3.Item.<clinit>(SourceFile:252)
 *    at net.minecraft.server.v1_5_R3.Block.<clinit>(Block.java:577)
 *
 *  extend this class to solve it.
 */
public abstract class AbstractTestingBase {

    @BeforeClass
    public static void setup() {
        StatisticList.a();
        DummyServer.setup();
        DummyPotions.setup();
        DummyEnchantments.setup();
    }
}