package pulau.com.pulauterunik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Utama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        Button daftar = (Button) findViewById(R.id.Button1);
        daftar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), DaftarPulau.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button profile = (Button) findViewById(R.id.Button2);
        profile.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), Profile.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
