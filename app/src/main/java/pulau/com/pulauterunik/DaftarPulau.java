package pulau.com.pulauterunik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarPulau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pulau);

        Button isabela = (Button) findViewById(R.id.Button1);
        isabela.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauIsabela.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button love = (Button) findViewById(R.id.Button2);
        love.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauLove.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
