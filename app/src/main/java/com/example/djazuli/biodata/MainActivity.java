package com.example.djazuli.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String no_telp = "0811853616";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Email(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","grey.hanif@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Judul Email");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

    public void Alamat(View view) {
        Uri uri = Uri.parse("https://goo.gl/maps/XMg8Wb7aoNP2");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void Telepon(View view) {
        Intent intentIndirect = new Intent(Intent.ACTION_DIAL);
        intentIndirect.setData(Uri.parse("tel:" +no_telp));
        startActivity(intentIndirect);
    }
}
