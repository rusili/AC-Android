package nyc.c4q.washingtonpostjson.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jsjrobotics.defaultTemplate.lifecycle.functional.Receiver;

import java.util.List;

import nyc.c4q.washingtonpostjson.backend.Post;
import nyc.c4q.washingtonpostjson.backend.PostsDownloader;

public class MainFragment extends Fragment {

    private MainView mView;
    private PostsDownloader mPostsDownloader;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mPostsDownloader = new PostsDownloader(getContext());
    }
    @Override
    public void onResume(){
        super.onResume();
        mPostsDownloader.downloadPosts(buildPostReceiver());
    }

    private Receiver<List<Post>> buildPostReceiver() {
        return new Receiver<List<Post>>() {
            @Override
            public void accept(List<Post> data) {
                mView.setData(data);
            }
        };
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        mView = new MainView(inflater, container, getActivity());
        return mView.getLayout();
    }
}
