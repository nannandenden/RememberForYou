package nanden.rememberforyou;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by nanden on 1/6/15.
 */


public class MapActivity extends Activity implements OnMapReadyCallback, View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    public void onMapReady(GoogleMap map) {

        LatLng STAR_MARKER_POSITION = new LatLng(-33.867, 151.206);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(STAR_MARKER_POSITION, 13));


//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.star);
//        BitmapDescriptor bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(bitmap);

        BitmapDescriptor bitmapDescriptor = BitmapDescriptorFactory.fromResource(R.drawable.star);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("STAR MARKER");
        markerOptions.icon(bitmapDescriptor);
        markerOptions.position(STAR_MARKER_POSITION);

        map.addMarker(markerOptions);



    }


    @Override
    public void onClick(View v) {

    }
}






