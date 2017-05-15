package dautien.editgamebackground;

/**
 * Created by Thuan on 4/2/2017.
 */

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import java.util.Random;

/**
 * Created by Thuan on 3/23/2017.
 */

public class Enemies {

    int x;
    int y;
    Bitmap bitmap;

    int [] vanToc= {10, 15, 25};
    int [] screen= {R.drawable.enemies1, R.drawable.enemies2, R.drawable.enemies3};
    int eRandom;

    public Enemies(Resources resources, int chieuRong, int chieuCao){
        Random random= new Random();
        eRandom= random.nextInt(3);
        this.x= chieuRong;
        int a= 0 + (int)(Math.random() * ((chieuCao - 0) + 1));
        this.y= a;
        bitmap= BitmapFactory.decodeResource(resources, screen[eRandom]);
        bitmap= Bitmap.createScaledBitmap(bitmap, 144, 108, true);
    }

    public Enemies(Resources resources, int x, int y, int image){
        this.x= x;
        this.y= y;
        bitmap= BitmapFactory.decodeResource(resources, image);
    }

    public void doDraw(Canvas canvas){
        canvas.drawBitmap(bitmap, x, y, null);
        x -= vanToc[eRandom];
    }

    public void setXY(int x, int y){
        this.x= x;
        this.y= y;
    }

    public int getWidth(){
        return bitmap.getWidth();
    }

    public int getHeight(){
        return bitmap.getHeight();
    }

    public int getTamX(){
        return (x + (bitmap.getWidth()/2));
    }

    public int getTamY(){
        return (y + (bitmap.getHeight()/2));
    }
}