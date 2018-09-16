package com.sds.inventory.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sds.inventory.entity.Item;

public class AgedBrieUpdateItemServiceTest {

	@Test
	public void testUpdateItem() {

		Item item = new Item();
		item.setSellIn(10);
		item.setQuality(30);

		AgedBrieUpdateItemService agedBrieUpdateItemService = new AgedBrieUpdateItemService();
		item = agedBrieUpdateItemService.updateItem(item);
		assertEquals(item.getSellIn(), 9);
		assertEquals(item.getQuality(), 31);
		
		item.setSellIn(0);
		item = agedBrieUpdateItemService.updateItem(item);
		assertEquals(item.getQuality(), 31);
		

	}

}
