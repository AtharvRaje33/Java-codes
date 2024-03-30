class Post {
    private String content;

    public Post(String content) {
        this.content = content;
    }

    public void publish() {
        System.out.println("Publishing generic post:\n" + content);
    }
}

class TextPost extends Post {
    private String text;

    public TextPost(String text) {
        super(text);
        this.text = text;
    }

    public void publish() {
        System.out.println("Publishing text post:\n" + text);
    }
}

class ImagePost extends Post {
    private String imageUrl;

    public ImagePost(String imageUrl) {
        super(imageUrl);
        this.imageUrl = imageUrl;
    }

    public void publish() {
        System.out.println("Publishing image post:\n" + imageUrl);
    }
}

class VideoPost extends Post {
    private String videoUrl;

    public VideoPost(String videoUrl) {
        super(videoUrl);
        this.videoUrl = videoUrl;
    }

    public void publish() {
        System.out.println("Publishing video post:\n" + videoUrl);
    }
}

public class Socialmedia {
    public static void main(String[] args) {
        
        TextPost textPost = new TextPost("Hello, everyone!");
        ImagePost imagePost = new ImagePost("https://example.com/image.jpg");
        VideoPost videoPost = new VideoPost("https://example.com/video.mp4");

        textPost.publish();
        imagePost.publish();
        videoPost.publish();
    }
}
