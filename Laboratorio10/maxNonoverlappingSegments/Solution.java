// Ejercicio 01
// El algoritmo decidirá los segmentos que no estén apilados y así buscar
// la mejor solución y retornará la cantidad de segmentos elegida
class Solution {
    public int solution(int A[], int B[]) {
        int N = A.length;
        if(N <= 1) 
            return N;
        
        int count = 1;
        int prev = B[0];
        
        for (int i = 1; i < N; i++) 
            if(A[i] > prev) {
                count++;
                prev= B[i];
            }
        
        return count
    }
}
