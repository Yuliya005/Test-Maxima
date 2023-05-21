import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите размер массива");
        int size = sc.nextInt();// Читаем с клавиатуры размер массива и записываем в size
        int[] array = new int[size];// Создаём массив int размером в size
        System.out.println("Полученные элементы массива" + " ");
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt();// Заполняем массив элементами, введёнными с клавиатуры
        }

            int i;
            for (i = 0; i < size; i++) {
                System.out.print(" " + array[i]); // Выводим на экран, полученный массив
            }



        }

        }











