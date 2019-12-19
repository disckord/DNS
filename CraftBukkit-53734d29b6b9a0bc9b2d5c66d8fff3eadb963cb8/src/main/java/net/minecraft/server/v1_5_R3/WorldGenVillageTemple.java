package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;
import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.StructureBoundingBox;
import net.minecraft.server.v1_5_R3.StructurePiece;
import net.minecraft.server.v1_5_R3.World;
import net.minecraft.server.v1_5_R3.WorldGenVillagePiece;
import net.minecraft.server.v1_5_R3.WorldGenVillageStartPiece;

public class WorldGenVillageTemple extends WorldGenVillagePiece {

   private int a = -1;


   public WorldGenVillageTemple(WorldGenVillageStartPiece var1, int var2, Random var3, StructureBoundingBox var4, int var5) {
      super(var1, var2);
      this.f = var5;
      this.e = var4;
   }

   public static WorldGenVillageTemple a(WorldGenVillageStartPiece var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      StructureBoundingBox var8 = StructureBoundingBox.a(var3, var4, var5, 0, 0, 0, 5, 12, 9, var6);
      return a(var8) && StructurePiece.a(var1, var8) == null?new WorldGenVillageTemple(var0, var7, var2, var8, var6):null;
   }

   public boolean a(World var1, Random var2, StructureBoundingBox var3) {
      if(this.a < 0) {
         this.a = this.b(var1, var3);
         if(this.a < 0) {
            return true;
         }

         this.e.a(0, this.a - this.e.e + 12 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 7, 0, 0, false);
      this.a(var1, var3, 1, 5, 1, 3, 9, 3, 0, 0, false);
      this.a(var1, var3, 1, 0, 0, 3, 0, 8, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 1, 0, 3, 10, 0, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 1, 1, 0, 10, 3, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 4, 1, 1, 4, 10, 3, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 0, 4, 0, 4, 7, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 4, 0, 4, 4, 4, 7, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 1, 8, 3, 4, 8, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 5, 4, 3, 10, 4, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 1, 5, 5, 3, 5, 7, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 9, 0, 4, 9, 4, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);
      this.a(var1, Block.COBBLESTONE.id, 0, 0, 11, 2, var3);
      this.a(var1, Block.COBBLESTONE.id, 0, 4, 11, 2, var3);
      this.a(var1, Block.COBBLESTONE.id, 0, 2, 11, 0, var3);
      this.a(var1, Block.COBBLESTONE.id, 0, 2, 11, 4, var3);
      this.a(var1, Block.COBBLESTONE.id, 0, 1, 1, 6, var3);
      this.a(var1, Block.COBBLESTONE.id, 0, 1, 1, 7, var3);
      this.a(var1, Block.COBBLESTONE.id, 0, 2, 1, 7, var3);
      this.a(var1, Block.COBBLESTONE.id, 0, 3, 1, 6, var3);
      this.a(var1, Block.COBBLESTONE.id, 0, 3, 1, 7, var3);
      this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 3), 1, 1, 5, var3);
      this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 3), 2, 1, 6, var3);
      this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 3), 3, 1, 5, var3);
      this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 1), 1, 2, 7, var3);
      this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 0), 3, 2, 7, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 3, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 4, 2, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 4, 3, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 6, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 7, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 4, 6, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 4, 7, 2, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 6, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 7, 0, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 6, 4, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 7, 4, var3);
      this.a(var1, Block.GLASS.id, 0, 0, 3, 6, var3);
      this.a(var1, Block.GLASS.id, 0, 4, 3, 6, var3);
      this.a(var1, Block.GLASS.id, 0, 2, 3, 8, var3);
      this.a(var1, Block.TORCH.id, 0, 2, 4, 7, var3);
      this.a(var1, Block.TORCH.id, 0, 1, 4, 6, var3);
      this.a(var1, Block.TORCH.id, 0, 3, 4, 6, var3);
      this.a(var1, Block.TORCH.id, 0, 2, 4, 5, var3);
      int var4 = this.c(Block.LADDER.id, 4);

      int var5;
      for(var5 = 1; var5 <= 9; ++var5) {
         this.a(var1, Block.LADDER.id, var4, 3, var5, 3, var3);
      }

      this.a(var1, 0, 0, 2, 1, 0, var3);
      this.a(var1, 0, 0, 2, 2, 0, var3);
      this.a(var1, var3, var2, 2, 1, 0, this.c(Block.WOODEN_DOOR.id, 1));
      if(this.a(var1, 2, 0, -1, var3) == 0 && this.a(var1, 2, -1, -1, var3) != 0) {
         this.a(var1, Block.COBBLESTONE_STAIRS.id, this.c(Block.COBBLESTONE_STAIRS.id, 3), 2, 0, -1, var3);
      }

      for(var5 = 0; var5 < 9; ++var5) {
         for(int var6 = 0; var6 < 5; ++var6) {
            this.b(var1, var6, 12, var5, var3);
            this.b(var1, Block.COBBLESTONE.id, 0, var6, -1, var5, var3);
         }
      }

      this.a(var1, var3, 2, 1, 2, 1);
      return true;
   }

   protected int b(int var1) {
      return 2;
   }
}
