package com.example.comidarapida_ciclo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.ItemizedOverlayWithFocus;
import org.osmdroid.views.overlay.OverlayItem;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    private MapView myOpenMapView;
    private MapController myMapController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        
        //-------------MAPA--------------------

        Configuration.getInstance().setUserAgentValue(BuildConfig.APPLICATION_ID);

        //-----------PUNTOS DE GEOLOCALIZACION-----------------
        GeoPoint bogota = new GeoPoint(4.6351, -74.0703);
        GeoPoint sucursal01 = new GeoPoint(4.695406, -74.138798);
        GeoPoint sucursal02 = new GeoPoint(4.727298, -74.024511);
        GeoPoint sucursal03 = new GeoPoint(4.686828, -74.075216);
        GeoPoint sucursal04 = new GeoPoint(4.666255, -74.056800);
        GeoPoint sucursal05 = new GeoPoint(4.693586, -74.051111);
        GeoPoint sucursal06 = new GeoPoint(4.729716, -74.045229);
        GeoPoint sucursal07 = new GeoPoint(4.633493, -74.089373);
        GeoPoint sucursal08 = new GeoPoint(4.667148, -74.053537);
        GeoPoint sucursal09 = new GeoPoint(4.592710, -74.123160);
        GeoPoint sucursal10 = new GeoPoint(4.635465, -74.119567);
        GeoPoint sucursal11 = new GeoPoint(4.632358, -74.116329);

        //-----------------------------------------------

        myOpenMapView = (MapView) findViewById(R.id.openmapview);
        myOpenMapView.setBuiltInZoomControls(true);

        myMapController = (MapController) myOpenMapView.getController();
        myMapController.setCenter(bogota);
        myMapController.setZoom(12);

        myOpenMapView.setMultiTouchControls(true);

        final MyLocationNewOverlay myLocationoverlay = new MyLocationNewOverlay(new GpsMyLocationProvider(getApplicationContext()), myOpenMapView);
        myOpenMapView.getOverlays().add(myLocationoverlay); //No añadir si no quieres una marca
        myLocationoverlay.enableMyLocation();

        myLocationoverlay.runOnFirstFix(new Runnable() {
            public void run() {
                myMapController.animateTo(myLocationoverlay.getMyLocation());
            }
        });

        //-------------MARCADORES----------

        ArrayList<OverlayItem> puntos = new ArrayList<OverlayItem>();
        puntos.add(new OverlayItem("Aeropuerto el Dorado", "Calle 26 #103-9", sucursal01));
        puntos.add(new OverlayItem("Belaire", "Carrera 7 #153-74", sucursal02));
        puntos.add(new OverlayItem("Cafam Floresta", "Avenida Carrera 68 # 90-80", sucursal03));
        puntos.add(new OverlayItem("Calle 80", "Calle 80 # 14-44", sucursal04));
        puntos.add(new OverlayItem("Calle 106", "Avenida 19 # 108-15", sucursal05));
        puntos.add(new OverlayItem("Calle 145", "Avenida 19 Con 147", sucursal06));
        puntos.add(new OverlayItem("CC Andino", "Carrera 40 # 25 B 15", sucursal07));
        puntos.add(new OverlayItem("CC Atlantis", "Carrera 12 # 83-02", sucursal08));
        puntos.add(new OverlayItem("CC Centro Mayor", "Calle 38a Sur # 34c 50", sucursal09));
        puntos.add(new OverlayItem("CC Ciudad Salitre", "Carrera 68 # 40-30", sucursal10));
        puntos.add(new OverlayItem("CC Plaza Central", "Carrera 62 Y 65 Con Avenida Calle 13", sucursal11));

        ItemizedIconOverlay.OnItemGestureListener<OverlayItem> tap = new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {
            @Override
            public boolean onItemLongPress(int arg0, OverlayItem arg1) {
                return false;
            }
            @Override
            public boolean onItemSingleTapUp(int index, OverlayItem item) {
                return true;
            }
        };

        ItemizedOverlayWithFocus<OverlayItem> capa = new ItemizedOverlayWithFocus<OverlayItem>(this, puntos, tap);
        capa.setFocusItemsOnTap(true);
        myOpenMapView.getOverlays().add(capa);


        //-------------FRAGMENTS----------------

        Fragment subPantalla1 = new BlankFragment1();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, subPantalla1).commit();

    }

    //----------------------MENU OPCIONES------------------------

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.option00){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity6.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Iniciar Sesión", Toast.LENGTH_LONG).show();
        }
        if (id==R.id.option01){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Menú", Toast.LENGTH_LONG).show();
        }
        if (id==R.id.option02){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Cupones", Toast.LENGTH_LONG).show();
        }
        if (id==R.id.option03){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity4.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Sucursales", Toast.LENGTH_LONG).show();
        }
        if (id==R.id.option04){
            Intent pasarPantalla = new Intent(getApplicationContext(),MainActivity5.class);
            startActivity(pasarPantalla);
            Toast.makeText(this,"Oprimio Acerca de...", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}