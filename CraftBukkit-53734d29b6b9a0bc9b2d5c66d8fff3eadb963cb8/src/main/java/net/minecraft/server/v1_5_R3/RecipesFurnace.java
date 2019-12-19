package net.minecraft.server.v1_5_R3;

import java.util.HashMap;
import java.util.Map;

public class RecipesFurnace {

    private static final RecipesFurnace a = new RecipesFurnace();
    public Map recipes = new HashMap(); // CraftBukkit - private -> public
    private Map c = new HashMap();

    public static final RecipesFurnace getInstance() {
        return a;
    }

    public RecipesFurnace() { // CraftBukkit - private -> public
        this.registerRecipe(Block.IRON_ORE.id, new ItemStack(Item.IRON_INGOT), 0.7F);
        this.registerRecipe(Block.GOLD_ORE.id, new ItemStack(Item.GOLD_INGOT), 1.0F);
        this.registerRecipe(Block.DIAMOND_ORE.id, new ItemStack(Item.DIAMOND), 1.0F);
        this.registerRecipe(Block.SAND.id, new ItemStack(Block.GLASS), 0.1F);
        this.registerRecipe(Item.PORK.id, new ItemStack(Item.GRILLED_PORK), 0.35F);
        this.registerRecipe(Item.RAW_BEEF.id, new ItemStack(Item.COOKED_BEEF), 0.35F);
        this.registerRecipe(Item.RAW_CHICKEN.id, new ItemStack(Item.COOKED_CHICKEN), 0.35F);
        this.registerRecipe(Item.RAW_FISH.id, new ItemStack(Item.COOKED_FISH), 0.35F);
        this.registerRecipe(Block.COBBLESTONE.id, new ItemStack(Block.STONE), 0.1F);
        this.registerRecipe(Item.CLAY_BALL.id, new ItemStack(Item.CLAY_BRICK), 0.3F);
        this.registerRecipe(Block.CACTUS.id, new ItemStack(Item.INK_SACK, 1, 2), 0.2F);
        this.registerRecipe(Block.LOG.id, new ItemStack(Item.COAL, 1, 1), 0.15F);
        this.registerRecipe(Block.EMERALD_ORE.id, new ItemStack(Item.EMERALD), 1.0F);
        this.registerRecipe(Item.POTATO.id, new ItemStack(Item.POTATO_BAKED), 0.35F);
        this.registerRecipe(Block.NETHERRACK.id, new ItemStack(Item.NETHER_BRICK), 0.1F);
        this.registerRecipe(Block.COAL_ORE.id, new ItemStack(Item.COAL), 0.1F);
        this.registerRecipe(Block.REDSTONE_ORE.id, new ItemStack(Item.REDSTONE), 0.7F);
        this.registerRecipe(Block.LAPIS_ORE.id, new ItemStack(Item.INK_SACK, 1, 4), 0.2F);
        this.registerRecipe(Block.QUARTZ_ORE.id, new ItemStack(Item.QUARTZ), 0.2F);
        
        this.registerRecipe(Item.STONE_PICKAXE.id, new ItemStack(Block.COBBLESTONE, 3));
        this.registerRecipe(Item.IRON_PICKAXE.id, new ItemStack(Item.IRON_INGOT, 3));
        this.registerRecipe(Item.DIAMOND_PICKAXE.id, new ItemStack(Item.DIAMOND, 3));
        this.registerRecipe(Item.GOLD_PICKAXE.id, new ItemStack(Item.GOLD_INGOT, 3));
        this.registerRecipe(Item.pickaxeHARDSTONE.id, new ItemStack(Block.STONE, 3));
        this.registerRecipe(Item.pickaxeHARDIRON.id, new ItemStack(Block.IRON_BLOCK, 3));
        this.registerRecipe(Item.pickaxeHARDDIAMOND.id, new ItemStack(Block.DIAMOND_BLOCK, 3));
        this.registerRecipe(Item.pickaxeHARDGOLD.id, new ItemStack(Block.GOLD_BLOCK, 3));
        
        this.registerRecipe(Item.STONE_SPADE.id, new ItemStack(Block.COBBLESTONE, 1));
        this.registerRecipe(Item.IRON_SPADE.id, new ItemStack(Item.IRON_INGOT, 1));
        this.registerRecipe(Item.DIAMOND_SPADE.id, new ItemStack(Item.DIAMOND, 1));
        this.registerRecipe(Item.GOLD_SPADE.id, new ItemStack(Item.GOLD_INGOT, 1));
        this.registerRecipe(Item.shovelHARDSTONE.id, new ItemStack(Block.STONE, 1));
        this.registerRecipe(Item.shovelHARDIRON.id, new ItemStack(Block.IRON_BLOCK, 1));
        this.registerRecipe(Item.shovelHARDDIAMOND.id, new ItemStack(Block.DIAMOND_BLOCK, 1));
        this.registerRecipe(Item.shovelHARDGOLD.id, new ItemStack(Block.GOLD_BLOCK, 1));
        
        this.registerRecipe(Item.STONE_AXE.id, new ItemStack(Block.COBBLESTONE, 3));
        this.registerRecipe(Item.IRON_AXE.id, new ItemStack(Item.IRON_INGOT, 3));
        this.registerRecipe(Item.DIAMOND_AXE.id, new ItemStack(Item.DIAMOND, 3));
        this.registerRecipe(Item.GOLD_AXE.id, new ItemStack(Item.GOLD_INGOT, 3));
        this.registerRecipe(Item.axeHARDSTONE.id, new ItemStack(Block.STONE, 3));
        this.registerRecipe(Item.axeHARDIRON.id, new ItemStack(Block.IRON_BLOCK, 3));
        this.registerRecipe(Item.axeHARDDIAMOND.id, new ItemStack(Block.DIAMOND_BLOCK, 3));
        this.registerRecipe(Item.axeHARDGOLD.id, new ItemStack(Block.GOLD_BLOCK, 3));
        
        this.registerRecipe(Item.STONE_HOE.id, new ItemStack(Block.COBBLESTONE, 2));
        this.registerRecipe(Item.IRON_HOE.id, new ItemStack(Item.IRON_INGOT, 2));
        this.registerRecipe(Item.DIAMOND_HOE.id, new ItemStack(Item.DIAMOND, 2));
        this.registerRecipe(Item.GOLD_HOE.id, new ItemStack(Item.GOLD_INGOT, 2));
        this.registerRecipe(Item.hoeHARDSTONE.id, new ItemStack(Block.STONE, 2));
        this.registerRecipe(Item.hoeHARDIRON.id, new ItemStack(Block.IRON_BLOCK, 2));
        this.registerRecipe(Item.hoeHARDDIAMOND.id, new ItemStack(Block.DIAMOND_BLOCK, 2));
        this.registerRecipe(Item.hoeHARDGOLD.id, new ItemStack(Block.GOLD_BLOCK, 2));
        
        this.registerRecipe(Item.STONE_SWORD.id, new ItemStack(Block.COBBLESTONE, 2));
        this.registerRecipe(Item.IRON_SWORD.id, new ItemStack(Item.IRON_INGOT, 2));
        this.registerRecipe(Item.DIAMOND_SWORD.id, new ItemStack(Item.DIAMOND, 2));
        this.registerRecipe(Item.GOLD_SWORD.id, new ItemStack(Item.GOLD_INGOT, 2));
        this.registerRecipe(Item.swordHARDSTONE.id, new ItemStack(Block.STONE, 2));
        this.registerRecipe(Item.swordHARDIRON.id, new ItemStack(Block.IRON_BLOCK, 2));
        this.registerRecipe(Item.swordHARDDIAMOND.id, new ItemStack(Block.DIAMOND_BLOCK, 2));
        this.registerRecipe(Item.swordHARDGOLD.id, new ItemStack(Block.GOLD_BLOCK, 2));
    }

    public void registerRecipe(int i, ItemStack itemstack, float f) {
        this.recipes.put(Integer.valueOf(i), itemstack);
        this.c.put(Integer.valueOf(itemstack.id), Float.valueOf(f));
    }
    
    public void registerRecipe(int i, ItemStack itemstack) {
        this.recipes.put(Integer.valueOf(i), itemstack);
    }

    public ItemStack getResult(int i) {
        return (ItemStack) this.recipes.get(Integer.valueOf(i));
    }

    public Map getRecipes() {
        return this.recipes;
    }

    public float c(int i) {
        return this.c.containsKey(Integer.valueOf(i)) ? ((Float) this.c.get(Integer.valueOf(i))).floatValue() : 0.0F;
    }
}
