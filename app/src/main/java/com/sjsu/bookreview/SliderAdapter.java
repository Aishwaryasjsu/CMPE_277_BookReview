package com.sjsu.bookreview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context=context;
    }

    //Array for sliding images
    public int[] slide_images={
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3
    };

    //Array for sliding headings
    public String[] slide_headings={
            "BookReview\nGo Above and Beyound",
            "Base your decisions on\nfacts and figures",
            "Experience the Impact of\nEmotions"
    };

    //Array for sliding description
    public String[] slide_decsriptions={
            "We plan to make your experience convenient and enjoyable and double the pleasure for you.",
            "By analyzing your book reviews and showcasing the collective opinion, we assist readers in gauging the overall sentiment.",
            "Life can be more fulfilling when you share. By sharing your book reviews, you can enhance your reading experience and see the impact of your opinions."
    };

    //Array for sliding buttons
    public int[] slide_buttons={
            R.drawable.buttons,
            R.drawable.buttons2,
            R.drawable.buttons3
    };
    //Array for sliding backgrounds
    public int[] slide_backgrounds={
            R.drawable.gradient1,
            R.drawable.gradient2,
            R.drawable.gradient3
    };

    //Get count of slides
    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view== (RelativeLayout) object;
    }

    //Pass the data through inflater to move to different slides (using a unique position for elements in arrays above)
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout,container,false);

        //Initializing xml components
        ImageView slideImageView=view.findViewById(R.id.image);
        TextView slideHeading=view.findViewById(R.id.heading);
        TextView slideDescription=view.findViewById(R.id.description);
        Button slideButton=view.findViewById(R.id.button);
        RelativeLayout slideBackground=view.findViewById(R.id.background);

        //Setting xml components of slide to new content
        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_decsriptions[position]);
        slideButton.setBackgroundResource(slide_buttons[position]);
        slideBackground.setBackgroundResource(slide_backgrounds[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position,Object object) {
        container.removeView((RelativeLayout)object);
    }
}
