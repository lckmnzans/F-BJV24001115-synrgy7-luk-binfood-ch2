package org.example.view;

import java.util.List;

public interface OrderView {
    void displayMainMenu();
    void displaySubMenu(String menu);
    void displaySelectedMenu(String selectedItem, int price);
    void displayOrderedMenu(int[][] items, List<String> menuList);
}
