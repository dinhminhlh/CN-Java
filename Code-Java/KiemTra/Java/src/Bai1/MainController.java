package Bai1;
import java.util.ArrayList;

public class MainController {
    private Account account;
    private ArrayList<Book> books;
    private MainView view;
    private int id = 0;
    public MainController(Account account, ArrayList<Book> books, MainView view) {
        this.account = account;
        this.books = books;
        this.view = view;
    }

    public void run() {
        if (!login()) {
            return;
        }

        int choice;
        do {
            choice = view.showMainMenu();
            switch (choice) {
                case 1:
                    inputBookInfo();
                    break;
                case 2:
                    viewBookInfo();
                    break;
                case 3:
                	getSearchBookYear();
                    break;
                case 4:
//                    getShowQuantity();
                    break;
                case 5:
                    view.showGoodbyeMessage();
                    break;
                default:
                    System.out.println("Chuc nang khong hop le, vui long chon lai");
            }
        } while (choice != 5);
    }

    private boolean login() {
        int loginAttempts = 0;
        while (loginAttempts < 3) {
            String username = view.getUsername();
            String password = view.getPassword();
            if (account.checkLogin(username, password)) {
                return true;
            } else {
                view.showLoginFailedMessage();
                loginAttempts++;
            }
        }
        view.showMaxLoginAttemptsMessage();
        return false;
    }

    private void inputBookInfo() {
        view.showInputBookInfoMessage();
        String type = view.getBookType();
        String name = view.getBookName();
        String author = view.getAuthorName();
        int year = view.getPublicYear();
        int number = view.getPageNumber();
        Book student = new Book(id, type, name, author, year, number);
        id++;
        books.add(student);
    }

    private void viewBookInfo() {
        for (Book student : books) {
            view.showStudentInfo(student);
        }
    }

    private void getSearchBookYear() {
        int searchYear = view.getSearchBookYear();
        for (Book student : books) {
            if (student.getPublicYear() == searchYear) {
                view.showStudentInfo(student);
                return;
            }
        }
        view.showStudentNotFoundMessage(searchYear);
    }
    
//    private void getShowQuantity() {
//    	view.getQuantity();
//    }
    
}
