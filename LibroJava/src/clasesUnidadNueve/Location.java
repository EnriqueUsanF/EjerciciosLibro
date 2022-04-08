package clasesUnidadNueve;

public class Location {
	public static double maxValue;
    public static int row;
    public static int column;


    public static Location locateLargest(double[][] a) {
        Location posicion = new Location();
        maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }

            }
        }
        return posicion;
    }
}
