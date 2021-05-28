import java.io.Serializable;

public class Quote implements Serializable{
    private int id;
    private String content;
    private String author;

    public Quote(){}

    public void setId(int id) {
        this.id = id;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public String getContent() {
        return content;
    }
    public String getAuthor() {
        return author;
    }

}
