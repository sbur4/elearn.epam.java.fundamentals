package mainTask;

//1. Приветствовать любого пользователя при вводе его имени через командную строку.

public class MT1 {
    public static void main(String[] args) {
        String inputUserName = args[0];
        System.out.println("Hello " + inputUserName);
    }

//        System.out.println("Please type your name");
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String inputUserName = in.nextLine();
//            System.out.println("Hello " + inputUserName);
//        }
//        in.close();
}

