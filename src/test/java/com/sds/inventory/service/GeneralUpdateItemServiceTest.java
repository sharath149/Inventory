package com.sds.inventory.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sds.inventory.entity.Item;

public class GeneralUpdateItemServiceTest {

	@Test
	public void testUpdateItem() {
		Item item = new Item();
		item.setSellIn(15);
		item.setQuality(30);

		GeneralUpdateItemService generalUpdateItemService = new GeneralUpdateItemService();
		item = generalUpdateItemService.updateItem(item);
		assertEquals(item.getSellIn(), 14);
		assertEquals(item.getQuality(), 29);

		item.setSellIn(0);

		item = generalUpdateItemService.updateItem(item);
		assertEquals(item.getSellIn(), 0);
		assertEquals(item.getQuality(), 27);
	}

}
