package MoreOres.recipe;

import MoreOres.init.RegisterRecipeSerializer;
import MoreOres.lists.BlockList;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

public class CrusherRecipe extends AbstractCookingRecipe
{
    public static IRecipeType<CrusherRecipe> TYPE;

    public CrusherRecipe(ResourceLocation idIn, String groupIn, Ingredient ingredientIn, ItemStack resultIn, float experienceIn, int cookTimeIn)
    {
        super(TYPE, idIn, groupIn, ingredientIn, resultIn, experienceIn, cookTimeIn);
    }

    @Override
    public ItemStack getToastSymbol()
    {
        return new ItemStack(BlockList.crusher);
    }

    @Override
    public IRecipeSerializer<?> getSerializer()
    {
        return RegisterRecipeSerializer.CRUSHER;
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<CrusherRecipe>
    {
        @Override
        public CrusherRecipe fromJson(ResourceLocation recipeId, JsonObject json)
        {
            String group = JSONUtils.getAsString(json,"group");
            JsonElement input = json.getAsJsonObject("input");
            Ingredient ingredient = Ingredient.fromJson(input);
            ItemStack result = ShapedRecipe.itemFromJson(JSONUtils.getAsJsonObject(json, "result"));
            float experience = JSONUtils.getAsFloat(json, "experience", 0.0F);
            int cookTime = JSONUtils.getAsInt(json, "cookingtime", 300);

            return new CrusherRecipe(recipeId, group, ingredient, result, experience, cookTime);
        }

        @Nullable
        @Override
        public CrusherRecipe fromNetwork(ResourceLocation recipeId, PacketBuffer buffer)
        {
            String group = buffer.readUtf(32767);
            Ingredient ingredient = Ingredient.fromNetwork(buffer);
            ItemStack result = buffer.readItem();
            float experience = buffer.readFloat();
            int cookTime = buffer.readVarInt();

            return new CrusherRecipe(recipeId, group, ingredient, result, experience, cookTime);
        }

        @Override
        public void toNetwork(PacketBuffer buffer, CrusherRecipe recipe)
        {
            buffer.writeUtf(recipe.group);
            recipe.ingredient.toNetwork(buffer);
            buffer.writeItem(recipe.result);
            buffer.writeFloat(recipe.experience);
            buffer.writeVarInt(recipe.cookingTime);
        }
    }
}
