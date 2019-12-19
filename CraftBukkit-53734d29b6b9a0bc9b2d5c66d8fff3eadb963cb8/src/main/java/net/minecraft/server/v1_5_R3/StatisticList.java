package net.minecraft.server.v1_5_R3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.server.v1_5_R3.AchievementList;
import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.CounterStatistic;
import net.minecraft.server.v1_5_R3.CraftingManager;
import net.minecraft.server.v1_5_R3.CraftingStatistic;
import net.minecraft.server.v1_5_R3.IRecipe;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;
import net.minecraft.server.v1_5_R3.LocaleI18n;
import net.minecraft.server.v1_5_R3.RecipesFurnace;
import net.minecraft.server.v1_5_R3.Statistic;

public class StatisticList {

   protected static Map a = new HashMap();
   public static List b = new ArrayList();
   public static List c = new ArrayList();
   public static List d = new ArrayList();
   public static List e = new ArrayList();
   public static Statistic f = (new CounterStatistic(1000, "stat.startGame")).h().g();
   public static Statistic g = (new CounterStatistic(1001, "stat.createWorld")).h().g();
   public static Statistic h = (new CounterStatistic(1002, "stat.loadWorld")).h().g();
   public static Statistic i = (new CounterStatistic(1003, "stat.joinMultiplayer")).h().g();
   public static Statistic j = (new CounterStatistic(1004, "stat.leaveGame")).h().g();
   public static Statistic k = (new CounterStatistic(1100, "stat.playOneMinute", Statistic.i)).h().g();
   public static Statistic l = (new CounterStatistic(2000, "stat.walkOneCm", Statistic.j)).h().g();
   public static Statistic m = (new CounterStatistic(2001, "stat.swimOneCm", Statistic.j)).h().g();
   public static Statistic n = (new CounterStatistic(2002, "stat.fallOneCm", Statistic.j)).h().g();
   public static Statistic o = (new CounterStatistic(2003, "stat.climbOneCm", Statistic.j)).h().g();
   public static Statistic p = (new CounterStatistic(2004, "stat.flyOneCm", Statistic.j)).h().g();
   public static Statistic q = (new CounterStatistic(2005, "stat.diveOneCm", Statistic.j)).h().g();
   public static Statistic r = (new CounterStatistic(2006, "stat.minecartOneCm", Statistic.j)).h().g();
   public static Statistic s = (new CounterStatistic(2007, "stat.boatOneCm", Statistic.j)).h().g();
   public static Statistic t = (new CounterStatistic(2008, "stat.pigOneCm", Statistic.j)).h().g();
   public static Statistic u = (new CounterStatistic(2010, "stat.jump")).h().g();
   public static Statistic v = (new CounterStatistic(2011, "stat.drop")).h().g();
   public static Statistic w = (new CounterStatistic(2020, "stat.damageDealt")).g();
   public static Statistic x = (new CounterStatistic(2021, "stat.damageTaken")).g();
   public static Statistic y = (new CounterStatistic(2022, "stat.deaths")).g();
   public static Statistic z = (new CounterStatistic(2023, "stat.mobKills")).g();
   public static Statistic A = (new CounterStatistic(2024, "stat.playerKills")).g();
   public static Statistic B = (new CounterStatistic(2025, "stat.fishCaught")).g();
   public static Statistic[] C = a("stat.mineBlock", 16777216);
   public static Statistic[] D;
   public static Statistic[] E;
   public static Statistic[] F;
   private static boolean G;
   private static boolean H;


   public static void a() {}

   public static void b() {
      E = a(E, "stat.useItem", 16908288, 0, 256);
      F = b(F, "stat.breakItem", 16973824, 0, 256);
      G = true;
      d();
   }

   public static void c() {
      E = a(E, "stat.useItem", 16908288, 256, 32000);
      F = b(F, "stat.breakItem", 16973824, 256, 32000);
      H = true;
      d();
   }

   public static void d() {
      if(G && H) {
         HashSet var0 = new HashSet();
         Iterator var1 = CraftingManager.getInstance().getRecipes().iterator();

         while(var1.hasNext()) {
            IRecipe var2 = (IRecipe)var1.next();
            if(var2.b() != null) {
               var0.add(Integer.valueOf(var2.b().id));
            }
         }

         var1 = RecipesFurnace.getInstance().getRecipes().values().iterator();

         while(var1.hasNext()) {
            ItemStack var4 = (ItemStack)var1.next();
            var0.add(Integer.valueOf(var4.id));
         }

         D = new Statistic[32000];
         var1 = var0.iterator();

         while(var1.hasNext()) {
            Integer var5 = (Integer)var1.next();
            if(Item.byId[var5.intValue()] != null) {
               String var3 = LocaleI18n.get("stat.craftItem", new Object[]{Item.byId[var5.intValue()].u()});
               D[var5.intValue()] = (new CraftingStatistic(16842752 + var5.intValue(), var3, var5.intValue())).g();
            }
         }

         a(D);
      }
   }

   private static Statistic[] a(String var0, int var1) {
      Statistic[] var2 = new Statistic[256];

      for(int var3 = 0; var3 < 256; ++var3) {
         if(Block.byId[var3] != null && Block.byId[var3].C()) {
            String var4 = LocaleI18n.get(var0, new Object[]{Block.byId[var3].getName()});
            var2[var3] = (new CraftingStatistic(var1 + var3, var4, var3)).g();
            e.add((CraftingStatistic)var2[var3]);
         }
      }

      a(var2);
      return var2;
   }

   private static Statistic[] a(Statistic[] var0, String var1, int var2, int var3, int var4) {
      if(var0 == null) {
         var0 = new Statistic[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if(Item.byId[var5] != null) {
            String var6 = LocaleI18n.get(var1, new Object[]{Item.byId[var5].u()});
            var0[var5] = (new CraftingStatistic(var2 + var5, var6, var5)).g();
            if(var5 >= 256) {
               d.add((CraftingStatistic)var0[var5]);
            }
         }
      }

      a(var0);
      return var0;
   }

   private static Statistic[] b(Statistic[] var0, String var1, int var2, int var3, int var4) {
      if(var0 == null) {
         var0 = new Statistic[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if(Item.byId[var5] != null && Item.byId[var5].usesDurability()) {
            String var6 = LocaleI18n.get(var1, new Object[]{Item.byId[var5].u()});
            var0[var5] = (new CraftingStatistic(var2 + var5, var6, var5)).g();
         }
      }

      a(var0);
      return var0;
   }

   private static void a(Statistic[] var0) {
      a(var0, Block.STATIONARY_WATER.id, Block.WATER.id);
      a(var0, Block.STATIONARY_LAVA.id, Block.STATIONARY_LAVA.id);
      a(var0, Block.JACK_O_LANTERN.id, Block.PUMPKIN.id);
      a(var0, Block.BURNING_FURNACE.id, Block.FURNACE.id);
      a(var0, Block.GLOWING_REDSTONE_ORE.id, Block.REDSTONE_ORE.id);
      a(var0, Block.DIODE_ON.id, Block.DIODE_OFF.id);
      a(var0, Block.REDSTONE_TORCH_ON.id, Block.REDSTONE_TORCH_OFF.id);
      a(var0, Block.RED_MUSHROOM.id, Block.BROWN_MUSHROOM.id);
      a(var0, Block.DOUBLE_STEP.id, Block.STEP.id);
      a(var0, Block.WOOD_DOUBLE_STEP.id, Block.WOOD_STEP.id);
      a(var0, Block.GRASS.id, Block.DIRT.id);
      a(var0, Block.SOIL.id, Block.DIRT.id);
   }

   private static void a(Statistic[] var0, int var1, int var2) {
      if(var0[var1] != null && var0[var2] == null) {
         var0[var2] = var0[var1];
      } else {
         b.remove(var0[var1]);
         e.remove(var0[var1]);
         c.remove(var0[var1]);
         var0[var1] = var0[var2];
      }
   }

   static {
      AchievementList.a();
      G = false;
      H = false;
   }
}
