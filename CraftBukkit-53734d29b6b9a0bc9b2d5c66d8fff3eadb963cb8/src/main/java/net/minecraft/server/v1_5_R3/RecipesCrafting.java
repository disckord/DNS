package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.CraftingManager;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;

public class RecipesCrafting {

   public void a(CraftingManager var1) {
      var1.registerShapedRecipe(new ItemStack(Block.CHEST), new Object[]{"###", "# #", "###", Character.valueOf('#'), Block.WOOD});
      var1.registerShapedRecipe(new ItemStack(Block.TRAPPED_CHEST), new Object[]{"#-", Character.valueOf('#'), Block.CHEST, Character.valueOf('-'), Block.TRIPWIRE_SOURCE});
     // var1.registerShapedRecipe(new ItemStack(Block.ENDER_CHEST), new Object[]{"###", "#E#", "###", Character.valueOf('#'), Block.OBSIDIAN, Character.valueOf('E'), Item.EYE_OF_ENDER});
      var1.registerShapedRecipe(new ItemStack(Block.FURNACE), new Object[]{"###", "# #", "###", Character.valueOf('#'), Block.COBBLESTONE});
      var1.registerShapedRecipe(new ItemStack(Block.WORKBENCH), new Object[]{"##", "##", Character.valueOf('#'), Block.WOOD});
      var1.registerShapedRecipe(new ItemStack(Block.SANDSTONE), new Object[]{"##", "##", Character.valueOf('#'), Block.SAND});
      var1.registerShapedRecipe(new ItemStack(Block.SANDSTONE, 4, 2), new Object[]{"##", "##", Character.valueOf('#'), Block.SANDSTONE});
      var1.registerShapedRecipe(new ItemStack(Block.SANDSTONE, 1, 1), new Object[]{"#", "#", Character.valueOf('#'), new ItemStack(Block.STEP, 1, 1)});
      var1.registerShapedRecipe(new ItemStack(Block.QUARTZ_BLOCK, 1, 1), new Object[]{"#", "#", Character.valueOf('#'), new ItemStack(Block.STEP, 1, 7)});
      var1.registerShapedRecipe(new ItemStack(Block.QUARTZ_BLOCK, 2, 2), new Object[]{"#", "#", Character.valueOf('#'), new ItemStack(Block.QUARTZ_BLOCK, 1, 0)});
      var1.registerShapedRecipe(new ItemStack(Block.SMOOTH_BRICK, 4), new Object[]{"##", "##", Character.valueOf('#'), Block.STONE});
      var1.registerShapedRecipe(new ItemStack(Block.IRON_FENCE, 6), new Object[]{"###", "###", Character.valueOf('#'), Item.IRON_INGOT});
      var1.registerShapedRecipe(new ItemStack(Block.THIN_GLASS, 6), new Object[]{"###", "###", Character.valueOf('#'), Block.GLASS});
      var1.registerShapedRecipe(new ItemStack(Block.REDSTONE_LAMP_OFF, 1), new Object[]{" R ", "RGR", " R ", Character.valueOf('R'), Item.REDSTONE, Character.valueOf('G'), Block.GLOWSTONE});
      //var1.registerShapedRecipe(new ItemStack(Block.BEACON, 1), new Object[]{"GGG", "GSG", "OOO", Character.valueOf('G'), Block.GLASS, Character.valueOf('S'), Item.NETHER_STAR, Character.valueOf('O'), Block.OBSIDIAN});
      var1.registerShapedRecipe(new ItemStack(Block.NETHER_BRICK, 1), new Object[]{"NN", "NN", Character.valueOf('N'), Item.NETHER_BRICK});
   }
}
