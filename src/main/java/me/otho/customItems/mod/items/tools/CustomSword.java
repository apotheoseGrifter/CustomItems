package me.otho.customItems.mod.items.tools;

import me.otho.customItems.ModReference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomSword extends ItemSword {
    public CustomSword(ToolMaterial mat) {
        super(mat);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister iconRegister) {
    	if(this.iconString == null)
    	{
    		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    	}else
    	{
    		itemIcon = iconRegister.registerIcon(ModReference.MOD_ID.toLowerCase() + ":" + this.iconString);
    	}
    }
    
//    @Override
//    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
//    {
//    	if(stack.getItemDamage() == stack.getMaxDamage())
//    	{
//    		return true;
//    	}else
//    	{
//    		return false;
//    	}
//        
//    }
    
}