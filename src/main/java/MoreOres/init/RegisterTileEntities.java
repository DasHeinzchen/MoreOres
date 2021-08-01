package MoreOres.init;

import MoreOres.lists.BlockList;
import MoreOres.tileEntity.CrusherTileEntity;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class RegisterTileEntities
{
    private static final List<Supplier<TileEntityType<?>>> ENTRIES = new ArrayList<>();

    public static final RegistryObject<TileEntityType<CrusherTileEntity>> CRUSHER = register("crusher", CrusherTileEntity::new, () -> new Block[] { BlockList.crusher});

    private static <T extends TileEntityType<?>> RegistryObject<T> register(String name, Supplier<TileEntity> tile, Supplier<Block[]> blocks)
    {
        ResourceLocation loc = new ResourceLocation("moreores", name);
        ENTRIES.add(() -> TileEntityType.Builder.of(tile, blocks.get()).build(null).setRegistryName(loc));
        return RegistryObject.of(loc, ForgeRegistries.TILE_ENTITIES);
    }
}
