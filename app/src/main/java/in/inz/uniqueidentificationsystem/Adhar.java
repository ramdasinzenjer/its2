package in.inz.uniqueidentificationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Adhar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhar);
        TextView ad_name = (TextView) findViewById(R.id.adname) ;
        TextView gender = (TextView) findViewById(R.id.adgender) ;

        TextView adddob = (TextView) findViewById(R.id.addob) ;
        TextView address = (TextView) findViewById(R.id.adaddress);
        ad_name.setText(Config.Name);
        gender.setText(Config.Gender);
        adddob.setText(Config.DoB);
        address.setText(Config.Address);
        TextView adno = (TextView) findViewById(R.id.Adharno) ;
        adno.setText(Config.An);
    }
}
