public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;
    side1 = 5;
    side2 = 10;
    hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

    System.out.println("The hypotenuse of a triangle with sides:");
    System.out.println(side1);
    System.out.println(side2);
    System.out.println("is " + hypotenuse);
  }
}
