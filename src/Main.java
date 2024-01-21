
public class Main {

    public static void main(String[] args) {
task1();
task2();
task3();

    }
    private static void task1(){
    String firstName = " Ivan ";
    String middleName = " Ivaniv ";
    String lastName =" Ivanovich ";
    String fullName  = firstName + middleName + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }

    private static void task2(){
        String firstName = " Ivan ";
        String middleName = " Ivaniv ";
        String lastName =" Ivanovich ";
        String fullName  = firstName + middleName + lastName;
        System.out.println("Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

    }
    private static void task3() {
        String firstName = " Семён ";
        String middleName = " Семенов ";
        String lastName = " Семенович ";
        String fullName = firstName + middleName + lastName;
        fullName = fullName.replace('ё', 'е');
        System.out.println("Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }
}