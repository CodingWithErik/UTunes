package com.example.eriks_000.utunes;



/**
 * Created by eriks_000 on 2016-05-26.
 */
public class AlbumItem {
    private String title;
    private String artist;
    private int id;
    private int year;
    private int genre;
    private float price;
    private int in_stock;
    private String cover_image;

    public AlbumItem(int id, int genre, String title)
    {
        this.id = id;
        this.genre = genre;
        this.title = title;

    }

    public void SetNote(String setString)
    {
        //this.note.setText(setString);
    }


}
