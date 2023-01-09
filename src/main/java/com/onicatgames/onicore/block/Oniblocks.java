package com.onicatgames.onicore.block;

import com.onicatgames.onicore.OniCore;
import com.onicatgames.onicore.item.Oniitems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * This class is used to register blocks and block items for the mod. It uses the
 * Forge modding library's DeferredRegister system to handle the registration process.
 */
public class Oniblocks {
    /**
     * Defines a DeferredRegister for blocks with the Forge Registry system. The
     * DeferredRegister is created with a reference to the block registry and the
     * mod's ID.
     */
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OniCore.MODID);





    /**
     *██████╗░██╗░░░░░░█████╗░░█████╗░██╗░░██╗░██████╗
     *██╔══██╗██║░░░░░██╔══██╗██╔══██╗██║░██╔╝██╔════╝
     *██████╦╝██║░░░░░██║░░██║██║░░╚═╝█████═╝░╚█████╗░
     *██╔══██╗██║░░░░░██║░░██║██║░░██╗██╔═██╗░░╚═══██╗
     *██████╦╝███████╗╚█████╔╝╚█████╔╝██║░╚██╗██████╔╝
     *╚═════╝░╚══════╝░╚════╝░░╚════╝░╚═╝░░╚═╝╚═════╝░
     */

    /** 𝑶𝑵𝑰_𝑩𝑳𝑶𝑪𝑲- a test block */
    public static final RegistryObject<Block> ONI_BLOCK = registerBlock("oni_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()/*| .add properties |*/), CreativeModeTab.TAB_MATERIALS);




    /**
     * Registers a new block with the game. The block is added to the BLOCKS
     * DeferredRegister and a corresponding BlockItem is also registered with the game.
     *
     * @param name The name of the block to register.
     * @param block A Supplier that provides an instance of the block to register.
     * @param tab The CreativeModeTab to add the block and block item to in the creative inventory.
     * @return A RegistryObject for the block.
     */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        // Add the block to the BLOCKS DeferredRegister and get a RegistryObject for it.
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        // Register a BlockItem for the block.
        registerBlockItem(name, toReturn, tab);
        // Return the RegistryObject for the block.
        return toReturn;
    }

    /**
     * Registers a new BlockItem for the given block. The BlockItem is added to the ITEMS
     * DeferredRegister from the Oniitems class.
     *
     * @param name The name of the block item to register.
     * @param block A RegistryObject for the block that the BlockItem is for.
     * @param tab The CreativeModeTab to add the block item to in the creative inventory.
     * @return A RegistryObject for the BlockItem.
     */
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        // Create and return a RegistryObject for the BlockItem.
        return Oniitems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
