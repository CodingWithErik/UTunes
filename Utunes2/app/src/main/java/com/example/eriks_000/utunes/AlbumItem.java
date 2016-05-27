package com.example.eriks_000.utunes;

import android.content.Context;
import android.widget.TextView;


/**
 * Created by eriks_000 on 2016-05-26.
 */
public class AlbumItem {
    private String albumName;
    private String artistName;
    private int id;
    private int year;
    private int genre;
    private float price;
    private int in_stock;
    private String cover_image;


    public AlbumItem()
    {


    }
    public void setAlbumName(String albumName)
    {
        this.albumName = albumName;
    }


    public void setArtistName(String artistName)
    {
        this.artistName = artistName;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    public String getArtistName()
    {
<<<<<<< HEAD
        //this.note.setText(setString);
=======
        return artistName;
>>>>>>> refs/remotes/origin/erik_devbranch
    }

    public float getPrice()
    {
        return price;
    }

}
