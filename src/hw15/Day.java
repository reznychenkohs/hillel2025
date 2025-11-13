package hw15;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

class Week implements WeekDay {

    private Day day;

    public Week(Day day) {
        this.day = day;
    }

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, THURSDAY, WEDNESDAY, TUESDAY:
                System.out.println("Порада для продуктивного дня: почніть день з написання плану");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Рекомендація: відвідати парк розваг");
                break;
        }
    }
    public void showAdvice() {
        advise(day);
    }

    public static void main(String[] args) {
        Week monday = new Week(Day.MONDAY);
        monday.showAdvice();

        Week friday = new Week(Day.FRIDAY);
        friday.showAdvice();

        Week sunday = new Week(Day.SUNDAY);
        sunday.showAdvice();
    }
}
