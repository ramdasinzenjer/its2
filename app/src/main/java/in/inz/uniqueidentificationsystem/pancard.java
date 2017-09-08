package in.inz.uniqueidentificationsystem;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pancard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancard);

        TextView pnname,pnmothersname,pndob,pnno;
        ImageView pnphoto;

        pnname = (TextView) findViewById(R.id.panname);
        pnmothersname = (TextView) findViewById(R.id.pan_mothersname);
        pndob = (TextView) findViewById(R.id.pan_dob);
        pnno = (TextView) findViewById(R.id.pan_no);

        pnname.setText(Config.Name);
        pndob.setText(Config.DoB);
        pnno.setText(Config.Pn);

    }

}
