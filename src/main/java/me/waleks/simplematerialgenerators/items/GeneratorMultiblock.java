package me.waleks.simplematerialgenerators.items;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun5.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun5.core.multiblocks.MultiBlockAssembler;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.implementation.items.SimpleSlimefunItem;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import io.github.thebusybiscuit.slimefun5.utils.compatibility.InventoryCompat;
import me.waleks.simplematerialgenerators.utils.MaterialCompat;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratorMultiblock extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

    public GeneratorMultiblock(ItemGroup category, SlimefunItemStack item) {
        super(category, item, RecipeType.MULTIBLOCK, new ItemStack[] {
                null, null, null,
                null, new ItemStack(MaterialCompat.safe(XMaterial.CHEST)), null,
                null, CustomItemStack.create(MaterialCompat.safe(XMaterial.BEDROCK), "Any SMG generator"), null
        });
        setGuideType("machines");
    }

    /**
     * @implNote This used to only print "this item is a dummy", so obtaining it through the guide's cheat
     *           mode gave the player nothing usable. It now builds the structure it depicts - a generator
     *           with a chest on top - picking a generator at random, since the depicted recipe accepts any
     *           of them and the item itself carries no choice.
     */
    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return e -> {
            e.cancel();

            if (!e.getClickedBlock().isPresent()) {
                return;
            }

            Player player = e.getPlayer();
            MaterialGenerator generator = randomGenerator();

            if (generator == null) {
                return;
            }

            Block base = e.getClickedBlock().get().getRelative(e.getClickedFace());

            Material[] layout = {
                null, null, null,
                null, MaterialCompat.safe(XMaterial.CHEST), null,
                null, generator.getItem().getType(), null
            };
            String[] customBlocks = { null, null, null, null, null, null, null, generator.getId(), null };

            // The generator is the bottom-centre cell, so it rests on the clicked surface with the chest
            // directly above it - which is the arrangement MaterialGenerator#tick looks for.
            Block center = base.getRelative(BlockFace.UP);

            if (MultiBlockAssembler.assembleAround(layout, customBlocks, center, player)) {
                InventoryCompat.consumeHeldItem(player, e.getHand(), 1, false);
            }
        };
    }

    @Nullable
    private static MaterialGenerator randomGenerator() {
        List<MaterialGenerator> generators = new ArrayList<>();

        for (SlimefunItem item : Slimefun.getRegistry().getEnabledSlimefunItems()) {
            if (item instanceof MaterialGenerator) {
                generators.add((MaterialGenerator) item);
            }
        }

        return generators.isEmpty() ? null : generators.get(ThreadLocalRandom.current().nextInt(generators.size()));
    }
}