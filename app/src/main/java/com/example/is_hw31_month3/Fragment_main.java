package com.example.is_hw31_month3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment_main extends Fragment {


    public Fragment_main() {

    }
    private RecyclerView rvFilms;
    private ArrayList<String> filmlist = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        loadData();
        initAdapter();


        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    private void initAdapter() {
        FilmAdapter adapter = new FilmAdapter(filmlist);
        rvFilms.setAdapter(adapter);
    }

    private void loadData() {
        filmlist.add("Мышь");
        filmlist.add("Начало");
        filmlist.add("Сумерки");
        filmlist.add("Бэтмен");
        filmlist.add("Последняя игра");
        filmlist.add("Алиса в стране чудес");
        filmlist.add("Каролина в стране кошмаров");
        filmlist.add("Супернянь 2");
        filmlist.add("Назад в будущее");
        filmlist.add("Поезд в пусан");
        filmlist.add("Леон");
        filmlist.add("Король лев");
        filmlist.add("Поворот туда");
    }

    private void initView() {
        rvFilms = requireActivity().findViewById(R.id.rv_films1);

    }



}