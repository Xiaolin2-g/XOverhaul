package com.xiaolin.xoverhaul.mixin;

import com.xiaolin.xoverhaul.XOverhaul;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class XOverhaulMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		XOverhaul.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
