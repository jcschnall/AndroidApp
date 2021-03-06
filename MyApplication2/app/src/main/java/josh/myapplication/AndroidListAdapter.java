package josh.myapplication;

/**
 * Created by Josh on 11/22/16.
 */

import android.app.Activity;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.List;

import android.widget.TextView;





import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.squareup.picasso.Picasso;

public class AndroidListAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Results> mPosts;
    private ViewHolder mViewHolder;

    private Bitmap mBitmap;
    private Results mPost;
    private Activity mActivity;

    public AndroidListAdapter(Activity activity, List<Results> posts) {
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        mPosts = posts;
        mActivity = activity;
    }

    @Override
    public int getCount() {
        return mPosts.size();
    }

    @Override
    public Object getItem(int position) {
        return mPosts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custom_list_item_layout, parent, false);
            mViewHolder = new ViewHolder();
            mViewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.image_view);
            mViewHolder.author = (TextView) convertView.findViewById(R.id.text_view);
            mViewHolder.title = (TextView) convertView.findViewById(R.id.text_view1);
            mViewHolder.date1 = (TextView) convertView.findViewById(R.id.post_date1);
            mViewHolder.date2 = (TextView) convertView.findViewById(R.id.post_date2);
            mViewHolder.date3 = (TextView) convertView.findViewById(R.id.post_date3);


            convertView.setTag(mViewHolder);

        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }


        mPost = mPosts.get(position);

        if (mPost.getBioguideId() != null) {


            /*
            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... params) {
                    try {
                        URL url = new URL("https://theunitedstates.io/images/congress/450x550/"+mPost.getBioguideId()+".jpg");
                        mBitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());

                    } catch (MalformedURLException e) {

                    } catch (IOException e) {

                    }
                    return null;
                }
            }.execute();


            mViewHolder.thumbnail.setImageBitmap(mBitmap);
        }*/

            // ถ้าใช้ Picasso ก็ uncomment ข้างล้างนี้ แล้วลบ AsyncTask ออก
            //try {
                String url = "https://theunitedstates.io/images/congress/225x275/" + mPost.getBioguideId() + ".jpg" ;
                Picasso.with(mActivity)
                        .load(url)
                        .into(mViewHolder.thumbnail);

            //}catch (MalformedURLException e) { return null;}
        }

        mViewHolder.author.setText(mPost.getLastName() + ", " + mPost.getFirstName());
        mViewHolder.title.setText(mPost.getLastName());
        mViewHolder.date1.setText(mPost.getParty());
        mViewHolder.date2.setText(mPost.getState());

        if(String.valueOf(mPost.getDistrict())=="null"){
            mViewHolder.date3.setText("district 0");

        }else {
            mViewHolder.date3.setText(String.valueOf(mPost.getDistrict()));
        }
        return convertView;
    }

    private static class ViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView author;
        TextView date1;
        TextView date2;
        TextView date3;


        //TextView date;
    }
}
















/*

public class AndroidListAdapter extends ArrayAdapter {
   // String[] lastName;
   // Integer[] imagesId;

    List<Results> res;
    Activity context;

    public AndroidListAdapter(Activity context, List<Results> textListView) {
        super(context, R.layout.custom_list_item_layout, textListView);
        this.res = textListView;
        //this.imagesId = imagesId;
        this.context = context;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View viewRow = layoutInflater.inflate(R.layout.custom_list_item_layout, null,
                true);
        TextView mtextView = (TextView) viewRow.findViewById(R.id.text_view);
        //ImageView mimageView = (ImageView) viewRow.findViewById(R.id.image_view);
        mtextView.setText(res.get(i).getLastName());
        //mimageView.setImageResource(imagesId[i]);
        return viewRow;
    }
}


*/




//use with json array as in Results array..........
//............................................................

/*

class AndroidListAdapter extends BaseAdapter implements ListAdapter {

    private   Activity activity;
    private    List<Results> jsonArray; //changed JSONArray

    public AndroidListAdapter(Activity activity, List<Results> jsonArray) {  //changes to public from private.....
        assert activity != null;
        assert jsonArray != null;
        this.jsonArray = jsonArray;  //results json array
        this.activity = activity;

    }



    @Override public int getCount() {


        //return jsonArray.length();
        return 0;
    }

    @Override public JSONObject getItem(int position) {

        //return jsonArray.optJSONObject(position);
        return null;
    }


    @Override public long getItemId(int position) {
        //JSONObject jsonObject = getItem(position);

        //return jsonObject.optLong("id");
        return position;
    }


    @Override public View getView(int position, View convertView, ViewGroup parent) {

        convertView = activity.getLayoutInflater().inflate(R.layout.custom_list_item_layout, null);

        //JSONObject jsonObject = getItem(position);



        TextView mtextView = (TextView) convertView.findViewById(R.id.text_view);
        //ImageView mimageView = (ImageView) viewRow.findViewById(R.id.image_view);
        mtextView.setText(jsonArray.get(position).getLastName());
        //mimageView.setImageResource(imagesId[i]);

        return convertView;
    }
}



*/









/*

class dataListAdapter extends BaseAdapter {
    String[] Title, Detail;
    int[] imge;

    dataListAdapter() {
        Title = null;
        Detail = null;
        imge=null;
    }

    public dataListAdapter(String[] text, String[] text1,int[] text3) {
        Title = text;
        Detail = text1;
        imge = text3;

    }

    public int getCount() {
        // TODO Auto-generated method stub
        return Title.length;
    }

    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = getLayoutInflater();
        View row;
        row = inflater.inflate(R.layout.custom, parent, false);
        TextView title, detail;
        ImageView i1;
        title = (TextView) row.findViewById(R.id.title);
        detail = (TextView) row.findViewById(R.id.detail);
        i1=(ImageView)row.findViewById(R.id.img);
        title.setText(Title[position]);
        detail.setText(Detail[position]);
        i1.setImageResource(imge[position]);

        return (row);
    }
}


*/
