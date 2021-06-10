package ru.betterend.recipe;

import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Blocks;
import ru.betterend.recipe.builders.InfusionRecipe;
import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndItems;

public class InfusionRecipes {
	public static void register() {
		InfusionRecipe.Builder.create("runed_flavolite")
			.setInput(EndBlocks.FLAVOLITE.polished)
			.setOutput(EndBlocks.FLAVOLITE_RUNED)
			.addCatalyst(0, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(2, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(4, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(6, EndItems.CRYSTAL_SHARDS)
			.setTime(100)
			.build();
		
		InfusionRecipe.Builder.create("eternal_crystal")
			.setInput(Items.END_CRYSTAL)
			.setOutput(EndItems.ETERNAL_CRYSTAL)
			.addCatalyst(0, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(2, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(4, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(6, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(1, EndItems.ENDER_SHARD)
			.addCatalyst(3, EndItems.ENDER_SHARD)
			.addCatalyst(5, EndItems.ENDER_SHARD)
			.addCatalyst(7, EndItems.ENDER_SHARD)
			.setTime(250)
			.build();
		
		InfusionRecipe.Builder.create("crystalite_helmet")
			.setInput(EndBlocks.TERMINITE.helmet)
			.setOutput(EndItems.CRYSTALITE_HELMET)
			.addCatalyst(0, EndItems.AMBER_GEM)
			.addCatalyst(2, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(6, EndItems.CRYSTAL_SHARDS)
			.setTime(150)
			.build();
		InfusionRecipe.Builder.create("crystalite_chestplate")
			.setInput(EndBlocks.TERMINITE.chestplate)
			.setOutput(EndItems.CRYSTALITE_CHESTPLATE)
			.addCatalyst(0, EndItems.AMBER_GEM)
			.addCatalyst(1, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(3, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(5, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(7, EndItems.CRYSTAL_SHARDS)
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("crystalite_leggings")
			.setInput(EndBlocks.TERMINITE.leggings)
			.setOutput(EndItems.CRYSTALITE_LEGGINGS)
			.addCatalyst(0, EndItems.AMBER_GEM)
			.addCatalyst(2, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(4, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(6, EndItems.CRYSTAL_SHARDS)
			.setTime(225)
			.build();
		InfusionRecipe.Builder.create("crystalite_boots")
			.setInput(EndBlocks.TERMINITE.boots)
			.setOutput(EndItems.CRYSTALITE_BOOTS)
			.addCatalyst(0, EndItems.AMBER_GEM)
			.addCatalyst(2, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(6, EndItems.CRYSTAL_SHARDS)
			.setTime(150)
			.build();

		InfusionRecipe.Builder.create("crystalite_elytra")
			.setInput(Items.ELYTRA)
			.setOutput(EndItems.CRYSTALITE_ELYTRA)
			.addCatalyst(0, EndItems.AMBER_GEM)
			.addCatalyst(1, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(2, EndItems.ENCHANTED_MEMBRANE)
			.addCatalyst(3, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(4, EndItems.ENCHANTED_MEMBRANE)
			.addCatalyst(5, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(6, EndItems.ENCHANTED_MEMBRANE)
			.addCatalyst(7, EndItems.CRYSTAL_SHARDS)
			.setTime(500)
			.build();
		
		InfusionRecipe.Builder.create("enchanted_petal")
			.setInput(EndItems.HYDRALUX_PETAL)
			.setOutput(EndItems.ENCHANTED_PETAL)
			.addCatalyst(0, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(2, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(4, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(6, EndItems.CRYSTAL_SHARDS)
			.setTime(75)
			.build();
		InfusionRecipe.Builder.create("enchanted_membrane")
			.setInput(Items.PHANTOM_MEMBRANE)
			.setOutput(EndItems.ENCHANTED_MEMBRANE)
			.addCatalyst(0, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(2, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(4, EndItems.CRYSTAL_SHARDS)
			.addCatalyst(6, EndItems.CRYSTAL_SHARDS)
			.setTime(75)
			.build();

		InfusionRecipe.Builder.create("protection_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.ALL_DAMAGE_PROTECTION, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(4, Items.TURTLE_HELMET)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("fire_protection_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.FIRE_PROTECTION, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.BLAZE_ROD)
			.addCatalyst(4, Items.BLAZE_ROD)
			.addCatalyst(6, Items.BLAZE_ROD)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("feather_falling_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.FALL_PROTECTION, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.FEATHER)
			.addCatalyst(4, Items.FEATHER)
			.addCatalyst(6, Items.FEATHER)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("blast_protection_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.BLAST_PROTECTION, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Blocks.OBSIDIAN)
			.addCatalyst(4, Blocks.OBSIDIAN)
			.addCatalyst(6, Blocks.OBSIDIAN)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("projectile_protection_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.PROJECTILE_PROTECTION, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.SCUTE)
			.addCatalyst(4, Items.SHIELD)
			.addCatalyst(6, Items.SCUTE)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("respiration_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.RESPIRATION, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.NAUTILUS_SHELL)
			.addCatalyst(4, Items.NAUTILUS_SHELL)
			.addCatalyst(6, Items.NAUTILUS_SHELL)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("aqua_affinity_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.AQUA_AFFINITY, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.PRISMARINE_CRYSTALS)
			.addCatalyst(4, Items.PRISMARINE_CRYSTALS)
			.addCatalyst(6, Items.PRISMARINE_CRYSTALS)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("thorns_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.THORNS, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Blocks.CACTUS)
			.addCatalyst(4, Blocks.CACTUS)
			.addCatalyst(6, Blocks.CACTUS)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("depth_strider_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.DEPTH_STRIDER, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Blocks.LILY_PAD)
			.addCatalyst(4, EndBlocks.END_LILY_SEED)
			.addCatalyst(6, Blocks.LILY_PAD)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("frost_walker_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.FROST_WALKER, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(4, EndBlocks.ANCIENT_EMERALD_ICE)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("soul_speed_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.SOUL_SPEED, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Blocks.SOUL_SAND, Blocks.SOUL_SOIL)
			.addCatalyst(4, Blocks.SOUL_SAND, Blocks.SOUL_SOIL)
			.addCatalyst(6, Blocks.SOUL_SAND, Blocks.SOUL_SOIL)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("sharpness_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.SHARPNESS, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(4, Items.NETHERITE_SCRAP)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("smite_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.SMITE, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Blocks.SUNFLOWER)
			.addCatalyst(4, Items.GOLD_INGOT)
			.addCatalyst(6, Blocks.SUNFLOWER)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("bane_of_arthropods_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.BANE_OF_ARTHROPODS, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.FERMENTED_SPIDER_EYE)
			.addCatalyst(4, Items.IRON_INGOT)
			.addCatalyst(6, Items.FERMENTED_SPIDER_EYE)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("knockback_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.KNOCKBACK, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.REDSTONE)
			.addCatalyst(4, Blocks.PISTON)
			.addCatalyst(6, Items.REDSTONE)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("fire_aspect_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.FIRE_ASPECT, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.BLAZE_POWDER)
			.addCatalyst(4, Items.MAGMA_CREAM)
			.addCatalyst(6, Items.BLAZE_POWDER)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("looting_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.MOB_LOOTING, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.EMERALD)
			.addCatalyst(4, Items.GOLD_INGOT)
			.addCatalyst(6, Items.EMERALD)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("sweeping_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.SWEEPING_EDGE, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.GOLDEN_SWORD)
			.addCatalyst(4, Items.IRON_SWORD)
			.addCatalyst(6, Items.GOLDEN_SWORD)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("efficiency_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.BLOCK_EFFICIENCY, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, EndItems.AMBER_GEM)
			.addCatalyst(4, EndItems.AMBER_GEM)
			.addCatalyst(6, EndItems.AMBER_GEM)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("silk_touch_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.SILK_TOUCH, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Blocks.COBWEB)
			.addCatalyst(4, EndItems.ETERNAL_CRYSTAL)
			.addCatalyst(6, Blocks.COBWEB)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(375)
			.build();
		InfusionRecipe.Builder.create("unbreaking_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.UNBREAKING, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.DIAMOND)
			.addCatalyst(4, Items.DIAMOND)
			.addCatalyst(6, Items.DIAMOND)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("fortune_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.BLOCK_FORTUNE, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.EMERALD)
			.addCatalyst(4, Items.RABBIT_FOOT)
			.addCatalyst(6, Items.EMERALD)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("power_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.POWER_ARROWS, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, EndItems.AMBER_GEM)
			.addCatalyst(4, Items.DIAMOND_SWORD)
			.addCatalyst(6, EndItems.AMBER_GEM)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("punch_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.PUNCH_ARROWS, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.POPPED_CHORUS_FRUIT)
			.addCatalyst(4, Items.SPECTRAL_ARROW)
			.addCatalyst(6, Items.POPPED_CHORUS_FRUIT)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("flame_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.FLAMING_ARROWS, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.BLAZE_POWDER)
			.addCatalyst(4, Items.SPECTRAL_ARROW)
			.addCatalyst(6, Items.BLAZE_POWDER)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("infinity_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.INFINITY_ARROWS, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.SPECTRAL_ARROW)
			.addCatalyst(4, EndItems.ETERNAL_CRYSTAL)
			.addCatalyst(6, Items.SPECTRAL_ARROW)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(375)
			.build();
		InfusionRecipe.Builder.create("luck_of_sea_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.FISHING_LUCK, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.EMERALD)
			.addCatalyst(4, Items.FISHING_ROD)
			.addCatalyst(6, Items.EMERALD)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("lure_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.FISHING_SPEED, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.GOLD_NUGGET)
			.addCatalyst(4, Items.FISHING_ROD)
			.addCatalyst(6, Items.GOLD_NUGGET)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("loyalty_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.LOYALTY, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.ENDER_EYE)
			.addCatalyst(4, Items.HEART_OF_THE_SEA)
			.addCatalyst(6, Items.ENDER_EYE)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(375)
			.build();
		InfusionRecipe.Builder.create("impaling_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.IMPALING, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.PRISMARINE_SHARD)
			.addCatalyst(4, Items.IRON_SWORD)
			.addCatalyst(6, Items.PRISMARINE_SHARD)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("riptide_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.RIPTIDE, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.LEAD)
			.addCatalyst(4, Items.HEART_OF_THE_SEA)
			.addCatalyst(6, Items.LEAD)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(375)
			.build();
		InfusionRecipe.Builder.create("channeling_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.CHANNELING, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.CHAIN)
			.addCatalyst(4, Items.HEART_OF_THE_SEA)
			.addCatalyst(6, Items.CHAIN)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(375)
			.build();
		InfusionRecipe.Builder.create("multishot_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.MULTISHOT, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.ARROW)
			.addCatalyst(4, Items.SPECTRAL_ARROW)
			.addCatalyst(6, Items.ARROW)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("quick_charge_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.QUICK_CHARGE, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.QUARTZ)
			.addCatalyst(4, Items.GLOWSTONE_DUST)
			.addCatalyst(6, Items.QUARTZ)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("piercing_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.PIERCING, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.GLOWSTONE_DUST)
			.addCatalyst(4, Items.SPECTRAL_ARROW)
			.addCatalyst(6, Items.GLOWSTONE_DUST)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(300)
			.build();
		InfusionRecipe.Builder.create("mending_book")
			.setInput(Items.BOOK)
			.setOutput(createEnchantedBook(Enchantments.MENDING, 1))
			.addCatalyst(0, EndItems.ENCHANTED_PETAL)
			.addCatalyst(2, Items.EXPERIENCE_BOTTLE)
			.addCatalyst(4, Blocks.ANVIL)
			.addCatalyst(6, Items.EXPERIENCE_BOTTLE)
			.addCatalyst(1, Items.LAPIS_LAZULI)
			.addCatalyst(3, Items.LAPIS_LAZULI)
			.addCatalyst(5, Items.LAPIS_LAZULI)
			.addCatalyst(7, Items.LAPIS_LAZULI)
			.setGroup("enchantment")
			.setTime(375)
			.build();
	}
	
	private static ItemStack createEnchantedBook(Enchantment enchantment, int level) {
		ItemStack book = new ItemStack(Items.ENCHANTED_BOOK);
		EnchantedBookItem.addEnchantment(book, new EnchantmentInstance(enchantment, level));
		return book;
	}
}
