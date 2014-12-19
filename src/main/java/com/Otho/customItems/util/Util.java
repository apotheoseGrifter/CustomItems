package com.Otho.customItems.util;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;

public class Util {
	
	public static int potionEffectId (String effect)
	{
		if(effect.equals("moveSpeed"))
		{
			return 1;
		}
		else if(effect.equals("moveSlowdown"))
		{
			return 2;
		}
		else if(effect.equals("digSpeed"))
		{
			return 3;
		}
		else if(effect.equals("digSlowdown"))
		{
			return 4;
		}
		else if(effect.equals("damageBoost"))
		{
			return 5;
		}
		else if(effect.equals("heal"))
		{
			return 6;
		}
		else if(effect.equals("harm"))
		{
			return 7;
		}
		else if(effect.equals("jump"))
		{
			return 8;
		}
		else if(effect.equals("confusion"))
		{
			return 9;
		}
		else if(effect.equals("regeneration"))
		{
			return 10;
		}
		else if(effect.equals("resistance"))
		{
			return 11;
		}
		else if(effect.equals("fireResistance"))
		{
			return 12;
		}
		else if(effect.equals("waterBreathing"))
		{
			return 13;
		}
		else if(effect.equals("invisibility"))
		{
			return 14;
		}
		else if(effect.equals("blindness"))
		{
			return 15;
		}
		else if(effect .equals("nightVision"))
		{
			return 16;
		}
		else if(effect.equals("hunger"))
		{
			return 17;
		}
		else if(effect.equals("weakness"))
		{
			return 18;
		}
		else if(effect.equals("poison"))
		{
			return 19;
		}
		else if(effect.equals("wither"))
		{
			return 20;
		}
		else if(effect.equals("healthBoost"))
		{
		    return 21;
		}
		else if(effect.equals("healthBoost"))
		{
		    return 22;
		}
		else if(effect.equals("healthBoost"))
		{
		    return 23;
		}
		else
		{
			return 6;
		}		
	}

	public static float range(float var, float min, float max)
	{
		if(var < min)
			var = min;
		if(var > max)
			var = max;
		
		return var;
	}
	
	public static int range(int var, int min, int max)
	{
		if(var < min)
			var = min;
		if(var > max)
			var = max;
		
		return var;
	}
	
	public static SoundType parseSoundType(String stepSound) {
		if(stepSound.equals("anvil"))
		{
			return Block.soundTypeAnvil;
		}else if(stepSound.equals("cloth"))
		{
			return Block.soundTypeCloth;
		}else if(stepSound.equals("glass"))
		{
			return Block.soundTypeGlass;
		}else if(stepSound.equals("grass"))
		{
			return Block.soundTypeGrass;
		}else if(stepSound.equals("gravel"))
		{
			return Block.soundTypeGravel;
		}else if(stepSound.equals("ladder"))
		{
			return Block.soundTypeLadder;
		}else if(stepSound.equals("metal"))
		{
			return Block.soundTypeMetal;
		}else if(stepSound.equals("piston"))
		{
			return Block.soundTypePiston;
		}else if(stepSound.equals("sand"))
		{
			return Block.soundTypeSand;
		}else if(stepSound.equals("snow"))
		{
			return Block.soundTypeSnow;
		}else if(stepSound.equals("stone"))
		{
			return Block.soundTypeStone;
		}else if(stepSound.equals("wood"))
		{
			return Block.soundTypeWood;
		}else 
		{
			return Block.soundTypeStone;
		}
	}
		
	public static String validateToolClass(String toolClass){
		if(toolClass.equals("pickaxe"))
		{
			return toolClass;
		}else if(toolClass.equals("axe"))
		{
			return toolClass;
		}else if(toolClass.equals("shovel"))
		{
			return toolClass;
		}else
		{
			return "pickaxe";
		}
	}
	
	public static String parseBlockType(String type){
		return "NORMAL";
	}

	public static String parseRegisterName(String name)
	{
		name = name.replaceAll("\\s+","_");
		name = name.toLowerCase();
		
		return name;
	}
}