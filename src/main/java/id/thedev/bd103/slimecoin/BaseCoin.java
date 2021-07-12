package id.thedev.bd103.slimecoin;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BaseCoin {
    public static Item get() {
        return new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());
    }
}
