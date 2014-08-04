package com.andylun.letsmodreboot.init;

import com.andylun.letsmodreboot.item.ItemLMRB;
import com.andylun.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

	public static void init() {
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
