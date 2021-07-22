package MoreOres.block;

import net.minecraft.block.Block;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;

public class MachineBlock extends HorizontalBlock
{
    //static final DirectionProperty DirectionProperty = BlockStateProperties.;

    public MachineBlock(Properties properties)
    {
        super(properties);
        //this.setDefaultState(this.stateContainer.getBaseState().with(DirectionProperty, Direction.NORTH));
    }
}
