package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun5.libraries.keys.NamespacedKey;
import io.github.thebusybiscuit.slimefun5.libraries.xseries.XMaterial;
import me.waleks.simplematerialgenerators.utils.MaterialCompat;

public final class SMGItems {

    private SMGItems() {}

    public static final ItemGroup SMG_ITEM_CATEGORY = new ItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "simplematerialgenerators"),
        CustomItemStack.create(MaterialCompat.safe(XMaterial.SMOOTH_STONE), "&9Simple Material Generators")
    );

    public static final SlimefunItemStack SMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
        "SMG_GENERATOR_MULTIBLOCK",
        MaterialCompat.safe(XMaterial.BEDROCK),
        "&9Generator multiblock",
        "",
        "&dBuild any of this addon's",
        "&dgenerators like this.",
        "&aThey will only output to a chest",
        "&adirectly above it."
    );
	
	/*	Template for adding more generator items
	public static final SlimefunItemStack SMG_GENERATOR_ = new SlimefunItemStack(
		"SMG_GENERATOR_",
		Material.,
		"& generator",
		"&6Rate: &e ticks",
		"",
		"&9&oSimpleMaterialGenerators"
	);
	*/

    public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_COBBLESTONE",
        MaterialCompat.safe(XMaterial.COBBLESTONE),
        "&7Cobblestone generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_STONE_BROKEN",
        MaterialCompat.safe(XMaterial.STONE),
        "&7Stone generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_STONE",
        MaterialCompat.safe(XMaterial.STONE),
        "&7Stone generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE_BROKEN",
        MaterialCompat.safe(XMaterial.SMOOTH_STONE),
        "&7Smooth stone generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE",
        MaterialCompat.safe(XMaterial.SMOOTH_STONE),
        "&7Smooth stone generator",
        "&6Rate: &e12 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL_BROKEN",
        MaterialCompat.safe(XMaterial.GRAVEL),
        "&7Gravel generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL",
        MaterialCompat.safe(XMaterial.ANDESITE),
        "&7Gravel generator",
        "&6Rate: &e6 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SAND_BROKEN",
        MaterialCompat.safe(XMaterial.SAND),
        "&eSand generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SAND",
        MaterialCompat.safe(XMaterial.SANDSTONE),
        "&eSand generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_GLASS",
        MaterialCompat.safe(XMaterial.GLASS),
        "&fGlass generator",
        "&6Rate: &e12 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_NETHERRACK",
        MaterialCompat.safe(XMaterial.NETHERRACK),
        "&cNetherrack generator",
        "&6Rate: &e6 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SOUL_SAND",
        MaterialCompat.safe(XMaterial.SOUL_SAND),
        "&8Soul sand generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );
}