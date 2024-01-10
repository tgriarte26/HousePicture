public class Picture
{
    private Square tealwall;
    private Square tealwall2;
    private Square squareroof;
    private Square squareroof2;
    private Square squareroof3;
    private Square squareroof4;
    private Square squareroof5;
    private Square window;
    private Triangle roof;
    private Triangle roof2;
    private Triangle tealroof;
    private Triangle brownroof;
    private Triangle brownroof2;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        tealwall = new Square();
        tealwall2 = new Square();
        squareroof = new Square();
        squareroof2 = new Square();
        squareroof3 = new Square();
        squareroof4 = new Square();
        squareroof5 = new Square();
        window = new Square();
        roof = new Triangle();
        roof2 = new Triangle();
        tealroof = new Triangle();
        brownroof = new Triangle();
        brownroof2 = new Triangle();
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
            squareroof.changeColor("brown");
            squareroof.moveHorizontal(430);
            squareroof.moveVertical(191);
            squareroof.changeSize(140);
            squareroof.makeVisible();
            squareroof2.changeColor("brown");
            squareroof2.moveHorizontal(311);
            squareroof2.moveVertical(191);
            squareroof2.changeSize(140);
            squareroof2.makeVisible();
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

            roof.changeColor("brown");
            roof.changeSize(60, 60);
            roof.moveHorizontal(670);
            roof.moveVertical(170);
            roof.makeVisible();
            roof2.changeColor("brown");
            roof2.changeSize(60, 60);
            roof2.moveHorizontal(410);
            roof2.moveVertical(170);
            roof2.makeVisible();
            brownroof.changeColor("brown");
            brownroof.changeSize(80, 264);
            brownroof.moveHorizontal(540);
            brownroof.moveVertical(92);
            brownroof.makeVisible();
            brownroof2.changeColor("brown");
            brownroof2.changeSize(200, 98);
            brownroof2.moveHorizontal(650);
            brownroof2.moveVertical(30);
            brownroof2.makeVisible();
            squareroof3.changeColor("brown");
            squareroof3.moveHorizontal(351);
            squareroof3.moveVertical(51);
            squareroof3.changeSize(199);
            squareroof3.makeVisible();
            squareroof4.changeColor("brown");
            squareroof4.moveHorizontal(155);
            squareroof4.moveVertical(51);
            squareroof4.changeSize(199);
            squareroof4.makeVisible();
            squareroof5.changeColor("brown");
            squareroof5.moveHorizontal(-40);
            squareroof5.moveVertical(51);
            squareroof5.changeSize(199);
            squareroof5.makeVisible();
            tealroof.changeColor("teal");
            tealroof.changeSize(60, 200);
            tealroof.moveHorizontal(540);
            tealroof.moveVertical(111);
            tealroof.makeVisible();



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
