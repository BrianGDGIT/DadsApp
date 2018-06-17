package briansapps.dadsapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Change Pictures Left Button
    public void previousImage(View previousImage){
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView);

        if(imageView1.getDrawable().equals(R.drawable.image1)){
            imageView1.setImageResource(R.drawable.image0);
        }else if(imageView1.getDrawable().equals(R.drawable.image2)){
            imageView1.setImageResource(R.drawable.image1);
        }

    }

    //Fathers Day Button
    public void sendFathersDayMessage(View fathersDay){
        MediaPlayer hfdayMP = MediaPlayer.create(this, R.raw.hfday);
        hfdayMP.start();
    }
}
