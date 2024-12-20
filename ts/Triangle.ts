/**
 * This class creates a triangle
 *
 * @author  Mikael Amare
 * @version 1.0
 * @since   2024-11-14
 */

export class Triangle {
  // Class variables
  private _lengthOne: number;
  private _lengthTwo: number;
  private _lengthThree: number;

  /** Initializes the function */
  constructor(startOne: number, startTwo: number, startThree: number) {
    this._lengthOne = startOne;
    this._lengthTwo = startTwo;
    this._lengthThree = startThree;
  }

  /** Returns the first length of the triangle's side */
  public get lengthOne(): number {
    return this._lengthOne;
  }

  /** Returns the second length of the triangle's side */
  public get lengthTwo(): number {
    return this._lengthTwo;
  }

  /** Returns the third length of the triangle's side */
  public get lengthThree(): number {
    return this._lengthThree;
  }

  /** Returns the perimeter of the triangle */
  private perimeter(): number {
    let perimeter: number = this.lengthOne + this.lengthTwo + this.lengthThree;

    return perimeter;
  }

  /** Checks if the triangle is valid */
  public isValid(): boolean {
    const sumOfOneAndTwo: number = this.lengthOne + this.lengthTwo;
    const sumOfTwoAndThree: number = this.lengthTwo + this.lengthThree;
    const sumOfOneAndThree: number = this.lengthOne + this.lengthThree;
    let isValid = true;
    if (
      sumOfOneAndTwo < this.lengthThree ||
      sumOfTwoAndThree < this.lengthOne ||
      sumOfOneAndThree < this.lengthTwo
    ) {
      isValid = false;
    }

    return isValid;
  }

  /** Return the area of the triangle */
  public area(): number {
    let area: number = -1;
    if (this.isValid()) {
      const semiPerimeter = this.semiPerimeter();
      area = Math.sqrt(
        semiPerimeter *
          (semiPerimeter - this.lengthOne) *
          (semiPerimeter - this.lengthTwo) *
          (semiPerimeter - this.lengthThree),
      );
    }

    return area;
  }

  /** Finds the type of the triangle */
  public getType(): any {
    let triangleType: any = -1;
    if (this.isValid()) {
      if (
        this.lengthOne == this.lengthTwo && this.lengthOne == this.lengthThree
      ) {
        triangleType = "Equilateral Triangle";
      } else if (
        this.lengthOne == this.lengthTwo ||
        this.lengthTwo == this.lengthThree ||
        this.lengthThree == this.lengthOne
      ) {
        triangleType = "Isosceles Triangle";
      } else if (
        this.lengthOne ** 2 + this.lengthTwo ** 2 == this.lengthThree ** 2
      ) {
        triangleType = "Right Angle Triangle";
      } else {
        triangleType = "Scalene Triangle";
      }
    }

    return triangleType;
  }

  /** Finds the semiperimeter of the triangle */
  public semiPerimeter(): number {
    let semiPerimeter: number = -1;
    if (this.isValid()) {
      semiPerimeter = this.perimeter() / 2;
    }

    return semiPerimeter;
  }

  /** Finds the angle of the triangle, in radians */
  public angle(angleNumber: number): number {
    let angle: number = -1;
    if (this.isValid()) {
      switch (angleNumber) {
        case 1:
          angle = Math.acos(
            (this.lengthTwo ** 2 + this.lengthThree ** 2 -
              this.lengthOne ** 2) /
              (2 * this.lengthTwo * this.lengthThree),
          );
          break;
        case 2:
          angle = Math.acos(
            (this.lengthOne ** 2 + this.lengthThree ** 2 -
              this.lengthTwo ** 2) /
              (2 * this.lengthOne * this.lengthThree),
          );
          break;
        case 3:
          angle = Math.acos(
            (this.lengthOne ** 2 + this.lengthTwo ** 2 -
              this.lengthThree ** 2) /
              (2 * this.lengthOne * this.lengthTwo),
          );
          break;
      }
    }

    return angle;
  }

  /** Finds the height of the triangle */
  public height(sideNumber: number): number {
    let height: number = -1;
    if (this.isValid()) {
      switch (sideNumber) {
        case 1:
          height = (2 * this.area()) / this.lengthOne;
          break;
        case 2:
          height = (2 * this.area()) / this.lengthTwo;
          break;
        case 3:
          height = (2 * this.area()) / this.lengthThree;
          break;
      }
    }

    return height;
  }

  /** Finds the inner circle radius of the triangle */
  public innerCircleRadius(): number {
    let innerCircleRadius = -1;
    if (this.isValid()) {
      innerCircleRadius = this.area() / this.semiPerimeter();
    }

    return innerCircleRadius;
  }

  /** Finds the circumsicle of the triangle */
  public circumsicleRadius(): number {
    let circumsicle = -1;
    if (this.isValid()) {
      circumsicle = this.lengthOne / (2 * Math.sin(this.angle(1)));
    }

    return circumsicle;
  }
}
