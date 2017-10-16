package com.example.wesniemarcelin.pinterestcodingchallenge.view;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.wesniemarcelin.pinterestcodingchallenge.R;
import com.example.wesniemarcelin.pinterestcodingchallenge.model.PinsResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainPinsActivity extends AppCompatActivity {
    public static final String FILE_NAME = "pins_formatted.json";
    @BindView(R.id.pins_rv)
    RecyclerView pinsRecyclerView;
    PinsAdapter adapter;
    StringBuilder builder;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pins);
        ButterKnife.bind(this);
        loadJSONFromRaw();

        GsonBuilder builder = new GsonBuilder();
        Gson mGson = builder.create();
//        String fileData = new String(Files.readAllBytes(Paths
//                        .get("pins_formatted.json")));
//        Collection<PinsResponse> pins = new Collection<PinsResponse>();
//        pins = mGson.fromJson("");
        Type collectionType = new TypeToken<Collection<PinsResponse>>(){}.getType();
        Collection<PinsResponse> enums = mGson.fromJson(loadJSONFromRaw(), collectionType);
//        PinsResponse converter = mGson.fromJson(loadJSONFromRaw(), PinsResponse.class);
        pinsRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter = new PinsAdapter((List<PinsResponse>) enums);
        pinsRecyclerView.setAdapter(adapter);

//        try {
//            JSONdata();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }

    private String loadJSONFromRaw() {
        Resources res = getResources();
        InputStream is = res.openRawResource(R.raw.pins_formatted);
        Scanner scanner = new Scanner(is);
         builder = new StringBuilder();

        while(scanner.hasNextLine()){
            builder.append(scanner.nextLine());
        }
        String json = builder.toString();
        parseJSON(builder.toString());
        return json;
    }

    private void parseJSON(String json) {
        StringBuilder builder = new StringBuilder();
        try{
            JSONArray root = new JSONArray(json);
            for (int i = 0; i <root.length() ; i++) {
                JSONObject obj = root.getJSONObject(i);
                Log.d("JSONNN", " " + obj);
            }
//            JSONObject root = new JSONObject(json);
//            JSONObject access = root.getJSONObject("access")
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

//    public String loadJSONFromAsset() {
//        String json = null;
//        try {
//            InputStream is = getAssets().open("pins_formatted.json");
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//            json = new String(buffer, "UTF-8");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//        return json;
//    }
//
//    public  void JSONdata() throws JSONException {
//        Log.d("JSON DATAAA", "parsing data");
//        JSONArray obj = new JSONArray(loadJSONFromAsset());
//        Log.d("LOADDATA ", " " +obj);
//       JSONObject boardObbject =  obj.getJSONObject(0);
//        boardObbject.getString("author_name");
//        Log.d("JSON OBJECT","is " + boardObbject);
//        obj.getString("provider_favicon_url");
//        Log.d("JSON", obj.getString("provider_favicon_url"));
//        JSONArray m_jArry = obj.getJSONArray("attribution");
//        ArrayList<HashMap<String, String>> formList = new ArrayList<HashMap<String, String>>();
//        HashMap<String, String> m_li;
//
//        for (int i = 0; i < m_jArry.length(); i++) {
//            JSONObject jo_inside = m_jArry.getJSONObject(i);
//            Log.d("Details-->", jo_inside.getString("formule"));
//            String formula_value = jo_inside.getString("formule");
//            String url_value = jo_inside.getString("url");
//
//            //Add your values in your `ArrayList` as below:
//            m_li = new HashMap<String, String>();
//            m_li.put("formule", formula_value);
//            m_li.put("url", url_value);
//
//            formList.add(m_li);
//        }
//    }
}
