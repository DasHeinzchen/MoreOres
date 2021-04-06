package MoreOres.init;

import MoreOres.lists.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "moreores", bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterBlocks 
{
	//Register Blocks
	@SubscribeEvent
	public static void onBlockRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
	{
		blockRegistryEvent.getRegistry().registerAll
		(
			//Itemblocks
			BlockList.copper_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("copper_block")),
			BlockList.tin_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("tin_block")),
			BlockList.silver_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("silver_block")),
			BlockList.lead_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("lead_block")),
			BlockList.platinum_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName(location("platinum_block")),
			BlockList.uranium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("uranium_block")),
			BlockList.ruby_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("ruby_block")),
			BlockList.topaz_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("topaz_block")),
			BlockList.cobalt_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("cobalt_block")),
			BlockList.ardite_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("ardite_block")),
			BlockList.nickel_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("nickel_block")),
			BlockList.netherium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("netherium_block")),
			BlockList.enderium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("enderium_block")),
			BlockList.zinc_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("zinc_block")),
			BlockList.titanium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName(location("titanium_block")),
			BlockList.tungsten_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("tungsten_block")),
			BlockList.lithium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("lithium_block")),
			BlockList.aluminium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("aluminium_block")),
			BlockList.amethyst_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("amethyst_block")),
			BlockList.sapphire_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("sapphire_block")),
			BlockList.osmium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("osmium_block")),
			BlockList.opal_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("opal_block")),
			//Ores
			BlockList.copper_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("copper_ore")),
			BlockList.tin_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("tin_ore")),
			BlockList.silver_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("silver_ore")),
			BlockList.lead_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("lead_ore")),
			BlockList.platinum_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName(location("platinum_ore")),
			BlockList.uranium_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("uranium_ore")),
			BlockList.ruby_ore_overworld = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("ruby_ore_overworld")),
			BlockList.ruby_ore_nether = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("ruby_ore_nether")),
			BlockList.topaz_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("topaz_ore")),
			BlockList.cobalt_ore_overworld = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("cobalt_ore_overworld")),
			BlockList.cobalt_ore_nether = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("cobalt_ore_nether")),
			BlockList.ardite_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("ardite_ore")),
			BlockList.nickel_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("nickel_ore")),
			BlockList.netherium_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("netherium_ore")),
			BlockList.enderium_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("enderium_ore")),
			BlockList.zinc_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("zinc_ore")),
			BlockList.titanium_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE)).setRegistryName(location("titanium_ore")),
			BlockList.tungsten_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("tungsten_ore")),
			BlockList.lithium_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("lithium_ore")),
			BlockList.aluminium_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("aluminium_ore")),
			BlockList.amethyst_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("amethyst_ore")),
			BlockList.sapphire_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("sapphire_ore")),
			BlockList.osmium_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)).setRegistryName(location("osmium_ore")),
			BlockList.opal_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(location("opal_ore"))
		);
	}
	private static ResourceLocation location(String name) 
	{
		return new ResourceLocation("moreores", name);
	}
}