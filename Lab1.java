public class Lab1 {
    public static void main(String[] args) {
        int[] g = new int[16];
        float[] x = new float[13];
        double[][] k = new double[16][13];
        final double min = -10.0;
        final double max = 3.0;
        for (int i = 0; i < 16; i++) {
            g[i] = i + 4;
        }
        for (int i = 0; i < 13; i++) {
            x[i] = (float) (min + (Math.random()) * (max - min));
        }
        for (int i = 0; i < 16; i++)
            for (int j = 0; j < 13; j++) {
                if (g[i] == 7) {
                    k[i][j] = Math.exp(Math.atan(Math.exp(-Math.abs(x[j]))));
                } else if (g[i] % 2 == 0 && g[i] > 2 && g[i] < 14 || g[i] > 16) {
                    k[i][j] = Math.pow(((3.0 / 4.0) / Math.pow(3.0 + Math.pow((0.25 - x[j]) / x[j], 3.0), x[j] / 2.0)),
                            Math.pow(4.0 * ((1.0 / 4.0 - x[j]) / x[j]), x[j]));
                } else {
                    k[i][j] = Math.pow(
                            (0.5 / (1.0 / 3.0 - 3.0 / (2.0 + Math.cbrt(Math.pow((x[j] / 1.0 / 4.0), x[j]))))), 3.0);
                }
            }
        for (int i = 0; i < 16; i++)
            for (int j = 0; j < 13; j++)
                System.out.printf("%.5f\n", k[i][j]);
    }
}
