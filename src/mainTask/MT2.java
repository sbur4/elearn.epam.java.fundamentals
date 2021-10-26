package mainTask;

//2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class MT2 {
    public static void main(String[] args) {
        String inputString = args[0];
        char[] ch = inputString.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println("\n");
    }
}

//    String inputString;
//        System.out.println("Please type anything");
//                Scanner sc = new Scanner(System.in);
//                while (sc.hasNext()) {
//                inputString = sc.nextLine();
//                char[] ch = inputString.toCharArray();
//                for (int i = ch.length - 1; i >= 0; i--) {
//                System.out.print(ch[i]);
//                }
//                }
//        sc.close();