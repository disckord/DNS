package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;
import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.StructureBoundingBox;
import net.minecraft.server.v1_5_R3.StructurePiece;
import net.minecraft.server.v1_5_R3.World;
import net.minecraft.server.v1_5_R3.WorldGenVillagePiece;
import net.minecraft.server.v1_5_R3.WorldGenVillageStartPiece;

public class WorldGenVillageHut extends WorldGenVillagePiece {

   private int a = -1;
   private final boolean b;
   private final int c;


   public WorldGenVillageHut(WorldGenVillageStartPiece var1, int var2, Random var3, StructureBoundingBox var4, int var5) {
      super(var1, var2);
      this.f = var5;
      this.e = var4;
      this.b = var3.nextBoolean();
      this.c = var3.nextInt(3);
   }

   public static WorldGenVillageHut a(WorldGenVillageStartPiece var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      StructureBoundingBox var8 = StructureBoundingBox.a(var3, var4, var5, 0, 0, 0, 4, 6, 5, var6);
      return a(var8) && StructurePiece.a(var1, var8) == null?new WorldGenVillageHut(var0, var7, var2, var8, var6):null;
   }

   public boolean a(World var1, Random var2, StructureBoundingBox var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 6 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 3, 5, 4, 0, 0, false);
      this.a(var1, var3, 0, 0, 0, 3, 0, 4, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 0, 1, 2, 0, 3, Block.DIRT.id, Block.DIRT.id, false);
      if(this.b) {
         this.a(var1, var3, 1, 4, 1, 2, 4, 3, Block.LOG.id, Block.LOG.id, false);
      } else {
         this.a(var1, var3, 1, 5, 1, 2, 5, 3, Block.LOG.id, Block.LOG.id, false);
      }

      this.a(var1, Block.LOG.id, 0, 1, 4, 0, var3);
      this.a(var1, Block.LOG.id, 0, 2, 4, 0, var3);
      this.a(var1, Block.LOG.id, 0, 1, 4, 4, var3);
      this.a(var1, Block.LOG.id, 0, 2, 4, 4, var3);
      this.a(var1, Block.LOG.id, 0, 0, 4, 1, var3);
      this.a(var1, Block.LOG.id, 0, 0, 4, 2, var3);
      this.a(var1, Block.LOG.id, 0, 0, 4, 3, var3);
      this.a(var1, Block.LOG.id, 0, 3, 4, 1, var3);
      this.a(var1, Block.LOG.id, 0, 3, 4, 2, var3);
      this.a(var1, Block.LOG.id, 0, 3, 4, 3, var3);
      this.a(var1, var3, 0, 1, 0, 0, 3, 0, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 3, 1, 0, 3, 3, 0, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 0, 1, 4, 0, 3, 4, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 3, 1, 4, 3, 3, 4, Block.LOG.id, Block.LOG.id, false);
      this.a(var1, var3, 0, 1, 1, 0, 3, 3, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 3, 1, 1, 3, 3, 3, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 1, 0, 2, 3, 0, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, var3, 1, 1, 4, 2, 3, 4, Block.WOOD.id, Block.WOOD.id, false);
      this.a(var1, Block.GLASS.id, 0, 0, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 3, 2, 2, var3);
      if(this.c > 0) {
         this.a(var1, Block.FENCE.id, 0, this.c, 1, 3, var3);
         this.a(var1, Block.WOOD_PLATE.id, 0, this.c, 2, 3, var3);
      }

      this.a(var1, 0, 0, 1, 1, 0, var3);
      this.a(var1, 0, 0, 1, 2, 0, var3);
      this.a(var1, var3, var2, 1, 1, 0, this.c(Block.WOODEN_DOOR.id, 1));
      if(this.a(var1, 1, 0, -1, var3) == 0 && this.a(var1, 1, -1, -1, var3) != 0) {
         this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 3), 1, 0, -1, var3);
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 4; ++var5) {
            this.b(var1, var5, 6, var4, var3);
            this.b(var1, Block.COBBLESTONE.id, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
