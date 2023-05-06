package pt.ipbeja.po2.sokoban2023.guiimages;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pt.ipbeja.po2.sokoban2023.model.Level;
import pt.ipbeja.po2.sokoban2023.model.Position;
import pt.ipbeja.po2.sokoban2023.model.SokobanGameModel;

import java.util.Set;


/**
 * Start a game with a hardcoded board and images
 * @author anonymized
 * @version 2022/10/13
 * Based on https://en.wikipedia.org/wiki/Sokoban
 */
public class StartJavaFXGUIImages extends Application {

    @Override
    public void start(Stage primaryStage) {

        final String boardContent =
                """
                        FFWWWWFF
                        FFWFFWFF
                        WWWFFWWW
                        WFFEEFFW
                        WFFFFFFW
                        WWWWWWWW""";

        Position keeperPosition = new Position(3, 5);
        Set<Position> boxesPositions =
                Set.of(new Position(3, 2),
                        new Position(3,3));

        SokobanGameModel sokoban = new SokobanGameModel(new Level(keeperPosition, boxesPositions, boardContent));

        SokobanBoardImages sokobanBoardImages =
                new SokobanBoardImages(sokoban,
                        "keeper.png",
                        "box.png",
                        "boxend.png",
                        "wall.png",
                        "free.png",
                        "end.png"
                        );
        primaryStage.setScene(new Scene(sokobanBoardImages));

        sokoban.registerView(sokobanBoardImages);
        sokobanBoardImages.requestFocus(); // to remove focus from first button
        primaryStage.show();
    }

    /**
     * @param args not used
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
