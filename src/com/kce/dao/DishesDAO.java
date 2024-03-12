package com.kce.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DishesDAO {

	
	public void InsertDishes()
	{
		try {
			Connection con = DButil.getConnection();
			
			//Values Insertion For Morning Dishes
			PreparedStatement pmt = con.prepareStatement("insert into MorningDishList values(?,?)");
			pmt.setString(1, "Dosa");
			pmt.setDouble(2, 50.00);
			pmt.executeUpdate();
			pmt.setString(1, "Poori");
			pmt.setDouble(2, 75.00);
			pmt.executeUpdate();
			pmt.setString(1, "Pongal With Vada");
			pmt.setDouble(2, 80.00);
			pmt.executeUpdate();
			pmt.setString(1, "Chola Puri");
			pmt.setDouble(2, 100.00);
			pmt.executeUpdate();
			pmt.setString(1, "Paniyaram");
			pmt.setDouble(2, 40.00);
			pmt.executeUpdate();
			pmt.setString(1, "Panner Dosa");
			pmt.setDouble(2, 100.00);
			pmt.executeUpdate();
			pmt.setString(1, "IdiYappam");
			pmt.setDouble(2, 50.00);
			pmt.executeUpdate();
			
			//Values Insertion For AfterNoon Dishes
			pmt = con.prepareStatement("insert into AfternoonDishList values(?,?)");
			pmt.setString(1, "Meals");
			pmt.setDouble(2, 80.00);
			pmt.executeUpdate();
			pmt.setString(1, "Sambhar rice");
			pmt.setDouble(2, 60.00);
			pmt.executeUpdate();
			pmt.setString(1, "Tamarind Rice");
			pmt.setDouble(2, 55.00);
			pmt.executeUpdate();
			pmt.setString(1, "Veg Briyani");
			pmt.setDouble(2, 80.00);
			pmt.executeUpdate();
			pmt.setString(1, "Panneer Fried Rice");
			pmt.setDouble(2, 120.00);
			pmt.executeUpdate();
			pmt.setString(1, "Mushroom Briyani");
			pmt.setDouble(2, 120.00);
			pmt.executeUpdate();
			pmt.setString(1, "Curd Rice");
			pmt.setDouble(2, 70.00);
			pmt.executeUpdate();
			
			//Values Insertion For Dinner Dishes
			pmt = con.prepareStatement("insert into DinnerDishList values(?,?)");
			pmt.setString(1, "Masala Dosa");
			pmt.setDouble(2, 80.00);
			pmt.executeUpdate();
			pmt.setString(1, "Poori with Channa");
			pmt.setDouble(2, 80.00);
			pmt.executeUpdate();
			pmt.setString(1, "Parota");
			pmt.setDouble(2, 25.00);
			pmt.executeUpdate();
			pmt.setString(1, "Chapati");
			pmt.setDouble(2, 80.00);
			pmt.executeUpdate();
			pmt.setString(1, "Veg Kothu Parota");
			pmt.setDouble(2, 80.00);
			pmt.executeUpdate();
			pmt.setString(1, "Chilli Parota");
			pmt.setDouble(2, 120.00);
			pmt.executeUpdate();
			pmt.setString(1, "Ghee Roast");
			pmt.setDouble(2, 70.00);
			pmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	/*public void MorningDishes()
	{
		try {
			Map<String, Double> morning_dish_map = new HashMap<String, Double>();

			Connection con = DButil.getConnection();
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from MorningDishList");
			System.out.println("DISHES\t\tPRICE");
			while(rs.next())
			{
				morning_dish_map.put(rs.getString(1), rs.getDouble(2));
			}	
			for(Map.Entry<String, Double> entry : morning_dish_map.entrySet()) {
				System.out.println(entry.getKey()+"\t"+entry.getValue());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}*/

}
