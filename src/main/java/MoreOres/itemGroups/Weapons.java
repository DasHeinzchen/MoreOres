package MoreOres.itemGroups;

import MoreOres.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Weapons extends ItemGroup
{

	public Weapons()
	{
		super("Weapons");
	}

	@Override
	public ItemStack makeIcon()
	{
		return new ItemStack(ItemList.copper_sword);
	}
}
