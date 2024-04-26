import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальное значение для результата: ");
        double currentRes = 0;

        if (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            currentRes = value;
            scanner.nextLine();
        } else {
            System.out.println("Ошибка: введено некорректное число.");
            return;
        }


        while (true) {
            System.out.println("Текущий результат = " + currentRes);
            System.out.println("Введите операцию: +, -, *, / или C для выхода: ");
            String operation = scanner.nextLine();

            if (operation.equals("C")) {
                System.out.println("Работа с калькулятором завершена.");
                break;
            }

            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Некорректная операция. Попробуйте снова.");
                continue;
            }

            System.out.println("Введите число:");
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();

                switch (operation) {
                    case "+":
                        currentRes += number;
                        break;
                    case "-":
                        currentRes -= number;
                        break;
                    case "*":
                        currentRes *= number;
                        break;
                    case "/":
                        if (number == 0) {
                            System.out.println("Нельзя делить на ноль.");
                        } else {
                            currentRes /= number;
                        }
                        break;
                    default:
                        System.out.println("Некорректная операция");
                }
            } else {
                System.out.println("Ошибка: введено некорректное число.");
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();
        }
    }
}
