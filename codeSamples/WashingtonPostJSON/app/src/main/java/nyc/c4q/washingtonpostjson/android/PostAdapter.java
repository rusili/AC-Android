package nyc.c4q.washingtonpostjson.android;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.washingtonpostjson.backend.Post;

public class PostAdapter extends RecyclerView.Adapter {
    private final List<Post> mData;
    private final Activity activity;

    public PostAdapter(List<Post> data, Activity activity) {
        mData = data;
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PostViewHolder(activity, parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Post currentItem = mData.get(position);
        PostViewHolder postViewHolder = (PostViewHolder) holder;
        postViewHolder.setData(currentItem);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
