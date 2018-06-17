package briansapps.dadsapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int imageLocation = 0;
    boolean firstPlay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Change Pictures Left Button
    public void previousImage(View v){
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView);

        int[] images = {R.drawable.image0, R.drawable.image1, R.drawable.image2, R.drawable.image3};

        if(imageLocation == 3){
            imageView1.setImageResource(images[2]);
            imageLocation--;
        }else if(imageLocation == 2){
            imageView1.setImageResource(images[1]);
            imageLocation--;
        }else if(imageLocation == 1){
            imageView1.setImageResource(images[0]);
            imageLocation--;
        }


    }

    //Change Pictures Right Button
    public void nextImage(View v){
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView);

        int[] images = {R.drawable.image0, R.drawable.image1, R.drawable.image2, R.drawable.image3};

        if(imageLocation == 0){
            imageView1.setImageResource(images[1]);
            imageLocation++;
        }else if(imageLocation == 1){
            imageView1.setImageResource(images[2]);
            imageLocation++;
        }else if(imageLocation == 2) {
            imageView1.setImageResource(images[3]);
            imageLocation++;
        }
    }

    //Fathers Day Button
    public void sendFathersDayMessage(View v){

        if(firstPlay == true){
            MediaPlayer hfdayMP = MediaPlayer.create(this, R.raw.hfday);
            hfdayMP.start();
            firstPlay = false;
        }else {
            Random rSound = new Random();
            int rNumber;

            rNumber = rSound.nextInt(3);

            switch(rNumber){
                case 0:
                    MediaPlayer s1MP = MediaPlayer.create(this, R.raw.s1  );
                    s1MP.start();
                    break;

                case 1:
                    MediaPlayer s2MP = MediaPlayer.create(this, R.raw.s2 );
                    s2MP.start();
                    break;

                case 2:
                    MediaPlayer s3MP = MediaPlayer.create(this, R.raw.s3);
                    s3MP.start();
                    break;

                default:
                    MediaPlayer hfdayMP = MediaPlayer.create(this, R.raw.hfday);
                    hfdayMP.start();
                    break;
            }
        }

    }
}
