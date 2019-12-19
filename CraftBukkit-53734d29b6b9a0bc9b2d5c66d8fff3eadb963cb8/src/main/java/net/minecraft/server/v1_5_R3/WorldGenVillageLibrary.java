package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;
import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.StructureBoundingBox;
import net.minecraft.server.v1_5_R3.StructurePiece;
import net.minecraft.server.v1_5_R3.World;
import net.minecraft.server.v1_5_R3.WorldGenVillagePiece;
import net.minecraft.server.v1_5_R3.WorldGenVillageStartPiece;

public class WorldGenVillageLibrary extends WorldGenVillagePiece {

   private int a = -1;


   public WorldGenVillageLibrary(WorldGenVillageStartPiece var1, int var2, Random var3, StructureBoundingBox var4, int var5) {
      super(var1, var2);
      this.f = var5;
      this.e = var4;
   }

   public static WorldGenVillageLibrary a(WorldGenVillageStartPiece var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      StructureBoundingBox var8 = StructureBoundingBox.a(var3, var4, var5, 0, 0, 0, 9, 9, 6, var6);
      return a(var8) && StructurePiece.a(var1, var8) == null?new WorldGenVillageLibrary(var0, var7, var2, var8, var6):null;
   }

   public boolean a(World var1, Random var2, StructureBoundingBox var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 9 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 7, 5, 4, 0, 0, false);
      this.a(var1, var3, 0, 0, 0, 8, 0, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 5, 0, 8, 5, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 6, 1, 8, 6, 4, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 7, 2, 8, 7, 3, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      int var4 = this.c(Block.WOOD_STAIRS.id, 3);
      int var5 = this.c(Block.WOOD_STAIRS.id, 2);

      int var6;
      int var7;
      for(var6 = -1; var6 <= 2; ++var6) {
         for(var7 = 0; var7 <= 8; ++var7) {
            this.a(var1, Block.WOOD_STAIRS.id, var4, var7, 6 + var6, var6, var3);
            this.a(var1, Block.WOOD_STAIRS.id, var5, var7, 6 + var6, 5 - var6, var3);
         }
      }

      this.a(var1, var3, 0, 1, 0, 0, 1, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 1, 5, 8, 1, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 8, 1, 0, 8, 1, 4, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 2, 1, 0, 7, 1, 0, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 2, 0, 0, 4, 0, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 2, 5, 0, 4, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 8, 2, 5, 8, 4, 5, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 8, 2, 0, 8, 4, 0, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 2, 1, 0, 4, 4, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 2, 5, 7, 4, 5, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 8, 2, 1, 8, 4, 4, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 2, 0, 7, 4, 0, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, Block.GLASS.id, 0, 4, 2, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 5, 2, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 6, 2, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 4, 3, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 5, 3, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 6, 3, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 2, 3, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 3, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 3, 3, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 2, 3, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 3, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 8, 3, 3, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 2, 5, var3);
      this.a(var1, Block.GLASS.id, 0, 3, 2, 5, var3);
      this.a(var1, Block.GLASS.id, 0, 5, 2, 5, var3);
      this.a(var1, Block.GLASS.id, 0, 6, 2, 5, var3);
      this.a(var1, var3, 1, 4, 1, 7, 4, 1, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 4, 4, 7, 4, 4, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 3, 4, 7, 3, 4, Block.BOOKSHELF.id, Block.BOOKSHELF.id, false);
      this.a(var1, Block.WOOD.id, 0, 7, 1, 4, var3);
      this.a(var1, Block.WOOD_STAIRS.id, this.c(Block.WOOD_STAIRS.id, 0), 7, 1, 3, var3);
      var6 = this.c(Block.WOOD_STAIRS.id, 3);
      this.a(var1, Block.WOOD_STAIRS.id, var6, 6, 1, 4, var3);
      this.a(var1, Block.WOOD_STAIRS.id, var6, 5, 1, 4, var3);
      this.a(var1, Block.WOOD_STAIRS.id, var6, 4, 1, 4, var3);
      this.a(var1, Block.WOOD_STAIRS.id, var6, 3, 1, 4, var3);
      this.a(var1, Block.FENCE.id, 0, 6, 1, 3, var3);
      this.a(var1, Block.WOOD_PLATE.id, 0, 6, 2, 3, var3);
      this.a(var1, Block.FENCE.id, 0, 4, 1, 3, var3);
      this.a(var1, Block.WOOD_PLATE.id, 0, 4, 2, 3, var3);
      this.a(var1, Block.WORKBENCH.id, 0, 7, 1, 1, var3);
      this.a(var1, 0, 0, 1, 1, 0, var3);
      this.a(var1, 0, 0, 1, 2, 0, var3);
      this.a(var1, var3, var2, 1, 1, 0, this.c(Block.WOODEN_DOOR.id, 1));
      if(this.a(var1, 1, 0, -1, var3) == 0 && this.a(var1, 1, -1, -1, var3) != 0) {
         this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 3), 1, 0, -1, var3);
      }

      for(var7 = 0; var7 < 6; ++var7) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.b(var1, var8, 9, var7, var3);
            this.b(var1, Block.COBBLESTONE.id, 0, var8, -1, var7, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int b(int var1) {
      return 1;
   }
}
