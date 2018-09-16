package com.sds.inventory.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sds.inventory.entity.Item;

public class SulfurasUpdateItemServiceTest {

	@Test
	public void testUpdateItem() {
		
		Item item = new Item();
		item.setSellIn(15);
		item.setQuality(30);

		SulfurasUpdateItemService sulfurasUpdateItemService = new SulfurasUpdateItemService();
		item = sulfurasUpdateItemService.updateItem(item);
		assertEquals(item.getSellIn(), 15);
		assertEquals(item.getQuality(), 30);

	}

}
