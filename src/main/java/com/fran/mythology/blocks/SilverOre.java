package com.fran.mythology.blocks;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraftforge.common.ToolType;


public class SilverOre extends Block {


    public SilverOre() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f, 4.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
