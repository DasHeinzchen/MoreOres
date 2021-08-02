package MoreOres.world;

import java.util.ArrayList;

import MoreOres.Config.OregenConfig;
import MoreOres.lists.BlockList;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class OreGeneration 
{
	
	private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
	private static final ArrayList<ConfiguredFeature<?, ?>> netherOres = new ArrayList<ConfiguredFeature<?, ?>>();
	private static final ArrayList<ConfiguredFeature<?, ?>> endOres = new ArrayList<ConfiguredFeature<?, ?>>();
	
	public static void setupOreGeneration()
	{
		//Adding Overworld Ores
		if(OregenConfig.copper_generation.get()) overworldOres.add(register("copper_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.copper_ore.defaultBlockState(), OregenConfig.copper_veinsize.get())).range(OregenConfig.copper_height.get()).squared().countRandom(OregenConfig.copper_chunk_frequency.get())));
		if(OregenConfig.tin_generation.get()) overworldOres.add(register("tin_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.tin_ore.defaultBlockState(), OregenConfig.tin_veinsize.get())).range(OregenConfig.tin_height.get()).squared().countRandom(OregenConfig.tin_chunk_frequency.get())));
		if(OregenConfig.silver_generation.get()) overworldOres.add(register("silver_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.silver_ore.defaultBlockState(), OregenConfig.silver_veinsize.get())).range(OregenConfig.silver_height.get()).squared().countRandom(OregenConfig.silver_chunk_frequency.get())));
		if(OregenConfig.lead_generation.get()) overworldOres.add(register("lead_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.lead_ore.defaultBlockState(), OregenConfig.lead_veinsize.get())).range(OregenConfig.lead_height.get()).squared().countRandom(OregenConfig.lead_chunk_frequency.get())));
		if(OregenConfig.platinum_generation.get()) overworldOres.add(register("platinum_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.platinum_ore.defaultBlockState(), OregenConfig.platinum_veinsize.get())).range(OregenConfig.platinum_height.get()).squared().countRandom(OregenConfig.platinum_chunk_frequency.get())));
		if(OregenConfig.uranium_generation.get()) overworldOres.add(register("uranium_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.uranium_ore.defaultBlockState(), OregenConfig.uranium_veinsize.get())).range(OregenConfig.uranium_height.get()).squared().countRandom(OregenConfig.uranium_chunk_frequency.get())));
		if(OregenConfig.ruby_overworld_generation.get()) overworldOres.add(register("ruby_ore_overworld", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.ruby_ore_overworld.defaultBlockState(), OregenConfig.ruby_overworld_veinsize.get())).range(OregenConfig.ruby_overworld_height.get()).squared().countRandom(OregenConfig.ruby_overworld_chunk_frequency.get())));
		if(OregenConfig.topaz_generation.get()) overworldOres.add(register("topaz_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.topaz_ore.defaultBlockState(), OregenConfig.topaz_veinsize.get())).range(OregenConfig.topaz_height.get()).squared().countRandom(OregenConfig.topaz_chunk_frequency.get())));
		if(OregenConfig.cobalt_overworld_generation.get()) overworldOres.add(register("cobalt_ore_overworld", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.cobalt_ore_overworld.defaultBlockState(), OregenConfig.cobalt_overworld_veinsize.get())).range(OregenConfig.cobalt_overworld_height.get()).squared().countRandom(OregenConfig.cobalt_overworld_chunk_frequency.get())));
		if(OregenConfig.nickel_generation.get()) overworldOres.add(register("nickel_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.nickel_ore.defaultBlockState(), OregenConfig.nickel_veinsize.get())).range(OregenConfig.nickel_height.get()).squared().countRandom(OregenConfig.nickel_chunk_frequency.get())));
		if(OregenConfig.zinc_generation.get()) overworldOres.add(register("zinc_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.zinc_ore.defaultBlockState(), OregenConfig.zinc_veinsize.get())).range(OregenConfig.zinc_height.get()).squared().countRandom(OregenConfig.zinc_chunk_frequency.get())));
		if(OregenConfig.titanium_generation.get()) overworldOres.add(register("titanium_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.titanium_ore.defaultBlockState(), OregenConfig.titanium_veinsize.get())).range(OregenConfig.titanium_height.get()).squared().countRandom(OregenConfig.titanium_chunk_frequency.get())));
		if(OregenConfig.tungsten_generation.get()) overworldOres.add(register("tungsten_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.tungsten_ore.defaultBlockState(), OregenConfig.tungsten_veinsize.get())).range(OregenConfig.tungsten_height.get()).squared().countRandom(OregenConfig.tungsten_chunk_frequency.get())));
		if(OregenConfig.lithium_generation.get()) overworldOres.add(register("lithium_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.lithium_ore.defaultBlockState(), OregenConfig.lithium_veinsize.get())).range(OregenConfig.lithium_height.get()).squared().countRandom(OregenConfig.lithium_chunk_frequency.get())));
		if(OregenConfig.aluminium_generation.get()) overworldOres.add(register("aluminium_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.aluminium_ore.defaultBlockState(), OregenConfig.aluminium_veinsize.get())).range(OregenConfig.aluminium_height.get()).squared().countRandom(OregenConfig.aluminium_chunk_frequency.get())));
		if(OregenConfig.amethyst_generation.get()) overworldOres.add(register("amethyst_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.amethyst_ore.defaultBlockState(), OregenConfig.amethyst_veinsize.get())).range(OregenConfig.amethyst_height.get()).squared().countRandom(OregenConfig.amethyst_chunk_frequency.get())));
		if(OregenConfig.sapphire_generation.get()) overworldOres.add(register("sapphire_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.sapphire_ore.defaultBlockState(), OregenConfig.sapphire_veinsize.get())).range(OregenConfig.sapphire_height.get()).squared().countRandom(OregenConfig.sapphire_chunk_frequency.get())));
		if(OregenConfig.osmium_generation.get()) overworldOres.add(register("osmium_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.osmium_ore.defaultBlockState(), OregenConfig.osmium_veinsize.get())).range(OregenConfig.osmium_height.get()).squared().countRandom(OregenConfig.osmium_chunk_frequency.get())));
		if(OregenConfig.opal_generation.get()) overworldOres.add(register("opal_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.opal_ore.defaultBlockState(), OregenConfig.opal_veinsize.get())).range(OregenConfig.opal_height.get()).squared().countRandom(OregenConfig.opal_chunk_frequency.get())));
		//Adding Nether Ores
		if(OregenConfig.ruby_nether_generation.get()) netherOres.add(register("ruby_ore_nether", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BlockList.ruby_ore_nether.defaultBlockState(), OregenConfig.ruby_nether_veinsize.get())).range(OregenConfig.ruby_nether_height.get()).squared().countRandom(OregenConfig.ruby_nether_chunk_frequency.get())));
		if(OregenConfig.cobalt_nether_generation.get()) netherOres.add(register("cobalt_ore_nether", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BlockList.cobalt_ore_nether.defaultBlockState(), OregenConfig.cobalt_nether_veinsize.get())).range(OregenConfig.cobalt_nether_height.get()).squared().countRandom(OregenConfig.cobalt_nether_chunk_frequency.get())));
		if(OregenConfig.ardite_generation.get()) netherOres.add(register("ardite_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BlockList.ardite_ore.defaultBlockState(), OregenConfig.ardite_veinsize.get())).range(OregenConfig.ardite_height.get()).squared().countRandom(OregenConfig.ardite_chunk_frequency.get())));
		if(OregenConfig.netherium_generation.get()) netherOres.add(register("netherium_ore", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BlockList.netherium_ore.defaultBlockState(), OregenConfig.netherium_veinsize.get())).range(OregenConfig.netherium_height.get()).squared().countRandom(OregenConfig.netherium_chunk_frequency.get())));
		//Adding End Ores
		if(OregenConfig.enderium_generation.get()) endOres.add(register("enderium_ore", Feature.ORE.configured(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), BlockList.enderium_ore.defaultBlockState(), OregenConfig.enderium_veinsize.get())).range(OregenConfig.enderium_height.get()).squared().countRandom(OregenConfig.enderium_chunk_frequency.get())));
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) 
	{
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(event.getCategory().equals(Biome.Category.NETHER))
        {
            for(ConfiguredFeature<?, ?> ore : netherOres)
            {
                if (ore != null) generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        if(event.getCategory().equals(Biome.Category.THEEND))
        {
            for(ConfiguredFeature<?, ?> ore : endOres)
            {
                if (ore != null) generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        for(ConfiguredFeature<?, ?> ore : overworldOres)
        {
            if (ore != null) generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        }
    }
	
	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "moreores:" + name, configuredFeature);
    }
}
