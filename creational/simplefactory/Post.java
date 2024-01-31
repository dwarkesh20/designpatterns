package designpatterns.creational.simplefactory;

public abstract class Post {
    private int id;
    private String title;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return "Post: " + this.id + ", " + this.title;
    }

}
