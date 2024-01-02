enum Complexity {

    O_LOG_N("O(log N)"),
    O_N_2("O(log N^2)"),
    O_FACTORIAL_N("O(!N)"),
    O_2_N("O(2 * N)"),
    O_N_LOG_N("O(N * log N)"),
    O_1("O(1)"),
    O_N("O(N)");
    private String title;
    Complexity(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

public class AlgorithmComplexity {
    public static void main(String[] args) {
        System.out.println("badLinerSearch - " + Complexity.O_N);
        System.out.println("arrayIndexItemAccess - " + Complexity.O_1);
        System.out.println("binarySorting - " + Complexity.O_LOG_N);
        System.out.println("twoCycleSorting - " + Complexity.O_N_2);


    }
}
