package cn.edu.whut.cst.Homework_01;

import cn.edu.whut.cst.Homework_01.Circle;
import cn.edu.whut.cst.Homework_01.Square;

public class Text1_1 {
    public static void main(String[] args)  {
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
