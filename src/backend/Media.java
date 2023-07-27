/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.logging.Logger;

/**
 *
 * @author desti
 */
public abstract class Media {
    private int duration;
    private String title;
    private MediaType mediaType;

    public Media(int duration, String title, MediaType mediaType) {
        this.duration = duration;
        this.title = title;
        this.mediaType = mediaType;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public MediaType getMediaType() {
        return mediaType;
    }
    
    public abstract double getCost();

    @Override
    public String toString() {
        return "duration=" + duration + ", title='" + title + "', type=" + mediaType + ", cost=" + getCost();
    }

    public final int compare(Media o1, Media o2) {
//        if(o1.mediaType == MediaType.FILM){
//            return o1.duration - o2.duration;
//        }
//        if(o1.mediaType == MediaType.SERIES){
//            return o1.title - o2.title;
//        }
        return 0;
    }
    
}
