package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.CraftingManager;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;

public class RecipesWeapons {

   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b;


   public RecipesWeapons() {
      this.b = new Object[][]{{Block.WOOD, Block.COBBLESTONE, Item.IRON_INGOT, Item.DIAMOND, Item.GOLD_INGOT, Block.LOG, Block.STONE, Block.IRON_BLOCK, Block.DIAMOND_BLOCK, Block.GOLD_BLOCK},
    	  {Item.WOOD_SWORD, Item.STONE_SWORD, Item.IRON_SWORD, Item.DIAMOND_SWORD, Item.GOLD_SWORD, Item.swordHARDWOOD, Item.swordHARDSTONE, Item.swordHARDIRON, Item.swordHARDDIAMOND, Item.swordHARDGOLD}};
   }

   public void a(CraftingManager var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            Item var5 = (Item)this.b[var4 + 1][var2];
            var1.registerShapedRecipe(new ItemStack(var5), new Object[]{this.a[var4], Character.valueOf('#'), Item.STICK, Character.valueOf('X'), var3});
         }
      }

      var1.registerShapedRecipe(new ItemStack(Item.BOW, 1), new Object[]{" #X", "# X", " #X", Character.valueOf('X'), Item.STRING, Character.valueOf('#'), Item.STICK});
      var1.registerShapedRecipe(new ItemStack(Item.ARROW, 4), new Object[]{"X", "#", "Y", Character.valueOf('Y'), Item.FEATHER, Character.valueOf('X'), Item.FLINT, Character.valueOf('#'), Item.STICK});
   }
}
