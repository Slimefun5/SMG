package me.waleks.simplematerialgenerators.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun5.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun5.implementation.items.SimpleSlimefunItem;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;

import javax.annotation.Nonnull;

public class GeneratorMultiblock extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

    public GeneratorMultiblock(ItemGroup category, SlimefunItemStack item) {
        super(category, item, RecipeType.MULTIBLOCK, new ItemStack[] {
                null, null, null,
                null, new ItemStack(Material.CHEST), null,
                null, CustomItemStack.create(Material.BEDROCK, "Any SMG generator"), null
        });
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return e -> {
            e.cancel();
            e.getPlayer().sendMessage("Psst, this Item is just a dummy. You need to place the actual generator down.");
        };
    }
}