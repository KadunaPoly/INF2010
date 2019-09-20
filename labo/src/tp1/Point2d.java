package tp1;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    // TODO creer un point en 2d avec 2 donnees
    public Point2d(Double x, Double y) {
        super(new Double[]{x, y});
    }

    // TODO creer un point a partir d'un vecteur de donnees
    public Point2d(Double[] vector) {
        super(new Double[]{vector[0], vector[1]});
    }

    public Double X() { return vector[X];}
    public Double Y() { return vector[Y];}

    // TODO prendre un vecteur de donnees et appliquer la translation.
    @Override
    public Point2d translate(Double[] translateVector) {
        PointOperator operateur = new PointOperator();
        Double[] vectorCopy = new Double[]{this.X(), this.Y()};
        Double[] vector = operateur.translate(vectorCopy, translateVector);

        return new Point2d(vector);
    }

    // TODO prendre un point et appliquer la translation.
    public Point2d translate(Point2d translateVector) {
        PointOperator operateur = new PointOperator();
        Double[] vectorCopy = new Double[]{this.X(), this.Y()};
        Double[] vector = operateur.translate(vectorCopy, translateVector.vector);

        return new Point2d(vector);
    }

    // TODO prendre un vecteur de donnees et appliquer la translation.
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        PointOperator operateur = new PointOperator();
        Double[] vector = operateur.rotate(this.vector, rotationMatrix);
        this.vector = vector;

        return this;
    }

    // TODO prendre un angle de rotation, creer une matrice et appliquer la rotation.
    public Point2d rotate(Double angle) {
        Double sin = Math.sin(angle);
        Double cos = Math.cos(angle);

        Double[][] matrix = new Double[][] {{cos, -sin}, {sin, cos}};

        PointOperator operateur = new PointOperator();
        Double[] vector = operateur.rotate(this.vector, matrix);

        return new Point2d(vector);
    }

    // TODO prendre un facteur de division et l'appliquer.
    @Override
    public Point2d divide(Double divider) {
        Double[] vector = new Double[]{this.X(), this.Y()};
        PointOperator operateur = new PointOperator();
        vector = operateur.divide(vector, divider);

        return new Point2d(vector);
    }

    // TODO prendre un facteur de multiplication et l'appliquer.
    @Override
    public Point2d multiply(Double multiplier) {
        Double[] vector = new Double[]{this.X(), this.Y()};
        PointOperator operateur = new PointOperator();
        vector = operateur.multiply(vector, multiplier);

        return new Point2d(vector);
    }

    // TODO prendre un facteur d'addition et l'appliquer.
    @Override
    public Point2d add(Double adder) {
        Double[] vector = new Double[]{this.X(), this.Y()};
        PointOperator operateur = new PointOperator();
        vector = operateur.add(vector, adder);

        return new Point2d(vector);
    }

    // TODO creer un nouveau point.
    @Override
    public Point2d clone() {
        return new Point2d(this.vector);
    }
}
