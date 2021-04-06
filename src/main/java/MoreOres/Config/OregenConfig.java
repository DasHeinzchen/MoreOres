package MoreOres.Config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig 
{
	public static ForgeConfigSpec.BooleanValue copper_generation;
	public static ForgeConfigSpec.IntValue copper_veinsize;
	public static ForgeConfigSpec.IntValue copper_height;
	public static ForgeConfigSpec.IntValue copper_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue tin_generation;
	public static ForgeConfigSpec.IntValue tin_veinsize;
	public static ForgeConfigSpec.IntValue tin_height;
	public static ForgeConfigSpec.IntValue tin_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue silver_generation;
	public static ForgeConfigSpec.IntValue silver_veinsize;
	public static ForgeConfigSpec.IntValue silver_height;
	public static ForgeConfigSpec.IntValue silver_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue lead_generation;
	public static ForgeConfigSpec.IntValue lead_veinsize;
	public static ForgeConfigSpec.IntValue lead_height;
	public static ForgeConfigSpec.IntValue lead_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue platinum_generation;
	public static ForgeConfigSpec.IntValue platinum_veinsize;
	public static ForgeConfigSpec.IntValue platinum_height;
	public static ForgeConfigSpec.IntValue platinum_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue uranium_generation;
	public static ForgeConfigSpec.IntValue uranium_veinsize;
	public static ForgeConfigSpec.IntValue uranium_height;
	public static ForgeConfigSpec.IntValue uranium_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue ruby_overworld_generation;
	public static ForgeConfigSpec.IntValue ruby_overworld_veinsize;
	public static ForgeConfigSpec.IntValue ruby_overworld_height;
	public static ForgeConfigSpec.IntValue ruby_overworld_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue topaz_generation;
	public static ForgeConfigSpec.IntValue topaz_veinsize;
	public static ForgeConfigSpec.IntValue topaz_height;
	public static ForgeConfigSpec.IntValue topaz_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue cobalt_overworld_generation;
	public static ForgeConfigSpec.IntValue cobalt_overworld_veinsize;
	public static ForgeConfigSpec.IntValue cobalt_overworld_height;
	public static ForgeConfigSpec.IntValue cobalt_overworld_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue nickel_generation;
	public static ForgeConfigSpec.IntValue nickel_veinsize;
	public static ForgeConfigSpec.IntValue nickel_height;
	public static ForgeConfigSpec.IntValue nickel_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue zinc_generation;
	public static ForgeConfigSpec.IntValue zinc_veinsize;
	public static ForgeConfigSpec.IntValue zinc_height;
	public static ForgeConfigSpec.IntValue zinc_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue titanium_generation;
	public static ForgeConfigSpec.IntValue titanium_veinsize;
	public static ForgeConfigSpec.IntValue titanium_height;
	public static ForgeConfigSpec.IntValue titanium_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue tungsten_generation;
	public static ForgeConfigSpec.IntValue tungsten_veinsize;
	public static ForgeConfigSpec.IntValue tungsten_height;
	public static ForgeConfigSpec.IntValue tungsten_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue lithium_generation;
	public static ForgeConfigSpec.IntValue lithium_veinsize;
	public static ForgeConfigSpec.IntValue lithium_height;
	public static ForgeConfigSpec.IntValue lithium_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue aluminium_generation;
	public static ForgeConfigSpec.IntValue aluminium_veinsize;
	public static ForgeConfigSpec.IntValue aluminium_height;
	public static ForgeConfigSpec.IntValue aluminium_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue amethyst_generation;
	public static ForgeConfigSpec.IntValue amethyst_veinsize;
	public static ForgeConfigSpec.IntValue amethyst_height;
	public static ForgeConfigSpec.IntValue amethyst_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue sapphire_generation;
	public static ForgeConfigSpec.IntValue sapphire_veinsize;
	public static ForgeConfigSpec.IntValue sapphire_height;
	public static ForgeConfigSpec.IntValue sapphire_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue osmium_generation;
	public static ForgeConfigSpec.IntValue osmium_veinsize;
	public static ForgeConfigSpec.IntValue osmium_height;
	public static ForgeConfigSpec.IntValue osmium_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue opal_generation;
	public static ForgeConfigSpec.IntValue opal_veinsize;
	public static ForgeConfigSpec.IntValue opal_height;
	public static ForgeConfigSpec.IntValue opal_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue ruby_nether_generation;
	public static ForgeConfigSpec.IntValue ruby_nether_veinsize;
	public static ForgeConfigSpec.IntValue ruby_nether_height;
	public static ForgeConfigSpec.IntValue ruby_nether_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue cobalt_nether_generation;
	public static ForgeConfigSpec.IntValue cobalt_nether_veinsize;
	public static ForgeConfigSpec.IntValue cobalt_nether_height;
	public static ForgeConfigSpec.IntValue cobalt_nether_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue ardite_generation;
	public static ForgeConfigSpec.IntValue ardite_veinsize;
	public static ForgeConfigSpec.IntValue ardite_height;
	public static ForgeConfigSpec.IntValue ardite_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue netherium_generation;
	public static ForgeConfigSpec.IntValue netherium_veinsize;
	public static ForgeConfigSpec.IntValue netherium_height;
	public static ForgeConfigSpec.IntValue netherium_chunk_frequency;
	public static ForgeConfigSpec.BooleanValue enderium_generation;
	public static ForgeConfigSpec.IntValue enderium_veinsize;
	public static ForgeConfigSpec.IntValue enderium_height;
	public static ForgeConfigSpec.IntValue enderium_chunk_frequency;
	
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
	{
		server.comment("Oregen Config");
		
		copper_generation = server
				.comment("Generation of Copper Ore")
				.define("oregen.overworld.copper.generation", true);
		copper_veinsize = server
				.comment("Maximum veinsize of Copper Ore")
				.defineInRange("oregen.overworld.copper.veinsize", 8, 1, 16);
		copper_height = server
				.comment("Maximum height Copper Ore can be generated")
				.defineInRange("oregen.overworld.copper.height", 64, 0, 255);
		copper_chunk_frequency = server
				.comment("How much Copper Ore will be generated per chunk")
				.defineInRange("oregen.overworld.copper.chunk_frequency", 20, 1, 32);
		tin_generation = server
				.comment("Generation of Tin Ore")
				.define("oregen.overworld.tin.generation", true);
		tin_veinsize = server
				.comment("Maximum veinsize of Tin Ore")
				.defineInRange("oregen.overworld.tin.veinsize", 8, 1, 16);
		tin_height = server
				.comment("Maximum height Tin Ore can be generated")
				.defineInRange("oregen.overworld.tin.height", 64, 0, 255);
		tin_chunk_frequency = server
				.comment("How much Tin Ore will be generated per chunk")
				.defineInRange("oregen.overworld.tin.chunk_frequency", 20, 1, 32);
		silver_generation = server
				.comment("Generation of Silver Ore")
				.define("oregen.overworld.silver.generation", true);
		silver_veinsize = server
				.comment("Maximum veinsize of Silver Ore")
				.defineInRange("oregen.overworld.silver.veinsize", 8, 1, 16);
		silver_height = server
				.comment("Maximum height Silver Ore can be generated")
				.defineInRange("oregen.overworld.silver.height", 64, 0, 255);
		silver_chunk_frequency = server
				.comment("How much Silver Ore will be generated per chunk")
				.defineInRange("oregen.overworld.silver.chunk_frequency", 20, 1, 32);
		lead_generation = server
				.comment("Generation of Lead Ore")
				.define("oregen.overworld.lead.generation", true);
		lead_veinsize = server
				.comment("Maximum veinsize of Lead Ore")
				.defineInRange("oregen.overworld.lead.veinsize", 8, 1, 16);
		lead_height = server
				.comment("Maximum height Lead Ore can be generated")
				.defineInRange("oregen.overworld.lead.height", 64, 0, 255);
		lead_chunk_frequency = server
				.comment("How much Lead Ore will be generated per chunk")
				.defineInRange("oregen.overworld.lead.chunk_frequency", 20, 1, 32);
		platinum_generation = server
				.comment("Generation of Platinum Ore")
				.define("oregen.overworld.platinum.generation", true);
		platinum_veinsize = server
				.comment("Maximum veinsize of Platinum Ore")
				.defineInRange("oregen.overworld.platinum.veinsize", 4, 1, 16);
		platinum_height = server
				.comment("Maximum height Platinum Ore can be generated")
				.defineInRange("oregen.overworld.platinum.height", 15, 0, 255);
		platinum_chunk_frequency = server
				.comment("How much Platinum Ore will be generated per chunk")
				.defineInRange("oregen.overworld.platinum.chunk_frequency", 2, 1, 32);
		uranium_generation = server
				.comment("Generation of Uranium Ore")
				.define("oregen.overworld.uranium.generation", true);
		uranium_veinsize = server
				.comment("Maximum veinsize of Uranium Ore")
				.defineInRange("oregen.overworld.uranium.veinsize", 8, 1, 16);
		uranium_height = server
				.comment("Maximum height Uranium Ore can be generated")
				.defineInRange("oregen.overworld.uranium.height", 45, 0, 255);
		uranium_chunk_frequency = server
				.comment("How much Uranium Ore will be generated per chunk")
				.defineInRange("oregen.overworld.uranium.chunk_frequency", 10, 1, 32);
		ruby_overworld_generation = server
				.comment("Generation of Ruby Ore in the Overworld")
				.define("oregen.overworld.ruby.generation", true);
		ruby_overworld_veinsize = server
				.comment("Maximum veinsize of Ruby Ore (Overworld)")
				.defineInRange("oregen.overworld.ruby.veinsize", 4, 1, 16);
		ruby_overworld_height = server
				.comment("Maximum height Ruby Ore can be generated in the Overworld")
				.defineInRange("oregen.overworld.ruby.height", 15, 0, 255);
		ruby_overworld_chunk_frequency = server
				.comment("How much Ruby Ore will be generated per chunk in the Overworld")
				.defineInRange("oregen.overworld.ruby.chunk_frequency", 2, 1, 32);
		topaz_generation = server
				.comment("Generation of Topaz Ore")
				.define("oregen.overworld.topaz.generation", true);
		topaz_veinsize = server
				.comment("Maximum veinsize of Topaz Ore")
				.defineInRange("oregen.overworld.topaz.veinsize", 4, 1, 16);
		topaz_height = server
				.comment("Maximum height Topaz Ore can be generated")
				.defineInRange("oregen.overworld.topaz.height", 30, 0, 255);
		topaz_chunk_frequency = server
				.comment("How much Topaz Ore will be generated per chunk")
				.defineInRange("oregen.overworld.topaz.chunk_frequency", 5, 1, 32);
		cobalt_overworld_generation = server
				.comment("Generation of Cobalt Ore in the Overworld")
				.define("oregen.overworld.cobalt.generation", true);
		cobalt_overworld_veinsize = server
				.comment("Maximum veinsize of Cobalt Ore (Overworld)")
				.defineInRange("oregen.overworld.cobalt.veinsize", 8, 1, 16);
		cobalt_overworld_height = server
				.comment("Maximum height Cobalt Ore can be generated in the Overworld")
				.defineInRange("oregen.overworld.cobalt.height", 30, 0, 255);
		cobalt_overworld_chunk_frequency = server
				.comment("How much Cobalt Ore will be generated per chunk in the Overworld")
				.defineInRange("oregen.overworld.cobalt.chunk_frequency", 5, 1, 32);
		nickel_generation = server
				.comment("Generation of Nickel Ore")
				.define("oregen.overworld.nickel.generation", true);
		nickel_veinsize = server
				.comment("Maximum veinsize of Nickel Ore")
				.defineInRange("oregen.overworld.nickel.veinsize", 8, 1, 16);
		nickel_height = server
				.comment("Maximum height Nickel Ore can be generated")
				.defineInRange("oregen.overworld.nickel.height", 64, 0, 255);
		nickel_chunk_frequency = server
				.comment("How much Nickel Ore will be generated per chunk")
				.defineInRange("oregen.overworld.nickel.chunk_frequency", 20, 1, 32);
		zinc_generation = server
				.comment("Generation of Zinc Ore")
				.define("oregen.overworld.zinc.generation", true);
		zinc_veinsize = server
				.comment("Maximum veinsize of Zinc Ore")
				.defineInRange("oregen.overworld.zinc.veinsize", 8, 1, 16);
		zinc_height = server
				.comment("Maximum height Zinc Ore can be generated")
				.defineInRange("oregen.overworld.zinc.height", 64, 0, 255);
		zinc_chunk_frequency = server
				.comment("How much Zinc Ore will be generated per chunk")
				.defineInRange("oregen.overworld.zinc.chunk_frequency", 20, 1, 32);
		titanium_generation = server
				.comment("Generation of Titanium Ore")
				.define("oregen.overworld.titanium.generation", true);
		titanium_veinsize = server
				.comment("Maximum veinsize of Titanium Ore")
				.defineInRange("oregen.overworld.titanium.veinsize", 4, 1, 16);
		titanium_height = server
				.comment("Maximum height Titanium Ore can be generated")
				.defineInRange("oregen.overworld.titanium.height", 45, 0, 255);
		titanium_chunk_frequency = server
				.comment("How much Titanium Ore will be generated per chunk")
				.defineInRange("oregen.overworld.titanium.chunk_frequency", 10, 1, 32);
		tungsten_generation = server
				.comment("Generation of Tungsten Ore")
				.define("oregen.overworld.tungsten.generation", true);
		tungsten_veinsize = server
				.comment("Maximum veinsize of Tungsten Ore")
				.defineInRange("oregen.overworld.tungsten.veinsize", 4, 1, 16);
		tungsten_height = server
				.comment("Maximum height Tungsten Ore can be generated")
				.defineInRange("oregen.overworld.tungsten.height", 45, 0, 255);
		tungsten_chunk_frequency = server
				.comment("How much Tungsten Ore will be generated per chunk")
				.defineInRange("oregen.overworld.tungsten.chunk_frequency", 10, 1, 32);
		lithium_generation = server
				.comment("Generation of Lithium Ore")
				.define("oregen.overworld.lithium.generation", true);
		lithium_veinsize = server
				.comment("Maximum veinsize of Lithium Ore")
				.defineInRange("oregen.overworld.lithium.veinsize", 8, 1, 16);
		lithium_height = server
				.comment("Maximum height Lithium Ore can be generated")
				.defineInRange("oregen.overworld.lithium.height", 45, 0, 255);
		lithium_chunk_frequency = server
				.comment("How much Lithium Ore will be generated per chunk")
				.defineInRange("oregen.overworld.lithium.chunk_frequency", 10, 1, 32);
		aluminium_generation = server
				.comment("Generation of Aluminium Ore")
				.define("oregen.overworld.aluminium.generation", true);
		aluminium_veinsize = server
				.comment("Maximum veinsize of Aluminium Ore")
				.defineInRange("oregen.overworld.aluminium.veinsize", 8, 1, 16);
		aluminium_height = server
				.comment("Maximum height Aluminium Ore can be generated")
				.defineInRange("oregen.overworld.aluminium.height", 64, 0, 255);
		aluminium_chunk_frequency = server
				.comment("How much Aluminium Ore will be generated per chunk")
				.defineInRange("oregen.overworld.aluminium.chunk_frequency", 20, 1, 32);
		amethyst_generation = server
				.comment("Generation of Amthyst Ore")
				.define("oregen.overworld.amethyst.generation", true);
		amethyst_veinsize = server
				.comment("Maximum veinsize of Amthyst Ore")
				.defineInRange("oregen.overworld.amethyst.veinsize", 4, 1, 16);
		amethyst_height = server
				.comment("Maximum height Amthyst Ore can be generated")
				.defineInRange("oregen.overworld.amethyst.height", 30, 0, 255);
		amethyst_chunk_frequency = server
				.comment("How much Amthyst Ore will be generated per chunk")
				.defineInRange("oregen.overworld.amethyst.chunk_frequency", 5, 1, 32);
		sapphire_generation = server
				.comment("Generation of Sapphire Ore")
				.define("oregen.overworld.sapphire.generation", true);
		sapphire_veinsize = server
				.comment("Maximum veinsize of Sapphire Ore")
				.defineInRange("oregen.overworld.sapphire.veinsize", 4, 1, 16);
		sapphire_height = server
				.comment("Maximum height Sapphire Ore can be generated")
				.defineInRange("oregen.overworld.sapphire.height", 30, 0, 255);
		sapphire_chunk_frequency = server
				.comment("How much Sapphire Ore will be generated per chunk")
				.defineInRange("oregen.overworld.sapphire.chunk_frequency", 5, 1, 32);
		osmium_generation = server
				.comment("Generation of Osmium Ore")
				.define("oregen.overworld.osmium.generation", true);
		osmium_veinsize = server
				.comment("Maximum veinsize of Osmium Ore")
				.defineInRange("oregen.overworld.osmium.veinsize", 8, 1, 16);
		osmium_height = server
				.comment("Maximum height Osmium Ore can be generated")
				.defineInRange("oregen.overworld.osmium.height", 64, 0, 255);
		osmium_chunk_frequency = server
				.comment("How much Osmium Ore will be generated per chunk")
				.defineInRange("oregen.overworld.osmium.chunk_frequency", 20, 1, 32);
		opal_generation = server
				.comment("Generation of Opal Ore")
				.define("oregen.overworld.opal.generation", true);
		opal_veinsize = server
				.comment("Maximum veinsize of Opal Ore")
				.defineInRange("oregen.overworld.opal.veinsize", 4, 1, 16);
		opal_height = server
				.comment("Maximum height Opal Ore can be generated")
				.defineInRange("oregen.overworld.opal.height", 30, 0, 255);
		opal_chunk_frequency = server
				.comment("How much Opal Ore will be generated per chunk")
				.defineInRange("oregen.overworld.opal.chunk_frequency", 5, 1, 32);
		ruby_nether_generation = server
				.comment("Generation of Ruby Ore in the Nether")
				.define("oregen.nether.ruby.generation", true);
		ruby_nether_veinsize = server
				.comment("Maximum veinsize of Ruby Ore (Nether)")
				.defineInRange("oregen.nether.ruby.veinsize", 4, 1, 16);
		ruby_nether_height = server
				.comment("Maximum height Ruby Ore can be generated in the Nether")
				.defineInRange("oregen.nether.ruby.height", 145, 0, 255);
		ruby_nether_chunk_frequency = server
				.comment("How much Ruby Ore will be generated per chunk in the Nether")
				.defineInRange("oregen.nether.ruby.chunk_frequency", 5, 1, 32);
		cobalt_nether_generation = server
				.comment("Generation of Cobalt Ore")
				.define("oregen.nether.cobalt.generation", true);
		cobalt_nether_veinsize = server
				.comment("Maximum veinsize of Cobalt Ore")
				.defineInRange("oregen.nether.cobalt.veinsize", 8, 1, 16);
		cobalt_nether_height = server
				.comment("Maximum height Cobalt Ore can be generated")
				.defineInRange("oregen.nether.cobalt.height", 250, 0, 255);
		cobalt_nether_chunk_frequency = server
				.comment("How much Cobalt Ore will be generated per chunk")
				.defineInRange("oregen.nether.cobalt.chunk_frequency", 10, 1, 32);
		ardite_generation = server
				.comment("Generation of Ardite Ore")
				.define("oregen.nether.ardite.generation", true);
		ardite_veinsize = server
				.comment("Maximum veinsize of Ardite Ore")
				.defineInRange("oregen.nether.ardite.veinsize", 8, 1, 16);
		ardite_height = server
				.comment("Maximum height Ardite Ore can be generated")
				.defineInRange("oregen.nether.ardite.height", 250, 0, 255);
		ardite_chunk_frequency = server
				.comment("How much Ardite Ore will be generated per chunk")
				.defineInRange("oregen.nether.ardite.chunk_frequency", 10, 1, 32);
		netherium_generation = server
				.comment("Generation of Netherium Ore")
				.define("oregen.nether.netherium.generation", true);
		netherium_veinsize = server
				.comment("Maximum veinsize of Netherium Ore")
				.defineInRange("oregen.nether.netherium.veinsize", 8, 1, 16);
		netherium_height = server
				.comment("Maximum height Netherium Ore can be generated")
				.defineInRange("oregen.nether.netherium.height", 250, 0, 255);
		netherium_chunk_frequency = server
				.comment("How much Netherium Ore will be generated per chunk")
				.defineInRange("oregen.nether.netherium.chunk_frequency", 5, 1, 32);
		enderium_generation = server
				.comment("Generation of Enderium Ore")
				.define("oregen.the_end.enderium.generation", true);
		enderium_veinsize = server
				.comment("Maximum veinsize of Enderium Ore")
				.defineInRange("oregen.the_end.enderium.veinsize", 8, 1, 16);
		enderium_height = server
				.comment("Maximum height Enderium Ore can be generated")
				.defineInRange("oregen.the_end.enderium.height", 250, 0, 255);
		enderium_chunk_frequency = server
				.comment("How much Enderium Ore will be generated per chunk")
				.defineInRange("oregen.the_end.enderium.chunk_frequency", 5, 1, 32);
	}
}
