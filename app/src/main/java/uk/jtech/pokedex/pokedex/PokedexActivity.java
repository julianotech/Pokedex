package uk.jtech.pokedex.pokedex;

import android.os.Bundle;

import stanford.androidlib.SimpleActivity;
import uk.jtech.pokedex.R;

// Note: I've got a problem with GitHub connection, the YouTube lesson is frozen
// and it is not synchronized so, the progress cannot be tracked because
// I had to upload everything after finished it by complete

public class PokedexActivity extends SimpleActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pokedex );
    }
}
