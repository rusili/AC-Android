package nyc.c4q.washingtonpostjson.android;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.washingtonpostjson.R;
import nyc.c4q.washingtonpostjson.backend.Post;

public class MainView {

    private final View mRoot;
    private final RecyclerView mRecyclerView;
    private final Activity activity;


    public MainView(LayoutInflater inflater, ViewGroup container, Activity activity) {
        this.activity = activity;
        mRoot = inflater.inflate(R.layout.main_fragment, container, false);
        mRecyclerView = (RecyclerView) mRoot.findViewById(R.id.posts);
    }

    public View getLayout() {
        return mRoot;
    }

    public void setData(List<Post> data) {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRoot.getContext()));
        mRecyclerView.setAdapter(new PostAdapter(data, activity));

    }
}
