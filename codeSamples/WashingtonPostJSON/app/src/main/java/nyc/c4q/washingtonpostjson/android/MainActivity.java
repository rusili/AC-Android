package nyc.c4q.washingtonpostjson.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nyc.c4q.washingtonpostjson.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.content, new MainFragment())
                .commit();
    }
}
