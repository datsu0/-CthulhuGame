public abstract class Character {
    String name;
    int diceNum;
    int STR,CON,POW,DEX,APP,SIZ,INT,EDU;
    //筋力、頑強さ、精神力、俊敏性、外見、体格、知力、教育
    int SAN,Lack,Idea,Knowlege,HP,MP,DamageBonus;
    //幸運、アイディア、知識、耐久力、MP、ダメージボーナス
    int money;

    int rollDice(int time,int diceFace){
        diceNum = 0;
        for(int i=0;i<time;i++) {
            double random = Math.random()*6;
            diceNum = diceNum +(int)random + 1;
        }
        return diceNum;
    }
    //public abstract void play();
    void printStatus(){
        System.out.println("str: "+STR+"\ncon: "+CON+"\npow: "+POW+"\ndex: "+DEX+"\napp: "+APP+"\nsiz: "+SIZ+"\nint: "+INT+"\nedu: "+EDU);
    }
}
