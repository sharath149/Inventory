package com.sds.inventory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.sds.inventory.service.AgedBrieUpdateItemService;
import com.sds.inventory.service.ConcertBackstageUpdateItemService;
import com.sds.inventory.service.GeneralUpdateItemService;
import com.sds.inventory.service.IUpdateItemService;
import com.sds.inventory.service.SulfurasUpdateItemService;

@Configuration
public class UpdateItemFactory {

	@Bean
	@Scope(value = "prototype")
	@Lazy(value = true)
	public IUpdateItemService getUpdateItemServie( String item) {
		switch (item) {
		case "Aged Brie":
			return new AgedBrieUpdateItemService();
		case "Sulfuras":
			return new SulfurasUpdateItemService();
		case "Concert backstage passes":
			return new ConcertBackstageUpdateItemService();
		default:
			return new GeneralUpdateItemService();
		}
	}
}
