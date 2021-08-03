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
    public ItemStack getIcon()
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
        public CrusherRecipe read(ResourceLocation recipeId, JsonObject json)
        {
            String group = JSONUtils.getString(json,"group","");
            JsonElement input = json.getAsJsonObject("input");
            Ingredient ingredient = Ingredient.deserialize(input);
            ItemStack result = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result"));
            float experience = JSONUtils.getFloat(json, "experience", 0.0F);
            int cookTime = JSONUtils.getInt(json, "cookingtime", 300);

            return new CrusherRecipe(recipeId, group, ingredient, result, experience, cookTime);
        }

        @Nullable
        @Override
        public CrusherRecipe read(ResourceLocation recipeId, PacketBuffer buffer)
        {
            String group = buffer.readString(32767);
            Ingredient ingredient = Ingredient.read(buffer);
            ItemStack result = buffer.readItemStack();
            float experience = buffer.readFloat();
            int cookTime = buffer.readVarInt();

            return new CrusherRecipe(recipeId, group, ingredient, result, experience, cookTime);
        }

        @Override
        public void write(PacketBuffer buffer, CrusherRecipe recipe)
        {
            buffer.writeString(recipe.group);
            recipe.ingredient.write(buffer);
            buffer.writeItemStack(recipe.result);
            buffer.writeFloat(recipe.experience);
            buffer.writeVarInt(recipe.cookTime);
        }
    }
}
