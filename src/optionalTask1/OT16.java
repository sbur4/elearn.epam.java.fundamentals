package optionalTask1;

import java.util.Arrays;

//6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

public class OT16 {

    public static void main(String[] args) {
        String[] intArr = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            intArr[i] = Integer.toString(Integer.parseInt(args[i]));
        }
        System.out.println(Arrays.toString(intArr));
        findDigit(intArr);
    }

    private static void findDigit(String[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            String str = String.valueOf(intArr[i]);
            char[] arraySplit = str.toCharArray();
            int j=0;
            while (j < arraySplit.length-1) {
                if (arraySplit[j] >= arraySplit[j + 1]) {
                    break;
                }
                else if (j == arraySplit.length-2){
                    System.out.println(Arrays.toString(arraySplit));
                    return;
                }
                else {
                    j++;
                    continue;
                }
            }
        }
    }
}



