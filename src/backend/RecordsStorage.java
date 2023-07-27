/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author desti
 */
public class RecordsStorage {
    private Map<String, Media> recordsStorage;

    public RecordsStorage() {
        this.recordsStorage = new HashMap<>();
    }

    public Media find(String title){
        return recordsStorage.get(title);
    }
    
    public boolean add(Media media){
        if(media != null){
            recordsStorage.put(media.getTitle(), media);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean addEpisodeToSeries(String seriesTitle, SeriesEpisode se){
        if(se != null){
            Media media = this.find(seriesTitle);
            if(media != null && media.getMediaType() == MediaType.SERIES){
                Series series = new Series(true, media.getDuration(), seriesTitle);
                series.addEpisode(se);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public boolean delete(String title){
        Media media = this.find(title);
        if(media == null){
            return false;
        }else{
            recordsStorage.put(media.getTitle(), media);
            return true;
        }
    }
    
    public void deleteAll(){
        recordsStorage.clear();
    }
    
    public String retreiveRecordsToDisplay(MediaType mediaType){
        String outputStr = "";
        double totalCost = 0.0;
        for (Map.Entry<String, Media> entry : recordsStorage.entrySet()) {
            String title = entry.getKey();
            Media media = entry.getValue();
            if(mediaType == MediaType.ALL){
                outputStr += media.toString() + "\n";
                totalCost += media.getCost();
            }else{
                if(media.getMediaType().equals(mediaType)){
                    outputStr += media.toString() + "\n";
                    totalCost += media.getCost();
                }
            }
        }
        DecimalFormat decFormat = new DecimalFormat("0.00");
        outputStr += "Total Cost = " + decFormat.format(totalCost);
        return outputStr;
    }
}
