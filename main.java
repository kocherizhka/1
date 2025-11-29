import java.util.Random;
import java.lang.Math;

class main {
    public static void main (String[] args) {
        int[] s0 = {7, 9, 11, 13, 15};
        double[] x = new double[13];
        Random rand = new Random();
        for (int i = 0; i < 13; i++) {
            double q = rand.nextFloat() * 15 - 8;
            x[i] = q;
        }
        double[][] s = new double[5][13];
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 13; k++) {
                switch (s0[j]) {
                    case 13:
                        s[j][k] = one(x[k]);
                        break;
                    case 7:
                    case 11:
                        s[j][k] = two(x[k]);
                    default:
                        s[j][k] = three(x[k]);
                }
            }
        }
        outp(s);
    }
    
    private static double one (double x) {
        return Math.atan(Math.sin(Math.tan(x - (1 / 3))));
    }
    
    private static double two (double x) {
        return Math.sin(Math.log(Math.abs(x)) / 0.5);
    }
    
    private static double three (double x) {
        double arct = Math.pow((Math.atan((x - 0.5) / 15)) / 0.5, 3);
        return Math.sin(Math.log(Math.pow(Math.sin(arct), 2)));
    }

    private static void outp (double[][] s) {
    }
}