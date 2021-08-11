package MoreOres.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public class BaseBlock extends Block
{
    public BaseBlock(Material material, SoundType soundType, float hardness, float resistance, int harvestLevel, ToolType harvestTool, String registryName)
    {
        super(AbstractBlock.Properties.of(material).sound(soundType).strength(hardness, resistance).harvestLevel(harvestLevel).harvestTool(harvestTool));
        this.setRegistryName(new ResourceLocation("moreores", registryName));
    }
}
