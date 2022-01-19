package com.example.clinicadental.controllers.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.clinicadental.R;
import com.example.clinicadental.models.*;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CitaAdapter extends RecyclerView.Adapter<CitaAdapter.ViewHolder> implements View.OnClickListener{

    Context context;
    LayoutInflater inflater;
    private View.OnClickListener listener;

    public CitaAdapter(Context context) {
        this.context = context;
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public CitaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cita_item, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    //Vamos a ir colocando cada uno de nuestros elementos de nuestra arrayList
    @Override
    public void onBindViewHolder(@NonNull CitaAdapter.ViewHolder holder, int position) {
        String strDia = CitaStore.listCita.get(position).getDia().toString();
        String strHora = CitaStore.listCita.get(position).getHora().toString();
        String strOperacion = CitaStore.listCita.get(position).getOperacion();

        holder.txtDia.setText(strDia);
        holder.txtHora.setText(strHora);
        holder.txtOperacion.setText(strOperacion);
    }

    @Override
    public int getItemCount() {

        return CitaStore.listCita.size();
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onClick(v);
        }
    }

    public void OnClick(View.OnClickListener listener) {
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtDia;
        TextView txtHora;
        TextView txtOperacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDia = itemView.findViewById(R.id.lblDiaCV);
            txtHora = itemView.findViewById(R.id.lblHoraCV);
            txtOperacion = itemView.findViewById(R.id.lblOperacionCV);
        }
    }
}
