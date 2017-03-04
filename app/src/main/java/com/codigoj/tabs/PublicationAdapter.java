package com.codigoj.tabs;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JHON on 21/02/2017.
 */

public class PublicationAdapter extends RecyclerView.Adapter<PublicationAdapter.PublicationViewHolder> {

    List<Publication> publications;

    public PublicationAdapter(List<Publication> publications) {
        this.publications = publications;
    }

    @Override
    public PublicationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pub, parent, false);
        PublicationViewHolder pvh = new PublicationViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PublicationViewHolder holder, int position) {
        holder.nombre.setText(publications.get(position).getName());
        //holder.image.setImageBitmap(publications.get(position).GET_IMAGEN_FROM_INTERNET);
        holder.description.setText(publications.get(position).getDescription());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return publications.size();
    }

    public static class PublicationViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView nombre;
        ImageView image;
        TextView description;

        public PublicationViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card);
            nombre = (TextView) itemView.findViewById(R.id.cardNombre);
            image = (ImageView) itemView.findViewById(R.id.cardImage);
            description = (TextView) itemView.findViewById(R.id.cardDescription);
        }
    }
}
