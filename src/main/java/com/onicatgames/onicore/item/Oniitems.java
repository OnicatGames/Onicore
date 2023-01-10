package com.onicatgames.onicore.item;

import com.onicatgames.onicore.OniCore;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * This class is used to register items for the mod. It uses the Forge modding library's
 * DeferredRegister system to handle the registration process.
 */
public class Oniitems {
    /**
     * Defines a DeferredRegister for items with the Forge Registry system. The
     * DeferredRegister is created with a reference to the item registry and the
     * mod's ID.
     */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OniCore.MODID);




    /**
     *██╗████████╗███████╗███╗░░░███╗░██████╗
     *██║╚══██╔══╝██╔════╝████╗░████║██╔════╝
     *██║░░░██║░░░█████╗░░██╔████╔██║╚█████╗░
     *██║░░░██║░░░██╔══╝░░██║╚██╔╝██║░╚═══██╗
     *██║░░░██║░░░███████╗██║░╚═╝░██║██████╔╝
     *╚═╝░░░╚═╝░░░╚══════╝╚═╝░░░░░╚═╝╚═════╝░
     */

    /** 𝗢𝗡𝗜_𝗧𝗔𝗕_𝗟𝗢𝗚𝗢  */
    /** This is the Item to represent the @OniCreativeTab Menu */
    public static final RegistryObject<Item> ONI_TAB_LOGO = ITEMS.register( "oni_tab_logo",
            () -> new Item(new Item.Properties().tab(null)));


    /** 𝑶𝑵𝑰_𝑰𝑵𝑮𝑶𝑻 - Oni ingot item representing the onicat from the OniCore core mod */
    public static final RegistryObject<Item> ONI_INGOT = ITEMS.register( "oni_ingot",
            () -> new Item(new Item.Properties().fireResistant().tab(OniCreativeTab.ONI_TAB)));

    /** 𝑶𝑵𝑰_𝑵𝑼𝑮𝑮𝑬𝑻 - a test nugget item */
    public static final RegistryObject<Item> ONI_NUGGET = ITEMS.register( "oni_nugget",
            () -> new Item(new Item.Properties().tab(OniCreativeTab.ONI_TAB)));




    /**
     * Registers all the items in the ITEMS DeferredRegister with the game. This allows the
     * items to be properly initialized and added to the game when it is loaded.
     *
     * @param eventBus The IEventBus to register the ITEMS DeferredRegister with.
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
