package ru.samsung.itschool.spacearrays;

/**
 * Created by student2 on 10.11.17.
 */

public class ControllerRocket extends Rcoket {
    private float toX,toY;
    ControllerRocket(float x,float y){
        super(x,y);
        toX=this.x;
        toY=this.y;
    }
   public  void setTarget(float toX,float toY){
        this.toX=toX;
        this.toY=toY;
        setVx(this.toX-this.getX());
        this.vy=this.toY-this.y;
        float d=(float)Math.sqrt(vx*vx+vy*vy);
        this.vx=(this.vx/d)*5;
        this.vy=(this.vy/d)*5;
    }
    ControllerRocket(){
        super();
    }
    void move(){
        if(((toX-x)*(toX-x)+(toY-y)*(toY-y))<3){
            return;
        }
        super.move();
    }
}
