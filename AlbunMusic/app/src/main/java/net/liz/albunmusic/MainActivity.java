
package net.liz.albunmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Declaro una variable
    ImageView dontCry, clud, patience, estranged;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciando
        dontCry = (ImageView) findViewById(R.id.dont_cry);
        clud    = (ImageView) findViewById(R.id.cloud);
        patience = (ImageView) findViewById(R.id.patience);
        estranged = (ImageView) findViewById(R.id.estranged);

        dontCry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
