package android.mainactivity;

import org.litepal.crud.DataSupport;

/**
 * Created by 15711 on 2018/10/16.
 */

public class diary extends DataSupport{
    private int id;
    private String content;
    private String time;
    private String title;
    private String author;

    public diary(
//            String title,
            String content,
            String time
//            ,String author
    ) {
//        this.title = title;
        this.content = content;
        this.time = time;
//        this.author = author;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "Diary{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){this.title=title;}
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){this.author=author;}

}
