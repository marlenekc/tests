package task;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "B1");
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void introduce() {
        System.out.println("Зовут " + name + " " + surname + ".");
    }

    public void introduce(String hello) {
        System.out.println(hello + " " + name + " ваш уровень английского: " + englishLevel);
    }

    public void introduce(String hello, String years) {
        System.out.println(hello + "меня зовут " + name + " " + surname + " мой опыт работы: " + experienceInYears + years);
    }
    public static void printInfo(String info) {
        System.out.println(info);
    }
}
