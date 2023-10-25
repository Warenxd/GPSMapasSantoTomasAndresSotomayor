package com.example.tallerandroid2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLatitud, txtLongitud;
    String[] Sedes = {"Santo Tomas Arica", "Santo Tomas Iquique", "Santo Tomas Antofagasta", "Santo Tomas La Serena", "Santo Tomas Viña del Mar", "Santo Tomas Santiago", "Santo Tomas Talca",
            "Santo Tomas Concepción", "Santo Tomas Los Angeles", "Santo Tomas Temuco", "Santo Tomas Valdivia", "Santo Tomas Osorno", "Santo Tomas Puerto Montt",};

    //                   Arica -- Iquique - Antofagasta - Serena - Viña -- Santiago - Talca - Concepción - LosAngeles - Temuco -- Valdivia - Osorno - Puerto Montt
    double[] Latitud = {-18.4746, -20.21326, -23.65236, -29.90453, -33.02457, -33.45694, -35.4264, -36.82699,   -37.46973,   -38.73965, -39.81422, -40.57395, -41.4693};
    double[] Longitud ={-70.29792, -70.15027, -70.3954, -71.24894, -71.55183, -70.64827, -71.65542, -73.04977,  -72.35366,   -72.59842, -73.24589, -73.13348, -72.94237};

    GoogleMap mMap;
    LatLng sedeLatLng = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud = findViewById(R.id.txt_Latitud);
        txtLongitud = findViewById(R.id.txt_Longitud);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
        VideoView videoST = findViewById(R.id.videoView);
        videoST.setVisibility(View.GONE);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        for (int i = 0; i < Sedes.length; i++) {
            sedeLatLng = new LatLng(Latitud[i], Longitud[i]);
            mMap.addMarker(new MarkerOptions().position(sedeLatLng).title(Sedes[i]));
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sedeLatLng));





        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(@NonNull Marker marker) {
                VideoView videoST = findViewById(R.id.videoView);

                String tituloMarcador = marker.getTitle();
                LatLng LatLongMarcador = marker.getPosition();

                if(tituloMarcador.equals("Santo Tomas Arica")){
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://"+getPackageName()+"/"+R.raw.sede_arica;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Iquique")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://"+getPackageName()+"/"+R.raw.sede_iquique;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Antofagasta")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_antofagasta;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas La Serena")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_laserena;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Viña del Mar")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_viniadelmar;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Santiago")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_santiago;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Talca")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_talca;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Concepción")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_concepcion;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Los Angeles")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_losangeles;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Temuco")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_temuco;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Valdivia")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_valdivia;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Osorno")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_osorno;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();

                } else if (tituloMarcador.equals("Santo Tomas Puerto Montt")) {
                    videoST.setVisibility(View.VISIBLE);
                    String video = "android.resource://" + getPackageName() + "/" + R.raw.sede_puertomontt;
                    Uri uri = Uri.parse(video);
                    videoST.setVideoURI(uri);
                    videoST.start();
                }
                else {
                    videoST.setVisibility(View.GONE);
                }
                txtLatitud.setText(String.valueOf(LatLongMarcador.latitude));
                txtLongitud.setText(String.valueOf(LatLongMarcador.longitude));
                return false;
            }
        });
    }


    
    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        VideoView videoST = findViewById(R.id.videoView);

        videoST.setVisibility(View.GONE);
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);

    }
    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        VideoView videoST = findViewById(R.id.videoView);

        videoST.setVisibility(View.GONE);
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
}