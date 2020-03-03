package org.rcsb.cif.model;

import org.rcsb.cif.schema.SchemaProvider;

public interface CifFileBuilder {
    BlockBuilder<? extends CifFileBuilder> enterBlock(String blockHeader);

    CifFile leaveFile();

    CifFile build();

    CifFileBuilder addBlock(Block block);

    <B extends CifFileBuilder> B digest(BlockBuilder<B> blockBuilder);

    default <F extends CifFile, B extends CifFileBuilder> B with(SchemaProvider<F, B> schemaProvider) {
        return schemaProvider.handle(this);
    }
}
