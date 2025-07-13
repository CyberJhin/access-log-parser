import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int correctFileCount = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите путь к файлу:");

            String path = sc.nextLine().trim();

            if (path.isEmpty()) {
                System.out.println("Ошибка: путь не может быть пустым.");
                continue;
            }

            File file = new File(path);

            boolean fileExists = file.exists();

            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                if (!fileExists) {
                    System.out.println("Ошибка: файл не существует.");
                } else {
                    System.out.println("Ошибка: указанный путь ведет к папке, а не к файлу.");
                }
                continue;
            }

            correctFileCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + correctFileCount);
        }
    }
}