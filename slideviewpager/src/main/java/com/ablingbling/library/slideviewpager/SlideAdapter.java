package com.ablingbling.library.slideviewpager;

import android.support.v7.widget.CardView;

public interface SlideAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getSlideViewAt(int position);

    int getCount();

}
