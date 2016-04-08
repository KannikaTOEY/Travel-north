package ice_pbru.kongsud.kannika.travelnorth;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private Button AboutMeButton;
    private ListView travalnoth_listview;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget
        binWidget();
        buttonContoler();
        createListView();

    }//Main Method

    private void createListView() {
        final int[] intIcon = {R.drawable.d10, R.drawable.d13,  R.drawable.down2, R.drawable.d14, R.drawable.d17, R.drawable.d4, R.drawable.d12, R.drawable.d8,
                R.drawable.d9, R.drawable.d22, R.drawable.d3, R.drawable.d23, R.drawable.d7, R.drawable.d18, R.drawable.d11, R.drawable.d1,
                R.drawable.d21, R.drawable.d16, R.drawable.d19, R.drawable.d20, };
        final String[] titleStrings = new String[20];
        titleStrings[0] = "แม่แจ่ม";
        titleStrings[1] = "แม่กลางหลวง";
        titleStrings[2] = "ดอยเสมอดาว";
        titleStrings[3] = "ดอยผาตั้ง";
        titleStrings[4] = "วนอุทยานภูลังกา";
        titleStrings[5] = "ดอยหัวแม่คำ";
        titleStrings[6] = "ดอยแม่สลอง";
        titleStrings[7] = "ดอยวาวี";
        titleStrings[8] = "พระตำหนักดอยตุงและสวนแม่ฟ้าหลวง";
        titleStrings[9] = "สันป่าเกี๊ยะ";
        titleStrings[10] = "อุทยานแห่งชาติดอยผากลอง";
        titleStrings[11] = "อุทยานแห่งชาติน้ำตกแม่สุรินทร์";
        titleStrings[12] = "วัดพระธาตุดอยสุเทพราชวรวิหาร";
        titleStrings[13] = "วัดร่องขุ่น";
        titleStrings[14] = "วัดเจดีย์หลวงวรวิหาร";
        titleStrings[15] = "วัดสวนดอกวรมหาวิหาร";
        titleStrings[16] = "พิพิธภัณฑ์ 3 มิติ อาร์ต อิน พาราไดซ์ เชียงใหม่";
        titleStrings[17] = "เชียงใหม่พิพิธภัณฑ์แมลงและสิ่งมหัศจรรย์ธรรมชาติ";
        titleStrings[18] = "เชียงใหม่ ไนท์ ซาฟารี";
        titleStrings[19] = "ไร่สตรอเบอร์รี่วงศ์วาน เชียงใหม่";

        String[] detailStrings = getResources().getStringArray(R.array.detail_short);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        travalnoth_listview.setAdapter(myAdapter);

    }//create list view

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
        travalnoth_listview = (ListView) findViewById(R.id.listView);


    }//bind widget


}//Main Class
