package net.n1korasu.pruebamod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class Keybinding {

    public static final String KEY_CATEGORY_PRUEBA = "key.category.pruebamod.prueba";
    public static final String KEY_SUMMON_SHARDBLADE = "key.pruebamod.summon_shardblade";
    public static final KeyMapping SUMMON_SHARDBLADE = new KeyMapping(KEY_SUMMON_SHARDBLADE, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_G, KEY_CATEGORY_PRUEBA);

}
