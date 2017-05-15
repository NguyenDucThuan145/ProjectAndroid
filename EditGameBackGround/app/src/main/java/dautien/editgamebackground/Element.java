package dautien.editgamebackground;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import java.util.Random;

/**
 * Created by Thuan on 3/22/2017.
 */

public class Element {

    Bitmap bitmap;
    int mX;
    int mY;

    public Element(Resources resources, int x, int y){
        bitmap= BitmapFactory.decodeResource(resources, R.drawable.nhanvat);
        bitmap= Bitmap.createScaledBitmap(bitmap, 216, 162, true);
        mX= x - bitmap.getWidth() / 2;
        mY= y - bitmap.getHeight() / 2;
    }

    public Element(Resources resources, int x, int y, int idImage){
        bitmap= BitmapFactory.decodeResource(resources, idImage);
        mX= x - bitmap.getWidth() / 2;
        mY= y - bitmap.getHeight() / 2;
    }

    public void doDraw(Canvas canvas){
        canvas.drawBitmap(bitmap, mX, mY, null);
    }


}
