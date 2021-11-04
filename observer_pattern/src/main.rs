//Connection to create elements
use observer_pattern::youtube_channel::Channel;
use observer_pattern::subscriber::Subscriber;

fn main() {

    //Creating a Youtube channel
    let mut channel = Channel::new(String::from("Tech_tecnology"),0,vec![]);

    //Creating subscribers
    let s1 = Subscriber::new(String::from("Juanito"));
    let s2 = Subscriber::new(String::from("Pedro"));

    //Subcribe to channel
    channel.attach(&s1);
    channel.attach(&s2);

    //Adding new video to channel
    channel.add_new_video(String::from("Patrón observador"));
}
