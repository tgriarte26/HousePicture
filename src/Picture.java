public class Picture
{
    private Square tealwall;
    private Square tealwall2;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        tealwall = new Square();
        tealwall2 = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {

            tealwall.changeColor("teal");
            tealwall.moveHorizontal(280);
            tealwall.moveVertical(250);
            tealwall.changeSize(160);
            tealwall.makeVisible();
            tealwall2.changeColor("teal");
            tealwall2.moveHorizontal(440);
            tealwall2.moveVertical(250);
            tealwall2.changeSize(160);
            tealwall2.makeVisible();


            //window.changeColor("black");
            //window.moveHorizontal(-120);
            //window.moveVertical(40);
            //window.changeSize(40);
            //window.makeVisible();

            //roof.changeSize(60, 180);
            //roof.moveHorizontal(20);
            //roof.moveVertical(-100);
            //roof.makeVisible();

            //sun.changeColor("yellow");
            //sun.moveHorizontal(100);
            //sun.moveVertical(-40);
            //sun.changeSize(80);
            //sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        tealwall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        tealwall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
