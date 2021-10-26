package optionalTask1;

//4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

public class OT14 {

    public static void main(String[] args) {
        int[] newArr = new int[args.length];
        for (int n = 0; n < args.length; n++) {
            newArr[n] = Integer.parseInt(args[n]);
        }
        System.out.println(countUnique(newArr));
    }

    public static int countUnique(int[] newArr) {
        int count = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (newArr[i] == newArr[j]) {
                    count++;
                }
            }
            if (count == 1)
                return newArr[i];
            count = 0;
        }
        return 0;
    }
}






