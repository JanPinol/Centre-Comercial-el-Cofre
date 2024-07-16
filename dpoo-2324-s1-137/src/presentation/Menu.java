package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void showWelcome() {
        String ELCOFRE = """
                        ________      ____
                  ___  / / ____/___  / __/_______
                 / _ \\/ / /   / __ \\/ /_/ ___/ _ \\
                /  __/ / /___/ /_/ / __/ /  / __ /
                \\___/_/\\____/\\____/_/ /_/   \\___/
                """;
        System.out.println(ELCOFRE);
        System.out.println("Welcome to elCofre Digital Shopping Experiences.\n");
    }

    public void showMainMenu() {
        System.out.println("\n\t1) Manage Products");
        System.out.println("\t2) Manage Shops");
        System.out.println("\t3) Search Products");
        System.out.println("\t4) List Shops");
        System.out.println("\t5) Your Cart");
        System.out.println();
        System.out.println("\t6) Exit");
    }

    public enum mainMenuOptions {
        MANAGE_PRODUCTS,
        MANAGE_SHOPS,
        SEARCH_PRODUCTS,
        LIST_SHOPS,
        YOUR_CART,
        EXIT,
        ERROR
    }

    public mainMenuOptions getSelectedMainMenuOption(int selection) {
        switch (selection) {
            case 1 -> {
                return mainMenuOptions.MANAGE_PRODUCTS;
            }
            case 2 -> {
                return mainMenuOptions.MANAGE_SHOPS;
            }
            case 3 -> {
                return mainMenuOptions.SEARCH_PRODUCTS;
            }
            case 4 -> {
                return mainMenuOptions.LIST_SHOPS;
            }
            case 5 -> {
                return mainMenuOptions.YOUR_CART;
            }
            case 6 -> {
                return mainMenuOptions.EXIT;
            }
            default -> {
                return mainMenuOptions.ERROR;
            }
        }
    }

    public void showManageProductsMenu() {
        System.out.println("\n\t1) Create a Product");
        System.out.println("\t2) Remove a Product");
        System.out.println();
        System.out.println("\t3) Back");
    }

    public enum menuManageProductsOptions {
        CREATE_PRODUCT,
        REMOVE_PRODUCT,
        BACK,
        ERROR
    }

    public menuManageProductsOptions getSelectedManageProductsMenuOption(int selection) {
        switch (selection) {
            case 1 -> {
                return menuManageProductsOptions.CREATE_PRODUCT;
            }
            case 2 -> {
                return menuManageProductsOptions.REMOVE_PRODUCT;
            }
            case 3 -> {
                return menuManageProductsOptions.BACK;
            }
            default -> {
                return menuManageProductsOptions.ERROR;
            }
        }
    }

    public void showManageShopMenu() {
        System.out.println("\n\t1) Create a Shop");
        System.out.println("\t2) Expand a Shop’s Catalogue");
        System.out.println("\t3) Reduce a Shop’s Catalogue");
        System.out.println();
        System.out.println("\t4) Back");
    }

    public enum menuManageShopsOptions {
        CREATE_SHOP,
        EXPAND_CATALOGUE,
        REDUCE_CATALOGUE,
        BACK,
        ERROR
    }

    public menuManageShopsOptions getSelectedManageShopsMenuOption(int selection) {
        switch (selection) {
            case 1 -> {
                return menuManageShopsOptions.CREATE_SHOP;
            }
            case 2 -> {
                return menuManageShopsOptions.EXPAND_CATALOGUE;
            }
            case 3 -> {
                return menuManageShopsOptions.REDUCE_CATALOGUE;
            }
            case 4 -> {
                return menuManageShopsOptions.BACK;
            }
            default -> {
                return menuManageShopsOptions.ERROR;
            }
        }

    }

    public void showSearchProductsMenu() {
        System.out.println("\n\t1) Read Reviews");
        System.out.println("\t2) Review Product");
    }

    public menuManageSearchProductsOptions getSelectedSearchProductsMenuOption(int selection) {
        switch (selection) {
            case 1 -> {
                return menuManageSearchProductsOptions.READ_REVIEWS;
            }
            case 2 -> {
                return menuManageSearchProductsOptions.REVIEW_PRODUCT;
            }
            default -> {
                return menuManageSearchProductsOptions.ERROR;
            }
        }
    }

    public enum menuManageSearchProductsOptions {
        READ_REVIEWS,
        REVIEW_PRODUCT,
        ERROR
    }

    public void showListShopsMenu() {
        System.out.println("\n\t1) Read Reviews");
        System.out.println("\t2) Review Product");
        System.out.println("\t3) Add to Cart");
    }

    public enum menuListShopsOptions {
        READ_REVIEWS,
        REVIEW_PRODUCT,
        ADD_TO_CART,
        ERROR
    }

    public menuListShopsOptions getSelectedListShopsMenuOption(int selection) {
        switch (selection) {
            case 1 -> {
                return menuListShopsOptions.READ_REVIEWS;
            }
            case 2 -> {
                return menuListShopsOptions.REVIEW_PRODUCT;
            }
            case 3 -> {
                return menuListShopsOptions.ADD_TO_CART;
            }
            default -> {
                return menuListShopsOptions.ERROR;
            }
        }
    }

    public void showYourCartMenu() {
        System.out.println("\n\t1) Checkout");
        System.out.println("\t2) Clear cart");
        System.out.println();
        System.out.println("\t3) Back");
    }

    public enum menuYourCartOptions {
        CHECKOUT,
        CLEAR_CART,
        BACK,
        ERROR
    }

    public menuYourCartOptions getSelectedYourCartMenuOption(int selection) {
        switch (selection) {
            case 1 -> {
                return menuYourCartOptions.CHECKOUT;
            }
            case 2 -> {
                return menuYourCartOptions.CLEAR_CART;
            }
            case 3 -> {
                return menuYourCartOptions.BACK;
            }
            default -> {
                return menuYourCartOptions.ERROR;
            }
        }
    }

    public void showGoodbye() {
        System.out.println("\nWe hope to see you again!");
    }

    public int askForInteger(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: This isn't an integer!");
            } finally {
                scanner.nextLine();
            }
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

}
