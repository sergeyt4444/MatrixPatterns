import javafx.geometry.VPos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

public class JFXDrawer implements IDrawer{

    private GraphicsContext g;
    private int spacing = 20;
    private int sizeX = 50;
    private int sizeY = 50;

    public void SetGraphicsContext(GraphicsContext gArg) {
        g = gArg;
    }

    public void DrawBorder(int size1, int size2) {
        g.setStroke(Color.BLACK);
        g.setLineWidth(2);
        g.strokeRect(spacing, spacing, sizeX*size2, sizeY*size1);
    }

    public void DrawCell(int row, int col, double val){
        g.setTextAlign(TextAlignment.CENTER);
        g.setTextBaseline(VPos.CENTER);
        g.fillText(Double.toString(val), spacing + col*sizeX + sizeX/2, spacing + row*sizeY + sizeY/2);
    }

    public void DrawBorderCell(int size1, int size2) {
        for (int i = 1; i < size1; i++) {
            g.strokeLine(spacing,spacing+i*sizeY, spacing+sizeX*size2, spacing+i*sizeY);
        }
        for (int i = 1; i < size2; i++) {
            g.strokeLine(spacing+ i*sizeX, spacing, spacing+i*sizeX, spacing+sizeY*size1);
        }

    }

}
