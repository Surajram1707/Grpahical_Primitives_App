package com.example.surajgraphical;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @RequiresApi(api= Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg = Bitmap.createBitmap(720,1280, Bitmap.Config.ARGB_8888);
        ImageView i =(ImageView)findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas=new Canvas(bg);

        Paint paint1 = new Paint();
        paint1.setColor(Color.BLUE);
        paint1.setTextSize(50);

        Paint paint2 = new Paint();
        paint2.setColor(Color.BLACK);
        paint2.setTextSize(50);

        Paint paint3 = new Paint();
        paint2.setColor(Color.MAGENTA);
        paint3.setTextSize(50);

        Paint paint4 = new Paint();
        paint4.setColor(Color.GREEN);
        paint4.setTextSize(50);

        canvas.drawText("Cube",200,130,paint2);
        canvas.drawRect(150,150,300,300,paint1);
        canvas.drawRect(75,225,225,375,paint1);
        canvas.drawLine(150,150,75,225,paint2);
        canvas.drawLine(300,300,225,375,paint2);

        canvas.drawText("Circle",360,406,paint3);
        canvas.drawCircle(369,476,50,paint3);

        canvas.drawText("Square",500,430,paint4);
        canvas.drawRect(650,650,500,500,paint4);

    }
}