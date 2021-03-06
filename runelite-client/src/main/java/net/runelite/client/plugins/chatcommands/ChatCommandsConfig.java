/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.chatcommands;

import java.awt.Color;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(
	keyName = "chatcommands",
	name = "Chat commands",
	description = "Configuration for chat commands"
)
public interface ChatCommandsConfig
{
	@ConfigItem(
		position = 0,
		keyName = "price",
		name = "Price Command",
		description = "Configures whether the Price command is enabled"
	)
	default boolean price()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "lvl",
		name = "Level Command",
		description = "Configures whether the Level command is enabled"
	)
	default boolean lvl()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "enableRecolor",
		name = "Enable command recolor",
		description = "Configures whether chat commands are recolored"
	)
	default boolean recolorEnabled()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "hexColorPublic",
		name = "Public chat",
		description = "Color of Public chat"
	)
	default Color getPublicRecolor()
	{
		return Color.decode("#0000FF");
	}

	@ConfigItem(
		position = 4,
		keyName = "hexColorPublicH",
		name = "Public chat highlight",
		description = "Color of Public chat highlight"
	)
	default Color getPublicHRecolor()
	{
		return Color.decode("#000000");
	}

	@ConfigItem(
		position = 5,
		keyName = "hexColorPrivate",
		name = "Private chat",
		description = "Color of Private chat"
	)
	default Color getPrivateRecolor()
	{
		return Color.decode("#0088FF");
	}

	@ConfigItem(
		position = 6,
		keyName = "hexColorPrivateH",
		name = "Private chat highlight",
		description = "Color of Private chat highlight"
	)
	default Color getPrivateHRecolor()
	{
		return Color.decode("#002783");
	}

	@ConfigItem(
		position = 7,
		keyName = "hexColorCc",
		name = "Clan chat",
		description = "Color of Clan chat"
	)
	default Color getCcRecolor()
	{
		return Color.decode("#900000");
	}

	@ConfigItem(
		position = 8,
		keyName = "hexColorCcH",
		name = "Clan chat Highlight",
		description = "Color of Clan chat highlight"
	)
	default Color getCcHRecolor()
	{
		return Color.decode("#000000");
	}
}
