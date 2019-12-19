package net.minecraft.server.v1_5_R3;

public class ItemBow extends Item {

    public static final String[] a = new String[] { "bow_pull_0", "bow_pull_1", "bow_pull_2"};

    public ItemBow(int i) {
        super(i);
        this.maxStackSize = 1;
        this.setMaxDurability(384);
        this.a(CreativeModeTab.j);
    }

    public ItemStack a(ItemStack itemstack, World world, EntityHuman entityplayer) 
    {
    	 boolean var5 = entityplayer.abilities.canInstantlyBuild || EnchantmentManager.getEnchantmentLevel(Enchantment.ARROW_INFINITE.id, itemstack) > 0;
         if(  var5 || entityplayer.inventory.consumeInventoryItem(Item.ARROW.id))
         {
             world.makeSound(entityplayer, "random.bow", 1.0F, 1.0F / (e.nextFloat() * 0.4F + 0.8F));
             if(!world.isStatic)
             {
              world.addEntity(new EntityArrow(world, entityplayer));
             }
             itemstack.damage(1, entityplayer);
         }
    	return itemstack;
    }

  

 

    public EnumAnimation b_(ItemStack itemstack) {
        return EnumAnimation.BOW;
    }

   

    public int c() {
        return 1;
    }
}
