package tp1;

import java.util.*;

public final class PointOperator {
    // TODO appliquer la translation sur le vecteur d'entree.
    public static Double[] translate(Double[] vector, Double[] translateVector) {

        int taille = vector.length;

        for (int i = 0; i < taille; i++)
            vector[i] += translateVector[i];

        return vector;
    }

    // TODO appliquer la rotation sur le vecteur d'entree.
    public static Double[] rotate(Double[] vector, Double[][] rotationMatrix) {
       int tailleLigne = rotationMatrix[0].length;
       int tailleColonne = rotationMatrix.length;
       int tailleVecteur = vector.length;
       double somme = 0;

       Double[] vecteurRetour;
       vecteurRetour = new Double[tailleVecteur];

       if (tailleLigne != tailleColonne || tailleColonne != tailleVecteur)
           return null;

       for (int  i = 0; i < tailleColonne; i++) {
           somme = 0;
           for (int j = 0; j < tailleVecteur; j++) {
               somme += rotationMatrix[i][j] * vector[j];
           }

           vecteurRetour[i] = somme;
       }

        return vecteurRetour;
    }

    // TODO appliquer le facteur de division sur le vecteur d'entree.
    public static Double[] divide(Double[] vector, Double divider) {
        if (divider == 0.0)
            return null;

        int tailleVecteur = vector.length;

        for (int i = 0; i < tailleVecteur; i++)
            vector[i] /= divider;

        return vector;
    }

    // TODO appliquer le facteur de multiplication sur le vecteur d'entree.
    public static Double[] multiply(Double[] vector, Double multiplier) {
        int tailleVecteur = vector.length;

        for (int
             i = 0; i < tailleVecteur; i++)
            vector[i] *= multiplier;

        return vector;
    }

    // TODO appliquer le facteur d'addition sur le vecteur d'entree.
    public static Double[] add(Double[] vector, Double adder) {
        int tailleVecteur = vector.length;

        for (int i = 0; i < tailleVecteur; i++)
            vector[i] += adder;

        return vector;
    }

    // TODO retourne la coordonnee avec les plus grandes valeurs en X et en Y.
    public static Point2d getMaxCoord(Collection<Point2d> coords) {
        Iterator<Point2d> itr = coords.iterator();
        Point2d pointMax = new Point2d(0.0, 0.0);
        double xmax = 0.0;
        double ymax = 0.0;
        boolean premiereFois = true;

        while(itr.hasNext()) {
            Point2d point = itr.next();
            if (point.X() > xmax || premiereFois)
                xmax = point.X();
            if (point.Y() > ymax || premiereFois)
                ymax = point.Y();
            premiereFois = false;
        }

        return new Point2d(xmax, ymax);
    }

    // TODO retourne la coordonnee avec les plus petites valeurs en X et en Y.
    public static Point2d getMinCoord(Collection<Point2d> coords) {
        Iterator<Point2d> itr = coords.iterator();
        Point2d pointMax = new Point2d(0.0, 0.0);
        double xmin = 0.0;
        double ymin = 0.0;
        boolean premiereFois = true;

        while(itr.hasNext()) {
            Point2d point = itr.next();
            if (point.X() < xmin || premiereFois)
                xmin = point.X();
            if (point.Y() < ymin || premiereFois)
                ymin = point.Y();
            premiereFois = false;
        }

        return new Point2d(xmin, ymin);
    }
}
