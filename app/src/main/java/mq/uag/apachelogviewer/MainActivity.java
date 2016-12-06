package mq.uag.apachelogviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private List<LogEntry> _activeViewList = new ArrayList<>();
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLogList();

        //region ############Quand les test sont tous verts décommenter############
        /*lv = (ListView) findViewById(R.id.mainLV);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,
                LogManager.getDisplayList(_activeViewList));

        lv.setAdapter(arrayAdapter);*/
        //endregion

    }

    /**
     * Préconditions: aucune
     * PostConditions : Le fichier access_log est chargé sous forme de LogEntry dans _activeViewList
     */
    private void initLogList()
    {
        Scanner s = new Scanner(getResources().openRawResource(R.raw.access_log));
        s.useDelimiter("\\r\\n");

        try {
            while (s.hasNext()) {
                /*A vous de coder !!!*/
            }
        } finally {
            s.close();
        }
    }


}
