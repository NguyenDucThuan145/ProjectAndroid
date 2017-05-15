package dautien.gameversion4.BulletClass;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import dautien.gameversion4.R;

public class FireForDragon {
    int x;
    public int y;
    Bitmap bitmap;
    private int vanToc = 5;

    public FireForDragon(Resources resources, int x, int y){
        this.x = x;
        this.y = y;
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.fireballfordragon);
        bitmap = Bitmap.createScaledBitmap(bitmap, 50, 100, true);
    }

    public FireForDragon (Resources resources, int x, int y, int image){
        this.x= x;
        this.y= y;
        bitmap= BitmapFactory.decodeResource(resources, image);
        bitmap= Bitmap.createScaledBitmap(bitmap, 50, 100, true);
    }

    public void doDraw(Canvas canvas, int speedBackGround){
        canvas.drawBitmap(bitmap, x, y, null);
        y += vanToc;
        x -= speedBackGround;
    }

    public void setVanToc(int vanToc){
        this.vanToc= vanToc;
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
