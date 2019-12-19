package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.CraftingManager;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;

public class RecipeIngots {

   private Object[][] a;


   public RecipeIngots() {
      this.a = new Object[][]{{Block.GOLD_BLOCK, new ItemStack(Item.GOLD_INGOT, 9)},
    	  {Block.IRON_BLOCK, new ItemStack(Item.IRON_INGOT, 9)},
    	  {Block.DIAMOND_BLOCK, new ItemStack(Item.DIAMOND, 9)}, 
    	  {Block.EMERALD_BLOCK, new ItemStack(Item.EMERALD, 9)}, 
    	  {Block.LAPIS_BLOCK, new ItemStack(Item.INK_SACK, 9, 4)}, 
    	  {Block.coalBlock, new ItemStack(Item.COAL, 9)}, 
    	  {Block.REDSTONE_BLOCK, new ItemStack(Item.REDSTONE, 9)}};
   }

   public void a(CraftingManager var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         Block var3 = (Block)this.a[var2][0];
         ItemStack var4 = (ItemStack)this.a[var2][1];
         var1.registerShapedRecipe(new ItemStack(var3), new Object[]{"###", "###", "###", Character.valueOf('#'), var4});
         var1.registerShapedRecipe(var4, new Object[]{"#", Character.valueOf('#'), var3});
      }

      var1.registerShapedRecipe(new ItemStack(Item.GOLD_INGOT), new Object[]{"###", "###", "###", Character.valueOf('#'), Item.GOLD_NUGGET});
      var1.registerShapedRecipe(new ItemStack(Item.GOLD_NUGGET, 9), new Object[]{"#", Character.valueOf('#'), Item.GOLD_INGOT});
   }
}
