package MoreOres.itemGroups;

import MoreOres.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Resources extends ItemGroup
{
	public Resources()
	{
		super("Resources");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemList.copper_ingot);
	}
}
