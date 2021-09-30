package Laboratorio03;
class Laboratorio03 { 
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 5, 7, 9, 10, 14, 15, 17, 18, 20, 50, 50};
        System.out.println(binary_search(arr, 15));
        int[][] matriz = {{1, 3, 5}, {7, 9, 11}, {13, 15, 17}};
        System.out.println(matrix_search(matriz, 12));
        System.out.println(matrix_search(matriz, 7));

    }
    //Ejercicio01
    public static int binary_search(int[] arr, int x) {
        //Algoritmo de búsqueda binaria para el arreglo a ingresar
        int first = 0, last = arr.length - 1;
        int m = arr.length/2;
        while(first <= last) {
            if(x == arr[m]) return m;
            else if(x > arr[m]) {
                first = m + 1;
            }else {
                last = m - 1;
            }
            m = (first + last)/2;
        }
        return -1;
    }
    
    //Ejercicio02
    public static String matrix_search(int[][] matrix, int x) {
        //Busca un elemento dentro de una matriz 2D, además de utilizar 
        //la búsqueda binaria
        for(int i = 0; i < matrix.length; i++) 
            if(matrix[i][matrix[i].length - 1] > x) {
                int a = binary_search(matrix[i], x);
                if(a != -1) return "Se encuentra en: " + i + ", " + a;
            } 
        return "No se encuentra el valor.";    
    } 
}
