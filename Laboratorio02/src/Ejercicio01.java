//Laboratorio 2 - Lenguaje Java

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] arr = {1000, 2000, 5000, 10000, 20000, 100000, 1000000};
        int[] times = calculateTime(arr);
        printArray(times);
    }

    public static int[] calculateTime(int[] sizes) {
        //Esta función calculará el tiempo de ejecución de otra función
        //En milisegundos
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
        //Generará un array invertido dependiendo el tamaño que se le
        //mande como atributo
        //Ejemplo, 100: [100, 99, 98, ..., 1]
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) 
            arr[i] = size - i;
        return arr;
    }

    public static int[] randomArray(int size) {
        //Generará un array de elementos aleatorios con la cantidad 
        //que se desee que posea el array
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) Math.random()*size + 1;
        return arr;
    }

    public static void printArray(int[] arr) {
        //Imprime el array recibido
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static boolean search(int[] arr, int t) {
        //Busca elemento por elemento un array, hasta encontrar el
        //elemento que se desee, retorna un boolean 
        for (int i : arr) 
            if(i == t)
                return true;
        return false;
    }
    
    public static int[] insertSort(int[] arr) {
        //Ordena el array ingresado como atributo
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
