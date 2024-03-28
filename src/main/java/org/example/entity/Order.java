package org.example.entity;

import java.util.Arrays;

import static org.example.Const.menuPrice;

public class Order implements OrderModel {
    private static Order instance;
    private final int[][] orderedMenu = new int[2][8];

    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
    @Override
    public void addOrders(String menu, int quantity) {
        int menuId = Integer.parseInt(menu);
        orderedMenu[0][menuId-1] = quantity;
        orderedMenu[1][menuId-1] = menuPrice[menuId-1] * quantity;
        System.out.println("Menu berhasil ditambahkan ke daftar pesanan anda");
    }

    @Override
    public int[][] getOrders() {
        return orderedMenu;
    }

    @Override
    public void clearOrders() {
        Arrays.fill(orderedMenu, 0);
    }
}
