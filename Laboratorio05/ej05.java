// Ejercicio 05
// What is the time complexity of
class Ejercicio5 {
    public static void main(String[] args) {
        // El primer ciclo recorre hasta cierta cantidad
        // En cada número recorrera de 0 hasta el número escogido
        int n = 10;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.println();
            }
        }
    }
}


//Complexity: O(n²)
