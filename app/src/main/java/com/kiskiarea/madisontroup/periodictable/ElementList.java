package com.kiskiarea.madisontroup.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by madison.troup on 10/29/2015.
 */
public class ElementList extends Activity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elementlist);
        Button e = (Button) findViewById(R.id.next);

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ElementList.this, ElementPage.class));
            }
        });
    }

}
