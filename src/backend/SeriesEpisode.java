
package backend;

public class SeriesEpisode {
    private String directorName;    
    private String episodeTitle;

    public SeriesEpisode(String directorName, String episodeTitle) {
        this.directorName = directorName;
        this.episodeTitle = episodeTitle;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    @Override
    public String toString() {
        return "directorName=" + directorName + ", episodeTitle=" + episodeTitle;
    }

    public int compareTo(SeriesEpisode episode) {
        return directorName.compareTo(episode.directorName);
    }
    
    
}
