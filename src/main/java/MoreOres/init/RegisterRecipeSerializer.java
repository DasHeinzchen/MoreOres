package MoreOres.init;

import MoreOres.recipe.CrusherRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class RegisterRecipeSerializer
{
    public static final IRecipeSerializer<CrusherRecipe> CRUSHER = new CrusherRecipe.Serializer();

    @SubscribeEvent
    public void onRegisterSerializers(RegistryEvent.Register<IRecipeSerializer<?>> event)
    {
        IForgeRegistry<IRecipeSerializer<?>> registry = event.getRegistry();
        registry.registerAll
        (
            CRUSHER.setRegistryName(location("crusher"))
        );
    }

    private ResourceLocation location(String name)
    {
        return new ResourceLocation("moreores", name);
    }
}
