package in.inz.uniqueidentificationsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class appdrawer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appdrawer);

    }

    public void launchadhar(View v)
    {
        Intent i = new Intent(this , Adhar.class);
        startActivity(i);

    }
   public void launchpan(View v)
    {
       Intent i =  new Intent(this , pancard.class);
        startActivity(i);
    }
   public void launchid(View v)
    {
        Intent i = new Intent(this , Id.class);
        startActivity(i);
    }

   public void launchlicnse(View v)
    {
Intent i = new Intent(this,License.class );
        startActivity(i);
    }

}
