//Struct of a subscriber
pub struct Subscriber {
    pub name: String,
}

//Methods to a subscriber
impl Subscriber {

    //Constructor of subscriber
    pub fn new(name:String) -> Self{
        Self{
            name,
        }
    }

    //Update state of channel
    pub fn update(&self, _tittle: &String){
        println!("Nuevo vídeo posteado: {}", _tittle);
    }
}
