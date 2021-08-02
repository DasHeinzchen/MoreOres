package MoreOres.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
	COPPER(4f, 4f, 150, 1, 7, ItemList.copper_ingot),
	TIN(4f, 4f, 150, 1, 7, ItemList.tin_ingot),
	SILVER(4f, 4f, 168, 1, 8, ItemList.silver_ingot),
	LEAD(4f, 4f, 165, 1, 20, ItemList.lead_ingot),
	PLATINUM(6f, 8f, 1600, 3, 17, ItemList.platinum_ingot),
	URANIUM(5f, 7f, 1550, 2, 18, ItemList.uranium_ingot),
	RUBY(6f, 8f, 1250, 2, 21, ItemList.ruby_gem),
	TOPAZ(6f, 8f, 1250, 2, 21, ItemList.topaz_gem),
	COBALT(5f, 6f, 620, 2, 15, ItemList.cobalt_ingot),
	ARDITE(5f, 6f, 620, 2, 17, ItemList.ardite_ingot),
	NICKEL(4f, 4f, 130, 1, 9, ItemList.nickel_ingot),
	NETHERIUM(5f, 5f, 260, 2, 15, ItemList.netherium_ingot),
	ENDERIUM(5f, 6f, 400, 3, 28, ItemList.enderium_ingot),
	ZINC(3f, 4f, 150, 1, 7, ItemList.zinc_ingot),
	TITANIUM(6f, 7f, 1111, 2, 12, ItemList.titanium_ingot),
	TUNGSTEN(5f, 6f, 1010, 2, 10, ItemList.tungsten_ingot),
	LITHIUM(3f, 3f, 98, 1, 17, ItemList.lithium_ingot),
	ALUMINIUM(3f, 3f, 104, 1, 9, ItemList.aluminium_ingot),
	AMETHYST(6f, 8f, 1250, 2, 21, ItemList.amethyst_gem),
	SAPPHIRE(6f, 8f, 1250, 2, 21, ItemList.sapphire_gem),
	OSMIUM(4f, 5f, 987, 1, 16, ItemList.osmium_ingot),
	OPAL(5f, 8f, 1111, 2, 15, ItemList.opal_gem);
	
	private float attackDmg, efficiency;
	private int durability, harvestLevel, enchantabillity;
	private Item repairMaterial;
	
	private ToolMaterialList(float attackDmg, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) 
	{
		this.attackDmg = attackDmg;
		this.efficiency = efficiency;
		this.durability = durability; //All Tools same
		this.harvestLevel = harvestLevel;
		this.enchantabillity = enchantability; // Wood 15, Stone 5, Iron 14, Gold 22, Dia 10, 1.16Netherite 15
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getUses()
	{
		return this.durability;
	}

	@Override
	public float getSpeed()
	{
		return this.efficiency;
	}

	@Override
	public float getAttackDamageBonus()
	{
		return this.attackDmg;
	}

	@Override
	public int getLevel()
	{
		return this.harvestLevel;
	}

	@Override
	public int getEnchantmentValue()
	{
		return this.enchantabillity;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.of(this.repairMaterial);
	}
}
