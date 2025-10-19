package io.github.sefiraat.slimetinker.items.tinkermaterials.elements;

import com.google.common.base.Preconditions;
import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterial;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryAlloy;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Alloy {

    private final Map<String, Integer> alloyMap = new HashMap<>();
    private final SlimefunItemStack[] recipe;
    private TinkerMaterial parent;
    private SlimefunItemStack itemStack;
    private SlimefunItem item;

    public Alloy(SlimefunItemStack[] recipe) {
        this.recipe = recipe;
    }

    public void setupAlloy(TinkerMaterial parent) {
        this.parent = parent;
        String titName = ThemeUtils.toTitleCase(parent.getId());
        this.itemStack =
            ThemeUtils.themedItemStack(
                parent.getId() + "_ALLOY",
                parent.getLiquidTexture(),
                ThemeItemType.MOLTEN_METAL,
                "Molten " + titName,
                ThemeUtils.PASSIVE + "A molten alloy metal of " + titName
            );

        SlimefunItemStack[] alloyRecipe = parent.getAlloyRecipe();
        Preconditions.checkNotNull(alloyRecipe, "Alloy recipe is null. SefiDumb™");

        ItemStack[] baseRecipe = Arrays.stream(alloyRecipe)
            .filter(Objects::nonNull)
            .map(si -> (ItemStack) si.item().clone())
            .toArray(ItemStack[]::new);

        this.item = new SlimefunItem(ItemGroups.ALLOYS, itemStack, DummySmelteryAlloy.TYPE, baseRecipe);
        item.register(SlimeTinker.getInstance());

        for (SlimefunItemStack i : parent.getAlloyRecipe()) {
            alloyMap.put(i.getItemId().replace("_LIQUID", ""), i.getAmount());
        }
    }

    public Map<String, Integer> getAlloyMap() {
        return alloyMap;
    }

    public SlimefunItemStack[] getRecipe() {
        return recipe;
    }

    public TinkerMaterial getParent() {
        return parent;
    }

    public SlimefunItemStack getItemStack() {
        return itemStack;
    }

    public SlimefunItem getItem() {
        return item;
    }
}
