// Ejercicio 11
// What is the time complexity of
class Ejercicio11 {
    public static void main(String[] args) {
        // En cada iteración se multiplicará por 2
        // En el segundo ciclo pasará a tener menos cantidad de iteraciones
        int p = 0, n = 10;
        for(int i = 1; i < n; i = i * 2) // O(log_2(n))
            p++;
        
        for(int j = 1; j < p; j = j * 2) // O(log_2(p))
            System.out.println(); 
    }
}
// O(log_2(n)) + O(log_2(p)) => n > p => O(log_2(n))

// Complexity: O(log_2(n))
