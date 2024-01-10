public class Picture
{
    private Square tealwall;
    private Square tealwall2;
    private Square tealwall3;
    private Square tealwall4;
    private Square tealwall5;
    private Square squareroof;
    private Square squareroof2;
    private Square squareroof3;
    private Square squareroof4;
    private Square squareroof5;
    private Square squareroof6;
    private Square chimney;
    private Square chimney2;
    private Square chimney3;
    private Square chimney4;
    private Square window;
    private Square floor;
    private Square grass;
    private Triangle roof;
    private Triangle roof2;
    private Triangle tealroof;
    private Triangle brownroof;
    private Triangle brownroof2;
    private Triangle whiteroof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        tealwall = new Square();
        tealwall2 = new Square();
        tealwall3 = new Square();
        tealwall4 = new Square();
        tealwall5 = new Square();
        squareroof = new Square();
        squareroof2 = new Square();
        squareroof3 = new Square();
        squareroof4 = new Square();
        squareroof5 = new Square();
        squareroof6 = new Square();
        chimney = new Square();
        chimney2 = new Square();
        chimney3 = new Square();
        chimney4 = new Square();
        floor = new Square();
        grass = new Square();
        window = new Square();
        roof = new Triangle();
        roof2 = new Triangle();
        tealroof = new Triangle();
        brownroof = new Triangle();
        brownroof2 = new Triangle();
        whiteroof = new Triangle();
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
            grass.changeColor("green");
            grass.moveHorizontal(450);
            grass.moveVertical(460);
            grass.changeSize(400);
            grass.makeVisible();
            floor.changeColor("gray");
            floor.moveHorizontal(-30);
            floor.moveVertical(300);
            floor.changeSize(480);
            floor.makeVisible();
            chimney.changeColor("maroon");
            chimney.moveHorizontal(-30);
            chimney.moveVertical(7);
            chimney.changeSize(93);
            chimney.makeVisible();
            chimney2.changeColor("maroon");
            chimney2.moveHorizontal(-30);
            chimney2.moveVertical(100);
            chimney2.changeSize(100);
            chimney2.makeVisible();
            chimney3.changeColor("maroon");
            chimney3.moveHorizontal(-30);
            chimney3.moveVertical(200);
            chimney3.changeSize(100);
            chimney3.makeVisible();
            chimney4.changeColor("maroon");
            chimney4.moveHorizontal(-30);
            chimney4.moveVertical(290);
            chimney4.changeSize(100);
            chimney4.makeVisible();
            squareroof.changeColor("brown");
            squareroof.moveHorizontal(630);
            squareroof.moveVertical(191);
            squareroof.changeSize(140);
            squareroof.makeVisible();
            squareroof2.changeColor("brown");
            squareroof2.moveHorizontal(511);
            squareroof2.moveVertical(191);
            squareroof2.changeSize(140);
            squareroof2.makeVisible();
            tealwall.changeColor("teal");
            tealwall.moveHorizontal(420);
            tealwall.moveVertical(250);
            tealwall.changeSize(210);
            tealwall.makeVisible();
            tealwall2.changeColor("teal");
            tealwall2.moveHorizontal(560);
            tealwall2.moveVertical(250);
            tealwall2.changeSize(210);
            tealwall2.makeVisible();
            tealwall3.changeColor("teal");
            tealwall3.moveHorizontal(280);
            tealwall3.moveVertical(250);
            tealwall3.changeSize(140);
            tealwall3.makeVisible();
            tealwall4.changeColor("teal");
            tealwall4.moveHorizontal(170);
            tealwall4.moveVertical(250);
            tealwall4.changeSize(140);
            tealwall4.makeVisible();
            tealwall5.changeColor("teal");
            tealwall5.moveHorizontal(50);
            tealwall5.moveVertical(250);
            tealwall5.changeSize(140);
            tealwall5.makeVisible();



            //window.changeColor("black");
            //window.moveHorizontal(-120);
            //window.moveVertical(40);
            //window.changeSize(40);
            //window.makeVisible();

            roof.changeColor("brown");
            roof.changeSize(60, 60);
            roof.moveHorizontal(870);
            roof.moveVertical(170);
            roof.makeVisible();
            roof2.changeColor("brown");
            roof2.changeSize(60, 60);
            roof2.moveHorizontal(610);
            roof2.moveVertical(170);
            roof2.makeVisible();
            brownroof.changeColor("brown");
            brownroof.changeSize(80, 264);
            brownroof.moveHorizontal(740);
            brownroof.moveVertical(92);
            brownroof.makeVisible();
            brownroof2.changeColor("brown");
            brownroof2.changeSize(200, 98);
            brownroof2.moveHorizontal(850);
            brownroof2.moveVertical(30);
            brownroof2.makeVisible();
            squareroof3.changeColor("brown");
            squareroof3.moveHorizontal(551);
            squareroof3.moveVertical(51);
            squareroof3.changeSize(199);
            squareroof3.makeVisible();
            squareroof4.changeColor("brown");
            squareroof4.moveHorizontal(355);
            squareroof4.moveVertical(51);
            squareroof4.changeSize(199);
            squareroof4.makeVisible();
            squareroof5.changeColor("brown");
            squareroof5.moveHorizontal(160);
            squareroof5.moveVertical(51);
            squareroof5.changeSize(199);
            squareroof5.makeVisible();
            squareroof6.changeColor("brown");
            squareroof6.moveHorizontal(0);
            squareroof6.moveVertical(51);
            squareroof6.changeSize(199);
            squareroof6.makeVisible();
            whiteroof.changeColor("white");
            whiteroof.changeSize(100, 300);
            whiteroof.moveHorizontal(710);
            whiteroof.moveVertical(100);
            whiteroof.makeVisible();
            tealroof.changeColor("teal");
            tealroof.changeSize(75, 240);
            tealroof.moveHorizontal(710);
            tealroof.moveVertical(115);
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
