package nyc.c4q.washingtonpostjson.android;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.washingtonpostjson.R;
import nyc.c4q.washingtonpostjson.backend.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {
    private final View mRoot;
    private final TextView id;
    private final TextView title;
    private final TextView date;
    private final TextView excerpt;
    private final TextView content;
    private final Activity mActivity;

    public PostViewHolder(Activity activity, ViewGroup parent) {
        super(inflateView(parent));
        mActivity = activity;
        mRoot = itemView;
        id = (TextView) mRoot.findViewById(R.id.id);
        title = (TextView) mRoot.findViewById(R.id.title);
        date = (TextView) mRoot.findViewById(R.id.date);
        excerpt = (TextView) mRoot.findViewById(R.id.excerpt);
        content = (TextView) mRoot.findViewById(R.id.content);


    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.post_item, parent, false);
    }

    public void setData(final Post data) {
        id.setText(data.getId());
        title.setText(data.getTitle());
        date.setText(data.getDate());
        excerpt.setText(data.getExcerpt());
        mRoot.setOnClickListener(view -> {
            Intent intent = new Intent(mRoot.getContext(), DetailActivity.class );
            intent.putExtra(Constants.EXTRA_ID, data.getId());
            intent.putExtra(Constants.EXTRA_TITLE, data.getTitle());
            mActivity.startActivity(intent);
        });
    }
}
