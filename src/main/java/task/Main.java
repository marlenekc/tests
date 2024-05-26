package task;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("София", "Антоненко");
        tester1.introduce();

        Tester tester2 = new Tester("София", "Антоненко", 3);
        tester2.introduce("Добрый день");

        Tester tester3 = new Tester("София", "Антоненко", 1, "B1", 1000.50);
        tester3.introduce("Приветствую ", " год");

        Tester.printInfo("Важная информация");
    }
}
