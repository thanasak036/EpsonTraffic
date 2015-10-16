package epson.a.thanasak.epsontraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // ประกาศตัวแปร explicit
    private ListView trafficListView;
    private Button aboutMEButton;

    // จาน
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bind widget

        bindWidget();   //Thai is Method

        //button controller
        buttonController();


    }// นี่คือ method หลัก

    private void buttonController() {


        aboutMEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //sound
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.dog);
                buttonMediaPlayer.start();

                //intent to webView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/DBmUc-sKcgg"));
                startActivity(objIntent);
            }// event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMEButton = (Button) findViewById(R.id.button);


    }
}// นี่คือคลาสหลัก main class
