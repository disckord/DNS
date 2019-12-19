package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;
import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.MathHelper;
import net.minecraft.server.v1_5_R3.StructureBoundingBox;
import net.minecraft.server.v1_5_R3.StructurePiece;
import net.minecraft.server.v1_5_R3.World;
import net.minecraft.server.v1_5_R3.WorldGenVillagePiece;
import net.minecraft.server.v1_5_R3.WorldGenVillageStartPiece;

public class WorldGenVillageFarm2 extends WorldGenVillagePiece {

   private int a = -1;
   private int b;
   private int c;
   private int d;
   private int h;


   public WorldGenVillageFarm2(WorldGenVillageStartPiece var1, int var2, Random var3, StructureBoundingBox var4, int var5) {
      super(var1, var2);
      this.f = var5;
      this.e = var4;
      this.b = this.a(var3);
      this.c = this.a(var3);
      this.d = this.a(var3);
      this.h = this.a(var3);
   }

   private int a(Random var1) {
      switch(var1.nextInt(5)) {
      case 0:
         return Block.PUMPKIN_STEM.id;
      case 1:
         return Block.CROPS.id;
      default:
         return Block.CROPS.id;
      }
   }

   public static WorldGenVillageFarm2 a(WorldGenVillageStartPiece var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      StructureBoundingBox var8 = StructureBoundingBox.a(var3, var4, var5, 0, 0, 0, 13, 4, 9, var6);
      return a(var8) && StructurePiece.a(var1, var8) == null?new WorldGenVillageFarm2(var0, var7, var2, var8, var6):null;
   }

   public boolean a(World var1, Random var2, StructureBoundingBox var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 4 - 1, 0);
      }

      this.a(var1, var3, 0, 1, 0, 12, 4, 8, 0, 0, false);
      this.a(var1, var3, 1, 0, 1, 2, 0, 7, Block.SOIL.id, Block.SOIL.id, false);
      this.a(var1, var3, 4, 0, 1, 5, 0, 7, Block.SOIL.id, Block.SOIL.id, false);
      this.a(var1, var3, 7, 0, 1, 8, 0, 7, Block.SOIL.id, Block.SOIL.id, false);
      this.a(var1, var3, 10, 0, 1, 11, 0, 7, Block.SOIL.id, Block.SOIL.id, false);
      this.a(var1, var3, 0, 0, 0, 0, 0, 8, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 6, 0, 0, 6, 0, 8, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 12, 0, 0, 12, 0, 8, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 1, 0, 0, 11, 0, 0, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 1, 0, 8, 11, 0, 8, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 3, 0, 1, 3, 0, 7, Block.WATER.id, Block.WATER.id, false);
      this.a(var1, var3, 9, 0, 1, 9, 0, 7, Block.WATER.id, Block.WATER.id, false);

      int var4;
      for(var4 = 1; var4 <= 7; ++var4) {
         this.a(var1, this.b, MathHelper.nextInt(var2, 2, 7), 1, 1, var4, var3);
         this.a(var1, this.b, MathHelper.nextInt(var2, 2, 7), 2, 1, var4, var3);
         this.a(var1, this.c, MathHelper.nextInt(var2, 2, 7), 4, 1, var4, var3);
         this.a(var1, this.c, MathHelper.nextInt(var2, 2, 7), 5, 1, var4, var3);
         this.a(var1, this.d, MathHelper.nextInt(var2, 2, 7), 7, 1, var4, var3);
         this.a(var1, this.d, MathHelper.nextInt(var2, 2, 7), 8, 1, var4, var3);
         this.a(var1, this.h, MathHelper.nextInt(var2, 2, 7), 10, 1, var4, var3);
         this.a(var1, this.h, MathHelper.nextInt(var2, 2, 7), 11, 1, var4, var3);
      }

      for(var4 = 0; var4 < 9; ++var4) {
         for(int var5 = 0; var5 < 13; ++var5) {
            this.b(var1, var5, 4, var4, var3);
            this.b(var1, Block.DIRT.id, 0, var5, -1, var4, var3);
         }
      }

      return true;
   }
}
