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
		if(OregenConfig.copper_generation.get()) overworldOres.add(register("copper_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.copper_ore.getDefaultState(), OregenConfig.copper_veinsize.get())).range(OregenConfig.copper_height.get()).square().func_242731_b(OregenConfig.copper_chunk_frequency.get())));
		if(OregenConfig.tin_generation.get()) overworldOres.add(register("tin_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.tin_ore.getDefaultState(), OregenConfig.tin_veinsize.get())).range(OregenConfig.tin_height.get()).square().func_242731_b(OregenConfig.tin_chunk_frequency.get())));
		if(OregenConfig.silver_generation.get()) overworldOres.add(register("silver_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.silver_ore.getDefaultState(), OregenConfig.silver_veinsize.get())).range(OregenConfig.silver_height.get()).square().func_242731_b(OregenConfig.silver_chunk_frequency.get())));
		if(OregenConfig.lead_generation.get()) overworldOres.add(register("lead_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.lead_ore.getDefaultState(), OregenConfig.lead_veinsize.get())).range(OregenConfig.lead_height.get()).square().func_242731_b(OregenConfig.lead_chunk_frequency.get())));
		if(OregenConfig.platinum_generation.get()) overworldOres.add(register("platinum_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.platinum_ore.getDefaultState(), OregenConfig.platinum_veinsize.get())).range(OregenConfig.platinum_height.get()).square().func_242731_b(OregenConfig.platinum_chunk_frequency.get())));
		if(OregenConfig.uranium_generation.get()) overworldOres.add(register("uranium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.uranium_ore.getDefaultState(), OregenConfig.uranium_veinsize.get())).range(OregenConfig.uranium_height.get()).square().func_242731_b(OregenConfig.uranium_chunk_frequency.get())));
		if(OregenConfig.ruby_overworld_generation.get()) overworldOres.add(register("ruby_ore_overworld", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.ruby_ore_overworld.getDefaultState(), OregenConfig.ruby_overworld_veinsize.get())).range(OregenConfig.ruby_overworld_height.get()).square().func_242731_b(OregenConfig.ruby_overworld_chunk_frequency.get())));
		if(OregenConfig.topaz_generation.get()) overworldOres.add(register("topaz_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.topaz_ore.getDefaultState(), OregenConfig.topaz_veinsize.get())).range(OregenConfig.topaz_height.get()).square().func_242731_b(OregenConfig.topaz_chunk_frequency.get())));
		if(OregenConfig.cobalt_overworld_generation.get()) overworldOres.add(register("cobalt_ore_overworld", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.cobalt_ore_overworld.getDefaultState(), OregenConfig.cobalt_overworld_veinsize.get())).range(OregenConfig.cobalt_overworld_height.get()).square().func_242731_b(OregenConfig.cobalt_overworld_chunk_frequency.get())));
		if(OregenConfig.nickel_generation.get()) overworldOres.add(register("nickel_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.nickel_ore.getDefaultState(), OregenConfig.nickel_veinsize.get())).range(OregenConfig.nickel_height.get()).square().func_242731_b(OregenConfig.nickel_chunk_frequency.get())));
		if(OregenConfig.zinc_generation.get()) overworldOres.add(register("zinc_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.zinc_ore.getDefaultState(), OregenConfig.zinc_veinsize.get())).range(OregenConfig.zinc_height.get()).square().func_242731_b(OregenConfig.zinc_chunk_frequency.get())));
		if(OregenConfig.titanium_generation.get()) overworldOres.add(register("titanium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.titanium_ore.getDefaultState(), OregenConfig.titanium_veinsize.get())).range(OregenConfig.titanium_height.get()).square().func_242731_b(OregenConfig.titanium_chunk_frequency.get())));
		if(OregenConfig.tungsten_generation.get()) overworldOres.add(register("tungsten_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.tungsten_ore.getDefaultState(), OregenConfig.tungsten_veinsize.get())).range(OregenConfig.tungsten_height.get()).square().func_242731_b(OregenConfig.tungsten_chunk_frequency.get())));
		if(OregenConfig.lithium_generation.get()) overworldOres.add(register("lithium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.lithium_ore.getDefaultState(), OregenConfig.lithium_veinsize.get())).range(OregenConfig.lithium_height.get()).square().func_242731_b(OregenConfig.lithium_chunk_frequency.get())));
		if(OregenConfig.aluminium_generation.get()) overworldOres.add(register("aluminium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.aluminium_ore.getDefaultState(), OregenConfig.aluminium_veinsize.get())).range(OregenConfig.aluminium_height.get()).square().func_242731_b(OregenConfig.aluminium_chunk_frequency.get())));
		if(OregenConfig.amethyst_generation.get()) overworldOres.add(register("amethyst_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.amethyst_ore.getDefaultState(), OregenConfig.amethyst_veinsize.get())).range(OregenConfig.amethyst_height.get()).square().func_242731_b(OregenConfig.amethyst_chunk_frequency.get())));
		if(OregenConfig.sapphire_generation.get()) overworldOres.add(register("sapphire_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.sapphire_ore.getDefaultState(), OregenConfig.sapphire_veinsize.get())).range(OregenConfig.sapphire_height.get()).square().func_242731_b(OregenConfig.sapphire_chunk_frequency.get())));
		if(OregenConfig.osmium_generation.get()) overworldOres.add(register("osmium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.osmium_ore.getDefaultState(), OregenConfig.osmium_veinsize.get())).range(OregenConfig.osmium_height.get()).square().func_242731_b(OregenConfig.osmium_chunk_frequency.get())));
		if(OregenConfig.opal_generation.get()) overworldOres.add(register("opal_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.opal_ore.getDefaultState(), OregenConfig.opal_veinsize.get())).range(OregenConfig.opal_height.get()).square().func_242731_b(OregenConfig.opal_chunk_frequency.get())));
		//Adding Nether Ores
		if(OregenConfig.ruby_nether_generation.get()) netherOres.add(register("ruby_ore_nether", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, BlockList.ruby_ore_nether.getDefaultState(), OregenConfig.ruby_nether_veinsize.get())).range(OregenConfig.ruby_nether_height.get()).square().func_242731_b(OregenConfig.ruby_nether_chunk_frequency.get())));
		if(OregenConfig.cobalt_nether_generation.get()) netherOres.add(register("cobalt_ore_nether", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, BlockList.cobalt_ore_nether.getDefaultState(), OregenConfig.cobalt_nether_veinsize.get())).range(OregenConfig.cobalt_nether_height.get()).square().func_242731_b(OregenConfig.cobalt_nether_chunk_frequency.get())));
		if(OregenConfig.ardite_generation.get()) netherOres.add(register("ardite_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, BlockList.ardite_ore.getDefaultState(), OregenConfig.ardite_veinsize.get())).range(OregenConfig.ardite_height.get()).square().func_242731_b(OregenConfig.ardite_chunk_frequency.get())));
		if(OregenConfig.netherium_generation.get()) netherOres.add(register("netherium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, BlockList.netherium_ore.getDefaultState(), OregenConfig.netherium_veinsize.get())).range(OregenConfig.netherium_height.get()).square().func_242731_b(OregenConfig.netherium_chunk_frequency.get())));
		//Adding End Ores
		if(OregenConfig.enderium_generation.get()) endOres.add(register("enderium_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), BlockList.enderium_ore.getDefaultState(), OregenConfig.enderium_veinsize.get())).range(OregenConfig.enderium_height.get()).square().func_242731_b(OregenConfig.enderium_chunk_frequency.get())));
	}
	
	@SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) 
	{
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(event.getCategory().equals(Biome.Category.NETHER))
        {
            for(ConfiguredFeature<?, ?> ore : netherOres)
            {
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        if(event.getCategory().equals(Biome.Category.THEEND))
        {
            for(ConfiguredFeature<?, ?> ore : endOres)
            {
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
        for(ConfiguredFeature<?, ?> ore : overworldOres)
        {
            if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        }
    }
	
	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "moreores:" + name, configuredFeature);
    }
}
