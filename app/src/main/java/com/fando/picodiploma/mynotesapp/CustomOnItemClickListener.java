package com.fando.picodiploma.mynotesapp;

import android.view.View;

// item pada cardView agar bisa di klik di dalam adapter
public class CustomOnItemClickListener implements View.OnClickListener {

    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }

    // menghindari nilai final dari posisi yang tentunya sangat tidak direkomendasikan
    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
