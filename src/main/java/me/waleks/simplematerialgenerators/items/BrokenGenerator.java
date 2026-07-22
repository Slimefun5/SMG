package me.waleks.simplematerialgenerators.items;

import io.github.thebusybiscuit.slimefun5.api.events.PlayerRightClickEvent;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun5.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun5.implementation.items.SimpleSlimefunItem;

import javax.annotation.Nonnull;

public class BrokenGenerator extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

    public BrokenGenerator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        setGuideType("resources");
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }

}