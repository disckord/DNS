package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;
import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.StructureBoundingBox;
import net.minecraft.server.v1_5_R3.StructurePiece;
import net.minecraft.server.v1_5_R3.World;
import net.minecraft.server.v1_5_R3.WorldGenVillagePiece;
import net.minecraft.server.v1_5_R3.WorldGenVillageStartPiece;

public class WorldGenVillageButcher extends WorldGenVillagePiece {

   private int a = -1;


   public WorldGenVillageButcher(WorldGenVillageStartPiece var1, int var2, Random var3, StructureBoundingBox var4, int var5) {
      super(var1, var2);
      this.f = var5;
      this.e = var4;
   }

   public static WorldGenVillageButcher a(WorldGenVillageStartPiece var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      StructureBoundingBox var8 = StructureBoundingBox.a(var3, var4, var5, 0, 0, 0, 9, 7, 11, var6);
      return a(var8) && StructurePiece.a(var1, var8) == null?new WorldGenVillageButcher(var0, var7, var2, var8, var6):null;
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
      this.a(var1, var3, 2, 0, 6, 8, 0, 10, Block.DIRT.id, Block.DIRT.id, false);
      this.a(var1, Block.COBBLESTONE.id, 0, 6, 0, 6, var3);
      this.a(var1, var3, 2, 1, 6, 2, 1, 10, Block.FENCE.id, Block.FENCE.id, false);
      this.a(var1, var3, 8, 1, 6, 8, 1, 10, Block.FENCE.id, Block.FENCE.id, false);
      this.a(var1, var3, 3, 1, 10, 7, 1, 10, Block.FENCE.id, Block.FENCE.id, false);
      this.a(var1, var3, 1, 0, 1, 7, 0, 4, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 0, 0, 0, 0, 3, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 8, 0, 0, 8, 3, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 0, 0, 7, 1, 0, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 0, 5, 7, 1, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 2, 0, 7, 3, 0, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 2, 5, 7, 3, 5, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 0, 4, 1, 8, 4, 1, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 0, 4, 4, 8, 4, 4, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 0, 5, 2, 8, 5, 3, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, Block.WOOD.id, 0, 0, 4, 2, var3);
      this.a(var1, Block.WOOD.id, 0, 0, 4, 3, var3);
      this.a(var1, Block.WOOD.id, 0, 8, 4, 2, var3);
      this.a(var1, Block.WOOD.id, 0, 8, 4, 3, var3);
      int var4 = this.c(Block.WOOD_STAIRS.id, 3);
      int var5 = this.c(Block.WOOD_STAIRS.id, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, Block.WOOD_STAIRS.id, var4, var7, 4 + var6, var6, var3);
            this.a(var1, Block.WOOD_STAIRS.id, var5, var7, 4 + var6, 5 - var6, var3);
         }
      }

      this.a(var1, Block.LOG.id, 0, 0, 2, 1, var3);
      this.a(var1, Block.LOG.id, 0, 0, 2, 4, var3);
      this.a(var1, Block.LOG.id, 0, 8, 2, 1, var3);
      this.a(var1, Block.LOG.id, 0, 8, 2, 4, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 2, 3, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 2, 3, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 2, 5, var3);
      this.a(var1, Block.GLASS.id, 0, 3, 2, 5, var3);
      this.a(var1, Block.GLASS.id, 0, 5, 2, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 6, 2, 5, var3);
      this.a(var1, Block.FENCE.id, 0, 2, 1, 3, var3);
      this.a(var1, Block.WOOD_PLATE.id, 0, 2, 2, 3, var3);
      this.a(var1, Block.WOOD.id, 0, 1, 1, 4, var3);
      this.a(var1, Block.WOOD_STAIRS.id, this.c(Block.WOOD_STAIRS.id, 3), 2, 1, 4, var3);
      this.a(var1, Block.WOOD_STAIRS.id, this.c(Block.WOOD_STAIRS.id, 1), 1, 1, 3, var3);
      this.a(var1, var3, 5, 0, 1, 7, 0, 3, Block.DOUBLE_STEP.id, Block.DOUBLE_STEP.id, false);
      this.a(var1, Block.DOUBLE_STEP.id, 0, 6, 1, 1, var3);
      this.a(var1, Block.DOUBLE_STEP.id, 0, 6, 1, 2, var3);
      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, Block.TORCH.id, 0, 2, 3, 1, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.c(Block.WOODEN_DOOR.id, 1));
      if(this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 3), 2, 0, -1, var3);
      }

      this.a(var1, 0, 0, 6, 1, 5, var3);
      this.a(var1, 0, 0, 6, 2, 5, var3);
      this.a(var1, Block.TORCH.id, 0, 6, 3, 4, var3);
      this.a(var1, var3, var2, 6, 1, 5, this.c(Block.WOODEN_DOOR.id, 1));

      for(var6 = 0; var6 < 5; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.b(var1, var7, 7, var6, var3);
            this.b(var1, Block.COBBLESTONE.id, 0, var7, -1, var6, var3);
         }
      }

      this.a(var1, var3, 4, 1, 2, 2);
      return true;
   }

   protected int b(int var1) {
      return var1 == 0?4:0;
   }
}
