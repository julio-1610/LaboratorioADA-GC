/* 
    Ejercicio01: RoadReparation

    Descripción: Existen n ciudades y m rutas entre ellas.
    Pero las rutas son pobres y tenemos que reparar algunas,
    por lo tanto el algoritmo debe buscar que rutas debe 
    reparar, utilizando el minimo costo posible

*/
import java.util.*;
import java.io.*;

class RoadReparation {

    public static class Path {
        int init, end, weight;
        Path(int i, int e, int w) {
            this.init = i;
            this.end = e;
            this.weight = w;
        }
    }

    static int[] paths;

    public static int search(int i) {
        return paths[i] < 0 ? i : (paths[i] = search(paths[i]));
    }

    public static boolean merge(int i, int e) {
        i = search(i);
        e = search(e);

        if(i == e)
            return false;
        if(paths[i] > paths[e])
            paths[i] = e;
        else {
            if(paths[i] == paths[e])
                paths[i]--;
            paths[e] = i;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        paths = new int[n];
        Arrays.fill(paths, -1);
        Path[] ee = new Path[m];
        for (int h = 0; h < m; h++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());
            ee[h] = new Path(i, j, w);
        }
        Arrays.sort(ee, (e, f) -> e.weight - f.weight);
        long w = 0;
        for (int h = 0; h < m && n > 1; h++) {
            Path e = ee[h];
            if (merge(e.init, e.end)) {
                w += e.weight;
                n--;
            }
        }
        System.out.println(n == 1 ? w : "IMPOSSIBLE");
    }
}