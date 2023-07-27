/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author desti
 */
public class Series extends Media{
    private final Set<SeriesEpisode> episodes = new TreeSet<>();
    private boolean isFree;

    public Series(boolean isFree, int duration, String title) {
        super(duration, title, MediaType.SERIES);
        this.isFree = isFree;
    }

    public Set<SeriesEpisode> getEpisodes() {
        return episodes;
    }
    
    public void addEpisode(SeriesEpisode episode) {
        episodes.add(episode);
    }

    @Override
    public double getCost() {
        double Cost;
        Cost = (super.getDuration() * 0.06) * episodes.size();
        return Cost;
    }

    @Override
    public String toString() {
        return "Series{" + super.toString() + " episodes=" + episodes.toString() + ", isFree=" + isFree + '}';
    }
}
