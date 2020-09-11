package ru.mirea;

import ru.mirea.humanoid.Human;

public class Tester {

    public static void main(String[] args) {
	// write your code here
        // Practice 3

        //3.1
        Circle circle  = new Circle(10);
        circle.printCircle();


        Circle circle1 = new Circle(10, 15,20);
        circle1.printCircle();


        System.out.println();
        //3.2

        Human human = new Human();
        human.print();



    }
}
