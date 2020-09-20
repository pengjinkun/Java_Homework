package cn.edu.whut.cst;

import java.awt.*;

public class Text1_1 {
    public static void main(String[] args) throws InterruptedException {
//        Picture pic = new Picture();
        Circle aNewCircle=new Circle();
        aNewCircle.makeVisible();
        aNewCircle.changeSize(60);
        aNewCircle.moveHorizontal(100);
        Square aNewSquare=new Square();
        aNewSquare.makeVisible();
        aNewCircle.changeColor("red");
        aNewSquare.changeColor("blue");
//        pic.draw();
    }
}
