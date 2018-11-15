package minamita.app.kumpulandoa.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import minamita.app.kumpulandoa.R;
import minamita.app.kumpulandoa.adapter.JadwalAdapter;
import minamita.app.kumpulandoa.model.modelJadwal;

import java.util.ArrayList;
import java.util.List;


public class home extends Fragment {
    private List<modelJadwal> jadwals=new ArrayList<>();

    RecyclerView lstJadwal;
    LinearLayoutManager linear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.fragment_home,container,false);
        lstJadwal=view.findViewById(R.id.rvJadwal);
        linear=new LinearLayoutManager(getActivity());
        lstJadwal.setLayoutManager(linear);

        JadwalAdapter adapter = new JadwalAdapter(jadwals);
        lstJadwal.setAdapter(adapter);

        jadwalsCollect();

        return view;
    }
    private void jadwalsCollect(){
        jadwals.add(new modelJadwal("Imsak","03:55 WIB"));
        jadwals.add(new modelJadwal("Subuh","04:05 WIB"));
        jadwals.add(new modelJadwal("Fajr","05:22 WIB"));
        jadwals.add(new modelJadwal("Dzuhur","11:39 WIB"));
        jadwals.add(new modelJadwal("Ashar","15:00 WIB"));
        jadwals.add(new modelJadwal("Maghrib","17:51 WIB"));
        jadwals.add(new modelJadwal("Isya","19.04 WIB"));
    }

}
