// Ejercicio 06
// What is the time complexity of
class Ejercicio6 {
    public static void main(String[] args) {
        // Cada ciclo se irá sumando el número del ciclo asignado
        // Serie de Fibonacci
        int p = 0, n = 10;
        for (int i = 1; p <= n; i++) {
            p = p + i;
        }        
    }
}

// Complexity: O(n^(1/2))
