public class Tank {

    int x = 0;
    int y = 0;
    int dir = 0;
    int fuel = 100;

    public void goForward(int i) {
        if (fuel < Math.abs(i)) {
            i = i < 0 ? -fuel : fuel;
        }

        if (dir == 0) {
            x += i;
        } else if (dir == -1) {
            y -= i;
        } else if (dir == 1) {
            x += i;
        } else {
            y -= i;
        }

        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -2) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 3) dir = -2;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }
    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
    }
    public Tank() {
        this.x = 0;
        this.y = 0;
        this.fuel = 100;
    }
}