import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class work2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите вес (кг): ");
            double weight = Double.parseDouble(br.readLine());
            System.out.print("Введите рост (м): ");
            double height = Double.parseDouble(br.readLine());

            Body.massIndex(weight, height);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка чтения ввода. Пожалуйста, введите числовые значения.");
        }
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double massIndex = weight / (height * height);
            if (massIndex < 18.5) {
                System.out.println("Дефицит массы тела");
            } else if (massIndex <= 24.9) {
                System.out.println("Норма");
            } else if (massIndex <= 29.9) {
                System.out.println("Избыток веса");
            } else {
                System.out.println("Ожирение");
            }
        }
    }
}
