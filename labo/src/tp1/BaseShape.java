package tp1;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape {
    // Vous aller apprendre plus en details le fonctionnement d'un Set lors
    // du cours sur les fonctions de hashage, vous pouvez considerez ceci comme une liste normale.
    private Set<Point2d> coords;

    // TODO Initialiser les points.
    public BaseShape() {
        this.coords = new HashSet<Point2d>();
    }

    // TODO prendre une liste de points et creer une nouvelle forme.
    public BaseShape(Collection<Point2d> coords) {
       this.coords = new HashSet<Point2d>(coords);
    }

    // TODO ajouter ou retirer des coordonnees a la liste de points.
    public void add(Point2d coord) {
        this.coords.add(coord);
    }
    public void add(BaseShape shape) {this.addAll(shape.coords);}
    public void addAll(Collection<Point2d> coords) { for(Point2d x : coords){ this.add(x);}}
    public void remove(Point2d coord) { this.coords.remove(coord);}
    //public void remove(Point2d coord) { this.coords.remove(coord);}
    public void remove(BaseShape shape) { this.removeAll(shape.coords); }
    public void removeAll(Collection<Point2d> coords) {
        for(Point2d x : coords){this.coords.remove(x) ;}
    }

    // TODO retourne les coordonnees de la liste.
    public Set<Point2d> getCoords() {
        Set<Point2d> coordones = new HashSet<Point2d>();
        coordones.addAll(this.coords);

        return coordones;
    }


    // TODO appliquer la translation sur la forme.
    public BaseShape translate(Point2d point) {
        Set<Point2d> liste = new HashSet<Point2d>();
        Iterator<Point2d> it = this.coords.iterator();
        while (it.hasNext()) {
            liste.add(it.next().translate(point));
        }
        return new BaseShape(liste);
    }

    // TODO appliquer la translation sur la liste.
    public Set<Point2d> translateAll(Point2d point) {
        Set<Point2d> liste = new HashSet<Point2d>();
        Iterator<Point2d> it = this.coords.iterator();
        while (it.hasNext())
        {
            liste.add(it.next().translate(point));
        }
        return liste;
    }

    // TODO appliquer la rotation sur la forme.
    public BaseShape rotate(Double angle) {
        Set<Point2d> liste = new HashSet<Point2d>();
        Iterator<Point2d> it = this.coords.iterator();
        while (it.hasNext())
        {
            liste.add(it.next().rotate(angle));
        }
        return new BaseShape(liste);
    }

    // TODO appliquer la rotation sur la liste.
    public Set<Point2d> rotateAll(Double angle) {
        Set<Point2d> liste = new HashSet<Point2d>();
        Iterator<Point2d> it = this.coords.iterator();
        while (it.hasNext())
        {
            liste.add(it.next().rotate(angle));
        }
        return liste;
    }

    // TODO retourner une nouvelle forme.
    public BaseShape clone() {
        BaseShape shapeClone = new BaseShape(this.coords);
        return shapeClone;
    }
}
