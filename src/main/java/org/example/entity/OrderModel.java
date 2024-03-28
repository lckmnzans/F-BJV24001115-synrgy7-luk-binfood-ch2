package org.example.entity;

public interface OrderModel {
    void addOrders(String menu, int quantity);
    int[][] getOrders();
    void clearOrders();
}
