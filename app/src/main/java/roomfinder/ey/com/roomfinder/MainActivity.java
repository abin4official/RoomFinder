package roomfinder.ey.com.roomfinder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity  {
    Spinner spinner_location,spinner_building;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_location = (Spinner) findViewById(R.id.spinner_location);
        spinner_building = (Spinner) findViewById(R.id.spinner_building);
        String[] locations = {"Select Location","Thiruvananthapuram","Kochi"};
        ArrayAdapter<CharSequence> langAdapter = new ArrayAdapter<CharSequence>(MainActivity.this, R.layout.spinner_text, locations );
        langAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner_location.setAdapter(langAdapter);

        spinner_location.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                switch (position) {
                    case 0:
                        break;
                    case 1:
                        setBuildingSpinner();
                        break;
                    case 2:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    private void setBuildingSpinner() {
        spinner_building = (Spinner) findViewById(R.id.spinner_building);
        String[] buildings = {"Select Building","Kinfra","Thejaswini","Gayatri"};
        ArrayAdapter<CharSequence> langAdapter = new ArrayAdapter<CharSequence>(MainActivity.this, R.layout.spinner_text, buildings );
        langAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner_building.setAdapter(langAdapter);
    }
}
