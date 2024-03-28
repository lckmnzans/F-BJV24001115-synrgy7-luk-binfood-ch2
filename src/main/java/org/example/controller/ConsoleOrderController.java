package org.example.controller;

import org.example.entity.OrderModel;
import org.example.view.OrderView;

import java.util.Arrays;
import java.util.List;

public class ConsoleOrderController extends OrderController {

    public ConsoleOrderController(OrderModel model, OrderView view) {
        super(model, view);
        init();
    }
    @Override
    void processInput(String userInput) {

    }

    void init() {
        String userInput = view.displayMainMenu();
        List<String> menuList = Arrays.asList("1","2","3","4","5","6","7","8");
        List<String> subMenuOption = Arrays.asList("00","01");
        if (menuList.contains(userInput)) {
            view.displaySelectedMenu(userInput);
        } else if (subMenuOption.contains(userInput)) {
            view.displaySubMenu(userInput);
        } else {
            System.out.println("Maaf, masukkan menu atau pilihan yang sesuai! \n" + "=".repeat(30));
            view.displayMainMenu();
        }
    }
}
