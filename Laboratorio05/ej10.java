// Ejercicio 10
// What is the time complexity of
class Ejercicio10 {
    public static void main(String[] args) {
        // Habrán 2 ciclos for de la misma cantidad de datos
        int n = 10;
        for(int i = 0; i < n; i++)  // O(n)
            System.out.println();

        for(int j = 0; j < n; j++)  // O(n)
            System.out.println();
    }
}
// O(n) + O(n) = O(2n) => O(n)

// Complexity: O(n)
