package com.example.periodictable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.periodictable.game.GameActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Personalitzem el caption
        setTitle("Periodic table");

        // Construim l'adaptador utilitzant un layout per defecte de Android.
        PeriodicTableAdapter adaptador = new PeriodicTableAdapter(this, Elements.elements);

        // Assignem al listview l'adaptador creat
        ListView lst = (ListView)findViewById(R.id.list_main);
        lst.setAdapter(adaptador);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openElementInfo(position);
                //openGame();
            }
        });
    }

    private void openElementInfo(Element el) {
        Bundle b = new Bundle();

        b.putString("symbol", el.getSymbol());
        b.putString("atomicNumber", String.valueOf(el.getAtomicNumber()));
        b.putString("type", el.getType());
        b.putString("name", el.getName());
        b.putString("atomicMass", el.getAtomicMass());
        b.putString("elecConfig", el.getElecConfig());
        b.putString("defaultState", el.getDefaultState());

        Intent intent = new Intent(getApplicationContext(), ElementInfoActivity.class);

        intent.putExtras(b);

        startActivity(intent);
    }

    private void openElementInfo(int idx) {
        this.openElementInfo(Elements.elements[idx]);
    }

    private void openGame() {
        Intent intent = new Intent(getApplicationContext(), GameActivity.class);
        startActivity(intent);
    }
}

class PeriodicTableAdapter extends ArrayAdapter<Element> {
    private Context conxtext;

    public PeriodicTableAdapter(Context context, Element[] data) {
        super(context, R.layout.layout_element, Arrays.copyOfRange(data, 1, data.length));
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.layout_element, null);

        Element el = (Element) getItem(position);



        TextView edt = (TextView)item.findViewById(R.id.textView_name);
        edt.setText(el.getName());

        edt = (TextView)item.findViewById(R.id.textView_min);
        edt.setText(el.getSymbol());

        edt = (TextView)item.findViewById(R.id.textView_num);
        edt.setText(String.valueOf(el.getAtomicNumber()));

        edt = (TextView)item.findViewById(R.id.textView_mass);
        edt.setText(String.valueOf(el.getAtomicMass()));

        item.setBackgroundColor(Utils.getColor(el.getType()));

        return(item);
    }
}
