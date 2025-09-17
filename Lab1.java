import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab1 {
    static float CalculateElementW(Short w_elem, Double x_elem) {
        if (w_elem == 5) {
            return (float) Math.pow(4 * Math.sin(Math.pow(Math.E, x_elem)) - 1, 2);
        } else if (List.of(13, 17, 19, 21).contains(w_elem.intValue())) {
            return (float) Math.pow(Math.pow(x_elem, x_elem * (x_elem - 0.25)), 1f / 9);
        }
        return (float) Math.pow(Math.atan(Math.cos(Math.cos((x_elem - 3) / 22))), 1f / 3);
    }

    static void PrintMatrix(float[][] mtx) {
        for (float[] floats : mtx) {
            String[] tmp = new String[floats.length];
            for (int i = 0; i < floats.length; i++) {
                tmp[i] = String.format("%.3f", floats[i]);
            }
            System.out.println(String.join(" ", tmp));
        }
    }

    public static void main(String[] args) {
        ArrayList<Short> w = new ArrayList<Short>();
        Double[] x = new Double[19];
        float[][] w1 = new float[9][19];

        for (short i = 21; i >= 5; i -= 2) {
            w.add(i);
        }

        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random() * 22 - 14;
        }
        // System.out.println(Arrays.toString(w.toArray()));
        // System.out.println(Arrays.toString(x));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 19; j++) {
                w1[i][j] = CalculateElementW(w.get(i), x[j]);
                // System.out.printf("%s, %s: %f\n", i, j, w1[i][j]);
            }
        }
        PrintMatrix(w1);
    }
}
