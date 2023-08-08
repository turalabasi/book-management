package service;


import util.InputUtil;
import util.MenuUtil;

import static service.BookService.*;

public class ManagementService  {

    public static void BookManage(){
        BookService bookService = new BookService();
        while (true) {
            int option = MenuUtil.EntryMenu();
            switch (option) {

                case 1:
                    BookService.displayBooks();
                    break;
                case 2:
                    BookService.searchBook();
                    break;
                case 3:
                    BookService.adBooks();
                    break;
                case 4:
                    int bookIdToUpdate =InputUtil.inputRequiredInt(("Which book would you like to update: "));
                    updateBook( bookIdToUpdate);
                    break;
                case 5:
                    int bookIdToDelete = InputUtil.inputRequiredInt(("Which book would you like to delete: "));
                    deleteBook(bookIdToDelete);
                    break;
                case 0:
                    System.out.println("Finish program!");
                    System.exit(-1);

                default:
                    System.out.println("Invalid option! ");
            }}}}











