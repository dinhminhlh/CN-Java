package Bai7;


public class Main {
	public static void main(String[] args) {
		StudentSorting SinhVienImpl = new StudentSorting();
		SinhVienImpl.loadData();
		
		System.out.println("===========================Default list===========================");
		SinhVienImpl.displayStudents();
		System.out.println("\n===========================Sort by name===========================");
		SinhVienImpl.sortSinhVienByName();
		SinhVienImpl.displayStudents();
		System.out.println("\n===========================Sort by age===========================");
		SinhVienImpl.sortSinhVienByAge();
		SinhVienImpl.displayStudents();
		System.out.println("\n===========================Sort by hometown===========================");
		SinhVienImpl.sortSinhVienByHometown();
		SinhVienImpl.displayStudents();
		System.out.println("\n===========================TopM by score===========================");
		SinhVienImpl.topMByScore();
	}
}
