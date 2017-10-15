package com.example.wesniemarcelin.pinterestcodingchallenge.view;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.wesniemarcelin.pinterestcodingchallenge.R;
import com.example.wesniemarcelin.pinterestcodingchallenge.model.PinsResponse;

import butterknife.BindView;

/**
 * Created by wesniemarcelin on 10/15/17.
 */

public class PinsViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.pin_item_tv)
    TextView pinItemtv;
    View view;
    private PinsResponse pinsResponse;

    public PinsViewHolder(View itemView) {
        super(itemView);
        view = itemView;
    }

    public void bind(PinsResponse response) {
        this.pinsResponse = response;
        pinItemtv.setText(response.getId());
        Log.d("TAGGG", "binded pins to recyclerview");
    }
}
