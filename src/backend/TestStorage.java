
package backend;

public class TestStorage{
    RecordsStorage rStorage;
    
//    Creating Series
    Series series1 = new Series(true, 120, "Legend of the seeker");    
    Series series2 = new Series(true, 129, "Meerlin");
    
    Film film1 = new Film("Steven Spilberg", 180, "Wicked Uncle's Diary");
    Film film2 = new Film("Steven Scott", 180, "Cocomelon");
    Film film3 = new Film("James Hart", 180, "When a Jack Jills");

    public TestStorage() {
        rStorage = new RecordsStorage();

//      Create and add series episodes
        SeriesEpisode s1e1 = new SeriesEpisode("James Kings", "The beginning of the end");
        SeriesEpisode s1e2 = new SeriesEpisode("James Kings", "Kings and Guards");
        SeriesEpisode s1e3 = new SeriesEpisode("James Kings", "Kind hearted widow");
        rStorage.addEpisodeToSeries(series1.getTitle(), s1e1);
        rStorage.addEpisodeToSeries(series1.getTitle(), s1e2);
        rStorage.addEpisodeToSeries(series1.getTitle(), s1e3);
        
        SeriesEpisode s2e1 = new SeriesEpisode("Arthur Pendragon", "Love at first sight");
        SeriesEpisode s2e2 = new SeriesEpisode("Arthur Pendragon", "Enemies between states");
        SeriesEpisode s2e3 = new SeriesEpisode("James Kings", "Loose end of conversation");
        rStorage.addEpisodeToSeries(series2.getTitle(), s2e1);
        rStorage.addEpisodeToSeries(series2.getTitle(), s2e2);
        rStorage.addEpisodeToSeries(series2.getTitle(), s2e3);
        
//        Add the serries to storage
        rStorage.add(series1);
        rStorage.add(series2);
        rStorage.add(film1);
        rStorage.add(film2);
        rStorage.add(film3);
    }

    public String DisplayRecords(MediaType mediaType) {
        return rStorage.retreiveRecordsToDisplay(mediaType);
    }
    
    

    
    
    

}
