package com.qa.ims.persistence.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;

@SuppressWarnings("unused")
public class OrderDAOTest {

	private final OrderDAO DAO = new OrderDAO();

	

	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}


	@Test
	public void testCreate() {
		//System.out.println("Test for testCreate");
		final Order created = new Order(2L, 1L, 0.0);
		assertEquals(created, DAO.create(created));
	}
	
	@Test
	public void testReadAll() {
		//System.out.println("Test for testReadAll");
		List<Order> expected = new ArrayList<>();
		expected.add(new Order(1L, 1L, 0.0));
		assertEquals(expected, DAO.readAll());
	}
	
	@Test
	public void testReadLatest() {
		//System.out.println("Test for testReadLatest");
		//final Order created = new Order(2L, 3L, 0.0);
		assertEquals(new Order(1L, 1L, 0.0) , DAO.readLatest());
	}

	@Test
	public void testRead() {
		//System.out.println("Test for testRead");
		final long ID = 1L;
		assertEquals(new Order(1L, 1L, 0.0), DAO.read(ID));
	}

	@Test
	public void testUpdate() {
		//System.out.println("Test for testUpdate");
		final Order updated = new Order(1L, 1L, 0.0);
		assertEquals(updated, DAO.update(updated)); 
	}

	@Test
	public void testDelete() {
		//System.out.println("Test for testDelete");
		assertEquals(1, DAO.delete(1));
	}

}