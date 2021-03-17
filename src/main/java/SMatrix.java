import java.util.ArrayList;

public class SMatrix extends AMatrix{

    private int rows, cols;
    private ArrayList<SparseMatrixCell> cells;

    public SMatrix(int size1, int size2, ArrayList<SparseMatrixCell> cellsArg, IDrawer drawerArg) {
        super(drawerArg);
        rows = size1;
        cols = size2;
        cells = cellsArg;

    }

    public double[] size() {
        double[] sizes = new double[2];
        sizes[0] = rows;
        sizes[1] = cols;
        return sizes;
    }

    public double value(int row, int col) {
        double tmpval = 0;
        for (SparseMatrixCell cell: cells) {
            if (cell.row == row && cell.col == col) {
                tmpval = cell.value;
                break;
            }
        }
        return tmpval;
    }

    public void Draw() {
        doDrawBorder(rows,cols);
        doDrawBorderCell(rows,cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                doDrawCell(i,j,value(i,j));
            }
    }

}
