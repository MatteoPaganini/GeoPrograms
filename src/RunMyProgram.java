

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;
//change
        run = (new B3_HalfTheRed() );
        run.planeIcon = "plane.png";
        run.pictureFileName="Winnie.jpeg";
        run.HEIGHT=800;
        run.WIDTH=1000;
        run.Refresh();

        //new Thread(run).start();
    }
}
