package Bai910;

public class Subject {
	private Integer credits;
	private String subjectName;
	private Double mark;
	
	
	public Subject(){	
	}
	
	public Subject(String markLine) {
		mark = Double.parseDouble(markLine.trim());
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public double toGPA() {
		return getMark() * getCredits();
	}
	
	public String[] getSubjectNameAndCredits(String fileName) {
		fileName = fileName.substring(0, fileName.length()-4); //bo di 4 ki tu '.csv'
		String[] str = fileName.split("-"); // tach ten mon hoc va so tin chi
		setSubjectName(str[0]);
		setCredits(Integer.parseInt(str[1]));
		return str;
	}

	@Override
	public String toString() {
		return "Subject [credits=" + credits + ", subjectName=" + subjectName + ", mark=" + mark + "]";
	}
	
	public void display() {
		System.out.printf("%-10s",mark);
	}
	
	
}
