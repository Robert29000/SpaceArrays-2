package ru.samsung.itschool.spacearrays;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by student2 on 06.11.17.
 */

public class imageManager {
    final static int MAX=100;
    static int[] id=new int[MAX];
    static Bitmap[] pic=new Bitmap[MAX];
    static int n=0;
    static Resources resources;
    static Bitmap get(int picid){
        for(int i=0;i<n;i++){
            if(id[i]==picid)
                return pic[i];
        }
        id[n]=picid;
        pic[n]= BitmapFactory.decodeResource(resources, picid);
        //n++;
        return pic[n++];
    }
}
