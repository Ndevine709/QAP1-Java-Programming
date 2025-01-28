// QAP1 - Advanced programming (Java)
// Author - Noah Devine
// Due Date - January 30th

public class TestTime {
    public static void main(String[] args) {
        // Creating t1 and t2
        Time t1 = new Time(5, 24, 38);
        Time t2 = new Time(2, 12, 23);

        // Setting the hour, minute, and seconds for both objects according to the QAP guidelines using various set methods
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // Displaying the set times of t1 and t2 before the nextSecond() and previousSecond() methods are used
        System.out.println("t1 time before: " + t1.toString() + " " + "t2 time before: " + t2.toString());

        // Adding one second to t1, taking away one second from t2
        t1.nextSecond();
        t2.previousSecond();
        
        // Displaying the set times of t1 and t2 after the nextSecond() and previousSecond() methods are used
        System.out.println("t1 time after: " + t1.toString() + " " + "t2 time after: " + t2.toString());
    }
}
