package com.pluralsight.NorthwindTradersAPI.data;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);


}
