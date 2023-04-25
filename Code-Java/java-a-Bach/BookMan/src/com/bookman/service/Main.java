package com.bookman.service;

import java.util.Scanner;

import com.bookman.model.Book;

public class Main { 
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		BookManager bookManager = new BookManager();
		bookManager.loadFromFile();
		int choose;
		
		do {
			showMenu();
			System.out.print("\nYour option: "); 
			choose = Integer.parseInt(input.nextLine());
			
			switch(choose) {
				case 1:
					
					bookManager.printBooks(bookManager.getBooks());
					break;
				case 2:
					Book temp = bookManager.inputBook();
					bookManager.add(temp);
					break;
				case 3:
					Book temp2 = bookManager.inputBook();
					bookManager.edit(temp2);
					break;
				case 4:
					int id;
					System.out.print("Enter Book id: "); id = Integer.parseInt(input.nextLine());
					Book temp3 = bookManager.getBookById(id);
					if(temp3 != null) {
						bookManager.remove(temp3);
					}
					break;
				case 5:
					String keyword;
					System.out.print("Enter keyword: "); keyword = input.nextLine();
					bookManager.printBooks(bookManager.searchByName(keyword));;
					break;
				case 6:
					bookManager.sortDescByPrice();
					break;
				case 0:
					bookManager.saveToFile();
					break;
				default:
					System.out.println("Invalid option!");
					break;
			}
		}while(choose != 0);
	}
	
	static void showMenu() {
		System.out.println("\n-----------------------------------");
		System.out.println("1. List all books");
		System.out.println("2. Add a new book");
		System.out.println("3. Edit book");
		System.out.println("4. Delete a book");
		System.out.println("5. Search books by name");
		System.out.println("6. Sort books descending by price");
		System.out.println("\n0. save & exit");
		System.out.println("-----------------------------------");
	}
}
