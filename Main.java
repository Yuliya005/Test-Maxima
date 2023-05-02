import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                String bob = "Bob";
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите ваше имя ");
                String name = sc.nextLine();
                System.out.print("Введите ваш возраст");
                short age = sc.nextShort();
                System.out.print("Введите желаемую сумму кредита");
                int sum = sc.nextInt();

                if (!name.equalsIgnoreCase(bob) && (age >= 18) && (sum <= (age * 100))) {
                    System.out.println("Кредит одобрен");

                }
            }
        }