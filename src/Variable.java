public class Variable {
    public static void main(String[] args) {
        int days = 10000;
        int year = days/365;
        int modyear = days%365;
        int month = modyear/30;
        int modmonth = modyear%30;
        System.out.println(year);
        System.out.println(month);
        System.out.println(modmonth);
    }
}
