package com.andylun.letsmodreboot.init;

import com.andylun.letsmodreboot.block.BlockFlag;
import com.andylun.letsmodreboot.block.BlockLMRB;
import com.andylun.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockLMRB flag = new BlockFlag();

	public static void init() {
		GameRegistry.registerBlock(flag, "flag");
	}
}
