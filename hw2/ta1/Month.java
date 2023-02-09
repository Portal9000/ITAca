package by.hw2.ta1;
public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    private int number;
    Month(int number) {
        this.number = number;
    }
    public static String getNameByNumber(int number) {
        for (Month month : Month.values()) {
            if (month.number == number) {
                return month.name();
            }
        }
        return "Нет месяца с таким номером.";
    }
    public static Integer getNumber(String name) {
        for (Month month : Month.values()) {
            if (month.name().equals(name)) {
                return month.number;
            }
        }
        return null;
    }
}
