package src.laboratorio.practica1;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Controller {

    @FXML
    private ImageView selectionFigure;

    @FXML
    private TextField inputSize;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Pane panelPaper;

    @FXML
    private Slider sliderSize;

    ArrayList<Double> pointX = new ArrayList<>();
    ArrayList<Double> pointY = new ArrayList<>();

    @FXML
    void draw(MouseEvent event) {
        switch (selectionFigure.getId()) {
            case "buttonCircle":
                Circle circle = new Circle();
                circle.setCenterX(event.getX());
                circle.setCenterY(event.getY());
                circle.setRadius(sliderSize.getValue() / 2);
                circle.setFill(colorPicker.getValue());
                circle.setStroke(Color.BLACK);
                panelPaper.getChildren().add(circle);
                break;
            case "buttonSquare":
                Rectangle rectangle = new Rectangle();
                rectangle.setX(event.getX());
                rectangle.setY(event.getY());
                rectangle.setHeight(sliderSize.getValue());
                rectangle.setWidth(sliderSize.getValue());
                rectangle.setFill(colorPicker.getValue());
                rectangle.setStroke(Color.BLACK);
                panelPaper.getChildren().add(rectangle);
                break;
            case "buttonTriangle":
                Polygon polygon = new Polygon();
                polygon.getPoints().addAll(
                        event.getX(), event.getY(),
                        event.getX() + sliderSize.getValue(), event.getY() + sliderSize.getValue(),
                        event.getX() - sliderSize.getValue(), event.getY() + sliderSize.getValue());
                polygon.setFill(colorPicker.getValue());
                polygon.setStroke(Color.BLACK);
                panelPaper.getChildren().add(polygon);
                break;
            case "buttonPolygon":
                Polyline polylines = new Polyline();

                if (pointX.contains(event.getX()) && pointY.contains(event.getY())) {
                    for (int i = 0; i < pointX.size(); i++) {
                        polylines.getPoints().addAll(pointX.get(i), pointY.get(i));
                    }
                    polylines.setStrokeWidth(sliderSize.getValue()/2);
                    panelPaper.getChildren().add(polylines);
                    pointX.clear();
                    pointY.clear();
                    return;
                }

                pointX.add(event.getX());
                pointY.add(event.getY());
                break;
            case "buttonSpiral":
                float n = 0, r = 0;

                Polyline polyline = new Polyline();
                for (int i = 0; i < 200 + sliderSize.getValue() * 4; i++) {
                    polyline.getPoints().addAll(event.getX() + Math.cos(n) * r,
                            event.getY() + Math.sin(n) * r);
                    n += 0.05;
                    r += 0.1;
                }
                polyline.setFill(colorPicker.getValue());
                panelPaper.getChildren().add(polyline);
                break;
        }

    }

    @FXML
    void editPreview(MouseEvent event) {
        selectionFigure.setImage(((ImageView) event.getSource()).getImage());
        selectionFigure.setId(((ImageView) event.getSource()).getId());
    }

    @FXML
    void changeValue(MouseEvent event) {
        inputSize.setText("" + ((Slider) event.getSource()).getValue());
    }
}
