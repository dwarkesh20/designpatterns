package designpatterns.creational.simplefactory;

public class Main {
    public static void main(String[] args) {
        try {
            Post post = PostFactory.createPost("blog");
            post.setId(2);
            post.setTitle("My title");
            System.out.println(post.getClass());
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
