package app.sunshine.android.example.cristian.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_main, container, false);
        String[] array={
                "Hoy - Lluvioso - 67/78",
                "Mañana - Soleado - 65/83",
                "Jueves - Nublado - 33/45",
                "Viernes - Soleado - 44/55",
                "Sabado - Nublado - 37/65",
                "Domingo - Lluvioso - 31/45",
                "Lunes - Nieve - 0/12",
                "Otro dia - EO - 10/14",
                "EO",
                "EO",
                "EE",
                "EI",
                "EU"

        };
        ArrayList<String> datos= new ArrayList<String>(Arrays.asList(array));
        ArrayAdapter<String> addaptercreado=new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,array);
        ListView listView= (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(addaptercreado);
        return rootView;
    }
}
