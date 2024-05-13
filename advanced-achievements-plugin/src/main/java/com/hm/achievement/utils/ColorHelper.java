package com.hm.achievement.utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.boss.BarColor;

public class ColorHelper {

	public static Color convertChatColorToColor(ChatColor chatColor) {
		switch (chatColor) {
			case AQUA:
				return Color.fromRGB(0x55, 0xFF, 0xFF);
			case BLACK:
				return Color.BLACK;
			case BLUE:
				return Color.fromRGB(0x55, 0x55, 0xFF);
			case GRAY:
				return Color.fromRGB(0xAA, 0xAA, 0xAA);
			case DARK_AQUA:
				return Color.fromRGB(0x00, 0xAA, 0xAA);
			case DARK_BLUE:
				return Color.fromRGB(0x00, 0x00, 0xAA);
			case DARK_GRAY:
				return Color.fromRGB(0x55, 0x55, 0x55);
			case DARK_GREEN:
				return Color.fromRGB(0x00, 0xAA, 0x00);
			case DARK_PURPLE:
				return Color.fromRGB(0xAA, 0x00, 0xAA);
			case DARK_RED:
				return Color.fromRGB(0xAA, 0x00, 0x00);
			case GOLD:
				return Color.fromRGB(0xFF, 0xAA, 0x00);
			case GREEN:
				return Color.fromRGB(0x55, 0xFF, 0x55);
			case LIGHT_PURPLE:
				return Color.fromRGB(0xFF, 0x55, 0xFF);
			case RED:
				return Color.fromRGB(0xFF, 0x55, 0x55);
			case YELLOW:
				return Color.fromRGB(0xFF, 0xFF, 0x55);
			case WHITE:
			default:
				return Color.WHITE;
		}
	}

	public static BarColor convertChatColorToBarColor(ChatColor chatColor) {
		switch (chatColor) {
			case AQUA:
			case DARK_GREEN:
			case GREEN:
				return BarColor.GREEN;
			case BLACK:
			case DARK_GRAY:
			case DARK_PURPLE:
			case LIGHT_PURPLE:
				return BarColor.PURPLE;
			case BLUE:
			case DARK_AQUA:
			case DARK_BLUE:
				return BarColor.BLUE;
			case DARK_RED:
			case RED:
				return BarColor.RED;
			case GOLD:
			case YELLOW:
				return BarColor.YELLOW;
			case GRAY:
			case WHITE:
			default:
				return BarColor.WHITE;
		}
	}

	private ColorHelper() {
		// Not called.
	}

}
