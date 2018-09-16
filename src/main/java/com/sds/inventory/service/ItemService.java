package com.sds.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.inventory.dao.ItemDao;
import com.sds.inventory.entity.Item;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;

	public List<Item> getItems() {
      return itemDao.findAll();
	}
}
