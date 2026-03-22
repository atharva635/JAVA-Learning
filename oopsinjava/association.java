// two type of java relationship

// 1 is inheritance - is a relationship
// it is implimented using extends or impliments keywords

// 2 is association - has a relationship
// that class is associated with that is it holds objects of another class in its body
//two types - 1.Aggregattion  2.Composition

class musicplayer{
    private String name;
    public musicplayer(String name){
        this.name = name;
    }
    public void start(){
        System.out.println("Satreted  ");
    }
    public void stop(){
        System.out.println("Stopped  ");
    }
}
//ab hum musicplayer ka reference car class me create krenge
class car{
    private String name;
    private musicplayer player;
    //contructor phir car ko
    public car (String name, musicplayer player){
        this.name = name;
        this.player = player;
    }

}


