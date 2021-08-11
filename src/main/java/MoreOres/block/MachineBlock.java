package MoreOres.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.common.ToolType;

public abstract class MachineBlock extends HorizontalBlock
{
    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    public static final BooleanProperty ACTIVE = BlockStateProperties.LIT;

    public MachineBlock(float hardness, float resistance, int harvestLevel, ToolType harvestTool, String registryName)
    {
        super(AbstractBlock.Properties.of(Material.METAL).sound(SoundType.METAL).strength(hardness, resistance).harvestLevel(harvestLevel).harvestTool(harvestTool));

        this.setRegistryName(registryName);
    }
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, ACTIVE);
    }
}
