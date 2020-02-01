package com.example.artproject.Client;

import com.example.artproject.Data.Picture;
import com.example.artproject.Data.Taste;
import com.example.artproject.Data.User;
import com.example.artproject.R;

import java.util.ArrayList;

public class ClientInfoManager {
    static private ClientInfoManager Instance= new ClientInfoManager();
    static public ClientInfoManager getInstance() {
        if(Instance==null) Instance=new ClientInfoManager();
        return Instance;
    }
    private User user;
    private ArrayList<Picture> pictures;
    private ArrayList<Picture> recommendPictures;
    private ArrayList<Taste> tastes;


    public ClientInfoManager(){
        user=new User();
        pictures=new ArrayList<Picture>();
        recommendPictures=new ArrayList<Picture>();
        tastes=new ArrayList<Taste>();

        setTestPictureSet();
        setTestRecommendPictureSet();
        setTestTasteSet();
    }
    public void setUser(User user){
        this.user=user;
    }
    public void setPictures(ArrayList<Picture> pictures) {this.pictures=pictures;}
    public void setRecommendPictures(ArrayList<Picture> pictures) {this.recommendPictures=pictures;}
    public void setTastes(ArrayList<Taste> tastes) { this.tastes=tastes; }

    public void addPicture(Picture picture) { pictures.add(picture);}
    public void addRecommendPicture(Picture picture) { recommendPictures.add(picture);}
    public void addTaste(Taste taste) {tastes.add(taste);}

    public User getUser() { return user; }
    public ArrayList<Picture> getPictures(){ return pictures;}
    public ArrayList<Picture> getRecommendPictures(){ return recommendPictures;}
    public ArrayList<Taste> getTastes(){ return tastes;}

    public void setTestTasteSet() {
        tastes.add(new Taste("taste1",R.drawable.ba1));
        tastes.add(new Taste("taste2",R.drawable.ba1));
        tastes.add(new Taste("taste3",R.drawable.ba1));
        tastes.add(new Taste("taste4",R.drawable.ba1));
        tastes.add(new Taste("taste5",R.drawable.ba1));
        tastes.add(new Taste("taste6",R.drawable.ba1));
        tastes.add(new Taste("taste7",R.drawable.ba1));
    }


    public void setTestRecommendPictureSet() {
        int[] src ={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11,R.drawable.image12};
        for(int i=0;i<11;i++) {
            recommendPictures.add(new Picture("id"+i, "name"+i, "artist"+i, i*100, src[i], null));
        }
        recommendPictures.add(new Picture("id1", "name1", "artist1", 100, R.drawable.ba1, null));
        recommendPictures.add(new Picture("id2", "name2", "artist2", 200, R.drawable.ba2, null));
        recommendPictures.add(new Picture("id3", "name3", "artist3", 300, R.drawable.ba3, null));
    }
    public void setTestPictureSet() {
        int[] src ={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11,R.drawable.image12};
        for(int i=10;i>-1;i--) {
            pictures.add(new Picture("id"+i, "name"+i, "artist"+i, i*100, src[i], null));
        }
        for(int i=0;i<11;i++) {
            pictures.add(new Picture("id"+i, "name"+i, "artist"+i, i*100, src[i], null));
        }
        pictures.add(new Picture("id1", "name1", "artist1", 100, R.drawable.ba1, null));
        pictures.add(new Picture("id2", "name2", "artist2", 200, R.drawable.ba2, null));
        pictures.add(new Picture("id3", "name3", "artist3", 300, R.drawable.ba3, null));
    }

    //TO-DO : create method for changing user's information
}
