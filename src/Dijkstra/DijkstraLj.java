package Dijkstra;

public class DijkstraLj {

    private int[] vex;
    private int[][] metrix;
    private boolean[] flag;
    private int[] distance;
    private int[] pre;

    public void dijkstra(int vs) {
        for (int i = 0; i < vex.length; i++) {
            flag[i] = false;
            distance[i] = metrix[vs][i];
            pre[i] = 0;
        }
        flag[vs] = true;
        distance[vs] = 0;
        int k = 0;
        for (int i = 1; i < vex.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < vex.length; j++) {
                if (flag[j] == false && min > distance[j]) {
                    min = distance[j];
                    k = j;
                }
            }
            flag[k] = true;
            for (int j = 0; j < vex.length; j++) {
                if (flag[j] == false && distance[j] > min + metrix[k][j]) {
                    distance[j] = min + metrix[k][j];
                    pre[j] = k;
                }
            }
        }
    }
}
