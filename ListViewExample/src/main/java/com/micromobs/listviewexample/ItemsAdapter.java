package com.micromobs.listviewexample;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemsAdapter extends BaseAdapter {

    final String TAG = "ItemsAdapter";

    ViewHolder holder = null;

	static class ViewHolder {
		TextView itemText;
	}

	private List<Item> items;
	private final Context context;
	
	public ItemsAdapter(Context context, List<Item> objects) {
		this.context = context;
		this.items = objects;
	}

    public Item getItem(int position) {
		if (position < items.size())
			return items.get(position);
		return null;
	}

	public int getCount() {
		return items.size();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;

        if (v == null) {
            Log.d(TAG, "is null");
        }
        else {
            Log.d(TAG, "is not null");
        }

		if (v == null) {
			LayoutInflater vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.list_item, null);

            holder = new ViewHolder();

            holder.itemText = (TextView) v.findViewById(R.id.item_text);

            v.setTag(holder);
        } else {
            holder = (ViewHolder)v.getTag();
        }

        Item currentItem = items.get(position);
        holder.itemText.setText(currentItem.myItemText);

		return v;
	}

    @Override
	public long getItemId(int position) {
		return position;
	}
}
