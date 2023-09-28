package io.github.concrafter20

import net.fabricmc.api.ModInitializer
import net.minecraft.client.MinecraftClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Kotient : ModInitializer {

	// really I am trying to declare a type because...
	//...
	// I don't know XD
	const val MOD_ID: String = "kotient"
    val logger: Logger = LoggerFactory.getLogger(MOD_ID)


	override fun onInitialize() {
		logger.info("kotient loaded on client with session ID " +
				MinecraftClient.getInstance().session.sessionId +
				" on game version " +
				 MinecraftClient.getInstance().gameVersion)
	}

	fun getMainLogger() : Logger {
		return logger
	}
}