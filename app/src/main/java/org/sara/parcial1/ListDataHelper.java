package org.sara.parcial1;


import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewitem> provideItem() {
        ArrayList<ListViewitem> list = new ArrayList<>();
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_blue_bright,  "Holo blue bright", android.R.color.holo_blue_bright));
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_blue_light, "Holo blue light",  android.R.color.holo_blue_light));
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_green_light, "Holo green light", android.R.color.holo_green_light));
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_orange_light, "Holo orange light", android.R.color.holo_orange_light));
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_red_light, "Holo red light", android.R.color.holo_red_light));
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_purple, "Holo purple", android.R.color.holo_purple));


        list.add(new ListViewitem(R.drawable.ic_brightness_holo_blue_dark, "Holo blue dark", android.R.color.holo_blue_dark));
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_green_dark, "Holo green dark", android.R.color.holo_green_dark));
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_red_dark, "Holo red dark", android.R.color.holo_red_dark));
        list.add(new ListViewitem(R.drawable.ic_brightness_holo_orange_dark, "Holo orange dark", android.R.color.holo_orange_dark));





        return list;

    }
}