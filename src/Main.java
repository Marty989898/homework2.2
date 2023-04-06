public class Main {
    public static void main(String[] args) {
        int balance = 300; // Баланс счета
        int sum = 1000; // размер пополнения счета
        int bonus = sum / 100; // Размер бонуса
        System.out.println("Ваш баланс составляет:");
        if (sum >= 1000) {
            System.out.println(sum + balance + bonus);
        } else {
            System.out.println(sum + balance);
        }
    }
}