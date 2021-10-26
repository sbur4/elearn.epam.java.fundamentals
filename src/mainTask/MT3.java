package mainTask;

//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class MT3 {
    public static void main(String[] args) {
        int randomNumber;
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        for (int i = start; i < end; i++) {
            randomNumber = (int) (start + (Math.random() * end));
            if (randomNumber % 2 == 0) {
                System.out.println(randomNumber + " ");
            } else {
                System.out.print(randomNumber + " ");
            }
        }
        System.out.println("\n");
    }
}

//    int start, end, randomNumber;
//        System.out.println("Please type two integers");
//                Scanner sc = new Scanner(System.in);
//                while (sc.hasNextInt()) {
//                start = sc.nextInt();
//                end = sc.nextInt();
//                for (int i = start; i < end; i++) {
//        randomNumber = (int) (start + (Math.random() * end));
//        if (randomNumber % 2 == 0) {
//        System.out.println(randomNumber + " ");
//        } else {
//        System.out.print(randomNumber + " ");
//        }
//        }
//        }
//        sc.close();
