package nyc.c4q.vineapplication.backend;

import org.json.JSONException;
import org.json.JSONObject;

public class VineRecord {
    private int liked;
    private String username;
    private String profileBackground;

    public VineRecord(int liked, String background, String userName) {
        this.liked = liked;
        this.profileBackground = background;
        this.username = userName;
    }

    public VineRecord() {}

    public static VineRecord parse(JSONObject currentRecord) {
        try {
            int liked = currentRecord.getInt("liked");
            String background = currentRecord.getString("profileBackground");
            String userName = currentRecord.getString("username");
            return new VineRecord(liked, background, userName);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new VineRecord();
    }
}
