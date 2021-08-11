package MoreOres.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreBlock extends BaseBlock
{

    public OreBlock(Material material, SoundType soundType, float hardness, float resistance, int harvestLevel, ToolType harvestTool, String registryName)
    {
        super(material, soundType, hardness, resistance, harvestLevel, harvestTool, registryName);
    }
    public OreBlock(float hardness, float resistance, int harvestLevel, String registryName)
    {
        super(Material.STONE, SoundType.STONE, hardness, resistance, harvestLevel, ToolType.PICKAXE, registryName);
    }
}
