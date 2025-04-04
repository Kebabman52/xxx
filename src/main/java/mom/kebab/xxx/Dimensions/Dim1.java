package mom.kebab.xxx.Dimensions;

import mom.kebab.xxx.Xxx;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;


public class Dim1 {
    public static final RegistryKey<DimensionOptions> EMPTY_KEY = RegistryKey.of(
            RegistryKeys.DIMENSION, Identifier.of(Xxx.MOD_ID, "empty_dimension")
    );

    public static final RegistryKey<World> EMPTY_LEVEL_KEY = RegistryKey.of(
            RegistryKeys.WORLD, Identifier.of(Xxx.MOD_ID, "empty_dimension")
    );

    public static final RegistryKey<DimensionType> EMPTY_DIM_TYPE = RegistryKey.of(
            RegistryKeys.DIMENSION_TYPE, Identifier.of(Xxx.MOD_ID, "empty_dimension_type")
    );

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(EMPTY_DIM_TYPE, new DimensionType(
                OptionalLong.of(0), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                false, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }


}
