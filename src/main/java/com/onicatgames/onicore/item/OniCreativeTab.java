package com.onicatgames.onicore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class OniCreativeTab {

    /**
     *████████╗░█████╗░██████╗░
     *╚══██╔══╝██╔══██╗██╔══██╗
     *░░░██║░░░███████║██████╦╝
     *░░░██║░░░██╔══██║██╔══██╗
     *░░░██║░░░██║░░██║██████╦╝
     *░░░╚═╝░░░╚═╝░░╚═╝╚═════╝░
     */
    public static final CreativeModeTab ONI_TAB = new CreativeModeTab("oni_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Oniitems.ONI_TAB_LOGO.get());
        }
    };
}
