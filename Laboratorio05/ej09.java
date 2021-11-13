// Ejercicio 09
// What is the time complexity of
class Ejercicio9 {
    public static void main(String[] args) {
        // En cada iteración se elevará al cuadrado
        int n = 10;
        for(int i = 0; i * i < n; i++)
            System.out.println();
    }
}
// Ejemplo:
//      n = 10: 0², 1², 2², 3² < 10
//      i = k²     i < n => k² = n      k = n^(1/2)
// Complexity: O(n^(1/2))
