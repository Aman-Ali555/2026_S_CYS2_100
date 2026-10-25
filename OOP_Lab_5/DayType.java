import java.util.Scanner;
//TASK_1
public class DayType {
    private static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };
    private int dayIndex;
    public DayType() {
        this("Sunday");
    }
    public DayType(String day) {
        setDay(day);
    }
    public void setDay(String day) {
        for (int i = 0; i < DAYS.length; i++) {
            if (DAYS[i].equalsIgnoreCase(day)) {
                dayIndex = i;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid day: " + day);
    }
    public void printDay() {
        System.out.println(getDay());
    }
    public String getDay() {
        return DAYS[dayIndex];
    }
    public String getNextDay() {
        return DAYS[(dayIndex + 1) % DAYS.length];
    }
    public String getPreviousDay() {
        return DAYS[(dayIndex + DAYS.length - 1) % DAYS.length];
    }
    public String getDayAfter(int numberOfDays) {
        int normalizedDays = Math.floorMod(numberOfDays, DAYS.length);
        return DAYS[(dayIndex + normalizedDays) % DAYS.length];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current day: ");
        String day = input.nextLine().trim();
        try {
            DayType today = new DayType(day);
            System.out.print("Enter number of days to add: ");
            int numberOfDays = input.nextInt();
            System.out.println("Current day: " + today.getDay());
            System.out.print("Printed day: ");
            today.printDay();
            System.out.println("Next day: " + today.getNextDay());
            System.out.println("Previous day: " + today.getPreviousDay());
            System.out.println("Day after adding " + numberOfDays + " days: "
                    + today.getDayAfter(numberOfDays));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        input.close();
    }
}
