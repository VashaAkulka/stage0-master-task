import java.util.Arrays;

public class ArraysTasks {
    public String[] seasonsArray() {
        return new String[] {"Winter","Spring","Summer","Autumn"};
    }

    public int[] generateNumbers(int n){
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        return numbers;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public int findIndexOfNumber(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return i;
        }
        return -1;
    }

    public String[] reverseArray(String[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            String buff = arr[i];
            arr[i] = arr[j];
            arr[j] = buff;

            i++;
            j--;
        }

        return arr;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for(int num: arr) {
            if (num > 0) count++;
        }

        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        
        return newArr;
    }
}
