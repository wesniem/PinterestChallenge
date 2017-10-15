package com.example.wesniemarcelin.pinterestcodingchallenge.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wesniemarcelin.pinterestcodingchallenge.R;
import com.example.wesniemarcelin.pinterestcodingchallenge.model.PinsResponse;

import java.util.List;

/**
 * Created by wesniemarcelin on 10/15/17.
 */

public class PinsAdapter extends RecyclerView.Adapter<PinsViewHolder> {
    private List<PinsResponse> mPinsListing;

    public PinsAdapter(List<PinsResponse> mPinsListing) {
        this.mPinsListing = mPinsListing;
    }

    @Override
    public PinsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.pins_item,parent, false);
        return new PinsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PinsViewHolder holder, int position) {
        PinsResponse response = mPinsListing.get(position);
        holder.bind(response);
    }

    @Override
    public int getItemCount() {
        return mPinsListing.size();
    }
}
