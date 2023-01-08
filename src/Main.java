import pl.makstokarz.shopBooks.ShopBook;
import pl.makstokarz.shopGames.Shop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopBook shopBook = new ShopBook();

        int a;
        long id;
        int quantity;
        String name;
        double price ;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Wybierz sklep: ");
            System.out.println("1. Sklep z grami");
            System.out.println("2. Sklep z książkami");
            System.out.println("0. Wyjdź");
            if (sc.hasNextInt()){
                a = sc.nextInt();
                if (a > 2){
                    System.out.println("Podano nieprawidłową wartość!");
                    a = 0;
                }
            }else{
                System.out.println("Podano nieprawidłową wartość!");
                sc.next();
                a = 0;
            }

            switch (a) {
                case 1 -> {
                    if (!shop.isMethodCalled()) shop.runFirst();
                    System.out.println("Wybierz opcję:");
                    System.out.println("1. Wyświetl wszystkie gry");
                    System.out.println("2. Znajdź gre");
                    System.out.println("3. Dodaj gre ");
                    System.out.println("4. Zaktualizuj gre ");
                    System.out.println("5. Usuń gre");
                    System.out.println("0. Menu");

                    int b = -1;
                    sc.nextLine();
                    if (sc.hasNextInt()){
                        b = sc.nextInt();
                        if (b > 5){
                            System.out.println("Podano nieprawidłową wartość!");
                            a = 0;
                        }
                    }else{
                        System.out.println("Podano nieprawidłową wartość!");
                        sc.next();
                        a = 0;
                    }

                    switch (b) {
                        case 1 -> shop.showAllProducts();
                        case 2 -> {
                            System.out.println("Podaj id gry: ");
                            if (sc.hasNextLong()){
                                id = sc.nextLong();
                                shop.findProduct(id);
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                            }

                        }
                        case 3 -> {
                            System.out.println("Podaj nazwe gry: ");
                            sc.nextLine();
                            name = sc.nextLine();

                            System.out.println("Podaj cene gry: ");
                            if (sc.hasNextDouble()){
                                price = sc.nextDouble();
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            System.out.println("Podaj ilość dostępności gry: ");
                            if (sc.hasNextInt()){
                                quantity = sc.nextInt();
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            shop.addProduct(name, price, quantity);
                        }
                        case 4 -> {
                            System.out.println("Podaj id gry którą chcesz zaktualizować: ");
                            if (sc.hasNextLong()){
                                id = sc.nextLong();
                                if (!shop.findProduct(id)) break;
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            System.out.println("Podaj nazwe gry: ");
                            sc.nextLine();
                            name = sc.nextLine();

                            System.out.println("Podaj cene gry: ");
                            if (sc.hasNextDouble()){
                                price = sc.nextDouble();
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            System.out.println("Podaj ilość dostępności gry: ");
                            if (sc.hasNextInt()){
                                quantity = sc.nextInt();
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            shop.updateProduct(name, price, id, quantity);
                        }
                        case 5 -> {
                            System.out.println("Podaj id gry którą chcesz usunąć: ");
                            if (sc.hasNextLong()){
                                id = sc.nextLong();
                                shop.deleteProduct(id);
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                            }
                        }
                    }
                }
                // case 2 switch a
                case 2 -> {
                    if (!shopBook.isMethodCalled()) shopBook.runFirst();
                    System.out.println("Wybierz opcję:");
                    System.out.println("1. Wyświetl wszystkie książki");
                    System.out.println("2. Znajdź książke");
                    System.out.println("3. Dodaj książke ");
                    System.out.println("4. Zaktualizuj książke ");
                    System.out.println("5. Usuń książke");
                    System.out.println("0. Menu");

                    int c = -1;
                    sc.nextLine();
                    if (sc.hasNextInt()){
                        c = sc.nextInt();
                        if (c > 5){
                            System.out.println("Podano nieprawidłową wartość!");
                            a = 0;
                        }
                    }else{
                        System.out.println("Podano nieprawidłową wartość!");
                        sc.next();
                        a = 0;
                    }

                    switch (c) {
                        case 1 -> shopBook.showAllProducts();
                        case 2 -> {
                            System.out.println("Podaj id książki: ");
                            if (sc.hasNextLong()){
                                id = sc.nextLong();
                                shopBook.findProduct(id);
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                            }

                        }
                        case 3 -> {
                            System.out.println("Podaj nazwe książki: ");
                            sc.nextLine();
                            name = sc.nextLine();

                            System.out.println("Podaj cene książki: ");
                            if (sc.hasNextDouble()){
                                price = sc.nextDouble();
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            System.out.println("Podaj ilość dostępności książki: ");
                            if (sc.hasNextInt()){
                                quantity = sc.nextInt();
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            shopBook.addProduct(name, price, quantity);
                        }
                        case 4 -> {
                            System.out.println("Podaj id książki którą chcesz zaktualizować: ");
                            if (sc.hasNextLong()){
                                id = sc.nextLong();
                                if (!shopBook.findProduct(id)) break;
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            System.out.println("Podaj nazwe książki: ");
                            sc.nextLine();
                            name = sc.nextLine();

                            System.out.println("Podaj cene książki: ");
                            if (sc.hasNextDouble()){
                                price = sc.nextDouble();
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            System.out.println("Podaj ilość dostępności książki: ");
                            if (sc.hasNextInt()){
                                quantity = sc.nextInt();
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                                break;
                            }

                            shopBook.updateProduct(name, price, id, quantity);
                        }
                        case 5 -> {
                            System.out.println("Podaj id książki którą chcesz usunąć: ");
                            if (sc.hasNextLong()){
                                id = sc.nextLong();
                                shopBook.deleteProduct(id);
                            }else{
                                System.out.println("Podano nieprawidłową wartość!");
                                sc.next();
                            }
                        }
                    }
                }
            }

        }while (a != 0);

    }
}
