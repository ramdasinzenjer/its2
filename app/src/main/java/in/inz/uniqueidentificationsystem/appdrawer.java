package in.inz.uniqueidentificationsystem;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class appdrawer extends AppCompatActivity {

    final  View view = this.findViewById(android.R.id.content).getRootView();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appdrawer);

    }

    public void launchadhar(View v)
    {
        Intent i = new Intent(this , Adhar.class);
        startActivity(i);
        //TODO add animation

        ActivityOptions options = ActivityOptions.makeScaleUpAnimation(view, 0,
                0, view.getWidth(), view.getHeight());
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
