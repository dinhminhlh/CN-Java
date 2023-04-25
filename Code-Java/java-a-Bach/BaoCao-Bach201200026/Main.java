package report.studenthasing.controller;

public class Main {
	public static void main(String[] args) {
		CreditRegister cr = new CreditRegister();
		cr.loadData();
		cr.displayStudent();
		cr.displayTranscript();
	}
}
