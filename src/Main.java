//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("________");

        System.out.println("Задача 2");
        System.out.println("Ф. И. О. сотрудника — " + fullName.toUpperCase());
        System.out.println("________");

        System.out.println("Задача 3");
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;
        String fullName2 = fullName.replace("ё","е");
        System.out.println("Ф. И. О. сотрудника — " + fullName2);
        System.out.println("________");
    }
}