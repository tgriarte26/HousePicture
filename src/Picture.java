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
    private Square squareroof7;
    private Square chimney;
    private Square chimney2;
    private Square chimney3;
    private Square chimney4;
    private Square chimney5;
    private Square window;
    private Square window2;
    private Square tealwindow;
    private Square tealwindow2;
    private Square floor;
    private Square grass;
    private Square door;
    private Triangle roof;
    private Triangle roof2;
    private Triangle tealroof;
    private Triangle brownroof;
    private Triangle brownroof2;
    private Triangle brownroof3;
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
        squareroof7 = new Square();
        chimney = new Square();
        chimney2 = new Square();
        chimney3 = new Square();
        chimney4 = new Square();
        chimney5 = new Square();
        floor = new Square();
        grass = new Square();
        door = new Square();
        window = new Square();
        window2 = new Square();
        tealwindow = new Square();
        tealwindow2 = new Square();
        roof = new Triangle();
        roof2 = new Triangle();
        tealroof = new Triangle();
        brownroof = new Triangle();
        brownroof2 = new Triangle();
        brownroof3 = new Triangle();
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
            floor.changeColor("gray");
            floor.moveHorizontal(-80);
            floor.moveVertical(300);
            floor.changeSize(530);
            floor.makeVisible();
            grass.changeColor("green");
            grass.moveHorizontal(385);
            grass.moveVertical(460);
            grass.changeSize(390);
            grass.makeVisible();
            chimney.changeColor("maroon");
            chimney.moveHorizontal(-110);
            chimney.moveVertical(7);
            chimney.changeSize(93);
            chimney.makeVisible();
            chimney2.changeColor("maroon");
            chimney2.moveHorizontal(-110);
            chimney2.moveVertical(100);
            chimney2.changeSize(100);
            chimney2.makeVisible();
            chimney3.changeColor("maroon");
            chimney3.moveHorizontal(-110);
            chimney3.moveVertical(200);
            chimney3.changeSize(100);
            chimney3.makeVisible();
            chimney4.changeColor("maroon");
            chimney4.moveHorizontal(-110);
            chimney4.moveVertical(290);
            chimney4.changeSize(100);
            chimney4.makeVisible();
            chimney5.changeColor("maroon");
            chimney5.moveHorizontal(-110);
            chimney5.moveVertical(330);
            chimney5.changeSize(100);
            chimney5.makeVisible();
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
            tealwall.moveHorizontal(385);
            tealwall.moveVertical(250);
            tealwall.changeSize(290);
            tealwall.makeVisible();
            tealwall2.changeColor("teal");
            tealwall2.moveHorizontal(485);
            tealwall2.moveVertical(250);
            tealwall2.changeSize(290);
            tealwall2.makeVisible();
            tealwall3.changeColor("teal");
            tealwall3.moveHorizontal(260);
            tealwall3.moveVertical(240);
            tealwall3.changeSize(190);
            tealwall3.makeVisible();
            tealwall4.changeColor("teal");
            tealwall4.moveHorizontal(100);
            tealwall4.moveVertical(240);
            tealwall4.changeSize(190);
            tealwall4.makeVisible();
            tealwall5.changeColor("teal");
            tealwall5.moveHorizontal(-70);
            tealwall5.moveVertical(240);
            tealwall5.changeSize(190);
            tealwall5.makeVisible();
            door.changeColor("white");
            door.moveHorizontal(180);
            door.moveVertical(280);
            door.changeSize(60);
            door.makeVisible();

            window.changeColor("white");
            window.moveHorizontal(-10);
            window.moveVertical(280);
            window.changeSize(70);
            window.makeVisible();
            window2.changeColor("white");
            window2.moveHorizontal(60);
            window2.moveVertical(280);
            window2.changeSize(70);
            window2.makeVisible();
            tealwindow.changeColor("teal2");
            tealwindow.moveHorizontal(65);
            tealwindow.moveVertical(290);
            tealwindow.changeSize(50);
            tealwindow.makeVisible();
            tealwindow2.changeColor("teal2");
            tealwindow2.moveHorizontal(5);
            tealwindow2.moveVertical(290);
            tealwindow2.changeSize(50);
            tealwindow2.makeVisible();

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
            brownroof3.changeColor("brown");
            brownroof3.changeSize(200, 98);
            brownroof3.moveHorizontal(50);
            brownroof3.moveVertical(30);
            brownroof3.makeVisible();
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
            squareroof6.moveHorizontal(-35);
            squareroof6.moveVertical(51);
            squareroof6.changeSize(199);
            squareroof6.makeVisible();
            squareroof7.changeColor("brown");
            squareroof7.moveHorizontal(-50);
            squareroof7.moveVertical(51);
            squareroof7.changeSize(199);
            squareroof7.makeVisible();
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
