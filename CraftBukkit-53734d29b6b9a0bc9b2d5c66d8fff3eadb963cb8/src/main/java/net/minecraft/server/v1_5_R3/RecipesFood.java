package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.CraftingManager;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;

public class RecipesFood {

   public void a(CraftingManager var1) {
      var1.registerShapelessRecipe(new ItemStack(Item.MUSHROOM_SOUP), new Object[]{Block.BROWN_MUSHROOM, Block.RED_MUSHROOM, Item.BOWL});
      var1.registerShapedRecipe(new ItemStack(Item.COOKIE, 8), new Object[]{"#X#", Character.valueOf('X'), new ItemStack(Item.INK_SACK, 1, 3), Character.valueOf('#'), Item.WHEAT});
   //   var1.registerShapedRecipe(new ItemStack(Block.MELON), new Object[]{"MMM", "MMM", "MMM", Character.valueOf('M'), Item.MELON});
    //  var1.registerShapedRecipe(new ItemStack(Item.MELON_SEEDS), new Object[]{"M", Character.valueOf('M'), Item.MELON});
   //   var1.registerShapedRecipe(new ItemStack(Item.PUMPKIN_SEEDS, 4), new Object[]{"M", Character.valueOf('M'), Block.PUMPKIN});
      var1.registerShapelessRecipe(new ItemStack(Item.PUMPKIN_PIE), new Object[]{Block.PUMPKIN, Item.SUGAR, Item.EGG});
      var1.registerShapelessRecipe(new ItemStack(Item.FERMENTED_SPIDER_EYE), new Object[]{Item.SPIDER_EYE, Block.BROWN_MUSHROOM, Item.SUGAR});
      var1.registerShapelessRecipe(new ItemStack(Item.SPECKLED_MELON), new Object[]{Item.MELON, Item.GOLD_NUGGET});
      var1.registerShapelessRecipe(new ItemStack(Item.BLAZE_POWDER, 2), new Object[]{Item.BLAZE_ROD});
      var1.registerShapelessRecipe(new ItemStack(Item.MAGMA_CREAM), new Object[]{Item.BLAZE_POWDER, Item.SLIME_BALL});
   }
}
