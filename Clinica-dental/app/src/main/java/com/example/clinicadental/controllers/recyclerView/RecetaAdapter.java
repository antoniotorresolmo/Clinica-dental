package com.example.clinicadental.controllers.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clinicadental.R;
import com.example.clinicadental.models.Farmacopea;

public class RecetaAdapter extends RecyclerView.Adapter<RecetaAdapter.ViewHolder> implements View.OnClickListener{

    Context context;
    LayoutInflater inflater;
    private View.OnClickListener listener;

    public RecetaAdapter(Context context){
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecetaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.receta_item, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecetaAdapter.ViewHolder holder, int position) {

        String sDescripcion = Farmacopea.lRecetas.get(position).getDescripcion();

        holder.lblDescripcion.setText(sDescripcion);

    }

    @Override
    public int getItemCount() {
        return Farmacopea.lRecetas.size();
    }

    @Override
    public void onClick(View view) {
        if(listener != null){
            listener.onClick(view);
        }
    }

    public void onClick(View.OnClickListener listener){
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView lblDescripcion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lblDescripcion = itemView.findViewById(R.id.lblDescripcionRVRecetario);
        }
    }

}
