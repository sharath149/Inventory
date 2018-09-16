package com.sds.inventory.service;

import org.springframework.stereotype.Service;

import com.sds.inventory.entity.Item;

@Service
public class GeneralUpdateItemService implements IUpdateItemService {

	@Override
	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		item.setSellIn(item.getSellIn() > 0 ? item.getSellIn() - 1 : 0);
		if (item.getSellIn() > 0) {
			item.setQuality(item.getQuality() - 1);
		} else {
			item.setQuality(item.getQuality() - 2);
		}
		if (item.getQuality() < 0) {
			item.setQuality(0);
		}
		return item;
	}

}
