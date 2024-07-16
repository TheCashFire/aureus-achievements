package com.hm.achievement.module;

import javax.inject.Singleton;

import org.bukkit.Bukkit;

import dagger.Module;
import dagger.Provides;

@Module
public class ServerVersionModule {

	@Provides
	@Singleton
	int provideServerVersion() {
		// Simple parsing of game version. Might need to be updated in the future depending on how the Minecraft
		// versions change in the future.

		// petulikan1
		// Bukkit.getBukkitVersion() -> 1.20.4-R0.1-SNAPSHOT || 1.21-R0.1-SNAPSHOT
		// split("-")[0] -> 1.20.4 | 1.21
		// split("\\.") -> 20 | 21
		return Integer.parseInt(Bukkit.getVersion().split("-")[0].split("\\.")[1]);
	}

}
