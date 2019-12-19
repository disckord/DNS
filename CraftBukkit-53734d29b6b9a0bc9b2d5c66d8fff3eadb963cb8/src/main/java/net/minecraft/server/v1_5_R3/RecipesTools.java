package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.CraftingManager;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;

public class RecipesTools {

   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b;


   public RecipesTools() {
      this.b = new Object[][]{{Block.WOOD, Block.COBBLESTONE, Item.IRON_INGOT, Item.DIAMOND, Item.GOLD_INGOT, Block.LOG, Block.STONE, Block.IRON_BLOCK, Block.DIAMOND_BLOCK, Block.GOLD_BLOCK}, 
    	  {Item.WOOD_PICKAXE, Item.STONE_PICKAXE, Item.IRON_PICKAXE, Item.DIAMOND_PICKAXE, Item.GOLD_PICKAXE, Item.pickaxeHARDWOOD,Item.pickaxeHARDSTONE, Item.pickaxeHARDIRON, Item.pickaxeHARDDIAMOND, Item.pickaxeHARDGOLD},
    	  {Item.WOOD_SPADE, Item.STONE_SPADE, Item.IRON_SPADE, Item.DIAMOND_SPADE, Item.GOLD_SPADE, Item.shovelHARDWOOD, Item.shovelHARDSTONE, Item.shovelHARDIRON, Item.shovelHARDDIAMOND, Item.shovelHARDGOLD}, 
    	  {Item.WOOD_AXE, Item.STONE_AXE, Item.IRON_AXE, Item.DIAMOND_AXE, Item.GOLD_AXE, Item.axeHARDWOOD, Item.axeHARDSTONE, Item.axeHARDIRON, Item.axeHARDDIAMOND, Item.axeHARDGOLD}, 
    	  {Item.WOOD_HOE, Item.STONE_HOE, Item.IRON_HOE, Item.DIAMOND_HOE, Item.GOLD_HOE, Item.hoeHARDWOOD, Item.hoeHARDSTONE, Item.hoeHARDIRON, Item.hoeHARDDIAMOND, Item.hoeHARDGOLD}};
   }

   public void a(CraftingManager var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            Item var5 = (Item)this.b[var4 + 1][var2];
            var1.registerShapedRecipe(new ItemStack(var5), new Object[]{this.a[var4], Character.valueOf('#'), Item.STICK, Character.valueOf('X'), var3});
         }
      }

      var1.registerShapedRecipe(new ItemStack(Item.SHEARS), new Object[]{" #", "# ", Character.valueOf('#'), Item.IRON_INGOT});
   }
}
