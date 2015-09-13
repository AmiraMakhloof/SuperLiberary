/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superliberary;

import java.util.ArrayList;

/**
 *
 * @author om4rezz
 */
public class Category {

    private String title;
    private ArrayList<Book> books;

    public Category(String title, ArrayList<Book> books) {
        this.title = title;
        this.books = books;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }
}
