public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = numberToPrint;
        for(int i = 1; i < power; i++) {
            result *= numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}