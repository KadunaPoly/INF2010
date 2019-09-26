package tp1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Rectangle extends BaseShape {
    // TODO creer un rectangle avec une largeur et une longueur.
    public Rectangle(Double width, Double height) {
        super(new HashSet<Point2d>(Arrays.asList(new Point2d(0.0, 0.0))));
        for(Double largeur=0.0; largeur<= width; largeur++) {
            for (Double longueur=0.0; longueur<= height; longueur++) {
                this.add(new Point2d(largeur, longueur));
            }
        }
    }

    // TODO creer un rectangle avec un point contenant la largeur et longueur.
    public Rectangle(Point2d dimensions) {
        super(new HashSet<Point2d>(Arrays.asList(dimensions)));
        for(double largeur=0; largeur< dimensions.X(); largeur++) {
            for (double longueur=0; longueur<dimensions.Y(); longueur++) {
                this.add(new Point2d(largeur, longueur));
            }
        }
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
