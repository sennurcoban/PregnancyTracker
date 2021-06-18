package com.example.pregnancytracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class PregnanDetailActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    private Integer day;
    private Integer week;
    private Integer totalDay;
    private ImageView menuBtn;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        day = getIntent().getIntExtra("selectedDay", 0);
        week = getIntent().getIntExtra("selectedWeek", 0);
        totalDay = day + (week * 7);
        setContentView(R.layout.activity_pregnant_detail);
        setPageResources();
        setListener();

    }

    private void setListener() {
        menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(view -> {
            goWeekList();
        });
    }


    private void setPageResources() {
        TextView headerText = findViewById(R.id.headerTxt);
        TextView sizeInfoText = findViewById(R.id.babySizeInfoTxt);
        TextView infoDetailText = findViewById(R.id.infoDetailTxt);
        ImageView babyImg = findViewById(R.id.babyImg);

        switch (week) {
            case 1:
                headerText.setText("1.hafta");
                sizeInfoText.setText("1.hafta boyutu: Toz Tarçın");
                infoDetailText.setText(getText(R.string.first_half));
                babyImg.setImageResource(R.drawable.ilkhafta);
                break;
            case 2:
                headerText.setText("2.hafta");
                sizeInfoText.setText("2.hafta boyutu:Haşhaş Tohumu");
                infoDetailText.setText(getText(R.string.ikinci_hafta));
                babyImg.setImageResource(R.drawable.ikincihafta);
                break;
            case 3:
                headerText.setText("3.hafta");
                sizeInfoText.setText("3.hafta boyutu: Haşhaş Tohumu");
                infoDetailText.setText(getText(R.string.ucuncu_hafta));
                babyImg.setImageResource(R.drawable.ucuncu);
                break;
            case 4:
                headerText.setText("4.hafta");
                sizeInfoText.setText("4.hafta boyutu:Susam Tohumu");
                infoDetailText.setText(getText(R.string.dorduncu_hafta));
                babyImg.setImageResource(R.drawable.dort);
                break;
            case 5:
                headerText.setText("5.hafta");
                sizeInfoText.setText("5.hafta boyutu: Pirinç");
                infoDetailText.setText(getText(R.string.besinci_hafta));
                babyImg.setImageResource(R.drawable.bes);
                break;
            case 6:
                headerText.setText("6.hafta");
                sizeInfoText.setText("6.hafta boyutu: Yabanmersini");
                infoDetailText.setText(getText(R.string.altinci_hafta));
                babyImg.setImageResource(R.drawable.alti);
                break;
            case 7:
                headerText.setText("7.hafta");
                sizeInfoText.setText("7.hafta boyutu: Ahududu");
                infoDetailText.setText(getText(R.string.yedinci_hafta));
                babyImg.setImageResource(R.drawable.yedinci);
                break;
            case 8:
                headerText.setText("8.hafta");
                sizeInfoText.setText("8.hafta boyutu: Üzüm");
                infoDetailText.setText(getText(R.string.sekizinci_hafta));
                babyImg.setImageResource(R.drawable.sekiz);
                break;
            case 9:
                headerText.setText("9.hafta");
                sizeInfoText.setText("9.hafta boyutu: Hurma");
                infoDetailText.setText(getText(R.string.dokuzuncu_hafta));
                babyImg.setImageResource(R.drawable.dokuz);
                break;
            case 10:
                headerText.setText("10.hafta");
                sizeInfoText.setText("10.hafta boyutu:");
                infoDetailText.setText(getText(R.string.onuncu_hafta));
                babyImg.setImageResource(R.drawable.on);
                break;
            case 11:
                headerText.setText("11.hafta");
                sizeInfoText.setText("11.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.onbirinci_hafta));
                babyImg.setImageResource(R.drawable.onbir);
                break;
            case 12:
                headerText.setText("12.hafta");
                sizeInfoText.setText("12.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.onikinci_hafta));
                babyImg.setImageResource(R.drawable.oniki);
                break;
            case 13:
                headerText.setText("13.hafta");
                sizeInfoText.setText("13-14.hafta boyutu:");
                infoDetailText.setText(getText(R.string.onucondort_hafta));
                babyImg.setImageResource(R.drawable.onuc);
                break;
            case 14:
                headerText.setText("14.hafta");
                sizeInfoText.setText("13-14.hafta boyutu:");
                infoDetailText.setText(getText(R.string.onucondort_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;
            case 15:
                headerText.setText("15.hafta");
                sizeInfoText.setText("15.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.onbesonalti_hafta));
                babyImg.setImageResource(R.drawable.onbes);
                break;
            case 16:
                headerText.setText("16.hafta");
                sizeInfoText.setText("16.hafta boyutu:");
                infoDetailText.setText(getText(R.string.onbesonalti_hafta));
                babyImg.setImageResource(R.drawable.onalti);
                break;
            case 17:
                headerText.setText("17.hafta");
                sizeInfoText.setText("17.hafta boyutu:");
                infoDetailText.setText(getText(R.string.onyedionsekiz_hafta));
                babyImg.setImageResource(R.drawable.onyedi);
                break;
            case 18:
                headerText.setText("18.hafta");
                sizeInfoText.setText("18.hafta boyutu:");
                infoDetailText.setText(getText(R.string.onyedionsekiz_hafta));
                babyImg.setImageResource(R.drawable.onsekiz);
                break;
            case 19:
                headerText.setText("19.hafta");
                sizeInfoText.setText("19.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.ondokuzyirmi_hafta));
                babyImg.setImageResource(R.drawable.ondokuz);
                break;
            case 20:
                headerText.setText("20.hafta");
                sizeInfoText.setText("20.hafta boyutu:");
                infoDetailText.setText(getText(R.string.ondokuzyirmi_hafta));
                babyImg.setImageResource(R.drawable.yirmi);
                break;
            case 21:
                headerText.setText("21.hafta");
                sizeInfoText.setText("22.hafta boyutu:");
                infoDetailText.setText(getText(R.string.yirmibiryirmiiki_hafta));
                babyImg.setImageResource(R.drawable.yirmibir);
                break;
            case 22:
                headerText.setText("22.hafta");
                sizeInfoText.setText("22.hafta boyutu:");
                infoDetailText.setText(getText(R.string.yirmibiryirmiiki_hafta));
                babyImg.setImageResource(R.drawable.yirmiiki);
                break;
            case 23:
                headerText.setText("23.hafta");
                sizeInfoText.setText("23.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.yirmiucyirmidort_hafta));
                babyImg.setImageResource(R.drawable.yirmiuc);
                break;
            case 24:
                headerText.setText("24.hafta");
                sizeInfoText.setText("24.hafta boyutu:");
                infoDetailText.setText(getText(R.string.yirmiucyirmidort_hafta));
                babyImg.setImageResource(R.drawable.yirmidort);
                break;
            case 25:
                headerText.setText("25.hafta");
                sizeInfoText.setText("25.hafta boyutu:");
                infoDetailText.setText(getText(R.string.yirmibesyirmialti_hafta));
                babyImg.setImageResource(R.drawable.yirmibes);
                break;
            case 26:
                headerText.setText("26.hafta");
                sizeInfoText.setText("26.hafta boyutu:");
                infoDetailText.setText(getText(R.string.yirmibesyirmialti_hafta));
                babyImg.setImageResource(R.drawable.yirmialti);
                break;
            case 27:
                headerText.setText("27.hafta");
                sizeInfoText.setText("27.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.yirmiyediyirmisekiz_hafta));
                babyImg.setImageResource(R.drawable.yirmiyedi);
                break;
            case 28:
                headerText.setText("28.hafta");
                sizeInfoText.setText("28.hafta boyutu:");
                infoDetailText.setText(getText(R.string.yirmiyediyirmisekiz_hafta));
                babyImg.setImageResource(R.drawable.yirmisekiz);
                break;
            case 29:
                headerText.setText("29.hafta");
                sizeInfoText.setText("29.hafta boyutu:");
                infoDetailText.setText(getText(R.string.yirmidokuz_hafta));
                babyImg.setImageResource(R.drawable.yirmidokuz);
                break;
            case 30:
                headerText.setText("30.hafta");
                sizeInfoText.setText("30.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.otuzotuzdort_hafta));
                babyImg.setImageResource(R.drawable.otuz);
                break;
            case 31:
                headerText.setText("31.hafta");
                sizeInfoText.setText("31.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzotuzdort_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;
            case 32:
                headerText.setText("32.hafta");
                sizeInfoText.setText("32.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzotuzdort_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;
            case 33:
                headerText.setText("33.hafta");
                sizeInfoText.setText("33.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzotuzdort_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;
            case 34:
                headerText.setText("34.hafta");
                sizeInfoText.setText("34.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzotuzdort_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;
            case 35:
                headerText.setText("35.hafta");
                sizeInfoText.setText("35.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzbesotuzyedi_hafta));
                babyImg.setImageResource(R.drawable.ilkhafta);
                break;
            case 36:
                headerText.setText("36.hafta");
                sizeInfoText.setText("36.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzbesotuzyedi_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;
            case 37:
                headerText.setText("37.hafta");
                sizeInfoText.setText("37.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzbesotuzyedi_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;

            case 38:
                headerText.setText("38.hafta");
                sizeInfoText.setText("38.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.otuzsekizkirk_hafta));
                babyImg.setImageResource(R.drawable.ilkhafta);
                break;
            case 39:
                headerText.setText("39.hafta");
                sizeInfoText.setText("39.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzsekizkirk_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;
            case 40:
                headerText.setText("40.hafta");
                sizeInfoText.setText("40.hafta boyutu:");
                infoDetailText.setText(getText(R.string.otuzsekizkirk_hafta));
                babyImg.setImageResource(R.drawable.ondort);
                break;
            case 41:
                headerText.setText("41.hafta");
                sizeInfoText.setText("41.hafta boyutu: ");
                infoDetailText.setText(getText(R.string.kirkbirinci_hafta));
                babyImg.setImageResource(R.drawable.ilkhafta);
                break;


        }


    }


    public void goWeekList() {
        Intent intent = new Intent(this, WeekListActivity.class);
        startActivity(intent);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
