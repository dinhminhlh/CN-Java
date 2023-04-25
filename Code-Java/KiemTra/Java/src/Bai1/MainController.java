package Bai1;
import java.util.ArrayList;

public class MainController {
    private Account account;
    private ArrayList<Student> students;
    private MainView view;

    public MainController(Account account, ArrayList<Student> students, MainView view) {
        this.account = account;
        this.students = students;
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
                    inputStudentInfo();
                    break;
                case 2:
                    viewStudentInfo();
                    break;
                case 3:
                    searchStudentById();
                    break;
                case 4:
                    calculateAverageScore();
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

    private void inputStudentInfo() {
        view.showInputStudentInfoMessage();
        int id = view.getStudentId();
        String name = view.getStudentName();
        float math = view.getStudentMathScore();
        float physics = view.getStudentPhysicsScore();
        float english = view.getStudentEnglishScore();
        Student student = new Student(id, name, math, physics, english);
        students.add(student);
    }

    private void viewStudentInfo() {
        for (Student student : students) {
            view.showStudentInfo(student);
        }
    }

    private void searchStudentById() {
        int searchId = view.getSearchStudentId();
        for (Student student : students) {
            if (student.getId() == searchId) {
                view.showStudentInfo(student);
                return;
            }
        }
        view.showStudentNotFoundMessage(searchId);
    }

    private void calculateAverageScore() {
        float totalScore = 0;
        for (Student student : students) {
            totalScore += student.getAverage();
        }
        float averageScore = totalScore / students.size();
        view.showAverageScore(averageScore);
    }
}
