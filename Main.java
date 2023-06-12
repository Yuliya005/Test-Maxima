import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Полученные элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Минимальное число " + min);
    }
}
