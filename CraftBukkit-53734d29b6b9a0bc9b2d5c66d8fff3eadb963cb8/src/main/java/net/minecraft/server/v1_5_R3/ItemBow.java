package net.minecraft.server.v1_5_R3;

public class ItemBow extends Item {
	public EnumBowType ebt;
	
    public static final String[] a = new String[] { "bow_pull_0", "bow_pull_1", "bow_pull_2"};

    public ItemBow(int i, EnumBowType ebt) {
        super(i);
        this.ebt = ebt;
        this.maxStackSize = 1;
        this.setMaxDurability(ebt.durability);
        this.a(CreativeModeTab.j);
    }

    public ItemStack a(ItemStack itemstack, World world, EntityHuman entityplayer) 
    {
    	 /*boolean var5 = entityplayer.abilities.canInstantlyBuild || EnchantmentManager.getEnchantmentLevel(Enchantment.ARROW_INFINITE.id, itemstack) > 0;
         if(  var5 || entityplayer.inventory.consumeInventoryItem(Item.ARROW.id))
         {
             world.makeSound(entityplayer, "random.bow", 1.0F, 1.0F / (e.nextFloat() * 0.4F + 0.8F));
             if(!world.isStatic)
             {
              world.addEntity(new EntityArrow(world, entityplayer));
             }
             itemstack.damage(1, entityplayer);
         }
    	return itemstack;*/
    	EntityArrow ea = new EntityArrow(world, entityplayer, EnumArrowType.DEFAULT, this.ebt);
   	 
    	boolean var5 = entityplayer.abilities.canInstantlyBuild;
    
    	int i = Item.ARROW.id;
    	if(var5 && this.ebt == EnumBowType.GOLDBOW)
    	{
    		i = Item.goldArrow.id;
    		ea.setArrowType(EnumArrowType.GOLDARROW);
    		ea.z();
    	}
    	else if(var5)
    	{
    		 i = Item.diamondArrow.id;
    		 ea.setArrowType(EnumArrowType.DIAMONDARROW);
    	}
    	else if(entityplayer.inventory.e(Item.goldArrow.id))
    	{
    		i = Item.goldArrow.id;
    		ea.setArrowType(EnumArrowType.GOLDARROW);
    	}
    	else if(entityplayer.inventory.e(Item.diamondArrow.id))
    	{
    		i = Item.diamondArrow.id;
    		ea.setArrowType(EnumArrowType.DIAMONDARROW);
    	}
    	else if(entityplayer.inventory.e(Item.ironArrow.id))
    	{
    		i = Item.ironArrow.id;
    		ea.setArrowType(EnumArrowType.IRONARROW);
    	}
    	
    	
    	if(ebt == EnumBowType.GOLDBOW)
    	{
    		
    		if(ea.eat == EnumArrowType.GOLDARROW)
    		{
    			ea.z();
    			//ea.setNoDropFlightDrop();
    		}
    	}
    	
        if(  var5 || entityplayer.inventory.consumeInventoryItem(i))
        {
            world.makeSound(entityplayer, "random.bow", 1.0F, (ebt.velocity + ea.eat.addedVel)* (e.nextFloat() * 0.4F) + 0.8F);
            if(!world.isStatic)
            {
                world.addEntity(ea);
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
