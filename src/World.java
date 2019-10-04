import java.util.Scanner;

public class World {
    String worldName;
    int worldClearKey;
    int backRoom;
    void printChooseNum(){
        System.out.println("数字をえらんでね！");
    }
    // enemy

    // world chara

    // world act

    //player act
    void worldPlayerActRoom(){
        // chose room
        printChooseNum();
        Scanner scan = new Scanner(System.in);
        if(this.worldName=="booldSoup") {
            System.out.println("1: 北の部屋は『調理室』\n2: 南の部屋は『礼拝室』\n3: 西の部屋は『書物庫』\n4: 東の部屋は『下僕の部屋』\n5: 血のスープの部屋\n 6: 血のスープを飲む");
        }else{
            System.out.println("血のスープ部屋の戻る。\n1: YES 2: NO");
            backRoom = scan.nextInt();
            if(backRoom==1){
                this.worldName="booldSoup";
                return;
            }else{
                return;
            }
        }

        int skillnum = scan.nextInt();
        if(skillnum==1){
            this.worldName = "north";
        }else if(skillnum==2){
            this.worldName = "south";
        }else if(skillnum==3){
            this.worldName = "west";
        }else if(skillnum==4){
            this.worldName = "east";
        }else if(skillnum==5){
            this.worldName = "booldSoup";
        }else if(skillnum==6){
            if(this.worldClearKey==0){
                System.out.println("game over\n");
                this.worldName = "gameOver";
            }else if(this.worldClearKey==1){
                System.out.println("game clear\n");
                this.worldName = "gameClear";
            }
        }
    }
    World(){
        this.worldName = "booldSoup";
        this.worldClearKey = 0;
    }


}
