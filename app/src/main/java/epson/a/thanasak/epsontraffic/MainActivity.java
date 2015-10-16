package epson.a.thanasak.epsontraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }// นี่คือ method หลัก

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMEButton = (Button) findViewById(R.id.button);


    }
}// นี่คือคลาสหลัก main class
