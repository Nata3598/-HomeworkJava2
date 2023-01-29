import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    // 2. Напишите метод, который составит строку,
    // состоящую из 100 повторений слова TEST и метод,
    // который запишет эту строку в простой текстовый файл,
    // обработайте исключения.
    public static void main(String[] args) {
        writer();
    }

    public static StringBuilder generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public static void writer() {
        try {
            FileOutputStream fileOut = new FileOutputStream("test.txt");
            fileOut.write(generateString().toString().getBytes());
            fileOut.close();
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
    }

}