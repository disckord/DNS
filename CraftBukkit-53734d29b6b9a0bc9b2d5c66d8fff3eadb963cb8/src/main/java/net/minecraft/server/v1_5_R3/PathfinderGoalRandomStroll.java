package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.EntityCreature;
import net.minecraft.server.v1_5_R3.PathfinderGoal;
import net.minecraft.server.v1_5_R3.RandomPositionGenerator;
import net.minecraft.server.v1_5_R3.Vec3D;

public class PathfinderGoalRandomStroll extends PathfinderGoal {

   private EntityCreature a;
   private double b;
   private double c;
   private double d;
   private float e;


   public PathfinderGoalRandomStroll(EntityCreature var1, float var2) {
      this.a = var1;
      this.e = var2;
      this.a(1);
   }

   public boolean a() {
      /*if(this.a.aH() >= 100) {
         return false;
      } else*/ if(this.a.aE().nextInt(72) != 0) {
         return false;
      } else {
         Vec3D var1 = RandomPositionGenerator.a(this.a, 10, 7);
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.c;
            this.c = var1.d;
            this.d = var1.e;
            return true;
         }
      }
   }

   public boolean b() {
      return !this.a.getNavigation().f();
   }

   public void c() {
      this.a.getNavigation().a(this.b, this.c, this.d, this.e);
   }
}
