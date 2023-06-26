public class Main {
    public static void main(String[] args) {
        int[] ar = {0};

        int i = 0;
        int j = ar.length - 1;

        if (ar.length == 1) {
            printArray(ar);
        } else {
            while (i < j) {
                if (ar[i] == 0) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                    i = i + 1;
                    j = j - 1;
                } else {
                    i = i + 1;
                }
            }

            printArray(ar);
        }
    }

    public static void printArray(int[] ar) {
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}
