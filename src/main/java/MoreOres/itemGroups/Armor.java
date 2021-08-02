package MoreOres.itemGroups;

import MoreOres.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Armor extends ItemGroup
{

	public Armor()
	{
		super("Armor");
	}

	@Override
	public ItemStack makeIcon()
	{
		return new ItemStack(ItemList.copper_chestplate);
	}
}
