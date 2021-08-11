package MoreOres.init;

import MoreOres.block.*;
import MoreOres.lists.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
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
			BlockList.copper_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 1, ToolType.PICKAXE, "copper_block"),
			BlockList.tin_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 1, ToolType.PICKAXE, "tin_block"),
			BlockList.silver_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 1, ToolType.PICKAXE, "silver_block"),
			BlockList.lead_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 1, ToolType.PICKAXE, "lead_block"),
			BlockList.platinum_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 3, ToolType.PICKAXE, "platinum_block"),
			BlockList.uranium_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "uranium_block"),
			BlockList.ruby_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "ruby_block"),
			BlockList.topaz_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "topaz_block"),
			BlockList.cobalt_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 3, ToolType.PICKAXE, "cobalt_block"),
			BlockList.ardite_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "ardite_block"),
			BlockList.nickel_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 1, ToolType.PICKAXE, "nickel_block"),
			BlockList.netherium_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "netherium_block"),
			BlockList.enderium_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "enderium_block"),
			BlockList.zinc_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 1, ToolType.PICKAXE, "zinc_block"),
			BlockList.titanium_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 3, ToolType.PICKAXE, "titanium_block"),
			BlockList.tungsten_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "tungsten_block"),
			BlockList.lithium_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "lithium_block"),
			BlockList.aluminium_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 1, ToolType.PICKAXE, "aluminium_block"),
			BlockList.amethyst_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "amethyst_block"),
			BlockList.sapphire_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "sapphire_block"),
			BlockList.osmium_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 1, ToolType.PICKAXE, "osmium_block"),
			BlockList.opal_block = new BaseBlock(Material.METAL, SoundType.METAL, 2.0F, 3.0F, 2, ToolType.PICKAXE, "opal_block"),
			//Ores
			BlockList.copper_ore = new OreBlock(2.0F, 3.0F, 1, "copper_ore"),
			BlockList.tin_ore = new OreBlock(2.0F, 3.0F, 1, "tin_ore"),
			BlockList.silver_ore = new OreBlock(2.0F, 3.0F, 1, "silver_ore"),
			BlockList.lead_ore = new OreBlock(2.0F, 3.0F, 1, "lead_ore"),
			BlockList.platinum_ore = new OreBlock(2.0F, 3.0F, 3, "platinum_ore"),
			BlockList.uranium_ore = new OreBlock(2.0F, 3.0F, 2, "uranium_ore"),
			BlockList.ruby_ore_overworld = new OreBlock(2.0F, 3.0F, 2, "ruby_ore_overworld"),
			BlockList.ruby_ore_nether = new OreBlock(2.0F, 3.0F, 2, "ruby_ore_nether"),
			BlockList.topaz_ore = new OreBlock(2.0F, 3.0F, 2, "topaz_ore"),
			BlockList.cobalt_ore_overworld = new OreBlock(2.0F, 3.0F, 2, "cobalt_ore_overworld"),
			BlockList.cobalt_ore_nether = new OreBlock(2.0F, 3.0F, 2, "cobalt_ore_nether"),
			BlockList.ardite_ore = new OreBlock(2.0F, 3.0F, 2, "ardite_ore"),
			BlockList.nickel_ore = new OreBlock(2.0F, 3.0F, 1, "nickel_ore"),
			BlockList.netherium_ore = new OreBlock(2.0F, 3.0F, 2, "netherium_ore"),
			BlockList.enderium_ore = new OreBlock(2.0F, 3.0F, 2, "enderium_ore"),
			BlockList.zinc_ore = new OreBlock(2.0F, 3.0F, 1, "zinc_ore"),
			BlockList.titanium_ore = new OreBlock(2.0F, 3.0F, 3, "titanium_ore"),
			BlockList.tungsten_ore = new OreBlock(2.0F, 3.0F, 2, "tungsten_ore"),
			BlockList.lithium_ore = new OreBlock(2.0F, 3.0F, 2, "lithium_ore"),
			BlockList.aluminium_ore = new OreBlock(2.0F, 3.0F, 1, "aluminium_ore"),
			BlockList.amethyst_ore = new OreBlock(2.0F, 3.0F, 2, "amethyst_ore"),
			BlockList.sapphire_ore = new OreBlock(2.0F, 3.0F, 2, "sapphire_ore"),
			BlockList.osmium_ore = new OreBlock(2.0F, 3.0F, 1, "osmium_ore"),
			BlockList.opal_ore = new OreBlock(2.0F, 3.0F, 2, "opal_ore"),
			//Machines
			BlockList.crusher = new Crusher(2.0F, 3.0F, 2, ToolType.PICKAXE, "crusher"),
			BlockList.centrifuge = new Centrifuge(2.0F, 3.0F, 2, ToolType.PICKAXE,"centrifuge"),
			BlockList.power_provider = new PowerProvider(2.0F, 3.0F, 2, ToolType.PICKAXE,"power_provider")
		);
	}
}