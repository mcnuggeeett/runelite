/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
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
package net.runelite.client.plugins.jewelrycount;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Query;
import net.runelite.api.queries.EquipmentItemQuery;
import net.runelite.api.queries.InventoryItemQuery;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.RuneLite;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;

class JewelryCountOverlay extends Overlay
{
	private final RuneLite runelite = RuneLite.getRunelite();
	private final JewelryCountConfig config;
	private final Font font = FontManager.getRunescapeSmallFont().deriveFont(Font.PLAIN, 16);

	JewelryCountOverlay(JewelryCount plugin)
	{
		super(OverlayPosition.DYNAMIC);
		this.config = plugin.getConfig();
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Client client = RuneLite.getClient();

		if (client.getGameState() != GameState.LOGGED_IN
			|| !config.enabled()
			|| client.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN) != null)
		{
			return null;
		}

		graphics.setFont(font);

		for (WidgetItem item : getJewelryWidgetItems())
		{
			JewelryCharges charges = JewelryCharges.getCharges(item.getId());

			if (charges == null)
			{
				continue;
			}

			renderWidgetText(graphics, item.getCanvasBounds(), charges.getCharges(), Color.white);

		}

		return null;
	}

	private Collection<WidgetItem> getJewelryWidgetItems()
	{
		Query inventoryQuery = new InventoryItemQuery();
		WidgetItem[] inventoryWidgetItems = runelite.runQuery(inventoryQuery);

		Query equipmentQuery = new EquipmentItemQuery().slotEquals(
			WidgetInfo.EQUIPMENT_AMULET,
			WidgetInfo.EQUIPMENT_RING,
			WidgetInfo.EQUIPMENT_GLOVES
		);
		WidgetItem[] equipmentWidgetItems = runelite.runQuery(equipmentQuery);

		Collection<WidgetItem> jewelry = new ArrayList<>();
		jewelry.addAll(Arrays.asList(inventoryWidgetItems));
		jewelry.addAll(Arrays.asList(equipmentWidgetItems));
		return jewelry;
	}

	private void renderWidgetText(Graphics2D graphics, Rectangle bounds, int charges, Color color)
	{
		FontMetrics fm = graphics.getFontMetrics();

		int textX = (int) bounds.getX();
		int textY = (int) bounds.getY() + fm.getHeight();

		//text shadow
		graphics.setColor(Color.BLACK);
		graphics.drawString(String.valueOf(charges), textX + 1, textY + 1);

		graphics.setColor(color);
		graphics.drawString(String.valueOf(charges), textX, textY);
	}

}
