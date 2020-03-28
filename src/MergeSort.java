import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{3,2,10,5})));
    }

    public static int[] sortArray(int[] arrayA) { // сортировка Массива который передается в функцию
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

    private static int[] mergeArray(int[] arrayB, int[] arrayC) {
        int positionB = 0;
        int positionC = 0;
        int[] result = new int[arrayB.length + arrayC.length];
        for (int i = 0; i < arrayB.length + arrayC.length; i++) {

            if(positionB == arrayB.length){
                result[i] = arrayC[positionC];
                positionC++;
            } else if(positionC == arrayC.length){
                result[i] = arrayB[positionB];
                positionB++;
            }else if (arrayB[positionB] < arrayC[positionC]){
                result[i] = arrayB[positionB];
                positionB++;
            }
            else if(arrayC[positionC] < arrayB[positionB]){
                result[i] = arrayC[positionC];
                positionC++;
            }else if(arrayB[positionB] == arrayC[positionC]){
                result[i] = arrayC[positionC];
                positionC++;
            }
        }
        return result;
    }
}


