package com.example.wesniemarcelin.pinterestcodingchallenge.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.wesniemarcelin.pinterestcodingchallenge.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.Scanner;

public class MainPinsActivity extends AppCompatActivity {
    public static final String FILE_NAME = "pins_formatted.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pins);
        loadJSONFromRaw();
//        try {
//            JSONdata();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }

    private void loadJSONFromRaw() {
        Resources res = getResources();
        InputStream is = res.openRawResource(R.raw.pins_formatted);
        Scanner scanner = new Scanner(is);
        StringBuilder builder = new StringBuilder();

        while(scanner.hasNextLine()){
            builder.append(scanner.nextLine());
        }
        parseJSON(builder.toString());
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