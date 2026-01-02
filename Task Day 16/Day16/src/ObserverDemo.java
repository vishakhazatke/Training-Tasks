interface Subscriber{
    void update(String video);
}

class User implements Subscriber{

    String name;
    User(String name){
        this.name = name;
    }
    @Override
    public void update(String video) {
        System.out.println(name + " got notification: " + video);
    }
}
class YoutubeChannel{
    Subscriber s1, s2;

    void subscribe(Subscriber s1, Subscriber s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    void uploadVideo(String video){
        s1.update(video);
        s2.update(video);
    }
}
public class ObserverDemo {
    public static void main(String[] args) {

        User u1 = new User("Vishakha");
        User u2 = new User("Vishu");

        YoutubeChannel channel = new YoutubeChannel();
        channel.subscribe(u1, u2);

        channel.uploadVideo("Observer Pattern Explained");
    }
}
