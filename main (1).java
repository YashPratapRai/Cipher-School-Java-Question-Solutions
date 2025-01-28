public class Main{
    public static void main(String[] args) {
        int intVar = 25;
        double doubleVar = 10.5;
        char charVar = 'A';
        boolean boolVar = true;

        System.out.println("Before conversion:");
        System.out.println("intVar: " + intVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);

        doubleVar = intVar;  

        int charToInt = charVar;
        System.out.println("\nAfter conversion:");
        System.out.println("doubleVar (int to double): " + doubleVar);
        System.out.println("charToInt (char to int): " + charToInt);
    }
}
