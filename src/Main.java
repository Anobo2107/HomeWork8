import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Task1/1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println("weight:");
        for (int num : weight) {
            System.out.println(num + " ");
        }
        System.out.println();
        //Task1/2
        double[] array = {1.57, 7.654, 9.986};
        System.out.println("Массив с дробными числами:");
        for (double num1 : array) {
            System.out.println(num1 + " ");
        }
        System.out.println();
        //Task1/3
        int[] array2 = {5, 8, 20, 56, 1, 4, 90, 56, 43};
        System.out.println(Arrays.toString(array2));
        System.out.println();
        //Task2
        int[] array3 = {5, 8, 9, 4};
        for (int index = 0; index < array3.length; index++) {
            if (index == array3.length - 1) {
                System.out.print(array3[index]);
                break;
            }
            System.out.print(array3[index] + " ,");
        }
        System.out.println();
        double[] array4 = {1.57, 7.654, 9.986};
        for (int index1 = 0; index1 < array4.length; index1++) {
            if (index1 == array4.length - 1) {
                System.out.print(array4[index1]);
            } else {
                System.out.print(array4[index1] + " ,");
            }
        }
        System.out.println();
        int[] weightBack = {1, 2, 3};
        double[] arrayBack = {1.57, 7.654, 9.986};
        for (int index = weightBack.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(weightBack[index]);
            } else {
                System.out.print(weightBack[index] + ", ");
            }
        }
        System.out.println();
        for (int index = arrayBack.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arrayBack[index]);
            } else {
                System.out.print(arrayBack[index] + ", ");
            }
        }
        System.out.println();
        int[] arrayMyBack = {5, 8, 20, 56, 1, 4, 90, 56, 43};
        for (int index = arrayMyBack.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arrayMyBack[index]);
            } else {
                System.out.print(arrayMyBack[index] + ", ");
            }
        }
        System.out.println();
        int[] array6 = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array6[i] % 2 != 0) {
                i = i + 1;
                i++;
                System.out.println(i);
            }
        }
        //Task3
        int[] intArray = {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};

        for (int j = intArray.length - 1; j >= 0; j--) {
            if (j != intArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(intArray[j]);
        }
        System.out.println();
        for (int g = doubleArray.length - 1; g >= 0; g--) {
            if (g != doubleArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(doubleArray[g]);
        }
        //task4
        {
            int[] intArray1 = {1, 2, 3};

            for (int k = 0; k < intArray1.length; k++) {
                if (intArray1[k] % 2 != 0) {
                    intArray1[k] += 1;
                }
            }
            for (int l = 0; l < intArray.length; l++) {
                if (l != 0) {
                    System.out.print(", ");
                }
                System.out.print(intArray[l]);
            }
        }
    }
}











