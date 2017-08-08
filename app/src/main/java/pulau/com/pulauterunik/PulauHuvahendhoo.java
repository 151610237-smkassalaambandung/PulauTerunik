package pulau.com.pulauterunik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PulauHuvahendhoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulau_huvahendhoo);

        Button home = (Button) findViewById(R.id.button);
        home.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), Utama.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
