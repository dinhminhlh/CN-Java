package me.loda.spring;


public class Todo {
	
    private String title;
    private String detail;
    
	public Todo() {
		super();
	}
	
	public Todo(String title, String detail) {
		super();
		this.title = title;
		this.detail = detail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
    
    
}
