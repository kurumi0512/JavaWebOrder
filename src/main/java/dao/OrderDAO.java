package dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import model.entity.Order;

public class OrderDAO {

	// 利用List來模擬資料庫/資料表 (稱為:InMemory)
	private static List<Order> orders = new CopyOnWriteArrayList<>();

	// 存入一筆資料
	public void save(Order order) {
		orders.add(order);

	}

	// 取得所有歷史資料
	public List<Order> findAll() {
		return orders;
	}
}
