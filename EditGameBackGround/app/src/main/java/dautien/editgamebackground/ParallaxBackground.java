package dautien.editgamebackground;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.content.Context;
import android.view.SurfaceHolder;

/**
 * Created by Thuan on 3/20/2017.
 */

public class ParallaxBackground {

    private int toaDoNen1_X= 0;
    private int toaDoNen2_Y= 0;
    private Bitmap hinhNen1;
    private Bitmap hinhNen2;

    public ParallaxBackground(Resources r){
        hinhNen1= BitmapFactory.decodeResource(r, R.drawable.image018);
        hinhNen1= Bitmap.createScaledBitmap(hinhNen1, 1440, 1080, true);
        hinhNen2= BitmapFactory.decodeResource(r, R.drawable.image020);
        hinhNen2= Bitmap.createScaledBitmap(hinhNen2, 1440, 1080, true);
    }

    public void doDrawRunning(Canvas canvas){

        toaDoNen1_X= toaDoNen1_X - 1;
        toaDoNen2_Y= toaDoNen2_Y - 4;

        int toaDoNen1_phu_X= hinhNen1.getWidth() - (-toaDoNen1_X);

        if(toaDoNen1_phu_X <= 0){
            toaDoNen1_X= 0;
            canvas.drawBitmap(hinhNen1, 0, 0, null);
        }
        else {
            canvas.drawBitmap(hinhNen1, toaDoNen1_X, 0, null);
            canvas.drawBitmap(hinhNen1, toaDoNen1_phu_X, 0, null);
        }

        int toaDoNen2_phu_X= hinhNen2.getWidth() - (-toaDoNen2_Y);

        if (toaDoNen2_phu_X <= 0){
            toaDoNen2_Y= 0;
            canvas.drawBitmap(hinhNen2, toaDoNen2_Y, 0, null);
        }
        else {
            canvas.drawBitmap(hinhNen2, toaDoNen2_Y, 0, null);
            canvas.drawBitmap(hinhNen2, toaDoNen2_phu_X, 0, null);
        }
    }
}
