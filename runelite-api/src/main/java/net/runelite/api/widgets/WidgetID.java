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
package net.runelite.api.widgets;

class WidgetID
{
	static final int BANK_GROUP_ID = 12;
	static final int BANK_INVENTORY_GROUP_ID = 15;
	static final int DEPOSIT_BOX_GROUP_ID = 192;
	static final int INVENTORY_GROUP_ID = 149;
	static final int EQUIPMENT_GROUP_ID = 387;
	static final int PESTRCONTROL_GROUP_ID = 408;
	static final int CLAN_CHAT_GROUP_ID = 7;
	static final int MINIMAP_GROUP_ID = 160;
	static final int LOGIN_CLICK_TO_PLAY_GROUP_ID = 378;
	static final int CLUE_SCROLL_GROUP_ID = 203;
	static final int FIXED_VIEWPORT_GROUP_ID = 548;
	static final int RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID = 161;
	static final int RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID = 164;
	static final int PRAYER_GROUP_ID = 541;
	static final int SHOP_GROUP_ID = 300;
	static final int SHOP_INVENTORY_GROUP_ID = 301;

	static class PestControl
	{
		static final int PURPLE_SHIELD = 21;
		static final int BLUE_SHIELD = 23;
		static final int YELLOW_SHIELD = 25;
		static final int RED_SHIELD = 27;

		static final int PURPLE_HEALTH = 17;
		static final int BLUE_HEALTH = 18;
		static final int YELLOW_HEALTH = 19;
		static final int RED_HEALTH = 20;

		static final int PURPLE_ICON = 13;
		static final int BLUE_ICON = 14;
		static final int YELLOW_ICON = 15;
		static final int RED_ICON = 16;

		static final int ACTIVITY_BAR = 6;
		static final int ACTIVITY_PROGRESS = 8;
	}

	static class ClanChat
	{
		static final int TITLE = 1;
		static final int NAME = 3;
		static final int OWNER = 5;
	}

	static class Bank
	{
		static final int ITEM_CONTAINER = 12;
		static final int INVENTORY_ITEM_CONTAINER = 3;
	}

	static class DepositBox
	{
		static final int INVENTORY_ITEM_CONTAINER = 2;
	}

	static class Shop
	{
		static final int ITEMS_CONTAINER = 2;
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Equipment
	{
		static final int HELMET = 6;
		static final int CAPE = 7;
		static final int AMULET = 8;
		static final int WEAPON = 9;
		static final int BODY = 10;
		static final int SHIELD = 11;
		static final int LEGS = 12;
		static final int GLOVES = 13;
		static final int BOOTS = 14;
		static final int RING = 15;
		static final int AMMO = 16;
	}

	static class Cluescroll
	{
		static final int CLUE_TEXT = 2;
	}

	static class Minimap
	{
		static final int XP_ORB = 1;
	}

	static class Viewport
	{
		static final int FIXED_VIEWPORT = 20;
		static final int RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX = 12;
		static final int RESIZABLE_VIEWPORT_BOTTOM_LINE = 12;
	}

	static class Prayer
	{
		static final int THICK_SKIN = 4;
		static final int BURST_OF_STRENGTH = 5;
		static final int CLARITY_OF_THOUGHT = 6;
		static final int SHARP_EYE = 22;
		static final int MYSTIC_WILL = 23;
		static final int ROCK_SKIN = 7;
		static final int SUPERHUMAN_STRENGTH = 8;
		static final int IMPROVED_REFLEXES = 9;
		static final int RAPID_RESTORE = 10;
		static final int RAPID_HEAL = 11;
		static final int PROTECT_ITEM = 12;
		static final int HAWK_EYE = 24;
		static final int MYSTIC_LORE = 25;
		static final int STEEL_SKIN = 13;
		static final int ULTIMATE_STRENGTH = 14;
		static final int INCREDIBLE_REFLEXES = 15;
		static final int PROTECT_FROM_MAGIC = 16;
		static final int PROTECT_FROM_MISSILES = 17;
		static final int PROTECT_FROM_MELEE = 18;
		static final int EAGLE_EYE = 26;
		static final int MYSTIC_MIGHT = 27;
		static final int RETRIBUTION = 19;
		static final int REDEMPTION = 20;
		static final int SMITE = 21;
		static final int PRESERVE = 32;
		static final int CHIVALRY = 28;
		static final int PIETY = 29;
		static final int RIGOUR = 30;
		static final int AUGURY = 31;
	}
}
