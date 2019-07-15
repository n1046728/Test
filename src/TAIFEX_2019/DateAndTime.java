package TAIFEX_2019;

public class DateAndTime {
	private int [] monthDays={0,31,28,31,30,31,30,31,31,30,31,30,31};
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	public DateAndTime(){
	}
	
	
	public DateAndTime(int year, int month, int day, int hour, int minute, int second) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	

	public static void main(String[] args) {
		

	}
}
