import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Array20. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти
        //сумму элементов массива с номерами от K до L включительно.

        /*Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива N: ");
        int size = in.nextInt();
        int[] arr = new int [size];

        System.out.println("Введите сам массив: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Введите целое число K: ");
        int k = in.nextInt();

        System.out.print("Введите целое число L: ");
        int l = in.nextInt();

        int sum = 0;

        for (int i = k; i <=l; i++) {
            sum += arr[k-1];
            k++;
        }

        System.out.println("Сумма элементов массива от K до L: " + sum);*/


        //Array21. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N).
        //Найти среднее арифметическое элементов массива с номерами от K до L
        //включительно.

        /*Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива N: ");
        int size = in.nextInt();
        int[] arr = new int [size];

        System.out.println("Введите сам массив: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Введите целое число K (от 1 до L): ");
        int k = in.nextInt();

        System.out.print("Введите целое число L (от K до N): ");
        int l = in.nextInt();

        int sum = 0;
        int delitel = l-k;

        for (int i = k; i <=l; i++) {
            sum += arr[k-1];
            k++;
        }

        System.out.println("Среднее арифметическое: " + (sum/(delitel+1.0)));*/


        //Array22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
        //сумму всех элементов массива, кроме элементов с номерами от K до L
        //включительно.

        /*Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива N: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите сам массив: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Введите целое число K (от 1 до L): ");
        int k = in.nextInt();

        System.out.print("Введите целое число L (от K до N): ");
        int l = in.nextInt();

        int sum = 0;
        int sum2 = 0;

        for (int i = k; i <= l; i++) {
            sum += arr[k - 1];
            k++;
        }

        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
            System.out.println(sum2);
        }

        System.out.println("Сумма всех элементов массива, кроме элементов с номерами от K до L включительно: " + (sum2 - sum));*/


        //Array23. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N).
        //Найти среднее арифметическое всех элементов массива, кроме элементов
        //с номерами от K до L включительно.

        /*Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива N: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите сам массив: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Введите целое число K (от 1 до L): ");
        int k = in.nextInt();

        System.out.print("Введите целое число L (от K до N): ");
        int l = in.nextInt();

        int sum = 0;
        int sum2 = 0;
        int delitel = size-(l-k);

        for (int i = k; i <= l; i++) {
            sum += arr[k - 1];
            k++;
        }

        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }

        System.out.println("Среднее арифметическое: " + ((sum2 - sum)/(delitel-1.0)));*/


    }
}