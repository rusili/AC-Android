package nyc.c4q.washingtonpostjson.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import nyc.c4q.washingtonpostjson.R;

public class DetailActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_item);
        String id = getIntent().getStringExtra(Constants.EXTRA_ID);
        String title = getIntent().getStringExtra(Constants.EXTRA_TITLE);

        TextView idView = (TextView) findViewById(R.id.id);
        idView.setText(id);

        TextView titleView = (TextView) findViewById(R.id.title);
        titleView.setText(title);

    }
}
