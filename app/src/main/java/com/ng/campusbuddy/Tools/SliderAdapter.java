package com.ng.campusbuddy.Tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ng.campusbuddy.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterVH> {

    private Context context;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        viewHolder.textViewDescription.setText("This is slider item " + position);

        switch (position) {
            case 0:
                Glide.with(viewHolder.itemView)
                        .load("https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
                        .centerCrop()
                        .into(viewHolder.imageViewBackground);
                break;
            case 1:
                Glide.with(viewHolder.itemView)
                        .load("https://scontent-lis1-1.xx.fbcdn.net/v/t1.0-0/p640x640/69816982_1317262918441061_2584431634757451776_o.jpg?_nc_cat=104&_nc_ohc=7eCStam_TXkAQm11OKWq0I4WJ5Aohb-2bPe0N6b494VY52R9_X7nJVzRg&_nc_ht=scontent-lis1-1.xx&oh=2aefb5fc4c390c32212213b881c35607&oe=5E75190C")
                        .centerCrop()
                        .into(viewHolder.imageViewBackground);
                break;
            case 2:
                Glide.with(viewHolder.itemView)
                        .load("https://scontent-lis1-1.xx.fbcdn.net/v/t1.0-9/41840059_1069527886547900_444387815006928896_n.jpg?_nc_cat=101&_nc_ohc=-oSvdGzrcHMAQmkoKVGjE8-oc00nXBs-u4EPU8KVMtVSr9cVJKmTiEwMQ&_nc_ht=scontent-lis1-1.xx&oh=bb63600bbaae951536618fba930410ce&oe=5E79A614")
                        .centerCrop()
                        .into(viewHolder.imageViewBackground);
                break;
            default:
                Glide.with(viewHolder.itemView)
                        .load("https://scontent-lis1-1.xx.fbcdn.net/v/t1.0-9/35145338_973468862820470_4185020896341131264_n.jpg?_nc_cat=102&_nc_ohc=0YWTjxXYnMIAQl-UljIFkQhrLIvLCqvOL1OPFIxpTItfvWVXArvM82TNg&_nc_ht=scontent-lis1-1.xx&oh=1c7ad482472fe07d9c4605b3b2d1078e&oe=5E7BE19B")
                        .centerCrop()
                        .into(viewHolder.imageViewBackground);
                break;

        }

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 4;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        TextView textViewDescription;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView = itemView;
        }
    }
}