package net.minecraft.server.v1_5_R3;

public class PathfinderGoalNetherCreeperSwell extends PathfinderGoal {

    EntityNetherCreeper a;
    EntityLiving b;

    public PathfinderGoalNetherCreeperSwell(EntityNetherCreeper entitycreeper) {
        this.a = entitycreeper;
        this.a(1);
    }
   

    public boolean a() {
        EntityLiving entityliving = this.a.getGoalTarget();
        if(this.a.o() > 0 || entityliving != null && this.a.e(entityliving) < 20.0D)
        {
        	this.a.rotateAttackRight();
        }
        return this.a.o() > 0 || entityliving != null && this.a.e(entityliving) < 9.0D;
    }

    public void c() {
        this.a.getNavigation().g();
        this.b = this.a.getGoalTarget();
    }

    public void d() {
        this.b = null;
    }

    public void e() {
        if (this.b == null) {
            this.a.a(-1);
        } else if (this.a.e(this.b) > 49.0D) {
            this.a.a(-1);
        } else if (!this.a.getEntitySenses().canSee(this.b)) {
            this.a.a(-1);
        } else {
            this.a.a(1);
        }
    }
}