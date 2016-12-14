package nyc.c4q.vineapplication.backend;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class VineResponse {
    private static final String JSON_RECORDS = "records";
    private String code;
    private VineData data;
    private boolean success;
    private String error;

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(JSONObject data) {
        try {
            this.data = parseVineData(data);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private VineData parseVineData(JSONObject data) throws JSONException {
        VineData result = new VineData();
        List<VineRecord> recordList = new ArrayList<>();

        JSONArray jsonRecords = data.getJSONArray(JSON_RECORDS);

        for (int index = 0; index < jsonRecords.length(); index ++){
            JSONObject currentRecord = jsonRecords.getJSONObject(index);
            VineRecord record = VineRecord.parse(currentRecord);
            recordList.add(record);
        }
        result.setRecords(recordList);
        return result;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setError(String error) {
        this.error = error;
    }
}
