package tp1;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 10;

    // TODO
    public static BaseShape create_H() {
        Double degrees90 = Math.toRadians(90);
        Double spacing = stripeThickness * 2;
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape leftStripe = mainStripe.translate(new Point2d(-spacing, 0.0));
        BaseShape rightStripe = mainStripe.translate(new Point2d(spacing, 0.0));
        BaseShape middleStripe = new Rectangle(stripeThickness, halfMaxHeight);
        BaseShape horizontalStripe = middleStripe.rotate(-degrees90).translate(new Point2d(-halfMaxWidth, halfMaxHeight));
        leftStripe.add(rightStripe);
        leftStripe.add(horizontalStripe);


        return leftStripe;
    }

    // TODO
    public static BaseShape create_e() {

        Double degrees90 = Math.toRadians(90);
        BaseShape circle = new Ellipse(maxWidth, maxWidth).translate(new Point2d(-halfMaxWidth,30.0));
        BaseShape mainStripe = new Rectangle(stripeThickness, halfMaxHeight-5);
        BaseShape horizontalStripe = mainStripe.rotate(-degrees90).translate(new Point2d(-halfMaxWidth, halfMaxHeight));
        BaseShape HiddingStripe = mainStripe.rotate(-degrees90).translate(new Point2d((maxWidth/2)-halfMaxWidth,halfMaxHeight+stripeThickness));
        circle.add(horizontalStripe);
        circle.remove(HiddingStripe);
        BaseShape lastCircle = circle.translate(new Point2d(0.0,60.0));//descendre le e
        return lastCircle;

    }

    // TODO
    public static BaseShape create_l() {
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape stripe = mainStripe.translate(new Point2d(0.0, 0.0));

        return stripe;
    }

    // TODO
    public static BaseShape create_o() {
        BaseShape mainO = new Ellipse(maxWidth, maxHeight);

        return mainO;
    }

    // On vous donne la lettre W comme exemple.
    public static BaseShape create_W() {
        Double degrees15 = Math.toRadians(8);
        Double spacing = stripeThickness * 2;
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape leftStripe = mainStripe.rotate(-degrees15).translate(new Point2d(-spacing, 0.0));
        BaseShape middleLeftStripe = mainStripe.rotate(degrees15).translate(new Point2d(-spacing / 3, 0.0));
        BaseShape middleRightStripe = mainStripe.rotate(-degrees15).translate(new Point2d(spacing / 3, 0.0));
        BaseShape rightStripe = mainStripe.rotate(degrees15).translate(new Point2d(spacing, 0.0));
        leftStripe.add(middleLeftStripe);
        leftStripe.add(middleRightStripe);
        leftStripe.add(rightStripe);
        return leftStripe;
    }

    // TODO
    public static BaseShape create_r() {

        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape mainCircle = new Circle(maxWidth);
        BaseShape mainSquare = new Square(maxWidth);
        BaseShape leftStripe = mainStripe.translate(new Point2d(-halfMaxWidth, 0.0));
        BaseShape circle = mainCircle.translate(new Point2d(-halfMaxWidth,10.0));
        BaseShape hiddingSquare = mainSquare.translate(new Point2d(-halfMaxWidth,halfMaxHeight/2));
        circle.remove(hiddingSquare);
        leftStripe.add(circle);
        return leftStripe;
    }

    // TODO
    public static BaseShape create_d() {
        Double spacing = halfMaxWidth;
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape stripe = mainStripe.translate(new Point2d(maxWidth, 0.0));
        BaseShape mainCircle = new Ellipse(maxWidth, halfMaxHeight);
        BaseShape circle = mainCircle.translate (new Point2d(0.0,halfMaxHeight));
        circle.add(stripe);

        return circle;
    }
}
