package com.romkudev.api;

import com.romkudev.api.item.domain.Item;
import com.romkudev.api.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemApplication implements CommandLineRunner {

//	@Autowired ItemService itemService;

	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		/*
		itemService.deleteAll();
		itemService.save(new Item("삼성", "갤럭시", "흑색"));
		itemService.save(new Item("애플", "아이폰", "흰색"));
		itemService.save(new Item("샤오미", "홍미", "적색"));
		for (Item i : itemService.findAll()) {
			System.out.println(i.toString());
		}
		*/
	}
}
