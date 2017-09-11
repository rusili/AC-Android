package nyc.c4q.vineapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;

import nyc.c4q.vineapplication.backend.VineApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VineApi.parseData(VineApi.TEST_RESULT);

    }
}
