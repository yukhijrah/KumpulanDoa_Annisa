package minamita.app.kumpulandoa.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import minamita.app.kumpulandoa.R;
import minamita.app.kumpulandoa.adapter.DoaAdapter;
import minamita.app.kumpulandoa.model.modelDoa;

import java.util.ArrayList;
import java.util.List;


public class Doa extends Fragment {
    private List<modelDoa> doas = new ArrayList<>();

    RecyclerView lstDoa;
    LinearLayoutManager linear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_doa,container,false);
        lstDoa = view.findViewById(R.id.rvDoa);

        linear = new LinearLayoutManager(getActivity());
        lstDoa.setLayoutManager(linear);

        doasCollection();

        return view;
    }



    private void doasCollection(){
        doas.add(new modelDoa("Doa Belajar", "يَارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا", "Yaa robbi zidnii 'ilman warzuqnii fahmaa", "Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman\"."));
        doas.add(new modelDoa("Doa Makan", "الَّلهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا، وَقِنَا عَذَابَ النَّارِ","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar", "Segala puji bagi Allah yang memberi kami makan dan minum serta menjadikan kami memeluk agama islam"));
        doas.add(new modelDoa("Doa Tidur", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ","Bismikallohumma ahya wa amuutu", "Dengan menyebut Nama-Mu Ya Allah Aku Hidup dan dengan menyebut Nama-Mu Aku Mati"));
        doas.add(new modelDoa("Doa Berpergian", "اَللّٰهُمَّ هَوِّنْ عَلَيْنَا سَفَرَنَا هَذَا وَاطْوِعَنَّابُعْدَهُ اَللّٰهُمَّ اَنْتَ الصَّاحِبُ فِى السَّفَرِوَالْخَلِيْفَةُفِى الْاَهْلِ","Alloohumma hawwin 'alainaa safaranaa hadzaa waatwi 'annaa bu'dahu. Alloohumma antashookhibu fiissafari walkholiifatu fiil ahli", "Ya Allah, mudahkanlah kami berpergian ini, dan dekatkanlah kejauhannya. Ya Allah yang menemani dalam berpergian, dan Engkau pula yang melindungi keluarga"));
        doas.add(new modelDoa("Doa Ketika Mimpi Buruk", "اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ","Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami", "Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk"));
        doas.add(new modelDoa("Doa Ketika Mendapat Mimpi Baik", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ","Alhamdulillahil ladzii qodzoo haajaati", "Segala puji bagi Allah yang telah memberi hajatku"));
        doas.add(new modelDoa("Doa Masuk Kamar Mandi", "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ","Alloohumma Innii auudzubika minal khubutsi wal khoaaitsi", "Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan syetan perempuan"));
        doas.add(new modelDoa("Doa Istinja", "اَللّٰهُمَّ طَهِّرُ قَلْبِىْ مِنَ النِّفَاقِ وَحَصِّنْ فَرْخِىْ مِنَ الْفَوَاحِشِ","Alloohumma thahhir qolbii minan nifaaqi wa hashshin fajrii minal fawaahisyi", "Wahai Tuhanku, sucikanlah hatiku dari sifat kepura-puraan (munafiq) serta peliharalah kemaluanku dari perbuatan keji"));
        doas.add(new modelDoa("Doa Menjelang Sholat Subuh", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ","Alloohumma inni a'udzubika min dzhiiqid-dunyaa wa dzhiiqi yaumal-qiyaamati", "Ya Allah! Sesungguhnya aku berlindung kepada-Mu dari kesempitan dunia dan kesempitan hari kiamat"));
        doas.add(new modelDoa("Doa Menyambut Pagi hari","Alloohumma bika ashbahnaa wa bika amsainaa wa bika nahyaa wa bika namuutu wa ilaikan nusyuuru", "اَللّٰهُمَّ بِكَ اَصْبَحْنَا وَبِكَ اَمْسَيْنَا وَبِكَ نَحْيَا وَبِكَ نَمُوْتُ وَاِلَيْكَ النُّشُوْرُ", "Ya Allah, karena Engkau kami mengalami waktu pagi dan waktu petang, dan karena Engkau kami hidup dan mati dan kepada-Mu juga kami akan kembali."));
        doas.add(new modelDoa("Doa Ketika Bercermin", "اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ","Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii", "Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku"));

        DoaAdapter adapter = new DoaAdapter(doas);

        lstDoa.setAdapter(adapter);

    }
}
