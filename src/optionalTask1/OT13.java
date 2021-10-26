package optionalTask1;

import java.util.Arrays;

//3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

public class OT13 {

    private static int avg = 0;

    public static void main(String[] args) {
        int[] intArr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intArr[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(intArr));
        avarageOfNums(intArr);
        lessThanAvg(intArr, avg);
        System.out.println();
        moreThanAvg(intArr, avg);
    }

    private static int avarageOfNums(int[] intArr) {
        int intLen = 0;
        int sumIntLen = 0;
        for (int i : intArr) {
            intLen = String.valueOf(i).length();
            sumIntLen += intLen;
        }
        avg = sumIntLen / intArr.length;
        return avg;
    }

    private static void lessThanAvg(int[] intArr, int avg) {
        for (int i : intArr) {
            if (avg > String.valueOf(i).length()) {
                System.out.println(i + " = " + String.valueOf(i).length());
            }
        }
    }

    private static void moreThanAvg(int[] intArr, int avg) {
        for (int i : intArr) {
            if (avg < String.valueOf(i).length()) {
                System.out.println(i + " = " + String.valueOf(i).length());
            }
        }
    }
}