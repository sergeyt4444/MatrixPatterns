public abstract class AMatrix implements IMatrix{

    private IDrawer drawer;

    public AMatrix() {
        drawer = null;
    }

    public AMatrix(IDrawer drawerArg) {
        drawer = drawerArg;
    }


    public abstract void Draw();

    protected void doDrawBorder(int size1, int size2) {
        drawer.DrawBorder(size1, size2);
    }

    protected void doDrawCell(int row, int col, double val) {
        drawer.DrawCell(row, col, val);
    }

    protected void doDrawBorderCell(int size1, int size2) {
        drawer.DrawBorderCell(size1, size2);
    }

}
