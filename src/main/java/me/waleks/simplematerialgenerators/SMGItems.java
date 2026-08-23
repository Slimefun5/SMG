package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun5.libraries.keys.NamespacedKey;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import me.waleks.simplematerialgenerators.utils.MaterialCompat;

// Item names and lore live in src/main/resources/languages/<lang>/items.yml,
// contributed via Slimefun.getItemTranslationService().registerTranslations(this).
public final class SMGItems {

    private SMGItems() {}

    public static final ItemGroup SMG_ITEM_CATEGORY = new ItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "simplematerialgenerators"),
        CustomItemStack.create(MaterialCompat.safe(XMaterial.SMOOTH_STONE), "&9Simple Material Generators")
    );

    public static final SlimefunItemStack SMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
        "SMG_GENERATOR_MULTIBLOCK",
        MaterialCompat.safe(XMaterial.BEDROCK)
    );

    public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_COBBLESTONE",
        MaterialCompat.safe(XMaterial.COBBLESTONE)
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_STONE_BROKEN",
        MaterialCompat.safe(XMaterial.STONE)
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_STONE",
        MaterialCompat.safe(XMaterial.STONE)
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE_BROKEN",
        MaterialCompat.safe(XMaterial.SMOOTH_STONE)
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE",
        MaterialCompat.safe(XMaterial.SMOOTH_STONE)
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL_BROKEN",
        MaterialCompat.safe(XMaterial.GRAVEL)
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL",
        MaterialCompat.safe(XMaterial.ANDESITE)
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SAND_BROKEN",
        MaterialCompat.safe(XMaterial.SAND)
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SAND",
        MaterialCompat.safe(XMaterial.SANDSTONE)
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_GLASS",
        MaterialCompat.safe(XMaterial.GLASS)
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_NETHERRACK",
        MaterialCompat.safe(XMaterial.NETHERRACK)
    );

    public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SOUL_SAND",
        MaterialCompat.safe(XMaterial.SOUL_SAND)
    );

    /** Places this addon's items in the shared guide categories (see ItemTypeClassifier). */
    static {
        SMG_ITEM_CATEGORY.setCategory("machines");
    }
}
