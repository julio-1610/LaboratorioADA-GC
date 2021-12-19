/* 
    Ejercicio03: Shortest Routes II

    Descripción: Existen n ciudades y m vuelos entre ellas,
    debemos procesar q peticiones, las cuales determinamos
		la ruta minima entre ambas ciudades.

*/

import java.io.*;
import java.util.*;

public class ShortestRoutes {
    static final long INF = 0x3f3f3f3f3f3f3f3fL;
    public static void main(String[] args) throws IOException {
        _Scanner s = new _Scanner(System.in);
        
        int n = s.nextInt();
        int m = s.nextInt();
        int q = s.nextInt();

        long[][] all = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                all[i][j] = INF;
            all[i][i] = 0;
        }
        while (m-- > 0) {
            int i = s.nextInt() - 1;
            int j = s.nextInt() - 1;
            int w = s.nextInt();
            if (all[i][j] > w)
                all[j][i] = all[i][j] = w;
        }
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++) {
                    long a = all[i][k] + all[k][j];
                    if (all[i][j] > a)
                        all[j][i] = all[i][j] = a;
                }
        while (q-- > 0) {
            int i = s.nextInt() - 1;
            int j = s.nextInt() - 1;
            long a = all[i][j];
            System.out.println(a == INF ? -1 : a);
        }
    }
    static class _Scanner {
        InputStream is;
        _Scanner(InputStream is) {
            this.is = is;
        }
        byte[] bb = new byte[1 << 15];
        int k, l;
        byte getc() throws IOException {
            if (k >= l) {
                k = 0;
                l = is.read(bb);
                if (l < 0) return -1;
            }
            return bb[k++];
        }
        byte skip() throws IOException {
            byte b;
            while ((b = getc()) <= 32)
                ;
            return b;
        }
        int nextInt() throws IOException {
            int n = 0;
            for (byte b = skip(); b > 32; b = getc())
                n = n * 10 + b - '0';
            return n;
        }
    }
}