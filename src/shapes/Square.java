package shapes;

import interfaces.Shape;

import java.util.Scanner;

public class Square  implements Shape{


    @Override
    public double getArea()
    {
        double length = this.getUserInput();

        double area = length * length;

        System.out.println("Area of the square is : " + area);

        return area;
    }

    public double getUserInput()
    {
        System.out.println("ENTER THE SIDE OF THE SQUARE HERE: " );

        Scanner input = new Scanner(System.in);

        double userInput = input.nextDouble();

        System.out.println("USER INPUT IS : " + userInput);

        return userInput;

    }
}
