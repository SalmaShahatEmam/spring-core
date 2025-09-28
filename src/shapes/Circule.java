package shapes;

import interfaces.Shape;

import java.util.Scanner;

public class Circule implements Shape {


    @Override
    public double getArea()
    {
        double radius = this.getUserInput();

        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle is : " + area);

        return area;
    }


    @Override
    public double getUserInput()
    {
        System.out.println("ENTER THE RADUS OF THE CIRCULE HERE: " );

        Scanner input = new Scanner(System.in);

        double userInput = input.nextDouble();

        System.out.println("USER INPUT IS : " + userInput);

        return userInput;
    }
}
