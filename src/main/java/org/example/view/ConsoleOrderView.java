package org.example.view;

import java.util.Scanner;

import static org.example.Const.menuMessage;

public class ConsoleOrderView implements OrderView {
    private Scanner inputMenu;
    public ConsoleOrderView() {
        this.inputMenu = new Scanner(System.in);
        init();
    }
    public void init() {
        String welcomeMessage =
                "=".repeat(30) +
                        "\n Selamat datang di Binar Food \n" +
                        "=".repeat(30);
        System.out.println(welcomeMessage);
        displayMainMenu();
    }

    @Override
    public String displayMainMenu() {
        System.out.println(menuMessage);
        System.out.print("=> ");
        String userInput = inputMenu.nextLine();
        return userInput;
    }

    @Override
    public void displaySubMenu(String menu) {
        System.out.println("Menampilkan Sub menu");
    }

    @Override
    public String displaySelectedMenu(String menu) {
        System.out.println("Menampilkan Selected menu");
        return menu;
    }

    @Override
    public void displayOrderedMenu() {
        System.out.println("Menampilkan Ordered menu");
    }
}
