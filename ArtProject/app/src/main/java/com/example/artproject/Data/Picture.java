package com.example.artproject.Data;

import java.io.Serializable;

public class Picture implements Serializable {
    private String id;
    private String name;
    private String artist;
    private int cost;
    private int src;
    private String url;

    public Picture(){}
    public Picture(String id, String name, String artist, int cost,int src, String url){
        setID(id);
        setName(name);
        setArtist(artist);
        setCost(cost);
        setSrc(src);
        setUrl(url);
    }
    public void setID(String id) { this.id=id; }
    public void setName(String name){ this.name=name;}
    public void setArtist(String artist) { this.artist=artist;}
    public void setCost(int cost) { this.cost=cost; }
    public void setSrc(int src) { this.src=src; }
    public void setUrl(String url) {this.url=url;}

    public String getID() { return id; }
    public String getName(){ return name; }
    public String getArtist(){ return artist; }
    public int getCost(){ return cost; }
    public int getSrc(){ return src; }
    public String getUrl(){ return url; }

}
