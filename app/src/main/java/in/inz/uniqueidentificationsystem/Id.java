package in.inz.uniqueidentificationsystem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Id extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id);
        final  View view = this.findViewById(android.R.id.content).getRootView();
        Context context = view.getContext();
        view.setOnTouchListener(new OnSwipeTouchListener(context) {
            @Override
            public void onSwipeLeft() {

                getup();

            }
        });

    }
    void getup()
    {
        final  View view = this.findViewById(android.R.id.content).getRootView();
        Intent myIntent = new Intent(view.getContext(), id_back.class);
        startActivityForResult(myIntent, 0);
    }
}
