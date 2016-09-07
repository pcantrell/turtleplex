package edu.macalester.cs124;

import java.awt.Color;

import edu.macalester.turtle.Turtle;
import edu.macalester.turtle.TurtleProgram;

public class TurtleExercise extends TurtleProgram {

    public static void main(String... args) {
        new TurtleExercise();
    }

    public void run() {
        
        setTurtleSpeedFactor(1000);
        
        Turtle sally = new Turtle(300, 300, Color.MAGENTA);
        add(sally);
        
        Turtle fred = new Turtle(300, 400, Color.GREEN);
        this.add(fred);
        
//        sally = fred;
        
        sally.forward(2);
        sally.left(90);
        fred.forward(2.5);
        sally.forward(3);
        sally.left(45);
        sally.setColor(Color.BLUE);
        fred.backward(0.5);
        fred.right(120);
        sally.forward(Math.sqrt(8));
        sally.left(90);
        fred.forward(2.5);
        sally.forward(Math.sqrt(8));
        sally.setColor(Color.MAGENTA);
        fred.backward(0.5);
        sally.left(45);
        sally.forward(3);
        fred.right(120);
        fred.forward(2.5);
        fred.penUp();
        fred.forward(1);
        fred.penDown();
        sally.left(90);
        sally.forward(2);
    }
}
