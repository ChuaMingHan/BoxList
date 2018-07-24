package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010265 on 07/24/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<colouritem> colourList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<colouritem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        colourList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView lvColour = rowView.findViewById(R.id.imageViewImpt);

        colouritem currentItem = colourList.get(position);

        if (currentItem.isBlue()) {
            lvColour.setImageResource(R.drawable.blue_box);
        }
        else if (currentItem.isOrange()) {
            lvColour.setImageResource(R.drawable.orange_box);
        } else {
            lvColour.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}
