package Bai1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("admin", "admin");
        ArrayList<Student> students = new ArrayList<>();
        MainView view = new MainView();
        MainController controller = new MainController(account, students, view);
        controller.run();
    }
}
