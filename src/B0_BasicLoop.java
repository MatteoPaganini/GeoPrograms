public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        gridOfSmallSquares();
    }

    public void gridOfSmallSquares(){
        plane.trailWidth=1;
        plane.pausetime = 0;
        for(int x=0;x<1000;x=x+10) {
            int y;
            for (y = 0; y < 800; y = y + 10) {
                System.out.println("x: " + x + ", y: " + y);
                plane.teleport(x, y);
                plane.square(10);
                plane.setColor(x*1/4, 100, x*1/6);
            }
            //add a line of code to teleport to an x,y coordinate
            //add a line of code to draw a square


        }

    }

}

