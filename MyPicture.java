
/**
 * Write a description of class MyPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPicture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Triangle roof;
    //private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        // initialise instance variables
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        //sun = new Circle();
        drawn = false;
    }

     /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
             roof.changeSize(60, 180);
             roof.moveHorizontal(20);
             roof.moveVertical(-60);
             roof.changeColor("magenta");
             roof.makeVisible();
    
            // sun.changeColor("yellow");
            // sun.moveHorizontal(100);
            // sun.moveVertical(-40);
            // sun.changeSize(80);
            // sun.makeVisible();
            drawn = true;
        }
    }
}
