package nyc.c4q.washingtonpostjson.backend;

import android.content.Context;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.jsjrobotics.defaultTemplate.lifecycle.functional.Receiver;
import com.jsjrobotics.defaultTemplate.prioritydownloader.Priorities;
import com.jsjrobotics.defaultTemplate.prioritydownloader.PriorityDownloader;
import com.jsjrobotics.defaultTemplate.prioritydownloader.downloader.DownloadRequest;
import com.jsjrobotics.defaultTemplate.prioritydownloader.downloader.InputStreamToObjectConverters;

public class PostsDownloader {
    private static final String URL = "http://www.washingtonpost.com/wp-srv/simulation/simulation_test.json";
    private final PriorityDownloader<String> mPriorityDownloader;

    public PostsDownloader(Context context){
        mPriorityDownloader = PriorityDownloader.from(context, String.class);
    }

    public void downloadPosts(final Receiver<List<Post>> listener){
        DownloadRequest<String> request = new DownloadRequest<>(
                data -> {
                    Type postsCollectionType = new TypeToken<Collection<Post>>() {}.getType();
                    GsonBuilder builder = new GsonBuilder();
                    builder.registerTypeAdapter(postsCollectionType, new PostsCollectionDeserializer());
                    WashingtonPostResponse result = builder.create().fromJson(data, WashingtonPostResponse.class);
                    listener.accept(result.posts);
                },
                InputStreamToObjectConverters.getStringConverter(),
                URL,
                Collections.<String, String>emptyMap(),
                Collections.<String, String>emptyMap(),
                Priorities.MEDIUM,
                "WashingPost"
        );
        mPriorityDownloader.queueRequest(request);
    }
}
