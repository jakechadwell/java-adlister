import java.io.Serializable;
import java.sql.Date;

public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private Date releaseDate;
    private String genre;
    private long sales;

    public Album(){}

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getArtist(){
        return artist;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }
    public Date getReleaseDate(){
        return releaseDate;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setSales(long sales){
        this.sales = sales;
    }
    public long getSales(){
        return sales;
    }

}
