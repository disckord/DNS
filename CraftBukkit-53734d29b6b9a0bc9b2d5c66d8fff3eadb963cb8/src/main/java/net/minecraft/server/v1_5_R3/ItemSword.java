package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.Block;
import net.minecraft.server.v1_5_R3.CreativeModeTab;
import net.minecraft.server.v1_5_R3.Entity;
import net.minecraft.server.v1_5_R3.EntityHuman;
import net.minecraft.server.v1_5_R3.EntityLiving;
import net.minecraft.server.v1_5_R3.EnumAnimation;
import net.minecraft.server.v1_5_R3.EnumToolMaterial;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;
import net.minecraft.server.v1_5_R3.Material;
import net.minecraft.server.v1_5_R3.World;

public class ItemSword extends Item {

   private int damage;
   private final EnumToolMaterial b;


   public ItemSword(int var1, EnumToolMaterial var2) {
      super(var1);
      this.b = var2;
      this.maxStackSize = 1;
      this.setMaxDurability(var2.a());
      this.a(CreativeModeTab.j);
      this.damage = 4 + var2.getQuartzDamageBonus() +  var2.c() * 2;
   }

   public int g() {
      return this.b.c();
   }

   public float getDestroySpeed(ItemStack var1, Block var2) {
      if(var2.id == Block.WEB.id) {
         return 15.0F;
      } else {
         Material var3 = var2.material;
         return var3 != Material.PLANT && var3 != Material.REPLACEABLE_PLANT && var3 != Material.CORAL && var3 != Material.LEAVES && var3 != Material.PUMPKIN?1.0F:1.5F;
      }
   }

   public boolean a(ItemStack var1, EntityLiving var2, EntityLiving var3) {
      var1.damage(1, var3);
      return true;
   }

   public boolean a(ItemStack var1, World var2, int var3, int var4, int var5, int var6, EntityLiving var7) {
      if((double)Block.byId[var3].l(var2, var4, var5, var6) != 0.0D) {
         var1.damage(2, var7);
      }

      return true;
   }

   public int a(Entity var1) {
      return this.damage;
   }

   public EnumAnimation b_(ItemStack var1) {
      return EnumAnimation.BLOCK;
   }

   public int c_(ItemStack var1) {
      return 72000;
   }

   public ItemStack a(ItemStack var1, World var2, EntityHuman var3) {
      var3.a(var1, this.c_(var1));
      return var1;
   }

   public boolean canDestroySpecialBlock(Block var1) {
      return var1.id == Block.WEB.id;
   }

   public int c() {
      return this.b.e();
   }

   public String h() {
      return this.b.toString();
   }

   public boolean a(ItemStack var1, ItemStack var2) {
      return this.b.f() == var2.id?true:super.a(var1, var2);
   }
}
