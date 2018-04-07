package com.envirogram.sbhack.envirogram;

public class Post {

    private int likeCount, imageViewResource;
    private String caption, username;

    public Post(int likeCount, int imageViewResource, String caption, String username){
        this.likeCount=likeCount;
        this.imageViewResource=imageViewResource;
        this.caption=caption;
        this.username=username;
    }

    public int getLikeCount(){
        return likeCount;
    }

    public int getImageViewResource(){
        return imageViewResource;
    }

    public String getCaption(){
        return caption;
    }

    public String getUsername(){
        return username;
    }


}
