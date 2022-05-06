package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemsDAO;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.utils.Utils;

/**
* Takes in item details for CRUD functionality
*
*/
public class ItemsController implements CrudController<Items> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private ItemsDAO itemsDAO;
	private Utils utils;
	
	public ItemsController(ItemsDAO itemsDAO, Utils utils) {
		super();
		this.itemsDAO = itemsDAO;
		this.utils = utils;
	}
	
	/**
	 * Reads all items to the logger
	 */
	@Override
	public List<Items> readAll() {
		List<Items> items = itemsDAO.readAll();
		for (Items item : items) {
			LOGGER.info(item.toString());
		}
		return items;
	}
	
	/**
	 * Creates a item by taking in user input: item name and value of the item
	 */
	@Override
	public Items create() {
		LOGGER.info("Please enter a item name");
		String name = utils.getString();
		LOGGER.info("Please enter a the value of the item");
		Double value = utils.getDouble();
		Items item = itemsDAO.create(new Items(name, value));
		LOGGER.info("Item created");
		return item;
	}
	
	/**
	 * Updates an existing item by taking in user input: id, name and value.
	 */
	@Override
	public Items update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a item name");
		String name = utils.getString();
		LOGGER.info("Please enter a the value of the item");
		Double value = utils.getDouble();
		Items item = itemsDAO.update(new Items(id, name, value));
		LOGGER.info("Item updated");
		return item;
	}
	
	/**
	 * Deletes an existing item by the id of the item
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		return itemsDAO.delete(id);
	}

}