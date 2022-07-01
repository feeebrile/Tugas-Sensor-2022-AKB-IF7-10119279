package com.example.makanterdekat_10119279;

/**
 * NIM      : 10119279
 * Nama     : Martua Febrianto
 * Kelas    : IF-7
 */


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import com.example.makanterdekat_10119279.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFagment(new profileFragment());

        binding.bnvBottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.navProfile:
                    replaceFagment(new profileFragment());
                    break;
                case R.id.navTempatTerdekat:
                    replaceFagment(new tempatTerdekatFragment());
                    break;
                case R.id.navMaps:
                    replaceFagment(new MapsFragment());
                    break;
                case R.id.navTentang:
                    replaceFagment(new tentangFragment());
                    break;

            }

            return true;
        });
    }

    private void replaceFagment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentBase,fragment);
        fragmentTransaction.commit();
    }
}