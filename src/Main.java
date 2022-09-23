public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task5();
        task6();
        task7();

    }

    private static void task5() {
        String fullName = " Ivanov Ivan Ivanovich";
        fullName = fullName.trim();
        String middleName = String.valueOf(fullName.lastIndexOf(" "));
        String firstName = String.valueOf(fullName.indexOf(" "));
        String lastName = fullName.substring(0, Integer.parseInt(firstName));
        firstName = fullName.substring(Integer.parseInt(String.valueOf(firstName)), Integer.parseInt(middleName));
        middleName = fullName.substring(Integer.parseInt(middleName));
        System.out.println("lastName = " + lastName.trim());
        System.out.println("firstName = " + firstName.trim());
        System.out.println("middleName = " + middleName.trim());


    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullNameE = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameE);

    }

    private static void task1_2() {
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("fullName = " + fullName);
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);
    }
}