package tp1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ellipse extends BaseShape {
    // TODO creer une ellipse avec une largeur et une longueur.
    public Ellipse(Double widthRadius, Double heightRadius) {
        super(new HashSet<Point2d>(Arrays.asList(new Point2d(widthRadius/2, 0.0))));
        for(Double largeur = 0.0; largeur <= widthRadius; largeur++) {
            for (Double longueur = 0.0; longueur <= heightRadius; longueur++) {
                Double elips= (Math.pow(largeur-widthRadius/2,2)/Math.pow(widthRadius/2,2)) + (Math.pow(longueur-heightRadius/2,2)/Math.pow(heightRadius/2,2));
                if((elips <=1) && (elips >= 0.6))
                    this.add(new Point2d(largeur, longueur));
            }
        }
    }

    private Ellipse(Set<Point2d> coords) {
        super(coords);
        Iterator<Point2d> iterator = coords.iterator();
        while(iterator.hasNext()){
            Point2d coordo =iterator.next();
            this.add(new Point2d(coordo.X(),coordo.Y()));
        }
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Ellipse translate(Point2d point) {
        return new Ellipse(translateAll(point));
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Ellipse rotate(Double angle) {
        return new Ellipse(rotateAll(angle));
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Ellipse clone() { return new Ellipse(getCoords()); }
}
