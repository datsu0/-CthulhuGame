import java.util.Scanner;

public class GameManeger {
    public void gameManeger(String gameMode){
        String RolePlay = "RolePlay";
        String battle = "battle";
        World world = new World();
        Print print = new Print();
        Player p1 = new Player();
        Enemy northEnemy = new Enemy("andead",100,50);
        while(true){
            if(world.worldName=="gameOver"){
                System.out.println("game over\n");
                break;
            }
            if(world.worldName=="gameClear"){
                System.out.println("game clear\n");
                break;
            }
            /*
            * gamemode character make
            * */
            if(gameMode=="CharaMake"){
                //name,syoku,skill
                System.out.println("ようこそ！！\n初めにキャラメイクをします！\n");
                Scanner scan = new Scanner(System.in);
                System.out.println("名前 >>\n");
                String name = scan.nextLine();
                p1.name = name;
                System.out.println("職業を選択\n");
                System.out.println("対応する数字を選んで下さい\n");
                System.out.println("医者：１\n学生：２\n警官：３\n");
                System.out.println("数字の入力: ");
                int job = scan.nextInt();
                p1.job = job;
                System.out.println("ステータスは、");
                p1.printStatus();
                System.out.println("スキル割り振り\n");
                p1.printSkill();
                while(p1.point!=0){
                    p1.setStatus(job,p1);
                }
                gameMode = "GameStart";
            }
            /*
            *   gamemode GAMESTART
            * */
            if(gameMode=="GameStart"){
                // dedug
                p1.name = "com";
                p1.job = 1;
                print.PrintStory(gameMode);
                gameMode = "RolePlay";
            }
            /*
            * gamemode ROLEPLAY
            * */
            if(gameMode==RolePlay) {
                Scanner scan = new Scanner(System.in);

                if (world.worldName == "booldSoup") {
                    System.out.println("this place is booldSoup");
                    System.out.println("1:スキル使用\n2:部屋を移動する、行動");
                    int rollPlay = scan.nextInt();
                    if (rollPlay == 1) {
                        p1.play();
                    } else if (rollPlay == 2) {
                        world.worldPlayerActRoom();
                    } else {
                        System.out.println("select 1 or 2");
                    }
                }
                if (world.worldName == "north") {
                    System.out.println("this is north");
                    System.out.println("encount enemy");
                    gameMode = battle;
                    if(northEnemy.HP>=0){
                        return;
                    }
                    gameMode = RolePlay;
                    System.out.println("1:スキル使用\n2:部屋を移動する、行動");
                    int rollPlay = scan.nextInt();

                    if (rollPlay == 1) {
                        p1.play();
                    } else if (rollPlay == 2) {
                        world.worldPlayerActRoom();
                    } else {
                        System.out.println("select 1 or 2");
                    }

                    //room finish
                    if(world.backRoom==1){
                        world.worldName = "booldSoup";
                    }
                }
                if (world.worldName == "west") {
                    System.out.println("this is west");
                    System.out.println("1:スキル使用\n2:部屋を移動する、行動");
                    int rollPlay = scan.nextInt();

                    if (rollPlay == 1) {
                        p1.play();
                    } else if (rollPlay == 2) {
                        world.worldPlayerActRoom();
                    } else {
                        System.out.println("select 1 or 2");
                    }

                    //room finish
                    if(world.backRoom==1){
                        world.worldName = "booldSoup";
                    }
                }
                if (world.worldName == "east") {
                    System.out.println("this is east");
                    System.out.println("1:スキル使用\n2:部屋を移動する、行動");
                    int rollPlay = scan.nextInt();

                    if (rollPlay == 1) {
                        p1.play();
                    } else if (rollPlay == 2) {
                        world.worldPlayerActRoom();
                    } else {
                        System.out.println("select 1 or 2");
                    }

                    //room finish
                    if(world.backRoom==1){
                        world.worldName = "booldSoup";
                    }
                }
                if (world.worldName == "south") {
                    System.out.println("this is south");
                    System.out.println("1:スキル使用\n2:部屋を移動する、行動");
                    int rollPlay = scan.nextInt();

                    if (rollPlay == 1) {
                        p1.play();
                    } else if (rollPlay == 2) {
                        world.worldPlayerActRoom();
                    } else {
                        System.out.println("select 1 or 2");
                    }

                    //room finish
                    if(world.backRoom==1){
                        world.worldName = "booldSoup";
                    }
                }

                //break;
            }
            /*
            * game mode  battle
            * */
            if(gameMode=="battle"){

            }
        }
    }
}
