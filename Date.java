// QAP1 - Advanced programming (Java)
// Author - Noah Devine
// Due Date - January 30th

public class Date {
    // Attributes
    private int day;
    private int month;
    private int year;
    // Constructors
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // Methods
    // Get the day
    public int getDay() {
        return this.day;
    }
    // Get the month
    public int getMonth() {
        return this.month;
    }
    // Get the year
    public int getYear() {
        return this.year;
    }
    // Set the day
    public void setDay(int day) {
        this.day = day;
    }
    // Set the month
    public void setMonth(int month) {
        this.month = month;
    }
    // Set the year
    public void setYear(int year) {
        this.year = year;
    }
    // Set the day, month and year
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // Return the date in the format dd/mm/yyyy
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }
}
