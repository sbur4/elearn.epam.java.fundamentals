package mainTask;

//4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.Arrays;

public class MT4 {
    public static void main(String[] args) {
        int[] numsArr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numsArr[i] = Integer.parseInt(args[i]);
        }
//        System.out.println(Arrays.toString(numsArr));
        System.out.println(numsSum(numsArr));
        System.out.println(numsMulti(numsArr));
    }

    private static int numsSum(int[] numsArr) {
        int result = 0;
        for (int i : numsArr) {
            result += i;
        }
        return result;
    }

    private static int numsMulti(int[] numsArr) {
        int result2 = 1;
        for (int i : numsArr) {
            result2 *= i;
        }
        return result2;
    }
}
