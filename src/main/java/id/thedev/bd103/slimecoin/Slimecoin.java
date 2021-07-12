package id.thedev.bd103.slimecoin;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Slimecoin implements ModInitializer {
    public static final String MODID = "slimecoin";

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "crystal_slimecoin"), Coins.CRYSTAL_SLIMECOIN);
        Registry.register(Registry.ITEM, new Identifier(MODID, "emerald_slimecoin"), Coins.EMERALD_SLIMECOIN);
        Registry.register(Registry.ITEM, new Identifier(MODID, "diamond_slimecoin"), Coins.DIAMOND_SLIMECOIN);
        Registry.register(Registry.ITEM, new Identifier(MODID, "gold_slimecoin"), Coins.GOLD_SLIMECOIN);
        Registry.register(Registry.ITEM, new Identifier(MODID, "silver_slimecoin"), Coins.SILVER_SLIMECOIN);
    }
}
