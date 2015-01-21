package nanden.rememberforyou;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by nanden on 1/12/15.
 */
public class ItemListViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_listview);

        String[] placeYouAte = {"Ike's place", "San Tung Chinese Restaurant", "Burma Superstar", "Nopa",
        "The House", "Gary Danko", "Wayfare Tavern", "Mama’s on Washington Square", "B Star Bar"};

        ListAdapter itemListViewAdapter = new ArrayAdapter<String>(this,R.layout.row_layout_item,placeYouAte);

        ListView itemListView = (ListView)findViewById(R.id.item_lv);

        itemListView.setAdapter(itemListViewAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
