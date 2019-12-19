package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;

public class WorldGenVillageWell extends WorldGenVillagePiece {

    private final boolean a = true;
    private int b = -1;

    public WorldGenVillageWell(WorldGenVillageStartPiece worldgenvillagestartpiece, int i, Random random, int j, int k) {
        super(worldgenvillagestartpiece, i);
        this.f = random.nextInt(4);
        switch (this.f) {
        case 0:
        case 2:
            this.e = new StructureBoundingBox(j, 64, k, j + 6 - 1, 78, k + 6 - 1);
            break;

        default:
            this.e = new StructureBoundingBox(j, 64, k, j + 6 - 1, 78, k + 6 - 1);
        }
    }

    public void a(StructurePiece structurepiece, List list, Random random) {
        WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.a - 1, this.e.e - 4, this.e.c + 1, 1, this.c());
        WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.d + 1, this.e.e - 4, this.e.c + 1, 3, this.c());
        WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.a + 1, this.e.e - 4, this.e.c - 1, 2, this.c());
        WorldGenVillagePieces.b((WorldGenVillageStartPiece) structurepiece, list, random, this.e.a + 1, this.e.e - 4, this.e.f + 1, 0, this.c());
    }

    public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
        if (this.b < 0) {
            this.b = this.b(world, structureboundingbox);
            if (this.b < 0) {
                return true;
            }

            this.e.a(0, this.b - this.e.e + 2, 1);
        }

        this.a(world, structureboundingbox, 1, 0, 1, 4, 12, 4, Block.COBBLESTONE.id, Block.WATER.id, false);
        this.a(world, 0, 0, 2, 12, 2, structureboundingbox);
        this.a(world, 0, 0, 3, 12, 2, structureboundingbox);
        this.a(world, 0, 0, 2, 12, 3, structureboundingbox);
        this.a(world, 0, 0, 3, 12, 3, structureboundingbox);
        this.a(world, Block.FENCE.id, 0, 1, 13, 1, structureboundingbox);
        this.a(world, Block.FENCE.id, 0, 1, 14, 1, structureboundingbox);
        this.a(world, Block.FENCE.id, 0, 4, 13, 1, structureboundingbox);
        this.a(world, Block.FENCE.id, 0, 4, 14, 1, structureboundingbox);
        this.a(world, Block.FENCE.id, 0, 1, 13, 4, structureboundingbox);
        this.a(world, Block.FENCE.id, 0, 1, 14, 4, structureboundingbox);
        this.a(world, Block.FENCE.id, 0, 4, 13, 4, structureboundingbox);
        this.a(world, Block.FENCE.id, 0, 4, 14, 4, structureboundingbox);
        this.a(world, structureboundingbox, 1, 15, 1, 4, 15, 4, Block.COBBLESTONE.id, Block.COBBLESTONE.id, false);

        for (int x = -2; x <= 7; ++x)
        {
            for (int z = -2; z <= 7; ++z)
            {
                if(z == -2|| z == -1|| z == 0|| z == 5|| z == 6|| z == 7|| x == -2|| x == -1|| x == 0|| x == 5 || x == 6|| x == 7)
                {
                	if(random.nextInt(3) > 0)
                	{
                    this.a(world, Block.GRAVEL.id, 0, z, 11, x, structureboundingbox);
                	}
                	else if(random.nextInt(3) > 0)
                	{
                		 this.a(world, Block.MOSSY_COBBLESTONE.id, 0, z, 11, x, structureboundingbox);
                	}
                    this.b(world, z, 13, x, structureboundingbox);
                }
            }
        }

        return true;
    }
}