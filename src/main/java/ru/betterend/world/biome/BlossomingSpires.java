package ru.betterend.world.biome;

import net.minecraft.entity.EntityType;
import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndFeatures;
import ru.betterend.registry.EndSounds;

public class BlossomingSpires extends EndBiome {
	public BlossomingSpires() {
		super(new BiomeDefinition("blossoming_spires")
				.setFogColor(241, 146, 229)
				.setFogDensity(2.0F)
				.setPlantsColor(122, 45, 122)
				.setSurface(EndBlocks.PINK_MOSS)
				.setMusic(EndSounds.MUSIC_BLOSSOMING_SPIRES)
				.setLoop(EndSounds.AMBIENT_BLOSSOMING_SPIRES)
				.addFeature(EndFeatures.SPIRE)
				.addFeature(EndFeatures.FLOATING_SPIRE)
				.addFeature(EndFeatures.TENANEA)
				.addFeature(EndFeatures.TENANEA_BUSH)
				.addFeature(EndFeatures.BULB_VINE)
				.addFeature(EndFeatures.BUSHY_GRASS)
				.addFeature(EndFeatures.BUSHY_GRASS_WG)
				.addFeature(EndFeatures.TWISTED_MOSS)
				.addFeature(EndFeatures.TWISTED_MOSS_WOOD)
				.addMobSpawn(EntityType.ENDERMAN, 50, 1, 4));
	}
}
