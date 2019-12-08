//package com.ng.campusbuddy.Tools;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.viewpager.widget.PagerAdapter;
//
//import com.ng.campusbuddy.R;
//
//public class SliderAdapter extends PagerAdapter {
//
//    Context context;
//    LayoutInflater layoutInflater;
//
//    public SliderAdapter(Context context) {
//        this.context = context;
//    }
//
//    //Arrays
//    public  int[] slide_image = {
//
//            R.drawable.slide_education,
//            R.drawable.slide_social,
//            R.drawable.slide_entertainment,
//            R.drawable.slide_work
//    };
//
//    public String[] slide_heading = {
//
//            "EDUCATIVE",
//            "SOCIALIZE",
//            "ENTERTAINING",
//            "LUCURATIVE"
//    };
//
//    public String[] slide_desc = {
//
//            "choose from our large library of books ",
//            "connect with friends on campus",
//            "get the latest gist on trends flowing on campus",
//            "become your own boss and start earning"
//    };
//
//    @Override
//    public int getCount() {
//        return slide_heading.length;
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
//        return view == (RelativeLayout) o;
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//
//        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
//        View view = layoutInflater.inflate(R.layout.slide_layout, container , false);
//
//        ImageView slide_Image = (ImageView) view.findViewById(R.id.slide_image);
//        TextView slide_Title = (TextView) view.findViewById(R.id.slide_heading);
//        TextView slide_Description = (TextView) view.findViewById(R.id.slide_desc);
//
//        slide_Image.setImageResource(slide_image[position]);
//        slide_Title.setText(slide_heading[position]);
//        slide_Description.setText(slide_desc[position]);
//
//        container.addView(view);
//        return view;
//
//    }
//
//    @Override
//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//
//        container.removeView((RelativeLayout)object);
//    }
//}
