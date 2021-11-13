// Ejercicio 12
// What is the time complexity of
class Ejercicio12 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++) {            // O(n)
            for(int j = 1; j < n; j = j * 2) {  // O(log_2(n))
                System.out.println();
            }
        }
    }
}
//O(n) * O(log_2(n)) = O(nlog_2(n))

// Complexity: O(nlog_2(n))
