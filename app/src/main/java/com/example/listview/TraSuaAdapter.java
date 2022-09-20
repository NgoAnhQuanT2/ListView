package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraSuaAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TraSua> trasualist;

    public TraSuaAdapter(Context context, int layout, List<TraSua> trasualist) {
        this.context = context;
        this.layout = layout;
        this.trasualist = trasualist;
    }

    @Override

    public int getCount() {
        return trasualist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtten = (TextView) view.findViewById(R.id.textviewten);
        TextView txtmota = (TextView) view.findViewById(R.id.textviewmota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);

        TraSua traSua = trasualist.get(i);
        txtten.setText(traSua.getTraSua());
        imgHinh.setImageResource(traSua.getHinh());

        return view;
    }
}
