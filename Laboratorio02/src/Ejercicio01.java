public class Ejercicio01 {
    public static void main(String[] args) {
        int[] arr = {1000, 20000, 100000, 5000, 115000, 1000};
        int[] times = calculateTime(arr);
        printArray(times);
    }

    public static int[] calculateTime(int[] sizes) {
        int[] times = new int[sizes.length];
        for (int i = 0;i < sizes.length; i++) {
            int[] arr = randomArray(sizes[i]);
            long tic = System.currentTimeMillis();
            arr = insertSort(arr);
            long toc = System.currentTimeMillis();
            times[i] = (int) (toc - tic);
        }
        return times;
    }

    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) 
            arr[i] = size - i;
        return arr;
    }

    public static int[] randomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) Math.random()*size + 1;
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static boolean search(int[] arr, int t) {
        for (int i : arr) 
            if(i == t)
                return true;
        return false;
    }
    
    public static int[] insertSort(int[] arr) {
        int i, j;
        for (j = 1; j < arr.length; j++) {
            int key = arr[j];
            i = j - 1;
            while (i >= 0 && arr[i] > key){
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
        return arr;
    }
}
