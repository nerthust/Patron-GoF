//Connection to manipulate subscribers
use crate::subscriber::Subscriber;

//Struct of Youtube channel
pub struct Channel<'a>{
    pub name: String,
    pub subscribers_counter: i32,//subscriber number
    pub channel_subscribers: Vec<&'a Subscriber>,//storage each subscriber
}

//Methods for channel
impl <'a>Channel <'a>{

    //Constructor of channel
    pub fn new(name:String, subscribers_counter:i32,channel_subscribers:Vec<&'a Subscriber>) -> Self{
        Self{
            name,
            subscribers_counter,
            channel_subscribers,
        }
    }

    //Subscribe to channel
    pub fn attach(&mut self, subscriber: &'a Subscriber){
        self.channel_subscribers.push(subscriber);
        self.subscribers_counter += 1;
    }

    //Notificate to all subscriber of channel that channel has a new video
    pub fn notify(&self, tittle: &String){
        for suscriptor in &self.channel_subscribers{
            suscriptor.update(&tittle);
        }
    }

    //Publish a new video to channel
    pub fn add_new_video(&self, _tittle: String){
        self.notify(&_tittle);
        println!("Nuevo vídeo añadido al canal");
    }
}
