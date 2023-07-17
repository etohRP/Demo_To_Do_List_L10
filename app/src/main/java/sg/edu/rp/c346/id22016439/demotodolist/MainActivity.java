package sg.edu.rp.c346.id22016439.demotodolist;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvItem;
    ArrayList<ToDoItem> alItem;


    //ArrayAdapter<AndroidVersion> aaAndroidVersions;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem = findViewById(R.id.lvItems);
        alItem = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);



        ToDoItem item1 = new ToDoItem("Go For Movie", date1 );
        ToDoItem item2 = new ToDoItem("Go For Haircut", date2);


        alItem.add(item1);
        alItem.add(item2);



        //aaAndroidVersions = new ArrayAdapter<>(this,
        //android.R.layout.simple_list_item_1, alAndroidVersions);


        adapter = new CustomAdapter(this, R.layout.row, alItem);


        //lvAndroidVersions.setAdapter(aaAndroidVersions);


        lvItem.setAdapter(adapter);
    }
}