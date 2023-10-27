package com.globaltest.navigationcomponentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements SomeFragmentClickListener{
    NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    }

    @Override
    public void onFragment1NextClick() {
        navController.navigate(R.id.fragment2);
    }

    @Override
    public void onFragment1BackClick() {

    }

    @Override
    public void onFragment2NextClick() {
        navController.navigate(R.id.fragment3);
    }

    @Override
    public void onFragment2BackClick() {
        navController.popBackStack();
    }

    @Override
    public void onFragment3NextClick() {

    }

    @Override
    public void onFragment3BackClick() {
        navController.popBackStack();
    }
}