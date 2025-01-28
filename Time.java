// QAP1 - Advanced programming (Java)
// Author - Noah Devine
// Due Date - January 30th

public class Time {
    // Attributes
    private int hour;
    private int minute;
    private int second;
    // Constructors
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // Methods
    // Method to get the hour
    public int getHour() {
        return this.hour;
    }
    // Method to get the minute
    public int getMinute() {
        return this.minute;
    }
    // Method to get the seconds
    public int getSecond() {
        return this.second;
    }
    // Method to set the hour
    public void setHour(int hour) {
        this.hour = hour;
    }
    // Method to set the minutes
    public void setMinute(int minute) {
        this.minute = minute;
    }
    // Method to set the seconds
    public void setSecond(int second) {
        this.second = second;
    }
    // Method to set the time (hour, minute, seconds)
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // toString method for formatting
    public String toString() {
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    // Method to advance the seconds by 1
    public Time nextSecond() {
        second ++;
        if (second == 59) {
            second = 0;
            minute ++;

            if (minute == 59) {
                minute = 0;
                hour ++;
                if (hour == 23) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    // method to go back one second
    public Time previousSecond () {
        second --;
        if(second == 0) {
            second = 59;
            minute --;
            if (minute == 0) {
                minute = 59;
                hour --;
                if(hour == 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

}
