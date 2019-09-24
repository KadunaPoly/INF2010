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
        BaseShape horizontalStripe = mainStripe.rotate(degrees90).translate(new Point2d(0.0, halfMaxHeight));
        leftStripe.add(horizontalStripe);
        leftStripe.add(rightStripe);

        return leftStripe;
    }

    // TODO
    public static BaseShape create_e() {


        return new Ellipse(maxWidth, maxHeight);
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

        return new Ellipse(maxWidth, maxHeight);
    }

    // TODO
    public static BaseShape create_d() {
        Double spacing = halfMaxWidth;
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape stripe = mainStripe.translate(new Point2d(spacing, 0.0));
        BaseShape circle = new Ellipse(maxWidth, maxWidth);
        circle.add(stripe);

        return circle;
    }
}
