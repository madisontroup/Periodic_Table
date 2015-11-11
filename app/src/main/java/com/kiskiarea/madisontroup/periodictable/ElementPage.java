package com.kiskiarea.madisontroup.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by madison.troup on 10/30/2015.
 */
public class ElementPage extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elementpage);

        Button Button = (Button)findViewById(R.id.history);

        Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://education.jlab.org/itselemental/ele004.html"));
                startActivity(intent);
            }
        });
    }
}
