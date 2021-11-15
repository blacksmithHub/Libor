package com.example.libor.libor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class Libor extends AppCompatActivity {
    int num = 0;
    int max = 7;
    int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libor);

        final SeekBar skMessage = (SeekBar)findViewById(R.id.seekMessage);
        final ImageButton imgBtn = (ImageButton)findViewById(R.id.imageButton);
        final TextView text = (TextView)findViewById(R.id.textView);


        final Integer img[] = {R.drawable.captain_america, R.drawable.iron_man, R.drawable.spiderman, R.drawable.thor
        , R.drawable.collosus, R.drawable.galgadot, R.drawable.gambit, R.drawable.wolverine};

        skMessage.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                switch(i)
                {
                    case 0 : imgBtn.setImageResource(img[0]);
                                text.setText("1.) Captain America");
                        num = 0;
                        break;
                    case 1 : imgBtn.setImageResource(img[1]);
                        num = 1;
                        text.setText("2.) Iron Man");break;
                    case 2 : imgBtn.setImageResource(img[2]);
                        text.setText("3.) SPiderman");
                        num = 2;break;
                    case 3 : imgBtn.setImageResource(img[3]);
                        text.setText("4.) Thor");
                        num = 3;break;
                    case 4 : imgBtn.setImageResource(img[4]);
                        text.setText("5.) Collosus");
                        num = 4;break;
                    case 5 : imgBtn.setImageResource(img[5]);
                        text.setText("6.) Gal Gadot");
                        num = 5;break;
                    case 6 : imgBtn.setImageResource(img[6]);
                        text.setText("7.) Gambit");
                        num = 6;
                        break;
                    case 7 : imgBtn.setImageResource(img[7]);
                        text.setText("8.) Wolverine");
                        num = 7;break;
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
imgBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        num++;
        num = num % 8;
        switch(num)
        {
            case 0 : imgBtn.setImageResource(img[0]);
                text.setText("1.) Captain America");
                skMessage.setProgress(0);
                break;
            case 1 : imgBtn.setImageResource(img[1]);
                text.setText("2.) Iron Man");
                skMessage.setProgress(1);break;
            case 2 : imgBtn.setImageResource(img[2]);
                text.setText("3.) SPiderman");
                skMessage.setProgress(2);break;
            case 3 : imgBtn.setImageResource(img[3]);
                text.setText("4.) Thor");
                skMessage.setProgress(3);break;
            case 4 : imgBtn.setImageResource(img[4]);
                text.setText("5.) Collosus");
                skMessage.setProgress(4);break;
            case 5 : imgBtn.setImageResource(img[5]);
                text.setText("6.) Gal Gadot");
                skMessage.setProgress(5);break;
            case 6 : imgBtn.setImageResource(img[6]);
                text.setText("7.) Gambit");
                skMessage.setProgress(6);
                break;
            case 7 : imgBtn.setImageResource(img[7]);
                text.setText("8.) Wolverine");
                skMessage.setProgress(7);

                break;
        }
    }
});
    }
}
