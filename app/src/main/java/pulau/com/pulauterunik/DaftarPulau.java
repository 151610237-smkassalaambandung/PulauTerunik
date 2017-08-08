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

        Button huva = (Button) findViewById(R.id.Button3);
        huva.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauHuvahendhoo.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button vul = (Button) findViewById(R.id.Button4);
        vul.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), Vulcan.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button lum = (Button) findViewById(R.id.Button5);
        lum.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauLumbaLumba.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Snoopy = (Button) findViewById(R.id.Button6);
        Snoopy.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauSnoopy.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button smiley = (Button) findViewById(R.id.Button7);
        smiley.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauSemiley.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button palm = (Button) findViewById(R.id.Button8);
        palm.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauPalm.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button wor = (Button) findViewById(R.id.Button9);
        wor.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauWortel.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button mata = (Button) findViewById(R.id.Button10);
        mata.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PulauMata.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
