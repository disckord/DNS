package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;
import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.StructureBoundingBox;
import net.minecraft.server.v1_5_R3.StructurePiece;
import net.minecraft.server.v1_5_R3.World;
import net.minecraft.server.v1_5_R3.WorldGenVillagePiece;
import net.minecraft.server.v1_5_R3.WorldGenVillageStartPiece;

public class WorldGenVillageHouse2 extends WorldGenVillagePiece {

   private int a = -1;


   public WorldGenVillageHouse2(WorldGenVillageStartPiece var1, int var2, Random var3, StructureBoundingBox var4, int var5) {
      super(var1, var2);
      this.f = var5;
      this.e = var4;
   }

   public static WorldGenVillageHouse2 a(WorldGenVillageStartPiece var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      StructureBoundingBox var8 = StructureBoundingBox.a(var3, var4, var5, 0, 0, 0, 9, 7, 12, var6);
      return a(var8) && StructurePiece.a(var1, var8) == null?new WorldGenVillageHouse2(var0, var7, var2, var8, var6):null;
   }

   public boolean a(World var1, Random var2, StructureBoundingBox var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 7 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 4, 4, 0, 0, false);
      this.a(var1, var3, 2, 1, 6, 8, 4, 10, 0, 0, false);
      this.a(var1, var3, 2, 0, 5, 8, 0, 10, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 0, 1, 7, 0, 4, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 0, 0, 0, 0, 3, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 8, 0, 0, 8, 3, 10, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 0, 0, 7, 2, 0, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 0, 5, 2, 1, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 2, 0, 6, 2, 3, 10, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 3, 0, 10, 7, 3, 10, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 2, 0, 7, 3, 0, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 2, 5, 2, 3, 5, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 0, 4, 1, 8, 4, 1, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 0, 4, 4, 3, 4, 4, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 0, 5, 2, 8, 5, 3, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, Block.WOOD.id, 0, 0, 4, 2, var3);
      this.a(var1, Block.WOOD.id, 0, 0, 4, 3, var3);
      this.a(var1, Block.WOOD.id, 0, 8, 4, 2, var3);
      this.a(var1, Block.WOOD.id, 0, 8, 4, 3, var3);
      this.a(var1, Block.WOOD.id, 0, 8, 4, 4, var3);
      int var4 = this.c(Block.WOOD_STAIRS.id, 3);
      int var5 = this.c(Block.WOOD_STAIRS.id, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, Block.WOOD_STAIRS.id, var4, var7, 4 + var6, var6, var3);
            if((var6 > -1 || var7 <= 1) && (var6 > 0 || var7 <= 3) && (var6 > 1 || var7 <= 4 || var7 >= 6)) {
               this.a(var1, Block.WOOD_STAIRS.id, var5, var7, 4 + var6, 5 - var6, var3);
            }
         }
      }

      this.a(var1, var3, 3, 4, 5, 3, 4, 10, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 7, 4, 2, 7, 4, 10, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 4, 5, 4, 4, 5, 10, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 6, 5, 4, 6, 5, 10, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 5, 6, 3, 5, 6, 10, Block.WOOD.id, Block.WOOD.id, false);
      var6 = this.c(Block.WOOD_STAIRS.id, 0);

      int var8;
      for(var7 = 4; var7 >= 1; --var7) {
         this.a(var1, Block.WOOD.id, 0, var7, 2 + var7, 7 - var7, var3);

         for(var8 = 8 - var7; var8 <= 10; ++var8) {
            this.a(var1, Block.WOOD_STAIRS.id, var6, var7, 2 + var7, var8, var3);
         }
      }

      var7 = this.c(Block.WOOD_STAIRS.id, 1);
      this.a(var1, Block.WOOD.id, 0, 6, 6, 3, var3);
      this.a(var1, Block.WOOD.id, 0, 7, 5, 4, var3);
      this.a(var1, Block.WOOD_STAIRS.id, var7, 6, 6, 4, var3);

      int var9;
      for(var8 = 6; var8 <= 8; ++var8) {
         for(var9 = 5; var9 <= 10; ++var9) {
            this.a(var1, Block.WOOD_STAIRS.id, var7, var8, 12 - var8, var9, var3);
         }
      }

      this.a(var1, Block.LOG.id, 0, 0, 2, 1, var3);
      this.a(var1, Block.LOG.id, 0, 0, 2, 4, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 2, 3, var3);
      this.a(var1, Block.LOG.id, 0, 4, 2, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 5, 2, 0, var3);
      this.a(var1, Block.LOG.id, 0, 6, 2, 0, var3);
      this.a(var1, Block.LOG.id, 0, 8, 2, 1, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 2, 3, var3);
      this.a(var1, Block.LOG.id, 0, 8, 2, 4, var3);
      this.a(var1, Block.WOOD.id, 0, 8, 2, 5, var3);
      this.a(var1, Block.LOG.id, 0, 8, 2, 6, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 2, 7, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 2, 8, var3);
      this.a(var1, Block.LOG.id, 0, 8, 2, 9, var3);
      this.a(var1, Block.LOG.id, 0, 2, 2, 6, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 2, 7, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 2, 8, var3);
      this.a(var1, Block.LOG.id, 0, 2, 2, 9, var3);
      this.a(var1, Block.LOG.id, 0, 4, 4, 10, var3);
      this.a(var1, Block.GLASS.id, 0, 5, 4, 10, var3);
      this.a(var1, Block.LOG.id, 0, 6, 4, 10, var3);
      this.a(var1, Block.WOOD.id, 0, 5, 5, 10, var3);
      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, Block.TORCH.id, 0, 2, 3, 1, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.c(Block.WOODEN_DOOR.id, 1));
      this.a(var1, var3, 1, 0, -1, 3, 2, -1, 0, 0, false);
      if(this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 3), 2, 0, -1, var3);
      }

      for(var8 = 0; var8 < 5; ++var8) {
         for(var9 = 0; var9 < 9; ++var9) {
            this.b(var1, var9, 7, var8, var3);
            this.b(var1, Block.COBBLESTONE.id, 0, var9, -1, var8, var3);
         }
      }

      for(var8 = 5; var8 < 11; ++var8) {
         for(var9 = 2; var9 < 9; ++var9) {
            this.b(var1, var9, 7, var8, var3);
            this.b(var1, Block.COBBLESTONE.id, 0, var9, -1, var8, var3);
         }
      }

      this.a(var1, var3, 4, 1, 2, 2);
      return true;
   }
}
