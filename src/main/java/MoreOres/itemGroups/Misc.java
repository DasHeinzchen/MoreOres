package MoreOres.itemGroups;

import MoreOres.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Misc extends ItemGroup
{
    public Misc()
    {
        super("Misc");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemList.crusher);
    }
}
