package com.sds.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.inventory.entity.Item;
import com.sds.inventory.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;

	@RequestMapping(value = "/fetchItems", method = RequestMethod.GET)
	public List<Item> message() {

		return itemService.getItems();
	}
}
