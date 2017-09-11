package nyc.c4q.washingtonpostjson.backend;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collection;

public class PostsCollectionDeserializer implements JsonDeserializer<Collection<Post>> {
    @Override
    public Collection<Post> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Type postCollectionType = new TypeToken<Collection<Post>>() {}.getType();
        return new Gson().fromJson(json, postCollectionType);
    }
}
