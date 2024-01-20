package carries.modthing.item;

import carries.modthing.Caribousmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import carries.modthing.item.ModToolMaterial;

public class ModItems {

    public static final Item RiptideTrident = registerItem("riptide-trident", new PickaxeItem(ModToolMaterial.GOLD, 5, 10f, new FabricItemSettings()));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(RiptideTrident);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Caribousmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Caribousmod.LOGGER.info("Registering mod items for " + Caribousmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
