package MoreOres.itemGroups;

import MoreOres.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Tools extends ItemGroup
{

	public Tools()
	{
		super("Tools");
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.copper_pickaxe);
	}
}
