package dautien.editgamebackground;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

/**
 * Created by Thuan on 4/4/2017.
 */

public class Explosion  {

    int mX;
    int mY;
    Bitmap bitmap;

    public Explosion(Resources resources, int x, int y){
        this.mX= x;
        this.mY= y;
        bitmap= BitmapFactory.decodeResource(resources, R.drawable.explosion);
        bitmap= bitmap.createScaledBitmap(bitmap, 288, 216, true);
    }

    public void doDraw(Canvas canvas){
        canvas.drawBitmap(bitmap, mX, mY, null);
    }
}
