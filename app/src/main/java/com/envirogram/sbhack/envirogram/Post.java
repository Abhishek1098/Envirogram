package com.envirogram.sbhack.envirogram;

import android.graphics.Bitmap;

public class Post {

    private int likeCount;
    private String caption, username;
    private Bitmap bitmap;

    public Post(int likeCount, Bitmap bitmap, String caption, String username){
        this.likeCount=likeCount;
        this.bitmap=bitmap;
        this.caption=caption;
        this.username=username;
    }

    public int getLikeCount(){
        return likeCount;
    }

    public Bitmap getImageViewResource(){
        return bitmap;
    }

    public String getCaption(){
        return caption;
    }

    public String getUsername(){
        return username;
    }


}
