package net.minecraft.server.v1_5_R3;

import net.minecraft.server.v1_5_R3.BlockDispenser;
import net.minecraft.server.v1_5_R3.CreativeModeTab;
import net.minecraft.server.v1_5_R3.DispenseBehaviorArmor;
import net.minecraft.server.v1_5_R3.EntityHuman;
import net.minecraft.server.v1_5_R3.EntityLiving;
import net.minecraft.server.v1_5_R3.EnumArmorMaterial;
import net.minecraft.server.v1_5_R3.IDispenseBehavior;
import net.minecraft.server.v1_5_R3.Item;
import net.minecraft.server.v1_5_R3.ItemStack;
import net.minecraft.server.v1_5_R3.NBTTagCompound;
import net.minecraft.server.v1_5_R3.World;

public class ItemArmor extends Item {

   private static final int[] cu = new int[]{11, 16, 15, 13};
   private static final String[] cv = new String[]{"helmetCloth_overlay", "chestplateCloth_overlay", "leggingsCloth_overlay", "bootsCloth_overlay"};
   public static final String[] a = new String[]{"slot_empty_helmet", "slot_empty_chestplate", "slot_empty_leggings", "slot_empty_boots"};
   private static final IDispenseBehavior cw = new DispenseBehaviorArmor();
   public final int b;
   public final int c;
   public final int d;
   private final EnumArmorMaterial cx;


   public ItemArmor(int var1, EnumArmorMaterial var2, int var3, int var4) {
      super(var1);
      this.cx = var2;
      this.b = var4;
      this.d = var3;
      this.c = var2.b(var4);
      this.setMaxDurability(var2.a(var4));
      this.maxStackSize = 1;
      this.a(CreativeModeTab.j);
      BlockDispenser.a.a(this, cw);
   }

   public int c() {
      return this.cx.a();
   }

   public EnumArmorMaterial d() {
      return this.cx;
   }

   public boolean a(ItemStack var1) {
      return this.cx != EnumArmorMaterial.CLOTH?false:(!var1.hasTag()?false:(!var1.getTag().hasKey("display")?false:var1.getTag().getCompound("display").hasKey("color")));
   }

   public int b(ItemStack var1) {
      if(this.cx != EnumArmorMaterial.CLOTH) {
         return -1;
      } else {
         NBTTagCompound var2 = var1.getTag();
         if(var2 == null) {
            return 10511680;
         } else {
            NBTTagCompound var3 = var2.getCompound("display");
            return var3 == null?10511680:(var3.hasKey("color")?var3.getInt("color"):10511680);
         }
      }
   }

   public void c(ItemStack var1) {
      if(this.cx == EnumArmorMaterial.CLOTH) {
         NBTTagCompound var2 = var1.getTag();
         if(var2 != null) {
            NBTTagCompound var3 = var2.getCompound("display");
            if(var3.hasKey("color")) {
               var3.remove("color");
            }

         }
      }
   }

   public void b(ItemStack var1, int var2) {
      if(this.cx != EnumArmorMaterial.CLOTH) {
         throw new UnsupportedOperationException("Can\'t dye non-leather!");
      } else {
         NBTTagCompound var3 = var1.getTag();
         if(var3 == null) {
            var3 = new NBTTagCompound();
            var1.setTag(var3);
         }

         NBTTagCompound var4 = var3.getCompound("display");
         if(!var3.hasKey("display")) {
            var3.setCompound("display", var4);
         }

         var4.setInt("color", var2);
      }
   }

   public boolean a(ItemStack var1, ItemStack var2) {
      return this.cx.b() == var2.id?true:super.a(var1, var2);
   }

   public ItemStack a(ItemStack var1, World var2, EntityHuman var3) {
      int var4 = EntityLiving.b(var1) - 1;
      ItemStack var5 = var3.q(var4);
      if(var5 == null) {
         var3.setEquipment(var4, var1.cloneItemStack());
         var1.count = 0;
      }

      return var1;
   }

   // $FF: synthetic method
   static int[] e() {
      return cu;
   }

}
