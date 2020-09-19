package cn.edu.whut.cst;

public class Text1_2 {
    public static void main(String[] args) throws InterruptedException {
        Circle aNewCircle=new Circle();
        //两次调用makeInvisible()方法后依然不会显示界面
//        aNewCircle.makeInvisible();
//        aNewCircle.makeInvisible();
        aNewCircle.makeVisible();
        //每调用一次moveDown()方法，圆形都会下降一定距离，调用越多，下降越多
        aNewCircle.moveDown();
        aNewCircle.moveDown();
        aNewCircle.moveDown();
        aNewCircle.moveDown();

    }

}
