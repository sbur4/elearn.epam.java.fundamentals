package optionalTask1;

import java.util.Arrays;

//5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом
// четных и нечетных цифр.

public class OT15 {

    public static void main(String[] args) {
        String[] intArr = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            intArr[i] = Integer.toString(Integer.parseInt(args[i]));
        }
        System.out.println(Arrays.toString(intArr));
        showNums(intArr);
    }

    public static void showNums(String[] intArr) {
        int[] newArr = strToInt(intArr);
        for (Integer dig : newArr) {
            if (dig % 2 == 0) {
                System.out.println("even: " + dig);
            } else {
                if (evenOddCheck(newArr) && String.valueOf(dig).length() != 1) {//?
                    System.out.println("even + odd = digit : " + dig);
                }
            }
        }
    }

    private static int[] strToInt(String[] intArr) {
        int[] newArr = new int[intArr.length];
        for (int n = 0; n < intArr.length; n++) {
            newArr[n] = Integer.parseInt(intArr[n]);
        }
//        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    private static boolean evenOddCheck(int[] newArr) {
        int even = 0;
        int odd = 0;
        for (int d : newArr) {
            char[] ch = Integer.toString(d).toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] % 2 == 0 && ch[i] != 0) {
                    return true;
//                    System.out.println("even digit: " + ch[i]);
                } else {
//                    if (ch[i] % 2 != 0 && ch[i] != 0) {
                        for (int j = 0; j < ch[i]; j++) {
                            if (ch[j] % 2 == 0) {
                                even++;
                            } else {
                                odd++;
                            }
                        }
                        if (even == odd) {
//                            System.out.println("even+odd digit: " + ch[i]);
                            return true;
                        }
//                    }
                }
            }
        }
        return false;
    }
}



