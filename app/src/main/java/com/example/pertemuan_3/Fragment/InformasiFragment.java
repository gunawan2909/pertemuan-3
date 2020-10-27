package com.example.pertemuan_3.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.pertemuan_3.R;

public class InformasiFragment extends Fragment {

    // Method onCreateView dipanggil saat Fragment harus menampilkan layoutnya      // dengan membuat layout tersebut secara manual lewat objek View
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Layout tampilan untuk fragment ini
        View view = inflater.inflate(R.layout.fragment_informasi, container, false);

        return view;
    }


}