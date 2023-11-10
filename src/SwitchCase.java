public class SwitchCase {
    public static void main(String[] args) {
//        int month = 13;
//                switch(month) {
//            case 1:
//             System.out.println("january");
//                    break;
//                    case 2:
//                        System.out.println("february");
//                        break;
//                    case 3:
//                        System.out.println("march");
//                        break;
//                    case 4:
//                        System.out.println("april");
//                        break;
//                    case 5:
//                        System.out.println("may");
//                        break;
//                    case 6:
//                        System.out.println("june");
//                        break;
//                    case 7:
//                        System.out.println("july");
//                        break;
//                    case 8:
//                        System.out.println("august");
//                        break;
//                    case 9:
//                        System.out.println("september");
//                        break;
//                    case 10:
//                        System.out.println("octomber");
//                        break;
//                    case 11:
//                        System.out.println("november");
//                        break;
//                    case 12:
//                        System.out.println("desember");
//                        break;
//                    default:
//                            System.out.println("Unknown month");
//                }

    String month = "april";
switch (month){
    case "december", "january", "february":
    System.out.println("Winter");
    break;
    case "march", "april", "may":
        System.out.println("Spring");
        break;
    case "june", "july", "august":
        System.out.println("Summer");
        break;
    case "september", "octomber", "november":
        System.out.println("Autumn");
        break;
}
    }
}
