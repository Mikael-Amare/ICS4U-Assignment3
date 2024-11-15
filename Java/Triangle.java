/*
* This class creates a triangle
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-04-18
*/

/**
 * Creates a triangle.
*/
public class Triangle {
    /**
     * A side of the triangle.
     *
     * @param lengthOne of the triangle
    */
    private double lengthOne;

    /**
     * A side of the triangle.
     *
     * @param lengthTwo of the triangle
     */
    private double lengthTwo;

    /**
     * A side of the triangle.
     *
     * @param lengthThree of the triangle
     */
    private double lengthThree;

    /**
     * Creates the base triangle.
     *
     * @param startOne side a of the triangle
     * @param startTwo side b of the triangle
     * @param startThree side c of the triangle
    */
    public Triangle(double startOne, double startTwo, double startThree) {
        this.lengthOne = startOne;
        this.lengthTwo = startTwo;
        this.lengthThree = startThree;
    }

    /**
     * Get side b of the triangle.
     *
     * @return the first length of the triangle
     */
    public double getLengthOne() {
        return this.lengthOne;
    }

    /**
     * Get side b of the triangle.
     *
     * @return the second length of the triangle
     */
    public double getLengthTwo() {
        return this.lengthTwo;
    }

    /**
     * Get side c of the triangle.
     *
     * @return the third length of the triangle
     */
    public double getLengthThree() {
        return this.lengthThree;
    }

    /**
     * Calculates the perimeter of the triangle.
     *
     * @return the perimeter of the triangle
     */
    private double perimeter() {
        final double perimeter =
            this.lengthOne + this.lengthTwo + this.lengthThree;

        return perimeter;
    }

    /**
     * Checks if the triangle is valid.
     *
     * @return the validity of the triangle
     */
    public boolean isValid() {
        boolean isValid = true;
        final double sumOfOneAndTwo = this.lengthOne + this.lengthTwo;
        final double sumOfTwoAndThree = this.lengthTwo + this.lengthThree;
        final double sumOfOneAndThree = this.lengthOne + this.lengthThree;
        if (sumOfOneAndTwo < this.lengthThree
            || sumOfTwoAndThree < this.lengthOne
            || sumOfOneAndThree < this.lengthTwo
        ) {
            isValid = false;
        }

        return isValid;
    }

    /**
     * Calculates the area of the triangle.
     *
     * @return the area of the triangle
     */
    public double area() {
        double area = -1;
        if (this.isValid()) {
            final double semiPerimeter = this.semiPerimeter();
            area = Math.sqrt(
                semiPerimeter
                * (semiPerimeter - this.lengthOne)
                * (semiPerimeter - this.lengthTwo)
                * (semiPerimeter - this.lengthThree)
            );
        }

        return area;
    }

    /**
     * Finds the type of the triangle.
     *
     * @return the type of the triangle
     */
    public String triangleType() {
        String triangleType = "-1";
        if (this.isValid()) {
            if (
                this.lengthOne == this.lengthTwo
                    && this.lengthOne == this.lengthThree
            ) {
                triangleType = "Equilateral Triangle";
            } else if (
                this.lengthOne == this.lengthTwo
                    || this.lengthTwo == this.lengthThree
                    || this.lengthThree == this.lengthOne
            ) {
                triangleType = "Isosceles Triangle";
            } else if (
                Math.pow(this.lengthOne, 2) + Math.pow(this.lengthTwo, 2)
                    == Math.pow(this.lengthThree, 2)
            ) {
                triangleType = "Right Angle Triangle";
            } else {
                triangleType = "Scalene Triangle";
            }
        }

        return triangleType;
    }

    /**
     * Calculates the semiperimeter of the triangle.
     *
     * @return the semiperimeter of the triangle
     */
    public double semiPerimeter() {
        double semiPerimeter = -1;
        if (this.isValid()) {
            semiPerimeter = this.perimeter() / 2;
        }

        return semiPerimeter;
    }

    /**
     * Calculates the three different angles of the triangle.
     *
     * @param angleNumber used to see which angle to calculate
     * @return the angle in radians
     */
    public double angle(int angleNumber) {
        double angle = -1;
        if (this.isValid()) {
            final int finalNumber = 3;
            switch (angleNumber) {
                case 1:
                    angle = Math.acos(
                        (
                            Math.pow(this.lengthTwo, 2)
                            + Math.pow(this.lengthThree, 2)
                            - Math.pow(this.lengthOne, 2)
                        ) / (2 * this.lengthTwo * this.lengthThree)
                    );
                    break;
                case 2:
                    angle = Math.acos(
                        (
                            Math.pow(this.lengthOne, 2)
                            + Math.pow(this.lengthThree, 2)
                            - Math.pow(this.lengthTwo, 2)
                        ) / (2 * this.lengthOne * this.lengthThree)
                    );
                    break;
                case finalNumber:
                    angle = Math.acos(
                        (
                            Math.pow(this.lengthOne, 2)
                            + Math.pow(this.lengthTwo, 2)
                            - Math.pow(this.lengthThree, 2)
                        ) / (2 * this.lengthOne * this.lengthTwo)
                    );
                    break;
                default:
                    break;
            }
        }

        return angle;
    }

    /**
     * Caculates the three heights of the triangle.
     *
     * @param sideNumber that determines what height is calculated
     * @return the height of the triangle
     */
    public double height(int sideNumber) {
        double height = -1;
        if (this.isValid()) {
            final int finalNumber = 3;
            switch (sideNumber) {
                case 1:
                    height = (2 * this.area()) / this.lengthOne;
                    break;
                case 2:
                    height = (2 * this.area()) / this.lengthTwo;
                    break;
                case finalNumber:
                    height = (2 * this.area()) / this.lengthThree;
                    break;
                default:
                    break;
            }
        }

        return height;
    }

    /**
     * Calculates the inner circle radius of the triangle.
     *
     * @return the inner circle radius
     */
    public double innerCircleRadius() {
        double innerCircleRadius = -1;
        if (this.isValid()) {
            innerCircleRadius = this.area() / this.semiPerimeter();
        }

        return innerCircleRadius;
    }

    /**
     * Calculates the circumcircle of the triangle.
     *
     * @return the circumcircle of the triangle
     */
    public double circumcircleRadius() {
        double circumcircle = -1;
        if (this.isValid()) {
            circumcircle = this.lengthOne / (2 * Math.sin(this.angle(1)));
        }

        return circumcircle;
    }
}
