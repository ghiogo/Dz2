public class Main {

    public static void main(String[] args) {
        System.out.println (tempAndAge(25, 12));
        System.out.println (tempAndAge(30, 40));
        System.out.println (tempAndAge(20, 20));
        System.out.println (tempAndAge(40, 13));
        System.out.println (tempAndAge(35, 35));
    }

    public static String tempAndAge(int temp, int age) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}