package MoreOres.tileEntity;

import MoreOres.recipe.CrusherRecipe;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;

public class CrusherTileEntity extends AbstractFurnaceTileEntity
{

    protected CrusherTileEntity(TileEntityType<?> tileTypeIn)
    {
        super(tileTypeIn, CrusherRecipe.TYPE);
    }

    @Override
    protected ITextComponent getDefaultName()
    {
        return null;
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player)
    {
        return null;
    }
}
