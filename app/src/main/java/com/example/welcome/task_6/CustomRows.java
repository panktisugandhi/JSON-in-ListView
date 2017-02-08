package com.example.welcome.task_6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by welcome on 2/8/2017.
 */

public class CustomRows extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Post> l;


    public CustomRows(Context context,List<Post> l) {
        this.context = context;
        this.l=l;
    }

    @Override
    public int getCount() {
        return l.size();
    }

    @Override
    public Object getItem(int position) {
        return l.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if(layoutInflater==null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view==null){
            view=layoutInflater.inflate(R.layout.rows,null);
            TextView TV1 = (TextView)view.findViewById(R.id.TV_uid);
            TextView TV2= (TextView)view.findViewById(R.id.TV_id);
            TextView TV3= (TextView)view.findViewById(R.id.TV_tit);
            TextView TV4= (TextView)view.findViewById(R.id.TV_body);

            Post p = l.get(position);
            TV1.setText(String.valueOf(p.getUid()));
            TV2.setText(String.valueOf(p.getId()));
            TV3.setText(p.getTitle());
            TV4.setText(p.getBody());
        }

        return view;
    }
}
