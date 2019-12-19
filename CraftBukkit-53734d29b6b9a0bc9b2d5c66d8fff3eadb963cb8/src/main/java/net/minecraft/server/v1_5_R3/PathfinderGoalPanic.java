package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.EntityCreature;
import net.minecraft.server.v1_5_R3.PathfinderGoal;
import net.minecraft.server.v1_5_R3.RandomPositionGenerator;
import net.minecraft.server.v1_5_R3.Vec3D;

public class PathfinderGoalPanic extends PathfinderGoal {

   private EntityCreature a;
   private float b;
   private double c;
   private double d;
   private double e;


   public PathfinderGoalPanic(EntityCreature var1, float var2) {
      this.a = var1;
      this.b = var2;
      this.a(1);
   }

   public boolean a() {
     /* if(this.a.aF() == null && !this.a.isBurning()) {
         return false;
      } else {
         Vec3D var1 = RandomPositionGenerator.a(this.a, 5, 4);
         if(var1 == null) {
            return false;
         } else {
            this.c = var1.c;
            this.d = var1.d;
            this.e = var1.e;
            return true;
         }
      }*/
	   return false;
   }

   public void c() {
      this.a.getNavigation().a(this.c, this.d, this.e, this.b);
   }

   public boolean b() {
      return !this.a.getNavigation().f();
   }
}
