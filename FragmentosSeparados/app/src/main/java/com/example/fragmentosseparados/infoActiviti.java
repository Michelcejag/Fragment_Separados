package com.example.fragmentosseparados;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.Key;

public class infoActiviti extends Fragment {
    private String description;
    private int idImage;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getArguments();

        if (arguments!=null){
            description=arguments.getString("nombre");
            idImage = arguments.getInt("id");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.info_animal,container, false);
        ImageView imageViewFoto = view.findViewById(R.id.imageView_foto);
        TextView textViewDescription=view.findViewById(R.id.textView_description);

        imageViewFoto.setImageResource(idImage);
        textViewDescription.setText(description);
        return view;
    }
}
