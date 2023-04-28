package Bai1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("admin", "admin");
        ArrayList<Book> books = new ArrayList<>();
        MainView view = new MainView();
        MainController controller = new MainController(account, books, view);
        controller.run();
    }
}
