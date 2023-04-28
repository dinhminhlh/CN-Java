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
        System.out.println("----------- Quan Ly  -----------");
        System.out.println("1. Nhap moi sach");
        System.out.println("2. Xem thong tin sach");
        System.out.println("3. Tim sach theo nam xuat ban");
        System.out.println("4. Xem so luong sach");
        System.out.println("5. Ket Thuc");
        System.out.println("-------------------------------------");
        System.out.println("Chon cac so tuong ung tren menu de thuc hien: ");
        System.out.println("<copyright: LeDinhMinh-211204113-CNTT3K62>");
        return scanner.nextInt();
    }

    public void showInputBookInfoMessage() {
        System.out.println("Nhap thong tin sach:");
    }

    public int getStudentId() {
        System.out.print("ID: ");
        return scanner.nextInt();
    }

    public String getBookType() {
        System.out.print("Loai sach: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String getBookName() {
        System.out.print("Ten sach: ");
        return scanner.nextLine();
    }

    public String getAuthorName() {
        System.out.print("Ten tac gia: ");
        return scanner.nextLine();
    }

    public int getPublicYear() {
        System.out.print("Nam xuat ban: ");
        return scanner.nextInt();
    }

    public int getPageNumber() {
        System.out.print("So trang: ");
        return scanner.nextInt();
    }

    public void showStudentInfo(Book student) {
        System.out.printf("ID: %d\nLoai sach: %s\nTen sach: %s\nTac gia: %s\nNam xuat ban: %d\nSo trang: %d\n",
                student.getId(), student.getBookType(), student.getBookName(), student.getAuthorName(),
                student.getPublicYear(), student.getPageNumber());
    }

    public int getSearchBookYear() {
        System.out.print("Nhap sach can tim: ");
        return scanner.nextInt();
    }

    public void showStudentNotFoundMessage(int studentId) {
        System.out.printf("Khong tim thay sach co nam xuat ban la %d\n", studentId);
    }

    public void showGoodbyeMessage() {
        System.out.println("Cam on ban da su dung chuong trinh <3");
    }
    
//    public void getQuantity() {
//    	System.out.println(getQuantity);
//    }
}
