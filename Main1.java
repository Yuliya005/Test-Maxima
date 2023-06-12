import java.util.Scanner;

class Main1 {
        public static void main(String[] args) {
                String bob = "Bob";
                Scanner scan = new Scanner(System.in);
                System.out.print("Введите ваше имя ");
                String name = scan.nextLine();
                System.out.print("Введите ваш возраст");
                short age = scan.nextShort();
                System.out.print("Введите желаемую сумму кредита");
                int sum = scan.nextInt();

                if (!name.equals("bob") && (age >= 18) && (sum <= (age * 100))) {
                        System.out.println("Кредит одобрен");
                } else {
                        System.out.println("Отказано");
                }
        }
}