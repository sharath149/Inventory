package com.sds.inventory.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sds.inventory.entity.Item;

public class ConcertBackstageUpdateItemServiceTest {

	@Test
	public void testUpdateItem() {
		Item item = new Item();
		item.setSellIn(15);
		item.setQuality(30);

		ConcertBackstageUpdateItemService concertBackstageUpdateItemService = new ConcertBackstageUpdateItemService();
		item = concertBackstageUpdateItemService.updateItem(item);
		assertEquals(item.getSellIn(), 14);
		assertEquals(item.getQuality(), 31);

		item.setSellIn(10);
		item = concertBackstageUpdateItemService.updateItem(item);
		assertEquals(item.getQuality(), 33);
		assertEquals(item.getSellIn(), 9);
		
		item.setSellIn(0);
		item = concertBackstageUpdateItemService.updateItem(item);
		assertEquals(item.getQuality(), 0);	
		assertEquals(item.getSellIn(), 0);

	}

}
