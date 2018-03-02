package uk.jtech.pokedex.pokedex;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import stanford.androidlib.SimpleActivity;
import stanford.androidlib.SimpleFragment;
import uk.jtech.pokedex.R;

// Note: I've got a problem with GitHub connection, the YouTube lesson is frozen
// and it is not synchronized so, the progress cannot be tracked because
// I had to upload everything after finished it by complete


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends SimpleFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_details, container, false );
    }

    /*
     * Called when the activity this fragment is inside of has been created.
     * This is where we put our initialization code that would have been in 'onCreate'.
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated( savedInstanceState );
        SimpleActivity activity = getSimpleActivity();
        String pokemonName = activity.getStringExtra( "pokemon_name", "Pikachu" );
        setPokemonName( pokemonName );
    }

    /*
     * Sets this fragment to display the pokemon with the given name.
     * Shows that pokemon's name, image, and text about that pokemon
     * from a file with a corresponding name.
     */
    public void setPokemonName(String pokemonName) {
        SimpleActivity activity = getSimpleActivity();
        int imageID = activity.getResourceId( pokemonName.toLowerCase(), "drawable" );
        int fileID = activity.getResourceId( pokemonName.toLowerCase(), "raw" );
        String fileText = activity.readFileText( fileID );
        activity.$TV( R.id.pokemon_name ).setText( pokemonName );
        activity.$IV( R.id.pokemon_image ).setImageResource( imageID );
        activity.$TV( R.id.pokemon_details ).setText( fileText );
    }
}
