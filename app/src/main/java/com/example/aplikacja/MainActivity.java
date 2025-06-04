package com.example.aplikacja;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button poleBot00, poleBot01, poleBot02, poleBot03, poleBot04;
    Button poleBot10, poleBot11, poleBot12, poleBot13, poleBot14;
    Button poleBot20, poleBot21, poleBot22, poleBot23, poleBot24;
    Button poleBot30, poleBot31, poleBot32, poleBot33, poleBot34;
    Button poleBot40, poleBot41, poleBot42, poleBot43, poleBot44;

    Button poleGracz01, poleGracz12, poleGracz23;

    TextView tekstInfo;

    boolean statekBot00 = true;
    boolean statekBot11 = true;
    boolean statekBot22 = true;

    boolean trafionyBot00 = false;
    boolean trafionyBot11 = false;
    boolean trafionyBot22 = false;

    boolean statekGracz01 = true;
    boolean statekGracz12 = true;
    boolean statekGracz23 = true;

    boolean trafionyGracz01 = false;
    boolean trafionyGracz12 = false;
    boolean trafionyGracz23 = false;

    Random losuj = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poleBot00 = findViewById(R.id.button_bot_00);
        poleBot01 = findViewById(R.id.button_bot_01);
        poleBot02 = findViewById(R.id.button_bot_02);
        poleBot03 = findViewById(R.id.button_bot_03);
        poleBot04 = findViewById(R.id.button_bot_04);

        poleBot10 = findViewById(R.id.button_bot_10);
        poleBot11 = findViewById(R.id.button_bot_11);
        poleBot12 = findViewById(R.id.button_bot_12);
        poleBot13 = findViewById(R.id.button_bot_13);
        poleBot14 = findViewById(R.id.button_bot_14);

        poleBot20 = findViewById(R.id.button_bot_20);
        poleBot21 = findViewById(R.id.button_bot_21);
        poleBot22 = findViewById(R.id.button_bot_22);
        poleBot23 = findViewById(R.id.button_bot_23);
        poleBot24 = findViewById(R.id.button_bot_24);

        poleBot30 = findViewById(R.id.button_bot_30);
        poleBot31 = findViewById(R.id.button_bot_31);
        poleBot32 = findViewById(R.id.button_bot_32);
        poleBot33 = findViewById(R.id.button_bot_33);
        poleBot34 = findViewById(R.id.button_bot_34);

        poleBot40 = findViewById(R.id.button_bot_40);
        poleBot41 = findViewById(R.id.button_bot_41);
        poleBot42 = findViewById(R.id.button_bot_42);
        poleBot43 = findViewById(R.id.button_bot_43);
        poleBot44 = findViewById(R.id.button_bot_44);

        poleGracz01 = findViewById(R.id.button_player_01);
        poleGracz12 = findViewById(R.id.button_player_12);
        poleGracz23 = findViewById(R.id.button_player_23);

        tekstInfo = findViewById(R.id.textView_info);

        poleBot00.setOnClickListener(v -> {
            if (statekBot00 && !trafionyBot00) {
                poleBot00.setText("X");
                tekstInfo.setText("Trafiłeś!");
                trafionyBot00 = true;
            } else {
                poleBot00.setText("O");
                tekstInfo.setText("Pudło!");
            }
            ruchBota();
            sprawdzWygrana();
        });

        poleBot01.setOnClickListener(v -> {
            poleBot01.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot02.setOnClickListener(v -> {
            poleBot02.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot03.setOnClickListener(v -> {
            poleBot03.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot04.setOnClickListener(v -> {
            poleBot04.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot10.setOnClickListener(v -> {
            poleBot10.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot11.setOnClickListener(v -> {
            if (statekBot11 && !trafionyBot11) {
                poleBot11.setText("X");
                tekstInfo.setText("Trafiłeś!");
                trafionyBot11 = true;
            } else {
                poleBot11.setText("O");
                tekstInfo.setText("Pudło!");
            }
            ruchBota();
            sprawdzWygrana();
        });

        poleBot12.setOnClickListener(v -> {
            poleBot12.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot13.setOnClickListener(v -> {
            poleBot13.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot14.setOnClickListener(v -> {
            poleBot14.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot20.setOnClickListener(v -> {
            poleBot20.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot21.setOnClickListener(v -> {
            poleBot21.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot22.setOnClickListener(v -> {
            if (statekBot22 && !trafionyBot22) {
                poleBot22.setText("X");
                tekstInfo.setText("Trafiłeś!");
                trafionyBot22 = true;
            } else {
                poleBot22.setText("O");
                tekstInfo.setText("Pudło!");
            }
            ruchBota();
            sprawdzWygrana();
        });

        poleBot23.setOnClickListener(v -> {
            poleBot23.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot24.setOnClickListener(v -> {
            poleBot24.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot30.setOnClickListener(v -> {
            poleBot30.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot31.setOnClickListener(v -> {
            poleBot31.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot32.setOnClickListener(v -> {
            poleBot32.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot33.setOnClickListener(v -> {
            poleBot33.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot34.setOnClickListener(v -> {
            poleBot34.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot40.setOnClickListener(v -> {
            poleBot40.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot41.setOnClickListener(v -> {
            poleBot41.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot42.setOnClickListener(v -> {
            poleBot42.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot43.setOnClickListener(v -> {
            poleBot43.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

        poleBot44.setOnClickListener(v -> {
            poleBot44.setText("O");
            tekstInfo.setText("Pudło!");
            ruchBota();
            sprawdzWygrana();
        });

    }

    void ruchBota() {
        int r = losuj.nextInt(3);

        switch (r) {
            case 0:
                if (statekGracz01 && !trafionyGracz01) {
                    poleGracz01.setText("X");
                    trafionyGracz01 = true;
                    tekstInfo.setText("Bot trafił Twój statek");
                } else {
                    poleGracz01.setText("O");
                    tekstInfo.setText("Bot chybił");
                }
                break;

            case 1:
                if (statekGracz12 && !trafionyGracz12) {
                    poleGracz12.setText("X");
                    trafionyGracz12 = true;
                    tekstInfo.setText("Bot trafił Twój statek");
                } else {
                    poleGracz12.setText("O");
                    tekstInfo.setText("Bot chybił");
                }
                break;

            case 2:
                if (statekGracz23 && !trafionyGracz23) {
                    poleGracz23.setText("X");
                    trafionyGracz23 = true;
                    tekstInfo.setText("Bot trafił Twój statek");
                } else {
                    poleGracz23.setText("O");
                    tekstInfo.setText("Bot chybił");
                }
                break;
        }
    }

    void sprawdzWygrana() {
        if (trafionyBot00 && trafionyBot11 && trafionyBot22) {
            tekstInfo.setText("Wygrałeś");
        } else if (trafionyGracz01 && trafionyGracz12 && trafionyGracz23) {
            tekstInfo.setText("Przegrałeś");
        }
    }
}


