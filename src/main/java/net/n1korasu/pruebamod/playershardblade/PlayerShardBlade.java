package net.n1korasu.pruebamod.playershardblade;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.n1korasu.pruebamod.item.custom.Oathbringer;

public class PlayerShardBlade {

    private Oathbringer sword;


    public void copyFrom (PlayerShardBlade source){
        this.sword = source.sword;
    }

    public void saveNBTData(CompoundTag nbt){
        nbt.put("shardblade", (Tag) sword);
    }

    public void loadNBTData (CompoundTag nbt){
        sword = nbt.getTag("shardblade");
    }


}
