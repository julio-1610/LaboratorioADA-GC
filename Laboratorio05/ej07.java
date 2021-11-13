// Ejercicio 07
// What is the time complexity of
class Ejercicio7 {
    public static void main(String[] args) {
        // Por cada iteración en número será multiplicado por 2
        int n = 10;
        for(int i = 1; i < n; i = i * 2)
            System.out.println();
    }   
}
// Ejemplo:
//       n = 8: i * 2 * 2 * ... * 2 => i = 2^k => log_2(8) = 3
//          i >= n      2^k >=n     log_2(2^k) = log_2(n)
//                  k = log_2(n)

// Complexity: O(log_2(n))
