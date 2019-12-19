package net.minecraft.server.v1_5_R3;

import java.util.List;
import java.util.Random;
import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.StructureBoundingBox;
import net.minecraft.server.v1_5_R3.StructurePiece;
import net.minecraft.server.v1_5_R3.StructurePieceTreasure;
import net.minecraft.server.v1_5_R3.WorldGenMineshaftCorridor;
import net.minecraft.server.v1_5_R3.WorldGenMineshaftCross;
import net.minecraft.server.v1_5_R3.WorldGenMineshaftStairs;

public class WorldGenMineshaftPieces {

	private static final StructurePieceTreasure[] a = new StructurePieceTreasure[] {
			new StructurePieceTreasure(Item.IRON_INGOT.id, 0, 1, 5, 10),
			new StructurePieceTreasure(Item.GOLD_INGOT.id, 0, 1, 3, 5),
			new StructurePieceTreasure(Item.REDSTONE.id, 0, 4, 9, 5),
			new StructurePieceTreasure(Item.INK_SACK.id, 4, 4, 9, 5),
			new StructurePieceTreasure(Item.DIAMOND.id, 0, 1, 2, 3),
			new StructurePieceTreasure(Item.COAL.id, 0, 3, 8, 10),
			new StructurePieceTreasure(Item.BREAD.id, 0, 1, 3, 15),
			new StructurePieceTreasure(Item.IRON_PICKAXE.id, 0, 1, 1, 1),
			new StructurePieceTreasure(Block.RAILS.id, 0, 4, 8, 1)};
			//new StructurePieceTreasure(Item.MELON_SEEDS.id, 0, 2, 4, 10),
			//new StructurePieceTreasure(Item.PUMPKIN_SEEDS.id, 0, 2, 4, 10) };

	private static StructurePiece a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1.nextInt(100);
		StructureBoundingBox var8;
		if (var7 >= 80) {
			var8 = WorldGenMineshaftCross.a(var0, var1, var2, var3, var4, var5);
			if (var8 != null) {
				return new WorldGenMineshaftCross(var6, var1, var8, var5);
			}
		} else if (var7 >= 70) {
			var8 = WorldGenMineshaftStairs.a(var0, var1, var2, var3, var4, var5);
			if (var8 != null) {
				return new WorldGenMineshaftStairs(var6, var1, var8, var5);
			}
		} else {
			var8 = WorldGenMineshaftCorridor.a(var0, var1, var2, var3, var4, var5);
			if (var8 != null) {
				return new WorldGenMineshaftCorridor(var6, var1, var8, var5);
			}
		}

		return null;
	}

	private static StructurePiece b(StructurePiece var0, List var1, Random var2, int var3, int var4, int var5, int var6,
			int var7) {
		if (var7 > 8) {
			return null;
		} else if (Math.abs(var3 - var0.b().a) <= 80 && Math.abs(var5 - var0.b().c) <= 80) {
			StructurePiece var8 = a(var1, var2, var3, var4, var5, var6, var7 + 1);
			if (var8 != null) {
				var1.add(var8);
				var8.a(var0, var1, var2);
			}

			return var8;
		} else {
			return null;
		}
	}

	// $FF: synthetic method
	static StructurePiece a(StructurePiece var0, List var1, Random var2, int var3, int var4, int var5, int var6,
			int var7) {
		return b(var0, var1, var2, var3, var4, var5, var6, var7);
	}

	// $FF: synthetic method
	static StructurePieceTreasure[] a() {
		return a;
	}

}
