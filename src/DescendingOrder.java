import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(12004488));

    }

    public static int sortDesc(final int num) {
        int countElements = (int) Math.log10(num) + 1;
        if (num > 0) {
            int number = num;
            int[] array = new int[countElements];
            int counter = 0;
            while (number != 0) {
                array[counter] += number % 10;
                number /= 10;
                counter++;
            }
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            StringBuilder resultString = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                resultString.append(array[i]);
            }

            return Integer.parseInt(resultString.toString());
        }
        else
            return 0;
    }

}
