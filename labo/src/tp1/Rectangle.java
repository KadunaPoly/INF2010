package tp1;

import java.util.HashSet;
import java.util.Set;

public class Rectangle extends BaseShape {
    // TODO creer un rectangle avec une largeur et une longueur.
    public Rectangle(Double width, Double height) {
        this.add(new Point2d(0.0,0.0));
        this.add(new Point2d(width,height));
        this.add(new Point2d(width,0.0));
        this.add(new Point2d(0.0,height));
    }

    // TODO creer un rectangle avec un point contenant la largeur et longueur.
    public Rectangle(Point2d dimensions) {
        this.add(new Point2d(0.0,0.0));
        this.add(new Point2d(dimensions.X(),dimensions.Y()));
        this.add(new Point2d(dimensions.X(),0.0));
        this.add(new Point2d(0.0,dimensions.Y()));
    }

    private Rectangle(Set<Point2d> coords) {
        super(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Rectangle translate(Point2d point) {
        return new Rectangle(translateAll(point));
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Rectangle rotate(Double angle) {
        return new Rectangle(rotateAll(angle));
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Rectangle clone() {
        return new Rectangle(getCoords());
    }
}
