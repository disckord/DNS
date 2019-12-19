package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.Entity;
import net.minecraft.server.v1_5_R3.EntityLiving;
import net.minecraft.server.v1_5_R3.IBlockAccess;
import net.minecraft.server.v1_5_R3.Material;
import net.minecraft.server.v1_5_R3.MathHelper;
import net.minecraft.server.v1_5_R3.PathEntity;
import net.minecraft.server.v1_5_R3.PathPoint;
import net.minecraft.server.v1_5_R3.Vec3D;
import net.minecraft.server.v1_5_R3.World;

public class Navigation {

   private EntityLiving a;
   private World b;
   private PathEntity c;
   private float d;
   private float e;
   private boolean f = false;
   private int g;
   private int h;
   private Vec3D i = Vec3D.a(0.0D, 0.0D, 0.0D);
   private boolean j = true;
   private boolean k = false;
   private boolean l = false;
   private boolean m = false;


   public Navigation(EntityLiving var1, World var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.e = var3;
   }

   public void a(boolean var1) {
      this.l = var1;
   }

   public boolean a() {
      return this.l;
   }

   public void b(boolean var1) {
      this.k = false;
   }

   public void c(boolean var1) {
      this.j = var1;
   }

   public boolean c() {
      return this.k;
   }

   public void d(boolean var1) {
      this.f = var1;
   }

   public void a(float var1) {
      this.d = var1;
   }

   public void e(boolean var1) {
      this.m = var1;
   }

   public PathEntity a(double var1, double var3, double var5) {
      return !this.k()?null:this.b.a(this.a, MathHelper.floor(var1), (int)var3, MathHelper.floor(var5), this.e, this.j, this.k, this.l, this.m);
   }

   public boolean a(double var1, double var3, double var5, float var7) {
      PathEntity var8 = this.a((double)MathHelper.floor(var1), (double)((int)var3), (double)MathHelper.floor(var5));
      return this.a(var8, var7);
   }

   public PathEntity a(EntityLiving var1) {
      return !this.k()?null:this.b.findPath(this.a, var1, this.e, this.j, this.k, this.l, this.m);
   }

   public boolean a(EntityLiving var1, float var2) {
      PathEntity var3 = this.a(var1);
      return var3 != null?this.a(var3, var2):false;
   }

   public boolean a(PathEntity var1, float var2) {
      if(var1 == null) {
         this.c = null;
         return false;
      } else {
         if(!var1.a(this.c)) {
            this.c = var1;
         }

         if(this.f) {
            this.m();
         }

         if(this.c.d() == 0) {
            return false;
         } else {
            this.d = var2;
            Vec3D var3 = this.i();
            this.h = this.g;
            this.i.c = var3.c;
            this.i.d = var3.d;
            this.i.e = var3.e;
            return true;
         }
      }
   }

   public PathEntity d() {
      return this.c;
   }

   public void e() {
      ++this.g;
      if(!this.f()) {
         if(this.k()) {
            this.h();
         }

         if(!this.f()) {
            Vec3D var1 = this.c.a((Entity)this.a);
            if(var1 != null) {
               this.a.getControllerMove().a(var1.c, var1.d, var1.e, this.d);
            }
         }
      }
   }

   private void h() {
      Vec3D var1 = this.i();
      int var2 = this.c.d();

      for(int var3 = this.c.e(); var3 < this.c.d(); ++var3) {
         if(this.c.a(var3).b != (int)var1.d) {
            var2 = var3;
            break;
         }
      }

      float var8 = this.a.width * this.a.width;

      int var4;
      for(var4 = this.c.e(); var4 < var2; ++var4) {
         if(var1.distanceSquared(this.c.a(this.a, var4)) < (double)var8) {
            this.c.c(var4 + 1);
         }
      }

      var4 = MathHelper.f(this.a.width);
      int var5 = (int)this.a.length + 1;
      int var6 = var4;

      for(int var7 = var2 - 1; var7 >= this.c.e(); --var7) {
         if(this.a(var1, this.c.a(this.a, var7), var4, var5, var6)) {
            this.c.c(var7);
            break;
         }
      }

      if(this.g - this.h > 100) {
         if(var1.distanceSquared(this.i) < 2.25D) {
            this.g();
         }

         this.h = this.g;
         this.i.c = var1.c;
         this.i.d = var1.d;
         this.i.e = var1.e;
      }

   }

   public boolean f() {
      return this.c == null || this.c.b();
   }

   public void g() {
      this.c = null;
   }

   private Vec3D i() {
      return this.b.getVec3DPool().create(this.a.locX, (double)this.j(), this.a.locZ);
   }

   private int j() {
      if(this.a.G() && this.m) {
         int var1 = (int)this.a.boundingBox.b;
         int var2 = this.b.getTypeId(MathHelper.floor(this.a.locX), var1, MathHelper.floor(this.a.locZ));
         int var3 = 0;

         do {
            if(var2 != Block.WATER.id && var2 != Block.STATIONARY_WATER.id) {
               return var1;
            }

            ++var1;
            var2 = this.b.getTypeId(MathHelper.floor(this.a.locX), var1, MathHelper.floor(this.a.locZ));
            ++var3;
         } while(var3 <= 16);

         return (int)this.a.boundingBox.b;
      } else {
         return (int)(this.a.boundingBox.b + 0.5D);
      }
   }

   private boolean k() {
      return this.a.onGround || this.m && this.l();
   }

   private boolean l() {
      return this.a.G() || this.a.I();
   }

   private void m() {
      if(!this.b.l(MathHelper.floor(this.a.locX), (int)(this.a.boundingBox.b + 0.5D), MathHelper.floor(this.a.locZ))) {
         for(int var1 = 0; var1 < this.c.d(); ++var1) {
            PathPoint var2 = this.c.a(var1);
            if(this.b.l(var2.a, var2.b, var2.c)) {
               this.c.b(var1 - 1);
               return;
            }
         }

      }
   }

   private boolean a(Vec3D var1, Vec3D var2, int var3, int var4, int var5) {
      int var6 = MathHelper.floor(var1.c);
      int var7 = MathHelper.floor(var1.e);
      double var8 = var2.c - var1.c;
      double var10 = var2.e - var1.e;
      double var12 = var8 * var8 + var10 * var10;
      if(var12 < 1.0E-8D) {
         return false;
      } else {
         double var14 = 1.0D / Math.sqrt(var12);
         var8 *= var14;
         var10 *= var14;
         var3 += 2;
         var5 += 2;
         if(!this.a(var6, (int)var1.d, var7, var3, var4, var5, var1, var8, var10)) {
            return false;
         } else {
            var3 -= 2;
            var5 -= 2;
            double var16 = 1.0D / Math.abs(var8);
            double var18 = 1.0D / Math.abs(var10);
            double var20 = (double)(var6 * 1) - var1.c;
            double var22 = (double)(var7 * 1) - var1.e;
            if(var8 >= 0.0D) {
               ++var20;
            }

            if(var10 >= 0.0D) {
               ++var22;
            }

            var20 /= var8;
            var22 /= var10;
            int var24 = var8 < 0.0D?-1:1;
            int var25 = var10 < 0.0D?-1:1;
            int var26 = MathHelper.floor(var2.c);
            int var27 = MathHelper.floor(var2.e);
            int var28 = var26 - var6;
            int var29 = var27 - var7;

            do {
               if(var28 * var24 <= 0 && var29 * var25 <= 0) {
                  return true;
               }

               if(var20 < var22) {
                  var20 += var16;
                  var6 += var24;
                  var28 = var26 - var6;
               } else {
                  var22 += var18;
                  var7 += var25;
                  var29 = var27 - var7;
               }
            } while(this.a(var6, (int)var1.d, var7, var3, var4, var5, var1, var8, var10));

            return false;
         }
      }
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, Vec3D var7, double var8, double var10) {
      int var12 = var1 - var4 / 2;
      int var13 = var3 - var6 / 2;
      if(!this.b(var12, var2, var13, var4, var5, var6, var7, var8, var10)) {
         return false;
      } else {
         for(int var14 = var12; var14 < var12 + var4; ++var14) {
            for(int var15 = var13; var15 < var13 + var6; ++var15) {
               double var16 = (double)var14 + 0.5D - var7.c;
               double var18 = (double)var15 + 0.5D - var7.e;
               if(var16 * var8 + var18 * var10 >= 0.0D) {
                  int var20 = this.b.getTypeId(var14, var2 - 1, var15);
                  if(var20 <= 0) {
                     return false;
                  }

                  Material var21 = Block.byId[var20].material;
                  if(var21 == Material.WATER && !this.a.G()) {
                     return false;
                  }

                  if(var21 == Material.LAVA) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private boolean b(int var1, int var2, int var3, int var4, int var5, int var6, Vec3D var7, double var8, double var10) {
      for(int var12 = var1; var12 < var1 + var4; ++var12) {
         for(int var13 = var2; var13 < var2 + var5; ++var13) {
            for(int var14 = var3; var14 < var3 + var6; ++var14) {
               double var15 = (double)var12 + 0.5D - var7.c;
               double var17 = (double)var14 + 0.5D - var7.e;
               if(var15 * var8 + var17 * var10 >= 0.0D) {
                  int var19 = this.b.getTypeId(var12, var13, var14);
                  if(var19 > 0 && !Block.byId[var19].b((IBlockAccess)this.b, var12, var13, var14)) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }
}
