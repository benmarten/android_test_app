package me.benmarten.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.benmarten.library.LibraryClass;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    LibraryClass.log(); // Can be accessed.
  }
}
