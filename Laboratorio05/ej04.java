// Ejercicio 04
// What is the time complexity of
class Ejercicio4 {
    public static void main(String[] args) {
        // Por cada número que cicle, va a generar otro ciclo de la misma cantidad de datos
        int n = 10;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println();
            }
        } 
    }
}

// Complexity: O(n²)