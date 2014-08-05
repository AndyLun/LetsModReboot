package com.andylun.letsmodreboot.init;

import com.andylun.letsmodreboot.item.ItemLMRB;
import com.andylun.letsmodreboot.item.ItemMapleLeaf;
import com.andylun.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

	public static void init() {
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
