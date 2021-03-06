package com.example.mmhp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by yidingfan on 2017-10-13.
 */

public class Event implements Comparable<Event>{
    private String id;
    private String habit;
    private Date happend;
    private String url_img;
    private String owner_comment;
    private String location;
    private ArrayList<String> pub_comment;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public Event(String location, String habit, String url_img, String comment, String id){
        this.location=location;
        this.habit=habit;
        this.url_img=url_img;
        this.id = id;
        this.owner_comment=comment;
        this.happend=new Date();
    }
    public void pub_comment(String comment){
        if(this.pub_comment.isEmpty()){
            this.pub_comment=new ArrayList<String>();
        }
        this.pub_comment.add(comment);
    }

    public String getId(){
        return this.id;
    }
    public String getOwner_comment(){
        return this.owner_comment;
    }
    public String getHabit(){
        return this.habit;
    }
    public String getHappend(){
        return dateFormat.format(this.happend);
    }
    public Date getHabitDate(){
        return this.happend;
    }
    public ArrayList<String> getPub_comment(){
        return this.pub_comment;
    }
    public String getUrl_img(){
        return this.url_img;
    }
    public String getLocation(){
        return  this.location;
    }


    @Override
    public int compareTo(Event e) {
        Date d1=this.happend;
        Date d2=e.getHabitDate();
        return d1.compareTo(d2);
    }
}
