package in.inz.uniqueidentificationsystem;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity implements View.OnClickListener

{
    private EditText editTextId;
    private Button buttonGet;
    private ProgressDialog loading;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextId = (EditText) findViewById(R.id.editText);
        buttonGet = (Button) findViewById(R.id.button);
        buttonGet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        getData();
    }


    private void getData() {
        String id = editTextId.getText().toString().trim();
        if (id.equals("")) {
            Toast.makeText(this, "Please enter an id", Toast.LENGTH_LONG).show();
            return;
        }
        loading = ProgressDialog.show(this, "Please wait...", "Fetching...", false, false);
        String urlfinal = "http://"+Config.url+Config.DATA_URL;
        String url = urlfinal + editTextId.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loading.dismiss();
                showJSON(response);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }


    private void showJSON(String response) {
        String name = "";
        String otp = "";
        String address="";
        String dob = "";
        String gender = "" ;
        String adharno = "";
        String Name  = "" ;
        String UniqueNo = "" ;
        String Address = "" ;
        String DoB = "" ;
        String Gender = "" ;
        String An = "" ;
        String Pn = "" ;
        String LC = "" ;
        String VIP = "" ;
        String IDVID = "" ;
        String ACNVID = "" ;
        String PNVID = "";
        String  IDLC = "";
        String NOF = "";
        String VFLC = "";
        String VTFLC = "";
        String Sign = "";
        String photo = "";
        String EmailID = "";
        String Phoneno = "";
        String Password = "" ;
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
            JSONObject collegeData = result.getJSONObject(0);
            name = collegeData.getString(Config.KEY_NAME);
            address =  collegeData.getString(Config.ADDRESS);
            dob = collegeData.getString(Config.DOB);
            gender = collegeData.getString(Config.GENDER);
            Password=collegeData.getString(Config.PASSWORD);
            Pn=collegeData.getString(Config.PN);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Config.Name = name;
        Config.Address=address;
        Config.DoB= dob;
        Config.Gender = gender;
        Config.An = adharno;
        Config.Password = Password;
        if (Password != "") {
            Intent intent = new Intent(this, otp.class);
            startActivity(intent);
        }
    }



}





