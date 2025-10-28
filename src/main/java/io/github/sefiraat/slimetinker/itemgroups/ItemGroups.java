package io.github.sefiraat.slimetinker.itemgroups;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.Utils;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;

public final class ItemGroups {

    private ItemGroups() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final MainFlexGroup MAIN = new MainFlexGroup(Keys.ITEM_GROUP_MAIN, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.CAT_MAIN),
        ThemeUtils.MAIN + "SlimeTinker"
    ));
    public static final DummyItemGroup WORKSTATIONS = new DummyItemGroup(Keys.ITEM_GROUP_WORKSTATIONS, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.CAT_MAIN),
        ThemeUtils.MAIN + "Workstations"
    ));
    public static final DummyItemGroup MATERIALS = new DummyItemGroup(Keys.ITEM_GROUP_MATERIALS, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.CAT_MATERIALS),
        ThemeUtils.MAIN + "Materials"
    ));
    public static final DummyItemGroup MOLTEN_METALS = new DummyItemGroup(Keys.ITEM_GROUP_MOLTEN, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.CAT_MOLTEN),
        ThemeUtils.MAIN + "Molten Metals"
    ));
    public static final DummyItemGroup ALLOYS = new DummyItemGroup(Keys.ITEM_GROUP_ALLOYS, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.CAT_ALLOYS),
        ThemeUtils.MAIN + "Alloy Metals"
    ));
    public static final DummyItemGroup CASTS = new DummyItemGroup(Keys.ITEM_GROUP_CASTS, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.CAT_CASTS),
        ThemeUtils.MAIN + "Casts"
    ));
    public static final DummyItemGroup PARTS = new DummyItemGroup(Keys.ITEM_GROUP_PARTS, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.CAT_PARTS),
        ThemeUtils.MAIN + "Part Building Guide"
    ));
    public static final DummyItemGroup TOOLS = new DummyItemGroup(Keys.ITEM_GROUP_TOOLS, CustomItemStack.create(
        Material.DIAMOND_SWORD,
        ThemeUtils.MAIN + "Tool Building Guide"
    ));
    public static final DummyItemGroup ARMOUR = new DummyItemGroup(Keys.ITEM_GROUP_ARMOUR, CustomItemStack.create(
        Material.DIAMOND_CHESTPLATE,
        ThemeUtils.MAIN + "Armour Building Guide"
    ));
    public static final DummyItemGroup TRAITS = new DummyItemGroup(Keys.ITEM_GROUP_PROPERTIES, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.CAT_TRAITS),
        ThemeUtils.MAIN + "Metal Traits"
    ));
    public static final DummyItemGroup MODIFICATIONS = new DummyItemGroup(Keys.ITEM_GROUP_MODIFICATIONS, CustomItemStack.create(
        Material.REDSTONE,
        ThemeUtils.MAIN + "Mods"
    ));
    public static final DummyItemGroup PART_DICT = new DummyItemGroup(Keys.ITEM_GROUP_PART_DICT, CustomItemStack.create(
        Utils.fromBase64Hash(SkullTextures.PART_PICKAXE_HEAD),
        ThemeUtils.MAIN + "Part Dictionary"
    ));
    public static final DummyItemGroup DUMMY = new DummyItemGroup(Keys.ITEM_GROUP_DUMMY, CustomItemStack.create(
        Material.BARRIER,
        ThemeUtils.MAIN + "SlimeTinker Dummy"
    ));

    public static void set(SlimeTinker p) {
        MAIN.register(p);
        WORKSTATIONS.register(p);
        MATERIALS.register(p);
        MOLTEN_METALS.register(p);
        ALLOYS.register(p);
        CASTS.register(p);
        PARTS.register(p);
        TOOLS.register(p);
        ARMOUR.register(p);
        TRAITS.register(p);
        MODIFICATIONS.register(p);
        PART_DICT.register(p);
    }

}
