public class Main {
    public static void main(String[] args) {

        public static void task1() {
//  Задание 1
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника - " + fullName + "\n");

        }

    }

    public static void task2() {
        //Задание 2
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpp + "\n");

    }

    public static void task3(){
        //Задание 3
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }
}








