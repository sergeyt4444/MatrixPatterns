public class SparseMatrixCell {
    int row, col;
    double value;

    public SparseMatrixCell() {
        row = col = 0;
        value = 1;
    }

    public SparseMatrixCell(int rowArg, int colArg, double valArg) {
        row = rowArg;
        col = colArg;
        value = valArg;
    }
}
