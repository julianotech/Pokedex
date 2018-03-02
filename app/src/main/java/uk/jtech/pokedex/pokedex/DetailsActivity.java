package uk.jtech.pokedex.pokedex;

import android.os.Bundle;

import stanford.androidlib.SimpleActivity;
import uk.jtech.pokedex.R;

// Note: I've got a problem with GitHub connection, the YouTube lesson is frozen
// and it is not synchronized so, the progress cannot be tracked because
// I had to upload everything after finished it by complete

public class DetailsActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_details );
        String pokemonName = getStringExtra( "pokemon_name", "Pikachu" );
        setPokemonName( pokemonName );
    }

    public void setPokemonName(String pokemonName) {
        int imageID = getResourceId( pokemonName.toLowerCase(), "drawable" );
        int fileID = getResourceId( pokemonName.toLowerCase(), "raw" );
        String fileText = readFileText( fileID );
        $TV( R.id.pokemon_name ).setText( pokemonName );
        $IV( R.id.pokemon_image ).setImageResource( imageID );
        $TV( R.id.pokemon_details ).setText( fileText );
    }
}
