package io.github.concrafter20.mixin;

import com.mojang.logging.LogUtils;
import io.github.concrafter20.Kotient;
import io.github.concrafter20.Kotient;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class LoadWorldMixin {

	public static final Logger mixinLogger = LoggerFactory.getLogger("kotient-mixin");

	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		mixinLogger.info("Loaded LoadWorldMixin successful.");
		mixinLogger.info("Executing LoadWorldMixin...");

		Kotient.INSTANCE.getMainLogger().info("Test");

		mixinLogger.info("Execution of LoadWorldMixin successful.");
	}


}