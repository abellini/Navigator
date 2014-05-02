package br.com.navigator.navigatordrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class RegisterDetailActivity extends Activity {

    private static final String REGISTER_DETAIL_ACTIVITY = "RegisterDetailActivity";

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_detail);

        Bundle bundle = getIntent().getExtras();
        String json = bundle.getString("jsonObject");
        try {
            if (json != null) {
                spinner = (Spinner) findViewById(R.id.spinnerCoin);
                List<String> list = new ArrayList<String>();
                JSONObject jsonObject = new JSONObject(json);
                JSONArray coins = jsonObject.getJSONArray("coins");
                for (int i = 0; i < coins.length(); i++) {
                    JSONObject obj = coins.getJSONObject(i);
                    String name = obj.getString("name");
                    list.add(name);
                }

                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, list);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(dataAdapter);

            }
        } catch (Exception e) {

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.register_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent it = new Intent(RegisterDetailActivity.this, MainActivity.class);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
