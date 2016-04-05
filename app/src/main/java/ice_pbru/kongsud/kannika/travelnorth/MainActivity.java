package ice_pbru.kongsud.kannika.travelnorth;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private Button AboutMeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //bind widget
        binWidget();
        buttonContoler();


    }//Main Method

    private void buttonContoler() {
      AboutMeButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(Intent.ACTION_VIEW);
              intent.setData(Uri.parse("https://narmtoey.wordpress.com/2014/05/21/%E0%B8%9B%E0%B8%A3%E0%B8%B0%E0%B8%A7%E0%B8%B1%E0%B8%95%E0%B8%B4%E0%B8%AA%E0%B9%88%E0%B8%A7%E0%B8%99%E0%B8%95%E0%B8%B1%E0%B8%A7/"));
              startActivity(intent);

          }
      });

    }//button controller

    private void binWidget() {
        AboutMeButton = (Button) findViewById(R.id.button);


    }//bind widget


}//Main Class
