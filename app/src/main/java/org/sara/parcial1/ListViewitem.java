package org.sara.parcial1;

public class ListViewitem {

    private int imageResource;
    private String title;

    public ListViewitem(int imageResource, String title) {
        this.imageResource = imageResource;
        this.title = title;
    }

    public ListViewitem(int imageResource, String title, int holo_blue_bright1) {
        this.imageResource = imageResource;
        this.title = title;
    }

    public int getImageResource() {
        return imageResource;}

    public String getTitle () {return title; }
}
