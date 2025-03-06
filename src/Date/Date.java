package Date;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day,int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		String chaineFinale = "";
		if (day < 10) {
			chaineFinale += "0";
		}
		chaineFinale += day;
		chaineFinale += '/';
		if (month < 10) {
			chaineFinale += '0';
		}
		chaineFinale += month;
		chaineFinale += '/';
		chaineFinale += year;
		return chaineFinale;
	}
}
