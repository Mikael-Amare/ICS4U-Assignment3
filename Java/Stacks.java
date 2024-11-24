/**
* This program creates and checks stats of different triangles.
*
* @author  Mikael Amare
* @version 1.0
* @since   2024-11-14
*/

import java.text.DecimalFormat;

/**
* This is the program.
*/
final class Stacks {
    /**
     * The format for the decimals caculated by the methods.
     *
     * @param DEC_FORMAT to use for the doubles
     */
    private static final DecimalFormat DEC_FORMAT = new DecimalFormat("0.0000");

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Stacks() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Number constants
        final double one = 1;
        final double two = 2;
        final double three = 3;
        final double four = 4;
        // Text constants
        final String validText = " -> Is the triangle valid: ";
        final String semiPeriText = " -> Semiperimeter: ";
        final String areaText = " -> Area: ";
        final String typeText = " -> Type: ";
        final String angleOneText = " -> Angle 1: ";
        final String angleTwoText = " -> Angle 2: ";
        final String angleThreeText = " -> Angle 3: ";
        final String heightOneText = " -> Height 1: ";
        final String heightTwoText = " -> Height 2: ";
        final String heightThreeText = " -> Height 3: ";
        final String innerCircleText = " -> Inner circle radius: ";
        final String circumcircleText = " -> Circumcircle radius: ";
        final String mmText = " mm";
        final String mmTwoText = " mm²";
        final String radText = " rad";

        final Triangle testTriangle1 = new Triangle(three, four, 5);
        System.out.println("\nCreated a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println(validText + testTriangle1.isValid());
        System.out.println(semiPeriText
            + DEC_FORMAT.format(testTriangle1.semiPerimeter()) + semiPeriText);
        System.out.println(areaText
            + DEC_FORMAT.format(testTriangle1.area()) + mmTwoText);
        System.out.println(typeText + testTriangle1.triangleType());
        System.out.println(angleOneText
            + DEC_FORMAT.format(testTriangle1.angle((int) one)) + radText);
        System.out.println(angleTwoText
            + DEC_FORMAT.format(testTriangle1.angle((int) two)) + radText);
        System.out.println(angleThreeText
            + DEC_FORMAT.format(testTriangle1.angle((int) three)) + radText);
        System.out.println(heightOneText
            + DEC_FORMAT.format(testTriangle1.height((int) one)) + mmText);
        System.out.println(heightTwoText
            + DEC_FORMAT.format(testTriangle1.height((int) two)) + mmText);
        System.out.println(heightThreeText
            + DEC_FORMAT.format(testTriangle1.height((int) three)) + mmText);
        System.out.println(innerCircleText
            + DEC_FORMAT.format(testTriangle1.innerCircleRadius()) + mmText);
        System.out.println(circumcircleText
            + DEC_FORMAT.format(testTriangle1.circumcircleRadius()) + mmText);
        final Triangle testTriangle2 = new Triangle(three, three, three);
        System.out.println("\nCreated a 3 mm by 3 mm by 3 mm triangle.");
        System.out.println(validText
            + testTriangle2.isValid());
        System.out.println(semiPeriText
            + DEC_FORMAT.format(testTriangle2.semiPerimeter()) + mmText);
        System.out.println(areaText
            + DEC_FORMAT.format(testTriangle2.area()) + mmTwoText);
        System.out.println(typeText + testTriangle2.triangleType());
        System.out.println(angleOneText
            + DEC_FORMAT.format(testTriangle2.angle((int) one)) + radText);
        System.out.println(angleTwoText
            + DEC_FORMAT.format(testTriangle2.angle((int) two)) + radText);
        System.out.println(angleThreeText
            + DEC_FORMAT.format(testTriangle2.angle((int) three)) + radText);
        System.out.println(heightOneText
            + DEC_FORMAT.format(testTriangle2.height((int) one)) + mmText);
        System.out.println(heightTwoText
            + DEC_FORMAT.format(testTriangle2.height((int) two)) + mmText);
        System.out.println(heightThreeText
            + DEC_FORMAT.format(testTriangle2.height((int) three)) + mmText);
        System.out.println(innerCircleText
            + DEC_FORMAT.format(testTriangle2.innerCircleRadius()) + mmText);
        System.out.println(circumcircleText
            + DEC_FORMAT.format(testTriangle2.circumcircleRadius()) + mmText);
        final Triangle testTriangle3 = new Triangle(three, four, four);
        System.out.println("\nCreated a 3 mm by 4 mm by 4 mm triangle.");
        System.out.println(validText + testTriangle3.isValid());
        System.out.println(semiPeriText
            + DEC_FORMAT.format(testTriangle3.semiPerimeter()) + mmText);
        System.out.println(areaText
            + DEC_FORMAT.format(testTriangle3.area()) + mmTwoText);
        System.out.println(typeText + testTriangle3.triangleType());
        System.out.println(angleOneText
            + DEC_FORMAT.format(testTriangle3.angle((int) one)) + radText);
        System.out.println(angleTwoText
            + DEC_FORMAT.format(testTriangle3.angle((int) two)) + radText);
        System.out.println(angleThreeText
            + DEC_FORMAT.format(testTriangle3.angle((int) three)) + radText);
        System.out.println(heightOneText
            + DEC_FORMAT.format(testTriangle3.height((int) one)) + mmText);
        System.out.println(heightTwoText
            + DEC_FORMAT.format(testTriangle3.height((int) two)) + mmText);
        System.out.println(heightThreeText
            + DEC_FORMAT.format(testTriangle3.height((int) three)) + mmText);
        System.out.println(innerCircleText
            + DEC_FORMAT.format(testTriangle3.innerCircleRadius()) + mmText);
        System.out.println(circumcircleText
            + DEC_FORMAT.format(testTriangle3.circumcircleRadius()) + mmText);
        final Triangle testTriangle4 = new Triangle(2, three, four);
        System.out.println("\nCreated a 2 mm by 3 mm by 4 mm triangle.");
        System.out.println(validText + testTriangle4.isValid());
        System.out.println(semiPeriText
            + DEC_FORMAT.format(testTriangle4.semiPerimeter()) + mmText);
        System.out.println(areaText
            + DEC_FORMAT.format(testTriangle4.area()) + mmTwoText);
        System.out.println(typeText + testTriangle4.triangleType());
        System.out.println(angleOneText
            + DEC_FORMAT.format(testTriangle4.angle((int) one)) + radText);
        System.out.println(angleTwoText
            + DEC_FORMAT.format(testTriangle4.angle((int) two)) + radText);
        System.out.println(angleThreeText
            + DEC_FORMAT.format(testTriangle4.angle((int) three)) + radText);
        System.out.println(heightOneText
            + DEC_FORMAT.format(testTriangle4.height((int) one)) + mmText);
        System.out.println(heightTwoText
            + DEC_FORMAT.format(testTriangle4.height((int) two)) + mmText);
        System.out.println(heightThreeText
            + DEC_FORMAT.format(testTriangle4.height((int) three)) + mmText);
        System.out.println(innerCircleText
            + DEC_FORMAT.format(testTriangle4.innerCircleRadius()) + mmText);
        System.out.println(circumcircleText
            + DEC_FORMAT.format(testTriangle4.circumcircleRadius()) + mmText);

        final Triangle testTriangle5 = new Triangle(23, three, four);
        System.out.println("\nCreated a 23 mm by 3 mm by 4 mm triangle.");
        System.out.println(validText + testTriangle5.isValid());
        System.out.println(semiPeriText
            + DEC_FORMAT.format(testTriangle5.semiPerimeter()) + mmText);
        System.out.println(areaText
            + DEC_FORMAT.format(testTriangle5.area()) + mmTwoText);
        System.out.println(typeText + testTriangle5.triangleType());
        System.out.println(angleOneText
            + DEC_FORMAT.format(testTriangle5.angle((int) one)) + radText);
        System.out.println(angleTwoText
            + DEC_FORMAT.format(testTriangle5.angle((int) two)) + radText);
        System.out.println(angleThreeText
            + DEC_FORMAT.format(testTriangle5.angle((int) three)) + radText);
        System.out.println(heightOneText
            + DEC_FORMAT.format(testTriangle5.height((int) one)) + mmText);
        System.out.println(heightTwoText
            + DEC_FORMAT.format(testTriangle5.height((int) two)) + mmText);
        System.out.println(heightThreeText
            + DEC_FORMAT.format(testTriangle5.height((int) three)) + mmText);
        System.out.println(innerCircleText
            + DEC_FORMAT.format(testTriangle5.innerCircleRadius()) + mmText);
        System.out.println(circumcircleText
            + DEC_FORMAT.format(testTriangle5.circumcircleRadius()) + mmText);

        // Show the program as done
        System.out.println("\nDone.");
    }
}
