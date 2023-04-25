package bai8;


public class Main {
	
	public static void main(String[] args) {
		StudentBST a = new StudentBST();
		a.display();
		
		a.findStudentById("101");
		a.findStudentByPhone("417 479 2858");
	}
}
