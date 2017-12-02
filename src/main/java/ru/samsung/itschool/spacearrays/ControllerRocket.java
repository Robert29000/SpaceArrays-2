package ru.samsung.itschool.spacearrays;

/**
 * Created by student2 on 10.11.17.
 */

public class ControllerRocket extends Rcoket {
    private float toX,toY;


    ControllerRocket(float x, float y){
        super(x,y);
        setVx(0);
        setVy(0);
    }
    void setTarget(float toX,float toY){
        this.toX=toX;
        this.toY=toY;
        setVx(toX-getX());
        setVy(toY-getY());
        float d=(float)(Math.sqrt(getVx()*getVx()+getVy()*getVy()));
        setVx((getVx()/d)*5);
        setVy((getVy()/d)*5);
    }
    void move(){
        super.move();
    }
}
