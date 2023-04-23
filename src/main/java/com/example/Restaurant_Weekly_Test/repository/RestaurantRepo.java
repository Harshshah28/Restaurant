package com.example.Restaurant_Weekly_Test.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.Restaurant_Weekly_Test.Model.Restaurant;
import org.springframework.stereotype.Repository;



@Repository
public class RestaurantRepo {

    private List<Restaurant> restaurantList ;

    public RestaurantRepo(){
        restaurantList = new ArrayList<>();

        restaurantList.add(new Restaurant("1", "Baba deep singh", "Ahmedabad", "7600241425", "Punjabi", "18"));
        restaurantList.add(new Restaurant("2", "lapinoz", "Baroda", "8897488756", "Pizza", "29"));
        restaurantList.add(new Restaurant("3", "Purohit", "Gandhinagar", "9998979695", "Gujarati", "27"));
    }

    public List<Restaurant> getAllRestaurant() {
        return restaurantList;
    }

    public Boolean save(Restaurant restaurant) {
        restaurantList.add(restaurant);
        return true;
    }

    public Boolean remove(Restaurant restaurant) {
        restaurantList.remove(restaurant);

        return true;
    }

    public Boolean update(Restaurant restaurant, Restaurant restaurant1) {
        restaurantList.remove(restaurant1);
        restaurantList.add(restaurant);
        return true;
    }





}
