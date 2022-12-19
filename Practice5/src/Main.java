import ru.mirea.kabanova.MovableCircle;
import ru.mirea.kabanova.MovablePoint;

import java.lang.*;
public class Main {
    public static void main(String[] args) {
        MovablePoint mpnt = new MovablePoint(1,-2,3,4);
        MovableCircle mcrc=new MovableCircle(5, mpnt);
        System.out.println(mcrc);
        if(mpnt.getySpeed() >=0) {
            mpnt.moveUp();
            mcrc.moveUp();
        }else if(mpnt.getySpeed() <=0) {
            mpnt.moveDown();
            mcrc.moveDown();
        }
        if(mpnt.getxSpeed() >=0) {
            mpnt.moveRight();
            mcrc.moveRight();
        }else if(mpnt.getySpeed() <=0) {
            mpnt.moveLeft();
            mcrc.moveLeft();
        }
    }
}