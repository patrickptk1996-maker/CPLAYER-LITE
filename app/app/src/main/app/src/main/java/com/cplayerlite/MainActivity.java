
package com.cplayerlite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView texto = new TextView(this);
        texto.setText("CPLAYER LITE FUNCIONANDO!");
        texto.setTextSize(24);
        texto.setGravity(17);

        setContentView(texto);
    }
}
