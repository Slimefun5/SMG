package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import me.waleks.simplematerialgenerators.items.BrokenGenerator;
import me.waleks.simplematerialgenerators.items.GeneratorMultiblock;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import me.waleks.simplematerialgenerators.utils.MaterialCompat;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class SMGItemSetup {

    private SMGItemSetup() {}

    public static void setup(@Nonnull SimpleMaterialGenerators plugin) {
        new GeneratorMultiblock(SMGItems.SMG_ITEM_CATEGORY, SMGItems.SMG_GENERATOR_MULTIBLOCK).register(plugin);

		/*	Template for adding more items
		new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
			SMGItems.SMG_GENERATOR_,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				null, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem(Material.)
		.setRate(1)
		.register(plugin);
		*/

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_COBBLESTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE)), new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE)),
				new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE)),
                new ItemStack(MaterialCompat.safe(XMaterial.LAVA_BUCKET)), new ItemStack(MaterialCompat.safe(XMaterial.IRON_PICKAXE)),
				new ItemStack(MaterialCompat.safe(XMaterial.WATER_BUCKET)),
                new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE)), new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE)),
				new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE))
            })
            .setItem(MaterialCompat.safe(XMaterial.COBBLESTONE))
            .setRate(4)
            .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE.item(), null, null,
                null, null, null,
                null, null, null
            }).register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(MaterialCompat.safe(XMaterial.STONE)), SlimefunItems.SOLDER_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.STONE)),
                SlimefunItems.SOLDER_INGOT.item(), SMGItems.SMG_GENERATOR_STONE_BROKEN.item(), SlimefunItems.SOLDER_INGOT.item(),
                new ItemStack(MaterialCompat.safe(XMaterial.STONE)), SlimefunItems.SOLDER_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.STONE))
            })
            .setItem(MaterialCompat.safe(XMaterial.STONE))
            .setRate(8)
            .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_STONE.item(), null, null,
                null, null, null,
                null, null, null
            }).register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE,
            RecipeType.SMELTERY,
            new ItemStack[] {
                new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE)), SlimefunItems.STEEL_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE)),
                new ItemStack(MaterialCompat.safe(XMaterial.IRON_BARS)), SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN.item(),
				new ItemStack(MaterialCompat.safe(XMaterial.IRON_BARS)),
                new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE)), SlimefunItems.STEEL_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.SMOOTH_STONE))
            })
            .setItem(MaterialCompat.safe(XMaterial.SMOOTH_STONE))
            .setRate(12)
            .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL_BROKEN,
            RecipeType.GRIND_STONE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE.item(), null, null,
                null, null, null,
                null, null, null
            }).register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(MaterialCompat.safe(XMaterial.STONE_BRICKS)), SlimefunItems.BILLON_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.STONE_BRICKS)),
                SlimefunItems.BILLON_INGOT.item(), SMGItems.SMG_GENERATOR_GRAVEL_BROKEN.item(), SlimefunItems.BILLON_INGOT.item(),
                new ItemStack(MaterialCompat.safe(XMaterial.STONE_BRICKS)), SlimefunItems.BILLON_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.STONE_BRICKS))
            })
            .setItem(MaterialCompat.safe(XMaterial.GRAVEL))
            .setRate(6)
            .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_GRAVEL.item(), null, null,
                null, null, null,
                null, null, null
            }).register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(MaterialCompat.safe(XMaterial.SANDSTONE)), SlimefunItems.DURALUMIN_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.SANDSTONE)),
                SlimefunItems.DURALUMIN_INGOT.item(), SMGItems.SMG_GENERATOR_SAND_BROKEN.item(), SlimefunItems.DURALUMIN_INGOT.item(),
                new ItemStack(MaterialCompat.safe(XMaterial.SANDSTONE)), SlimefunItems.DURALUMIN_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.SANDSTONE))
            })
            .setItem(MaterialCompat.safe(XMaterial.SAND))
            .setRate(8)
            .register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GLASS,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SlimefunItems.BRONZE_INGOT.item(), SlimefunItems.GOLD_8K.item(), SlimefunItems.BRONZE_INGOT.item(),
                SlimefunItems.BRASS_INGOT.item(), SMGItems.SMG_GENERATOR_SAND.item(), SlimefunItems.BRASS_INGOT.item(),
                null, null, null
            })
            .setItem(MaterialCompat.safe(XMaterial.GLASS))
            .setRate(12)
            .register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_NETHERRACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.SOLDER_INGOT.item(), SlimefunItems.SOLDER_INGOT.item(), SlimefunItems.SOLDER_INGOT.item(),
                SMGItems.SMG_GENERATOR_STONE.item(), new ItemStack(MaterialCompat.safe(XMaterial.LAVA_BUCKET)), SMGItems.SMG_GENERATOR_STONE.item(),
                SMGItems.SMG_GENERATOR_STONE.item(), SlimefunItems.COMPOSTER.item(), SMGItems.SMG_GENERATOR_STONE.item()
            })
            .setItem(MaterialCompat.safe(XMaterial.NETHERRACK))
            .setRate(6)
            .register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SOUL_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(MaterialCompat.safe(XMaterial.SPIDER_EYE)), SlimefunItems.STEEL_INGOT.item(),
                new ItemStack(MaterialCompat.safe(XMaterial.ROTTEN_FLESH)), new ItemStack(MaterialCompat.safe(XMaterial.WATER_BUCKET)), new ItemStack(MaterialCompat.safe(XMaterial.BONE)),
                SMGItems.SMG_GENERATOR_SAND.item(), SlimefunItems.COMPOSTER.item(), SMGItems.SMG_GENERATOR_SAND.item()
            })
            .setItem(MaterialCompat.safe(XMaterial.SOUL_SAND))
            .setRate(8)
            .register(plugin);
    }
}
