package asoftwaresolution.mismapasguatemala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irProceres(View view)
    {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra(getResources().getString(R.string.lat), 14.59476880196551);
        intent.putExtra(getResources().getString(R.string.lng), -90.51550044049281);
        startActivity(intent);
    }

    public void irPradera(View view)
    {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra(getResources().getString(R.string.lat), 14.579810760039514);
        intent.putExtra(getResources().getString(R.string.lng), -90.4953969758774);
        startActivity(intent);
    }

    public void irPricesmart(View view)
    {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra(getResources().getString(R.string.lat), 14.584535131505126);
        intent.putExtra(getResources().getString(R.string.lng), -90.49930227220308);
        startActivity(intent);
    }

    public void irArkadia(View view)
    {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra(getResources().getString(R.string.lat), 14.580488604130744);
        intent.putExtra(getResources().getString(R.string.lng), -90.49286099999995);
        startActivity(intent);
    }
}
