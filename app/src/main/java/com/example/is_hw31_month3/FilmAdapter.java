package com.example.is_hw31_month3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmViewHolder> {
    private ArrayList<String> filmlist;

    public FilmAdapter(ArrayList<String> filmlist) {
        this.filmlist = filmlist;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FilmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.bind(filmlist.get(position));
    }

    @Override
    public int getItemCount() {
        return filmlist.size();
    }
}
