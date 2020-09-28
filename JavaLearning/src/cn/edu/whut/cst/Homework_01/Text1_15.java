package cn.edu.whut.cst.Homework_01;

public class Text1_15
{
    private Square wall;
    private Square window;
    private Triangle roof;

    public void setRoof(Triangle roof) {
        this.roof = roof;
    }

    public void setWindow(Square window) {
        this.window = window;
    }

    public void setWall(Square wall) {
        this.wall = wall;
    }

    public void setSun(Circle sun) {
        this.sun = sun;
    }

    private Circle sun;

    /*
     * Constructor for objects of class Picture
     */
    public Text1_15()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /*
     * Draw this picture.
     */

    public void draw() {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        sun.slowMoveVertical(100);




//        for (int i = 0; i < 100; i++) {
//            Thread.sleep(100);
//            sun.slowMoveVertical(1);
//            sun.slowMoveHorizontal(1);
//        }


    }

    /*
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /*
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Text1_15 picture = new Text1_15();
        picture.draw();
    }

}
