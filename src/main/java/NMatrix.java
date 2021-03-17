public class NMatrix extends AMatrix{

    private int rows, cols;
    private double[][] values;

    public double[] size() {
        double[] sizes = new double[2];
        sizes[0] = rows;
        sizes[1] = cols;
        return sizes;
    }

    public double value(int row, int col) {
        double result;
        if (row > rows || col > cols || row <= 0 || col <= 0)
            throw new ArrayIndexOutOfBoundsException();
        else {
            result = values[row -1][col - 1];
        }
        return result;
    }

    public void Draw() {
        doDrawBorder(rows,cols);
        doDrawBorderCell(rows,cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                doDrawCell(i,j,values[i][j]);
            }
    }

    public NMatrix(int size1, int size2, IDrawer drawerArg) {
        super(drawerArg);
        values = new double[size1][size2];
        rows = size1;
        cols = size2;
        for (int i = 0; i < size1; i++)
            for(int j = 0; j < size2; j++) {
                values[i][j] = 1;
            }
    }
//
//    public NMatrix(int size1, int size2, double[][] valArg) {
//        rows = size1;
//        cols = size2;
//
//    }

}
