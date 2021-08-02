package MoreOres.lists;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import MoreOres.MoreOres;

public enum ArmorMaterialList implements IArmorMaterial
{
	COPPER("moreores.copper", 10, new int[] {2, 3, 5, 2}, 7, ItemList.copper_ingot, "item.armor.equip_iron", 0.0f, 0.0f),
	TIN("moreores.tin", 10, new int[] {2, 3, 5, 2}, 7, ItemList.tin_ingot, "item.armor.equip_iron", 0.0f, 0.0f),
	SILVER("moreores.silver", 13, new int[] {2, 4, 5, 2}, 8, ItemList.silver_ingot, "item.armor.equip_iron", 1.0f, 0.0f),
	LEAD("moreores.lead", 8, new int[] {1, 3, 4, 2}, 20, ItemList.lead_ingot, "item.armor.equip_iron", 2.0f, 0.5f),
	PLATINUM("moreores.platinum", 35, new int[] {3, 6, 9, 4}, 17, ItemList.platinum_ingot, "item.armor.equip_iron", 2.5f, 0.5f),
	URANIUM("moreores.uranium", 16, new int[] {2, 6, 6, 2}, 18, ItemList.uranium_ingot, "item.armor.equip_iron", 1.5f, 0.0f),
	RUBY("moreores.ruby", 25, new int[] {2, 5, 7, 3}, 21, ItemList.ruby_gem, "item.armor.equip_iron", 1.5f, 0.0f),
	TOPAZ("moreores.topaz", 26, new int[] {3, 5, 7, 3}, 21, ItemList.topaz_gem, "item.armor.equip_iron", 1.75f, 0.0f),
	COBALT("moreores.cobalt", 20, new int[] {2, 5, 7, 2}, 15, ItemList.cobalt_ingot, "item.armor.equip_iron", 1.0f, 0.0f),
	ARDITE("moreores.ardite", 20, new int[] {2, 5, 7, 2}, 17, ItemList.ardite_ingot, "item.armor.equip_iron", 1.0f, 0.0f),
	NICKEL("moreores.nickel", 12, new int[] {2, 4, 5, 2}, 9, ItemList.nickel_ingot, "item.armor.equip_iron", 0.0f, 0.0f),
	NETHERIUM("moreores.netherite", 17, new int[] {2, 6, 7, 2}, 15, ItemList.netherium_ingot, "item.armor.equip_iron", 0.0f, 0.0f),
	ENDERIUM("moreores.enderium", 30, new int[] {3, 6, 7, 3}, 28, ItemList.enderium_ingot, "item.armor.equip_iron", 1.5f, 0.5f),
	ZINC("moreores.zinc", 11, new int[] {2, 3, 5, 2}, 7, ItemList.zinc_ingot, "item.armor.equip_iron", 0.0f, 0.0f),
	TITANIUM("moreores.titanium", 18, new int[] {2, 5, 6, 3}, 12, ItemList.titanium_ingot, "item.armor.equip_iron", 2.0f, 0.5f),
	TUNGSTEN("moreores.tungsten", 17, new int[] {2, 5, 6, 2}, 10, ItemList.tungsten_ingot, "item.armor.equip_iron", 1.5f, 0.0f),
	LITHIUM("moreores.lithium", 6, new int[] {1, 2, 3, 1}, 17, ItemList.lithium_ingot, "item.armor.equip_iron", 0.5f, 0.0f),
	ALUMINIUM("moreores.aluminium", 9, new int[] {2, 3, 4, 2}, 9, ItemList.aluminium_ingot, "item.armor.equip_iron", 0.0f, 0.0f),
	AMETHYST("moreores.amethyst", 25, new int[] {2, 5, 7, 3}, 21, ItemList.amethyst_gem, "item.armor.equip_iron", 1.5f, 0.0f),
	SAPPHIRE("moreores.sapphire", 27, new int[] {3, 6, 7, 3}, 21, ItemList.sapphire_gem, "item.armor.equip_iron", 2.0f, 0.0f),
	OSMIUM("moreores.osmium", 10, new int[] {2, 3, 5, 2}, 8, ItemList.osmium_ingot, "item.armor.equip_iron", 0.5f, 0.5f),
	OPAL("moreores.opal", 21, new int[] {2, 4, 6, 3}, 15, ItemList.opal_gem, "item.armor.equip_iron", 0.5f, 0.0f);
	
	private String name, equipSound;
	private int durability, enchantability;
	private int[] dmgReductionAmounts;
	private float toughness, knockbackResistance;
	private Item repairItem;
	private static final int[] max_damage_array = new int[] {13, 15, 16, 11};
	
	private ArmorMaterialList(String name, int durability, int[]dmgReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness, float knockbackResistance) 
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability; //helmet*11, chest*16, leg*15, boots*13   //Dia 33, Iron 15, Gold 7, Leather 5
		this.enchantability = enchantability; //Leather 15, Chain 12, Iron 9, Gold 25, Dia 10, 1.16Netherite 15
		this.dmgReductionAmounts = dmgReductionAmounts; //{Boots, Leg, Chest, Helmet}
		this.toughness = toughness; //Dia 2, 1.16Netherite 3
		this.repairItem = repairItem;
		this.knockbackResistance = knockbackResistance;
		
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType p_200896_1_)
	{
		return max_damage_array[p_200896_1_.getIndex()] * this.durability;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType p_200902_1_)
	{
		return this.dmgReductionAmounts[p_200902_1_.getIndex()];
	}

	@Override
	public int getEnchantmentValue()
	{
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound()
	{
		return new SoundEvent(new ResourceLocation(this.equipSound));
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.of(this.repairItem);
	}

	@Override
	public String getName() 
	{
		return MoreOres.modid + ":" + this.name;
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() 
	{
		return this.knockbackResistance;
	}
}
