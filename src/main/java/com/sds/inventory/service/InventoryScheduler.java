package com.sds.inventory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.sds.inventory.UpdateItemFactory;
import com.sds.inventory.dao.ItemDao;
import com.sds.inventory.entity.Item;

@Service
public class InventoryScheduler {

	@Autowired
	ItemDao itemDao;

	@Autowired
	UpdateItemFactory updateItemFactory;

	@Scheduled(cron = "0 0 0 * * ?")
	public void updateInventory() {

		List<Item> items = itemDao.findAll();
		items = items.stream().map(item -> updateItemFactory.getUpdateItemServie(item.getItem()).updateItem(item))
				.collect(Collectors.toList());
		for (Item item : items) {
			itemDao.save(item);
		}
	}
}
