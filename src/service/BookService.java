package service;

import global.GlobalData;
import model.Book;
import util.InputUtil;



import static global.GlobalData.books;

public class BookService {





    public static void displayBooks() {
        System.out.println("-------------------------------");
        System.out.println("----------BOOK LIST-------------");

        if (books != null) {
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i].getInfo());

            }
        } else {
            System.out.print("------------------------- \n " +
                    "Book has not yet! \n" +

                    "----------------------------");
        }
    }

    public static void searchBook() {
        String key = InputUtil.inputRequiredString("Search");
        boolean isFind = false;

        for (int i = 0; i < GlobalData.books.length; i++) {

            if (GlobalData.books[i].getName().contains(key) || GlobalData.books[i].getAuthor().contains(key)) {
                isFind = true;
                System.out.println(GlobalData.books[i].getInfo());

            }}
        if (!isFind) {
            System.out.println("there is no such book");
        }

    }

    public static void adBooks() {
        int bookCount = InputUtil.inputRequiredInt("how many Books to add");

        if (books == null) {
            books = new Book[bookCount];

            for (int i = 0; i < books.length; i++) {
                books[i] = fillBooks(i);

            }
        } else {
            Book[] tempBooks = books;
            books = new Book[books.length + bookCount];
            for (int i = 0; i < books.length; i++) {
                if (i < tempBooks.length) {
                    books[i] = tempBooks[i];
                } else {
                    books[i] = fillBooks(i);

                }
            }
        }
    }


    public static void updateBook( int bookId) {
        int index = findBookIndex(bookId);
        if (index == -1) {
            System.out.println("Book not found.");
            return;
        }

        Book book = books[index];
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("NOTE: If you don't want to change the selected field, just press enter.");

        String title = InputUtil.inputRequiredString("Title (" + book.getName() + "): ");
        if (!title.isEmpty()) {
            book.setName(title);
        }
        String description = InputUtil.inputRequiredString("Description (" + book.getDescription() + "): ");
        if (!description.isEmpty()) {
            book.setDescription(description);
        }
        String author =InputUtil.inputRequiredString("Author (" + book.getAuthor() + "): ") ;
        if (!author.isEmpty()) {
            book.setAuthor(author);
        }

        System.out.println("Successfully updated!");
    }


    static void deleteBook(int bookId) {

        int index = findBookIndex(bookId);
        if (index == -1) {
            System.out.println("Book not found.");
            return;
        }
        Book[] tempBooks = books;
        books = new Book[tempBooks.length-1];
        for (int i = 0; i < books.length; i++) {
            if(i<index) {
                books[i]=tempBooks[i];
                continue;
            }
            books[i]=tempBooks[i+1];

        }
        System.out.println("successfully deleted");
    }





        public static int findBookIndex ( int bookId){

            for (int i = 0; i < books.length; i++) {

                if (books[i].getId() == bookId) {
                    return i;
                }
            }
            return -1;
        }

        public static Book fillBooks ( int i){
            System.out.println("----------------------------------------------------");
            System.out.println(i + 1 + ".Book");
            String name = InputUtil.inputRequiredString("enter the name : ");
            String description = InputUtil.inputRequiredString("enter the description : ");
            String author = InputUtil.inputRequiredString("enter  Author : ");

            System.out.println("----------------------------------------------------");
            return new Book(i + 1, name, description, author);
        }



}








