package com.bookman.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.bookman.model.Book;

public class BookManager{
	private ArrayList<Book> books = new ArrayList<>();
	Scanner input = null;
	
	public BookManager() {
    }

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

    /**
     * update this.books by reading books from file books.txt
     */
    public void loadFromFile() {
    	try {
			input = new Scanner(new File("books.txt"));
			
			while(input.hasNext()) {
				int id = Integer.parseInt(input.nextLine());
				String name = input.nextLine();
				double price = Double.parseDouble(input.nextLine());
				
				Book book = new Book(id, name, price);
				books.add(book);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Loading books...");
    }

    
    
    /**
     * print books (one/line) in required format
     */
    public void printBooks(ArrayList<Book> books) {
    	if(books.isEmpty()) {
    		System.out.println("(empty)");
    		return;
    	}
    	System.out.printf("%-5s %-45s %-10s", "ID", "Name", "Price");
        for(Book book : books) {
        	System.out.printf("\n%-5d %-45s %-10.2f",book.getId(), book.getName(), book.getPrice());
        }
    }

    /**
     * if book.id is not duplicated, add book to this.books
     * return whether added or not
     */
    public boolean add(Book book) {
    	books.add(book);
    	System.out.println("Added successfully.");
        return true;
    }
    
    public void edit(Book book) {
    	for(Book b : books) {
    		if(b.getId() == book.getId()) {
    			b.setName(book.getName());
    			b.setPrice(book.getPrice());
    			System.out.println("Updated successfully.");
    		}
    	}
    }
    public Book inputBook() {
    	int id;
    	String name;
    	double price;
    	input = new Scanner(System.in);
    	
        System.out.print("\nEnter book id: "); id = Integer.parseInt(input.nextLine());
        System.out.print("Enter book name: "); name = input.nextLine();
        System.out.print("Enter book price: "); price = input.nextDouble();
        Book book = new Book(id, name, price);
    	return book;
    }

    /**
     * return book specified by id, null if not found
     */
    public Book getBookById(int id) {
//    	int check;
//    	input = new Scanner(System.in); 
//        System.out.print("\nEnter id: "); check = input.nextInt();
        
        for(Book book : books) {
        	if(id == book.getId()) {
        		return book;
        	}
        }
        System.out.println("Invalid ID!");
        return null;
    }

    /**
     * remove book from this.books
     */
    public void remove(Book book) {
        for(Book b : books) {
        	if(book.getId() == b.getId()) {
        		books.remove(book);
        		System.out.println("Deleted successfully !");
        		return;
        	}
        }
        System.out.println("This book does not exist !");
    }

    /**
     * update this.books to be sorted by price from high -> low
     */
    public void sortDescByPrice() {
        Collections.sort(books);
        System.out.println("\nAfter sorting: ");
        printBooks(books);
    }

    /**
     * return all books having name contains keyword (case in-sensitive)
     */
    public ArrayList<Book> searchByName(String keyword) {
        ArrayList<Book> matches = new ArrayList<>();

        for(Book book : books) {
        	if(book.getName().contains(keyword)) {
        		matches.add(book);
        	}
        }
        return matches;
    }

    /**
     * write this.books to file books.txt in required format
     */
    public void saveToFile() {
    	BufferedWriter bufferedWriter = null;
    	File file = null;
    	try {
    		file = new File("books.txt");
    		bufferedWriter = new BufferedWriter(new FileWriter(file));
    		for(Book book : books){
    			bufferedWriter.write(book.toString());
    		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
    	System.out.println("Saving to file...\nBye!");
    }
}
