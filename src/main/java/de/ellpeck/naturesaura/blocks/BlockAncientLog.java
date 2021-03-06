package de.ellpeck.naturesaura.blocks;

import de.ellpeck.naturesaura.data.BlockStateGenerator;
import de.ellpeck.naturesaura.reg.ICustomBlockState;
import de.ellpeck.naturesaura.reg.IModItem;
import de.ellpeck.naturesaura.reg.ModRegistry;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockAncientLog extends LogBlock implements IModItem, ICustomBlockState {

    private final String baseName;

    public BlockAncientLog(String baseName) {
        super(MaterialColor.PURPLE, ModBlocks.prop(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
        this.baseName = baseName;
        ModRegistry.add(this);
    }

    @Override
    public String getBaseName() {
        return this.baseName;
    }

    @Override
    public void generateCustomBlockState(BlockStateGenerator generator) {
        generator.logBlock(this);
    }
}
