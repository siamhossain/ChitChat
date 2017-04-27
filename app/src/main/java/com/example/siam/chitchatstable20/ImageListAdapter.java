package com.example.siam.chitchatstable20;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import static com.example.siam.chitchatstable20.R.id.tvImageName;
import static com.example.siam.chitchatstable20.R.id.tvPrice;
import static com.example.siam.chitchatstable20.R.id.tvStatus;
import static com.example.siam.chitchatstable20.R.id.tvDescription;
import static com.example.siam.chitchatstable20.R.id.tvNamePhon;
import static com.example.siam.chitchatstable20.R.id.tvuse;





public class ImageListAdapter extends ArrayAdapter<ImageUpload> {
    private Activity context;
    private int resource;
    private List<ImageUpload> listImage;

    public ImageListAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<ImageUpload> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        listImage = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View v = inflater.inflate(resource, null);
        TextView tvName = (TextView) v.findViewById(tvImageName);
        TextView tvPrices = (TextView) v.findViewById(tvPrice);
        TextView tvstatus = (TextView) v.findViewById(tvStatus);
        TextView tvdescription = (TextView) v.findViewById(tvDescription);
        TextView tvnamephon = (TextView) v.findViewById(tvNamePhon);
        TextView tvUsername = (TextView) v.findViewById(tvuse);
        ImageView img = (ImageView) v.findViewById(R.id.imgView);

        tvUsername.setText("Username : " + UserDetails.username);

        tvName.setText("Product Name : "+listImage.get(position).getName());
        Glide.with(context).load(listImage.get(position).getUrl()).into(img);

        tvPrices.setText("Price : "+listImage.get(position).getPrice());
        Glide.with(context).load(listImage.get(position).getUrl()).into(img);

        tvstatus.setText("Using Status : "+listImage.get(position).getStatus());
        Glide.with(context).load(listImage.get(position).getUrl()).into(img);

        tvdescription.setText("Description : "+listImage.get(position).getDescription());
        Glide.with(context).load(listImage.get(position).getUrl()).into(img);

        tvnamephon.setText("Name & Phone : "+listImage.get(position).getNamephon());
        Glide.with(context).load(listImage.get(position).getUrl()).into(img);

        return v;

    }
}
