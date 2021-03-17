import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.canvas.*;

import java.util.ArrayList;

public class UserInterface extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        JFXDrawer jfxDrawer1 = new JFXDrawer();
        JFXDrawer jfxDrawer2 = new JFXDrawer();

        NMatrix nMatrix = new NMatrix(3,3,jfxDrawer1);
        ArrayList<SparseMatrixCell> cellList = new ArrayList<>();
        cellList.add(new SparseMatrixCell(0,0, 5));
        cellList.add(new SparseMatrixCell(1,1,4));
        cellList.add(new SparseMatrixCell(1,2,3));
        SMatrix sMatrix = new SMatrix(3,3,cellList,jfxDrawer2);

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(100,100,100,100));
        hBox.setSpacing(200);

        final Canvas canvasN = new Canvas(400,400);
        GraphicsContext gN = canvasN.getGraphicsContext2D();
        gN.setStroke(Color.BLACK);
        gN.setLineWidth(4);
        gN.strokeRect(0, 0, 400, 400);
        jfxDrawer1.SetGraphicsContext(gN);
        nMatrix.Draw();


        final Canvas canvasS = new Canvas(400,400);
        GraphicsContext gS = canvasS.getGraphicsContext2D();
        gS.setStroke(Color.BLACK);
        gS.setLineWidth(4);
        gS.strokeRect(0, 0, 400, 400);
        jfxDrawer2.SetGraphicsContext(gS);
        sMatrix.Draw();

        Group root = new Group();
        hBox.getChildren().addAll(canvasN, canvasS);
        root.getChildren().add(hBox);

        //Creating a Scene
        Scene scene = new Scene(root, 1200, 600);

        //Setting title to the scene
        stage.setTitle("Sample application");

        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }


}