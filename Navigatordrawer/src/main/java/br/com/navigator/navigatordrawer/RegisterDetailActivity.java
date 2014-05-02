package br.com.navigator.navigatordrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class RegisterDetailActivity extends Activity {

    private static final String REGISTER_DETAIL_ACTIVITY = "RegisterDetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_detail);

        Bundle bundle = getIntent().getExtras();

        if(bundle.getString("jsonObject")!= null) {
            Log.i(REGISTER_DETAIL_ACTIVITY, "Chegouuuu....");
        }

        //spinner2 = (Spinner) findViewById(R.id.spinner2);
        //List<String> list = new ArrayList<String>();
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
