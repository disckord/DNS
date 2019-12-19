package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;

public class WorldGenVillageRoad extends WorldGenVillageRoadPiece {

    private int a;

    public WorldGenVillageRoad(WorldGenVillageStartPiece worldgenvillagestartpiece, int i, Random random, StructureBoundingBox structureboundingbox, int j) {
        super(worldgenvillagestartpiece, i);
        this.f = j;
        this.e = structureboundingbox;
        this.a = Math.max(structureboundingbox.b(), structureboundingbox.d());
    }

    public void a(StructurePiece structurepiece, List list, Random random) {
        boolean flag = false;

        int i;
        StructurePiece structurepiece1;

        for (i = random.nextInt(5); i < this.a - 8; i += 2 + random.nextInt(5)) {
            structurepiece1 = this.a((WorldGenVillageStartPiece) structurepiece, list, random, 0, i);
            if (structurepiece1 != null) {
                i += Math.max(structurepiece1.e.b(), structurepiece1.e.d());
                flag = true;
            }
        }

        for (i = random.nextInt(5); i < this.a - 8; i += 2 + random.nextInt(5)) {
            structurepiece1 = this.b((WorldGenVillageStartPiece) structurepiece, list, random, 0, i);
            if (structurepiece1 != null) {
                i += Math.max(structurepiece1.e.b(), structurepiece1.e.d());
                flag = true;
            }
        }

        if (flag && random.nextInt(7) != 0) {
            switch (this.f) {
            case 0:
                WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.a - 1, this.e.b, this.e.f - 5, 1, this.c());
                break;

            case 1:
                WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.a, this.e.b, this.e.c - 1, 2, this.c());
                break;

            case 2:
                WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.a - 1, this.e.b, this.e.c, 1, this.c());
                break;

            case 3:
                WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.d - 5, this.e.b, this.e.c - 1, 2, this.c());
            }
        }

        if (flag && random.nextInt(7) != 0) {
            switch (this.f) {
            case 0:
                WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.d + 1, this.e.b, this.e.f - 5, 3, this.c());
                break;

            case 1:
                WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.a, this.e.b, this.e.f + 1, 0, this.c());
                break;

            case 2:
                WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.d + 1, this.e.b, this.e.c, 3, this.c());
                break;

            case 3:
                WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.d - 5, this.e.b, this.e.f + 1, 0, this.c());
            }
        }
    }

    public static StructureBoundingBox a(WorldGenVillageStartPiece worldgenvillagestartpiece, List list, Random random, int i, int j, int k, int l) {
        for (int i1 = 15 * MathHelper.nextInt(random, 3, 5); i1 >= 15; i1 -= 15) {
            StructureBoundingBox structureboundingbox = StructureBoundingBox.a(i, j, k, 0, 0, 0, 6, 6, i1, l);

            if (StructurePiece.a(list, structureboundingbox) == null) {
                return structureboundingbox;
            }
        }

        return null;
    }

    public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
        int blockid = this.d(Block.GRAVEL.id, 0);

        for (int j = this.e.a; j <= this.e.d; ++j) {
            for (int k = this.e.c; k <= this.e.f; ++k) {
                if (structureboundingbox.b(j, 64, k)) 
                {
                    int l = world.i(j, k) - 1;
                    if(random.nextInt(7) != 0)
                    {
                    world.setTypeIdAndData(j, l, k, blockid, 0, 2);
                    }
                    else if(blockid == Block.GRAVEL.id && random.nextInt(20) == 0)
                    {
                    	world.setTypeIdAndData(j, l, k, Block.MOSSY_COBBLESTONE.id, 0, 2);
                    }
                    else if(blockid == Block.GRAVEL.id && random.nextInt(20) == 0)
                    {
                    	world.setTypeIdAndData(j, l, k, Block.COBBLESTONE.id, 0, 2);
                    }
                }
            }
        }

        return true;
    }
}