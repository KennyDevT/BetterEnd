package org.betterx.betterend.world.biome.cave;

import org.betterx.bclib.interfaces.SurfaceMaterialProvider;
import org.betterx.bclib.util.WeightedList;
import org.betterx.betterend.registry.EndParticles;
import org.betterx.betterend.registry.features.EndConfiguredCaveFeatures;
import org.betterx.betterend.world.biome.EndBiomeBuilder;
import org.betterx.betterend.world.biome.EndBiomeKey;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.KeyDispatchDataCodec;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EmptyAuroraCaveBiome extends EndCaveBiome.Config<EmptyAuroraCaveBiome> {
    public static final MapCodec<Biome> CODEC = EndCaveBiome.simpleCaveBiomeCodec(EmptyAuroraCaveBiome.Biome::new);
    public static final KeyDispatchDataCodec<EmptyAuroraCaveBiome.Biome> KEY_CODEC = KeyDispatchDataCodec.of(CODEC);


    public static class Biome extends EndCaveBiome {
        @Override
        public void datagenSetup() {
            this.addFloorFeature(EndConfiguredCaveFeatures.BIG_AURORA_CRYSTAL, 1);
            this.addCeilFeature(EndConfiguredCaveFeatures.END_STONE_STALACTITE, 1);
        }

        @Override
        public KeyDispatchDataCodec<? extends EndCaveBiome> codec() {
            return EmptyAuroraCaveBiome.KEY_CODEC;
        }

        protected Biome(
                float fogDensity,
                @NotNull ResourceKey<net.minecraft.world.level.biome.Biome> biome,
                @NotNull List<Climate.ParameterPoint> parameterPoints,
                float terrainHeight,
                float genChance,
                int edgeSize,
                boolean vertical,
                @Nullable ResourceKey<net.minecraft.world.level.biome.Biome> edge,
                @Nullable ResourceKey<net.minecraft.world.level.biome.Biome> parent,
                boolean hasCaves,
                SurfaceMaterialProvider surface,
                WeightedList<Holder<ConfiguredFeature<?, ?>>> floorFeatures,
                WeightedList<Holder<ConfiguredFeature<?, ?>>> ceilFeatures
        ) {
            super(
                    fogDensity, biome, parameterPoints, terrainHeight,
                    genChance, edgeSize, vertical,
                    edge, parent,
                    hasCaves, surface, floorFeatures, ceilFeatures
            );
        }

        @Override
        public float getFloorDensity() {
            return 0.01F;
        }

        @Override
        public float getCeilDensity() {
            return 0.1F;
        }
    }

    public EmptyAuroraCaveBiome(EndBiomeKey<EmptyAuroraCaveBiome, ?> key) {
        super(key);
    }

    @Override
    public void addCustomBuildData(EndBiomeBuilder builder) {
        super.addCustomBuildData(builder);
        builder.fogColor(150, 30, 68)
               .fogDensity(2.0F)
               .plantsColor(108, 25, 46)
               .waterAndFogColor(186, 77, 237)
               .particles(EndParticles.GLOWING_SPHERE, 0.001F);
    }

}
