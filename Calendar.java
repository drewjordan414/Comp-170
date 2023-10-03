public class Calendar {
    public static void main(String[] args) {
        //array containing the months of the year
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int startDay = 1;
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i]);
            System.out.println("------------------------------");
            startDay = printCalendarMonth(daysInMonth[i], startDay);
            System.out.println();
        }
    }

    public static void printHeader() {
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : daysOfWeek) {
            System.out.print(day + "  ");
        }
        System.out.println();
    }

    public static void printBlankDays(int numBlankDays) {
        for (int i = 0; i < numBlankDays; i++) {
            System.out.print("    ");  
        }
    }

    public static int printCalendarMonth(int monthLength, int startDay) {
        printHeader();
        printBlankDays(startDay - 1);
        int currentDayOfWeek = startDay;
        for (int day = 1; day <= monthLength; day++) {
            System.out.printf("%2d  ", day);
            currentDayOfWeek = (currentDayOfWeek % 7) + 1;
            System.out.print((currentDayOfWeek == 1 ? "\n" : ""));
        }
        return (startDay + monthLength - 1) % 7 + 1;
    }
}
