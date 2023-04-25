package Bai1;
import java.util.Scanner;

public class MainView {
    private Scanner scanner;

    public MainView() {
        this.scanner = new Scanner(System.in);
    }

    public String getUsername() {
        System.out.print("Username: ");
        return scanner.nextLine();
    }

    public String getPassword() {
        System.out.print("Password: ");
        return scanner.nextLine();
    }

    public void showLoginFailedMessage() {
        System.out.println("Sai thong tin dang nhap, vui long thu lai !");
    }

    public void showMaxLoginAttemptsMessage() {
        System.out.println("Ban da dang nhap qua 3 lan, dang thoat chuong trinh !!!");
    }

    public int showMainMenu() {
        System.out.println("----------- Quan Ly Diem -----------");
        System.out.println("1. Nhap Thong Tin");
        System.out.println("2. Xem Thong Tin");
        System.out.println("3. Tim theo Ma");
        System.out.println("4. Tinh Diem Trung Binh");
        System.out.println("5. Ket Thuc");
        System.out.println("<copyright: LeDinhMinh-211204113-CNTT3K62>");
        System.out.println("-------------------------------------");
        System.out.println("Chon cac so tuong ung tren menu de thuc hien: ");
        return scanner.nextInt();
    }

    public void showInputStudentInfoMessage() {
        System.out.println("Nhap thong tin hoc sinh:");
    }

    public int getStudentId() {
        System.out.print("ID: ");
        return scanner.nextInt();
    }

    public String getStudentName() {
        System.out.print("Ten: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public float getStudentMathScore() {
        System.out.print("Diem Toan: ");
        return scanner.nextFloat();
    }

    public float getStudentPhysicsScore() {
        System.out.print("Diem Ly: ");
        return scanner.nextFloat();
    }

    public float getStudentEnglishScore() {
        System.out.print("Diem Anh: ");
        return scanner.nextFloat();
    }

    public void showStudentInfo(Student student) {
        System.out.printf("ID: %d\nTen: %s\nDiem Toan: %.2f\nDiem Ly: %.2f\nDiem Anh: %.2f\n",
                student.getId(), student.getName(), student.getMath(), student.getPhysics(), student.getEnglish());
    }

    public int getSearchStudentId() {
        System.out.print("Nhap ID hoc sinh can tim: ");
        return scanner.nextInt();
    }

    public void showStudentNotFoundMessage(int studentId) {
        System.out.printf("Khong tim thay hoc sinh co ID la %d\n", studentId);
    }

    public void showAverageScore(float averageScore) {
        System.out.printf("Diem trung binh cua lop la: %.2f\n", averageScore);
    }

    public void showGoodbyeMessage() {
        System.out.println("Cam on ban da su dung chuong trinh <3");
    }


}
