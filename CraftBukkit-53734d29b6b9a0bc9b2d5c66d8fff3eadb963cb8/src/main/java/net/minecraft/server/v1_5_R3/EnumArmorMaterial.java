package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemArmor;

public enum EnumArmorMaterial {

	CLOTH(5, new int[]{1, 3, 2, 1}, 0),
    CHAIN(15, new int[]{2, 5, 4, 1}, 0),
    IRON(15, new int[]{2, 6, 5, 2}, 0),
    GOLD(7, new int[]{2, 5, 3, 1}, 0),
    DIAMOND(33, new int[]{3, 8, 6, 3}, 0),
    HARDIRON(20, new int[]{3,8,6,3}, 0),
	HARDDIAMOND(53, new int[]{3,8,6,3}, 0),
	HARDGOLD(14, new int[]{2,5,4,1}, 0);
   private int f;
   private int[] g;
   private int h;
   private int special;
   // $FF: synthetic field
   private static final EnumArmorMaterial[] i = new EnumArmorMaterial[]{CLOTH, CHAIN, IRON, GOLD, DIAMOND, HARDIRON, HARDDIAMOND, HARDGOLD};


   private EnumArmorMaterial(  int var3, int[] var4, int var5) {
      this.f = var3;
      this.g = var4;
      this.h = 0;
      this.special = var5;
   }

   public int a(int var1) {
      return ItemArmor.e()[var1] * this.f;
   }

   public int b(int var1) {
      return this.g[var1];
   }

   public int a() {
      return this.h;
   }

   public int b() {
      return this == CLOTH?Item.LEATHER.id:
    	  (this == CHAIN?Item.IRON_INGOT.id:
    		  (this == GOLD?Item.GOLD_INGOT.id:
    			  (this == IRON?Item.IRON_INGOT.id:
    				  (this == DIAMOND?Item.DIAMOND.id:
    					  (this == HARDIRON ? Block.IRON_BLOCK.id :
    			        		(this == HARDDIAMOND? Block.DIAMOND_BLOCK.id :
    			        			(this == HARDGOLD ? Block.GOLD_BLOCK.id :
    					  0)))))));
   }

}
