/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superliberary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author om4rezz
 */
public class SuperLiberary {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner;
    static ArrayList<Category> categories;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        categories = new ArrayList<Category>();

        categories.add(new Category("Physics", new ArrayList<Book>()));
        categories.add(new Category("History", new ArrayList<Book>()));
// to add books 0 for phisics 1 for history.
        categories.get(0).getBooks().add(new Book("Waves", "Nielz Bouhr", "xy-2344-33"));
        categories.get(0).getBooks().add(new Book("Moder Laser", "Schrodinger", "aa-332-2444"));
        categories.get(1).getBooks().add(new Book("War in Eraq", "General Donald Ramsfield", "re-322-3332"));
        categories.get(1).getBooks().add(new Book("6th October war", "General Saad Ed-Dien El-Shazli", "er-322-3992"));
        categories.get(1).getBooks().add(new Book("The Abbasian Era", "El-Gabarti", "AR-333-3921"));

        // history...... 
//        for (int book = 0; book < categories.get(1).getBooks().size(); book++) {
//            categories.get(1).getBooks().get(book).printBookDetails();
//        }
//        for (int category = 0; category < categories.size(); category++) {
//            System.out.println(categories.get(category).getTitle() + " category:\n");
//            internal:
//            for (int book = 0; book < categories.get(category).getBooks().size(); book++) {
//                categories.get(category).getBooks().get(book).printBookDetails();
//            }
//
//        }
        while (true) {
            startAppAndGiveOptions();
        }
    }

    public static void startAppAndGiveOptions() {
        System.out.println("Welcome to the Super Libreray:");
        System.out.println("To add a new category, press 1: ");
        System.out.println("To remove a category, press 2: ");
        System.out.println("To add a new book, press 3: ");
        System.out.println("To remove a book, press 4: ");
        System.out.println("To list the books of some categoty, press 5: ");
        System.out.println("To exit, press 0: ");

        System.out.print("\nYour choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Good bye.!");
                System.exit(0);
                break;
            case 1:
                // go with the scenario of adding a new categotry
                break;
            case 2:
                // go with the scenario of deleting a categotry
                break;
            case 3:
                // go with the scenario of adding a new book
                break;
            case 4:
                // go with the scenario of delegting a book
                break;
            case 5:
                // go with the scenario of listing the books
                // of some categoty'
                String output = "";
                for (int c = 0; c < categories.size(); c++) {
                    output += "  For " + categories.get(c).getTitle() + ", press " + (c + 1) + ":\n";
                }
                System.out.println(output);
                System.out.print("\nYour choice: ");
                int category = scanner.nextInt();
                if (category - 1 >= categories.size()) {
                    System.out.println("OPS Invalid category number.!");
                    break;
                }

                for (int i = 0; i < categories.get(category - 1).getBooks().size(); i++) {
                    categories.get(category - 1).getBooks().get(i).printBookDetails();
                }
                break;
        }
    }

}
