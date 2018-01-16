package com.example.kranthikumarpolimetla.lifecycledemo;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener{
    public static String firstName;
    public static String lastName;
    TextView welcome, firstname, lastname, email, phoneNo, address;
    FirstFragment firstFragment;
    FragmentManager fm;
    LinearLayout linearLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        welcome = (TextView) findViewById(R.id.welcomeText);
        firstname = (TextView) findViewById(R.id.firstName);
        lastname = (TextView) findViewById(R.id.lastName);
        email = (TextView) findViewById(R.id.email);
        phoneNo = (TextView) findViewById(R.id.phoneNo);
        address = (TextView) findViewById(R.id.address);
        fm= getFragmentManager();
        linearLayout = (LinearLayout) findViewById(R.id.fragView);

        welcome.append("2nd on create called");
        firstname.append(": " + firstName);
        lastname.append(": " + lastName);
        email.append(": " +getIntent().getStringExtra("email"));
        phoneNo.append(": " +getIntent().getStringExtra("phoneNo"));
        address.append(": " +getIntent().getStringExtra("address"));
    }
    @Override
    protected void onStart() {
        super.onStart();
        welcome.append("on start called \n");
        Log.d("life-cycle", "2nd on start called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        welcome.append("on resume called \n");
        Log.d("life-cycle", "2nd on resume called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        welcome.append("on stop called \n");
        Log.d("life-cycle", "2nd on stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        welcome.append("on destroy called \n");
        Log.d("life-cycle", "2nd on destroy called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        welcome.append("on restart called \n");
        Log.d("life-cycle", "2nd on restart called");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void loadFragment(View view){
        firstFragment = new FirstFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragView, firstFragment, "first fragment");
        linearLayout.setVisibility(View.VISIBLE);
        ft.commit();
    }

    public void dialogMethod(View view) {
        ShowDailog sd = (builder1)-> {
            builder1.setMessage("Write your message here.");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Yes",
                    (dialog, id) -> dialog.cancel());

            builder1.setNegativeButton(
                    "No",
                    (dialog, id) -> dialog.cancel());

            AlertDialog alert11 = builder1.create();
            alert11.show();
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivity.this);

        sd.showDialog(builder);
    }
}
