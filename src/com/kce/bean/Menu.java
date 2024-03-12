package com.kce.bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.kce.dao.DishesDAO;
import com.kce.service.Order_Timing;
import com.kce.util.TimingException;

public class Menu {

	private String dish_name;
	private double dish_price;

	Menu() {
	}

	public Menu(String dish_name, double dish_price) {
		super();
		this.dish_name = dish_name;
		this.dish_price = dish_price;
	}

	public String getDish_name() {
		return dish_name;
	}

	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}

	public double getDish_price() {
		return dish_price;
	}

	public void setDish_price(double dish_price) {
		this.dish_price = dish_price;
	}

	public static Map<String, Double> Dishes_List_At_Morning() {
		System.out.printf("%25s%50s\n","DISHNAME","PRICES");
		System.out.println("-------------------------------------------------------------------------------");
		//Formatter f = new Formatter();
		Map<String, Double> Dishes_at_morning = new HashMap<String, Double>();
		Dishes_at_morning.put("Dosa", 50.00);
		Dishes_at_morning.put("Poori", 70.00);
		Dishes_at_morning.put("Pongal With Vada", 75.00);
		Dishes_at_morning.put("Rava Onion Roast", 80.00);
		Dishes_at_morning.put("Chola Puri", 100.00);
		Dishes_at_morning.put("Paniyaram", 40.00);
		Dishes_at_morning.put("Panner Dosa", 100.00);
		Dishes_at_morning.put("Idiyappam", 60.00);
		for (Map.Entry<String, Double> entry : Dishes_at_morning.entrySet()) {
			System.out.printf("%25s%50s",entry.getKey() , entry.getValue());
			System.out.println();
		}
		return Dishes_at_morning;
	}

	public static Map<String, Double> Dishes_List_At_AfterNoon() {
		System.out.printf("%25s%50s\n","DISHNAME","PRICES");
		System.out.println("-------------------------------------------------------------------------------");

		Map<String, Double> Dishes_at_afternoon = new HashMap<String, Double>();
		Dishes_at_afternoon.put("Meals", 80.00);
		Dishes_at_afternoon.put("Sambhar Rice", 60.00);
		Dishes_at_afternoon.put("Tamarind RIce", 55.00);
		Dishes_at_afternoon.put("Veg Briyani", 85.00);
		Dishes_at_afternoon.put("Panneer Fried Rice", 120.00);
		Dishes_at_afternoon.put("Mushroom Briyani  ", 110.00);
		Dishes_at_afternoon.put("Curd Rice", 70.00);
		Dishes_at_afternoon.put("Lemon Rice", 75.00);

		for (Map.Entry<String, Double> entry : Dishes_at_afternoon.entrySet()) {
			System.out.printf("%25s%50s",entry.getKey() , entry.getValue());
			System.out.println();
		}
		return Dishes_at_afternoon;
	}

	public static Map<String, Double> Dishes_List_At_Night() {
		System.out.printf("%25s%50s\n","DISHNAME","PRICES");
		System.out.println("-------------------------------------------------------------------------------");

		Map<String, Double> Dishes_at_night = new HashMap<String, Double>();
		Dishes_at_night.put("Masala Dosa", 80.00);
		Dishes_at_night.put("Poori with Channa", 120.00);
		Dishes_at_night.put("Parota", 25.00);
		Dishes_at_night.put("Chapati", 50.00);
		Dishes_at_night.put("Veg Kothu parota", 85.00);
		Dishes_at_night.put("Chilli Parota", 100.00);

		for (Map.Entry<String, Double> entry : Dishes_at_night.entrySet()) {
			System.out.printf("%25s%50s",entry.getKey() , entry.getValue());
			System.out.println();
		}
		return Dishes_at_night;
	}

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String timing = br.readLine().toLowerCase();
			Order_Timing time = new Order_Timing();
			switch (timing) {
			case "morning": {
				System.out.println("Please Book the Order According to the Menu");
				System.out.println("-------------------------------------------");
				time.order_at_morning();
				break;
			}
			case "afternoon": {
				time.order_at_afternoon();
				break;
			}
			case "night": {
				time.order_at_night();
				break;
			}
			default:
				throw new TimingException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
