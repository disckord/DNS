package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.CraftingManager;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;

public class RecipesArmor {

   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b;


   public RecipesArmor() {
      this.b = new Object[][]{{Item.LEATHER, Block.FIRE, Item.IRON_INGOT, Item.DIAMOND, Item.GOLD_INGOT, Block.IRON_BLOCK, Block.DIAMOND_BLOCK, Block.GOLD_BLOCK},
    	  {Item.LEATHER_HELMET, Item.CHAINMAIL_HELMET, Item.IRON_HELMET, Item.DIAMOND_HELMET, Item.GOLD_HELMET, Item.helmetHARDIRON, Item.helmetHARDDIAMOND, Item.helmetHARDGOLD},
    	  {Item.LEATHER_CHESTPLATE, Item.CHAINMAIL_CHESTPLATE, Item.IRON_CHESTPLATE, Item.DIAMOND_CHESTPLATE, Item.GOLD_CHESTPLATE, Item.plateHARDIRON, Item.plateHARDDIAMOND, Item.plateHARDGOLD},
    	  {Item.LEATHER_LEGGINGS, Item.CHAINMAIL_LEGGINGS, Item.IRON_LEGGINGS, Item.DIAMOND_LEGGINGS, Item.GOLD_LEGGINGS, Item.legsHARDIRON, Item.legsHARDDIAMOND, Item.legsHARDGOLD}, 
    	  {Item.LEATHER_BOOTS, Item.CHAINMAIL_BOOTS, Item.IRON_BOOTS, Item.DIAMOND_BOOTS, Item.GOLD_BOOTS, Item.bootsHARDIRON, Item.bootsHARDDIAMOND, Item.bootsHARDGOLD}};
   }

   public void a(CraftingManager var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            Item var5 = (Item)this.b[var4 + 1][var2];
            var1.registerShapedRecipe(new ItemStack(var5), new Object[]{this.a[var4], Character.valueOf('X'), var3});
         }
      }

   }
}
