package mainTask;

//5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

public class MT5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num != 0 && num <= 12) {
            switch (num) {
                case (1):
                    System.out.println("January");
                    break;
                case (2):
                    System.out.println("February");
                    break;
                case (3):
                    System.out.println("March");
                    break;
                case (4):
                    System.out.println("April");
                    break;
                case (5):
                    System.out.println("May");
                    break;
                case (6):
                    System.out.println("June");
                    break;
                case (7):
                    System.out.println("July");
                    break;
                case (8):
                    System.out.println("August");
                    break;
                case (9):
                    System.out.println("September");
                    break;
                case (10):
                    System.out.println("October");
                    break;
                case (11):
                    System.out.println("November");
                    break;
                case (12):
                    System.out.println("December");
                    break;
            }
        }
    }
}

//    int num = 0;
//        System.out.println("Please type numeric from 1 to 12");
//                Scanner sc = new Scanner(System.in);
//                while (sc.hasNextInt()) {
//                num = sc.nextInt();
//                if (num != 0 && num <= 12) {
//                switch (num) {
//                case (1):
//                System.out.println("January");
//                break;
//                case (2):
//                System.out.println("February");
//                break;
//                case (3):
//                System.out.println("March");
//                break;
//                case (4):
//                System.out.println("April");
//                break;
//                case (5):
//                System.out.println("May");
//                break;
//                case (6):
//                System.out.println("June");
//                break;
//                case (7):
//                System.out.println("July");
//                break;
//                case (8):
//                System.out.println("August");
//                break;
//                case (9):
//                System.out.println("September");
//                break;
//                case (10):
//                System.out.println("October");
//                break;
//                case (11):
//                System.out.println("November");
//                break;
//                case (12):
//                System.out.println("December");
//                break;
//                }
//                }
//                }
//        sc.close();