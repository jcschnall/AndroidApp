package josh.myapplication; /**
 * Created by Josh on 11/28/16.
 */


import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Package of helper classes and server-wide info.
 */

public class Sunlight4 {
    public static final String BASE_URL = "https://congress.api.sunlightfoundation.com/";

    public static final String apiKey = "52bf01e9cad0422c8e3c1faa809ad959";

    //"https://congress.api.sunlightfoundation.com/legislators?apikey=52bf01e9cad0422c8e3c1faa809ad959&per_page=all",
    //"https://congress.api.sunlightfoundation.com/bills?history.active=true&order=last_action_at&apikey=52bf01e9cad0422c8e3c1faa809ad959&per_page=50"
    //String[] urls; //arraylist of other api calls than base




    public static String url(String queryString, String endString) {


        return BASE_URL +  queryString + "?apikey=" + apiKey +"&" + endString ;
    }



    public static String fetchJSON(String url) {

            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Response responses = null;

            String jsonData = null;

            try {
                responses = client.newCall(request).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                jsonData = responses.body().string();

            } catch (IOException e){
                e.printStackTrace();
            }


            //JSONObject Jobject = new JSONObject(jsonData);
            //JSONArray Jarray = Jobject.getJSONArray("employees");

            //for (int i = 0; i < Jarray.length(); i++) {
            //    JSONObject object     = Jarray.getJSONObject(i);
            //}
        return  jsonData;
    }
}