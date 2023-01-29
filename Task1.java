public class Task1 {
    // 1. Напишите метод, который принимает на вход строку (String) и
    // определяет является ли строка палиндромом (возвращает boolean значение).

    public static void main(String[] args) {
        System.out.println(isPalindrome("шалаш"));
        System.out.println(isPalindrome("топор"));
        System.out.println(isPalindrome("азазаза"));
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
}