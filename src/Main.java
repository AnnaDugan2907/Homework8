import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        int[] number = new int[]{1, 2, 3};
        float[] fractional = {1.57F, 6.654F, 9.868F};
        int[] three = new int[]{3, 6, 9, 12, 15, 18, 21};

        //Задача 2
        for (int i = 0; i < number.length; i++) {

            if (i > 0) {
                System.out.print(", ");
            }

            System.out.print(number[i]);
        }

        System.out.println();

        for (int i = 0; i < fractional.length; i++) {

            if (i > 0) {
                System.out.print(", ");
            }

            System.out.print(fractional[i]);
        }

        System.out.println();

        for (int i = 0; i < three.length; i++) {

            if (i > 0) {
                System.out.print(", ");
            }

            System.out.print(three[i]);
        }

        System.out.println();

        //Задача 3
        for (int i = number.length - 1; i >= 0; i--) {

            System.out.print(number[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = fractional.length - 1; i >= 0; i--) {

            System.out.print(fractional[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = three.length - 1; i >= 0; i--) {

            System.out.print(three[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //Задача 3 number[i]
        for (int i = 0; i < number.length; i++) {

            if (number[i] % 2 != 0){

                number[i] += 1;
            }

        }
        System.out.print(Arrays.toString(number));
    }
}