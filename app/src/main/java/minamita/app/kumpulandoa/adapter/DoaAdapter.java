package minamita.app.kumpulandoa.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import minamita.app.kumpulandoa.DetailActivity;
import minamita.app.kumpulandoa.R;
import minamita.app.kumpulandoa.model.modelDoa;

import java.util.List;

/**
 * Created by ole on 11/13/18.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<modelDoa> doas;


    public DoaAdapter(List<modelDoa> doas) {
        this.doas=doas;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa,null));
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        holder.txtNamaDoa.setText(doas.get(position).getNama());
        holder.txtArtiDoa.setText(doas.get(position).getArti());

        holder.cardItemDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetailActivity.class);
                i.putExtra("id_nama", doas.get(position).getNama());
                i.putExtra("id_surah", doas.get(position).getSurah());
                i.putExtra("id_baca", doas.get(position).getBaca());
                i.putExtra("id_arti", doas.get(position).getArti());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}

class DoaHolder extends RecyclerView.ViewHolder{

    public TextView txtNamaDoa;
    public TextView txtArtiDoa;
    public View cardItemDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        cardItemDoa = itemView.findViewById(R.id.carditem_doa);
        txtNamaDoa = itemView.findViewById(R.id.txt_Nama_Doa);
        txtArtiDoa = itemView.findViewById(R.id.txt_Arti_Doa);
    }

}

