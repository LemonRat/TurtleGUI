package com.example.admin.turtlegui;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TurtleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtle);
    }

    public void chooseTurtle(View view) {
        ImageButton turtleImgBtn =(ImageButton) findViewById(R.id.turtleImageBtn);

        int turtleImageResID = 0;
        if(view.getId() == R.id.donTurtle)
        {
           turtleImageResID = R.drawable.tmntdon;
        }
        else if (view.getId() == R.id.leoTurtle)
        {
            turtleImageResID = R.drawable.tmntleo;
        }
        else if(view.getId() == R.id.mikeTurtle)
        {
            turtleImageResID = R.drawable.tmntmike;
        }
        else if(view.getId() == R.id.raphTurtle)
        {
            turtleImageResID = R.drawable.tmntraph;
        }
        turtleImgBtn.setImageResource(turtleImageResID);
    }
}
