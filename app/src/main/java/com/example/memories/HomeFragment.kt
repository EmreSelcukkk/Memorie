package com.example.memories


import androidx.fragment.app.Fragment
import com.example.memories.databinding.FragmentHomeBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding



    class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

        private lateinit var mMap: GoogleMap

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
                setContentView(R.layout.fragment_home)

            // Harita Fragment'ini al
            val mapFragment = supportFragmentManager
                .findFragmentById(R.id.mapView) as SupportMapFragment
            mapFragment.getMapAsync(this)
        }

        override fun onMapReady(googleMap: GoogleMap) {
            mMap = googleMap

            // İstanbul'un koordinatlarını belirle
            val istanbul = LatLng(41.0082, 28.9784)

            // Haritaya işaretçi ekle
            mMap.addMarker(MarkerOptions().position(istanbul).title("İstanbul"))

            // Kamerayı İstanbul'a odakla
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(istanbul, 10f))
        }
    }




}