

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(200, 0, 0);
        plane.move(100);

        plane.startingAngle(-45);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(45);
        plane.setColor(200, 0, 0);
        plane.move(100);

        plane.startingAngle(180);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(200, 0, 0);
        plane.move(140);

        plane.startingAngle(90);
        plane.isTrail = false;
        plane.trailWidth = 5;
        plane.setColor(0, 0, 0);
        plane.move(300);

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(0, 0, 200);
        plane.move(100);
        plane.turn(60);
        plane.setColor(0, 0, 200);
        plane.move(100);
        plane.turn(60);
        plane.setColor(0, 0, 200);
        plane.move(100);
        plane.turn(60);
        plane.setColor(0, 0, 200);
        plane.move(100);
        plane.turn(60);
        plane.setColor(0, 0, 200);
        plane.move(100);
        plane.turn(60);
        plane.setColor(0, 0, 200);
        plane.move(100);
        plane.turn(60);

        plane.startingAngle(-40);
        plane.isTrail = false;
        plane.trailWidth = 5;
        plane.move(500);

        plane.startingAngle(-40);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(120);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(120);
        plane.setColor(0, 200, 0);
        plane.move(100);


        plane.isTrail = false;
        plane.turn(0);
        plane.move(100);





    }


}
