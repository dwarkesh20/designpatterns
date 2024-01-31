package designpatterns.creational.simplefactory;

public class PostFactory {
    public static Post createPost(String type) {
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type \'"+type+"\' is unknown");
        }
    }

    public static class BlogPost extends Post {
        private String author;
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        @Override
        public String toString() {
           return "BlogPost [id=" + getId() + ", title=" + getTitle() + "]";
        }
    }

    public static class NewsPost extends Post {
        @Override
        public String toString() {
            return "NewsPost [id=" + getId() + ", title=" + getTitle() + "]";
        }
    }

    public static class ProductPost extends Post {
        @Override
        public String toString() {
            return "ProductPost [id=" + getId() + ", title=" + getTitle() + "]";
        }
    }
}
