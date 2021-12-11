// Ejercicio 02
// El algoritmo sumará las cuerdas adyacientes, sin embargo si la longitud
// es mayor o igual a K, reiniciará la longitud y sumará uno al contador
// retorna el contador donde está la cantidad de sumas mayores o iguales a K 

class Solution {
    public int solution(int K, int[] A) {
        int N = A.length;
        int count = 0;
        int L = 0;

        for(int i = 0; i < N; i++) {
            L = L + A[i];
            if(L >= K) {
                count++;
                L = 0;
            }
        }
        return count;
    }
}
