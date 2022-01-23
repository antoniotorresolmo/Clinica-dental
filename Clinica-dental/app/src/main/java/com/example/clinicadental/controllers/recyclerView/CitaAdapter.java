package com.example.clinicadental.controllers.recyclerView;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.clinicadental.R;
import com.example.clinicadental.models.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class CitaAdapter extends RecyclerView.Adapter<CitaAdapter.ViewHolder> implements View.OnClickListener{

    Context context;
    LayoutInflater inflater;
    private View.OnClickListener listener;
    int iPosicion;
    private int lastPosition = -1;


    public CitaAdapter(Context context) {
        inflater = LayoutInflater.from(context);
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

    public void onViewDetachedFromWindow(@NonNull ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.itemView.clearAnimation();
    }



    //Vamos a ir colocando cada uno de nuestros elementos de nuestra arrayList
    @Override
    public void onBindViewHolder(@NonNull CitaAdapter.ViewHolder holder, int position) {
        String strDia = CitaStore.listCita.get(position).getDia();
        String strHora = CitaStore.listCita.get(position).getHora();
        String strOperacion = CitaStore.listCita.get(position).getOperacion();

        holder.txtDia.setText(strDia);
        holder.txtHora.setText(strHora);
        holder.txtOperacion.setText(strOperacion);

        Animation animation = AnimationUtils.loadAnimation(context,
                (iPosicion > lastPosition) ? R.anim.up_from_bottom
                        : R.anim.down_from_top);
        holder.itemView.startAnimation(animation);
        lastPosition = iPosicion;


        holder.imgCancelarCita.setOnClickListener(v -> {

        });
        setAnimation(holder.itemView, position);

    }
    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
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
        ImageButton imgCancelarCita;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDia = itemView.findViewById(R.id.lblDiaCV);
            txtHora = itemView.findViewById(R.id.lblHoraCV);
            txtOperacion = itemView.findViewById(R.id.lblOperacionCV);
            imgCancelarCita = itemView.findViewById(R.id.imgCancelarCita);



        }
    }
}
