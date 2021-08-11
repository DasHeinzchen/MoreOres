package MoreOres.tileEntity;

import MoreOres.init.RegisterTileEntities;
import MoreOres.recipe.CrusherRecipe;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;

public class CrusherTileEntity extends AbstractFurnaceTileEntity
{

    public CrusherTileEntity()
    {
        super(RegisterTileEntities.CRUSHER.get(), CrusherRecipe.TYPE);
    }

    @Override
    public ITextComponent getDefaultName()
    {
        return null;
    }

    @Override
    public Container createMenu(int id, PlayerInventory player)
    {
        return null;
    }
}
