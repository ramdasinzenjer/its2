package in.inz.uniqueidentificationsystem;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class id_back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_back);
        final View view = this.findViewById(android.R.id.content).getRootView();
        Context context = view.getContext();
        view.setOnTouchListener(new OnSwipeTouchListener(context) {
            @Override
            public void onSwipeRight() {

                getup();

            }
        });

    }
    void getup()
    {
        final  View view = this.findViewById(android.R.id.content).getRootView();
        Intent myIntent = new Intent(view.getContext(), Id.class);
        startActivityForResult(myIntent, 0);
    }

    }

