package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.Item;

public enum EnumToolMaterial {

	WOOD(0, 59, 2.0F, 0, 0),
    STONE(1, 131, 4.0F, 1, 0),
    IRON(2, 250, 6.0F, 2, 0),
    DIAMOND(3, 1561, 8.0F,3, 0),
    GOLD(0, 32, 12.0F, 0, 0),
	HARDWOOD(0,59,3.0F,1, 0),
	HARDSTONE(2,131,5.0F,2, -1),
	HARDIRON(2,1875,7.0F,3, -1),
	HARDDIAMOND(3,8781,11.0F,8, -2),
	HARDGOLD(1,216,15.0F,1, 0),
	QEIRON(2,750,8.0F,3, -1),
	QEDIAMOND(3,2061,10.0F,8, -2),
	QEGOLD(0, 200, 14.0F, 1, 1),
	QEHARDIRON(3,2875,12.0F,3, 0),
	QEHARDDIAMOND(3,9781,16.0F,8, 0),
	QEHARDGOLD(2,1216,20.0F,1, 2);
   private final int f;
   private final int g;
   private final float h;
   private final int i;
   private final int j;
   private final int quartzdamagebonus;
   // $FF: synthetic field
   private static final EnumToolMaterial[] k = new EnumToolMaterial[]{WOOD, STONE, IRON, DIAMOND, GOLD};


   private EnumToolMaterial(  int var3, int var4, float var5, int var6, int var7) {
      this.f = var3;
      this.g = var4;
      this.h = var5;
      this.i = var6;
      this.j = 0;
      this.quartzdamagebonus = var7;
   }
   public int getQuartzDamageBonus()
   {
   	return this.quartzdamagebonus;
   }

   public int a() {
      return this.g;
   }

   public float b() {
      return this.h;
   }

   public int c() {
      return this.i;
   }

   public int d() {
      return this.f;
   }

   public int e() {
      return this.j;
   }

   public int f() {
      return this == 
    		  WOOD?Block.WOOD.id:
    			  (this == STONE?Block.COBBLESTONE.id:
    				  (this == GOLD?Item.GOLD_INGOT.id:
    					  (this == IRON?Item.IRON_INGOT.id:
    						  (this == DIAMOND?Item.DIAMOND.id:
    							  (this == HARDWOOD?Block.LOG.id:
    								  (this == HARDSTONE ? Block.STONE.id :
    					        			(this == HARDIRON ? Block.IRON_BLOCK.id :
    					        				(this == HARDDIAMOND ? Block.DIAMOND_BLOCK.id :
    					        					( this == HARDGOLD ? Block.GOLD_BLOCK.id :
    							  0)))))))));
   }

}
