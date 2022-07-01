package com.example.makanterdekat_10119279;

/**
 * NIM      : 10119279
 * Nama     : Martua Febrianto
 * Kelas    : IF-7
 */


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class tempatTerdekatFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Initialize view
        View view = inflater.inflate(R.layout.fragment_maps, container, false);

        SupportMapFragment mapFragment=(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.fragment_googleMap);

        // check condition
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(getActivity(),
                Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            mapFragment.getMapAsync(googleMap -> {
                //Lokasi 1
                LatLng lokasi1 = new LatLng(-6.887539779078464, 107.61538402432093);
                MarkerOptions options1 = new MarkerOptions().position(lokasi1).title("Warung Nasi Babeh");
                //Lokasi 2
                LatLng lokasi2 = new LatLng(-6.88657815316004, 107.61503211244212);
                MarkerOptions options2 = new MarkerOptions().position(lokasi2).title("Ayam SPG");
                //Lokasi 3
                LatLng lokasi3 = new LatLng(-6.887790967515732, 107.6151655057611);
                MarkerOptions options3 = new MarkerOptions().position(lokasi3).title("Richeese");
                //Lokasi 4
                LatLng lokasi4 = new LatLng(-6.888274614527028, 107.6165940164085);
                MarkerOptions options4 = new MarkerOptions().position(lokasi4).title("Warkop99");
                //Lokasi 5
                LatLng lokasi5 = new LatLng(-6.887543819589651, 107.61635951250483);
                MarkerOptions options5 = new MarkerOptions().position(lokasi5).title("Warkop Sariwangi");

                googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lokasi3,17));
                googleMap.addMarker(options1);
                googleMap.addMarker(options2);
                googleMap.addMarker(options3);
                googleMap.addMarker(options4);
                googleMap.addMarker(options5);


            });
        }
        else {
            // When permission is not granted
            // Call method
            requestPermissions(new String[] {Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION }, 100);
        }
        // Return view
        return view;
    }
}