import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Player extends Character {
    int job;
    int jobPoint,hobbyPoint;
    int point;

    //play's skill
    int avoid = DEX *2;
    int kick = 25;
    int hit = 50;
    int ThorowObject = 25;
    int gan = 20;
    //skill search
    int firstAid = 30;
    int unlockKey = 1;
    int hide = 10;//隠れる
    int hideIt = 15;//隠す
    int listen = 25;
    int stealth = 10;
    int picture = 10;
    int psychoanalysis = 1;
    int pursuit = 10;
    int climb = 40;
    int library = 25;
    int EyeStar = 25;
    //skill move
    int drive = 20;
    int machineRepair = 20;
    int machineryOperation = 1;
    int rideHorse = 5;
    int swim = 25;
    int make = 5;
    int operation = 1;
    int jump = 25;
    int electricalRepair = 10;
    int navigate = 10;
    int disguise = 1;//変装
    int tell = 0;
    int credit = 15;
    int persuasion = 15;//説得
    int NativeLang = 100;
    int medicine = 5;
    int occult = 5;
    int chemistry = 1;
    int cthulhuMythology = 0;//クトゥルフ神話
    int art = 5;
    int accounting = 10;//経理
    int archeology = 1;//考古学
    int computer = 1;
    int psychology = 5;
    int pharmacy = 1;
    int history = 20;
    //skill wepon
    int knife = 25;
    int cane = 25;//杖
    int iai = 1;//居合
    ArrayList<String> skillNameList = new ArrayList<String>();
    ArrayList<Integer> skillList = new ArrayList<Integer>();

    Player(){
        //status
        money = rollDice(3,6);
        STR = rollDice(3,6);
        CON = rollDice(3,6);
        POW = rollDice(3,6);
        DEX = rollDice(3,6);
        APP = rollDice(3,6);
        SIZ = rollDice(2,6)+6;
        INT = rollDice(2,6)+6;
        EDU = rollDice(3,6)+3;
        Lack = POW*5;
        SAN = POW*5;
        Idea = INT*5;
        Knowlege = EDU*5;
        HP = (CON+SIZ)/2;
        MP = POW;
        jobPoint = EDU*20;
        hobbyPoint = INT*10;
        DamageBonus = STR + SIZ;
        avoid = DEX *2;
        Collections.addAll(skillNameList," 回避 "," キック "," パンチ "," 投擲 "," 銃 "," 応急手当 "," 鍵開け "
                ," 隠れる "," 隠す "," 聞き耳 "," 忍び歩き "," 写真術 "," 精神分析 "," 追跡 "," 登攀（登る）"
                ," 図書館 "," 目星 "," 運転 "," 機械修理 "," 重機械操作 "," 乗馬 "," 水泳 "," 制作 "," 操縦 "
                ," 跳躍 "," 電気修理 "," ナビゲート "," 変装 "," 言いくるめ "," 信用 "," 説得 "," 母国語 "
                ," 医学 "," オカルト "," 科学 "," クトゥルフ神話 "," 芸術 "," 経理 "," 考古学 "," コンピュータ "
                ," 心理学 "," 薬学 "," 歴史 "," ナイフ "," 杖 "," 居合 ");
        Collections.addAll(skillList,avoid,kick,hit,ThorowObject,gan,firstAid,unlockKey
                ,hide,hideIt,listen,stealth,picture,psychoanalysis,pursuit,climb,library,EyeStar
                ,drive,machineRepair,machineryOperation,rideHorse,swim,make,operation
                ,jump,electricalRepair,navigate,disguise,tell,credit,persuasion,NativeLang
                ,medicine,occult,chemistry,cthulhuMythology,art,accounting,archeology,computer
                ,psychology,pharmacy,history,knife,cane,iai);
        point = jobPoint + hobbyPoint;
    }

    public void printSkill(){
        for(int i=0;i<skillNameList.size();i++){
            String skillname = skillNameList.get(i);
            int skillpoint = skillList.get(i);
            System.out.println(i+": "+skillname+skillpoint);
        }
        System.out.println("\n");
    }

    public void setStatus(int job,Player p1) {
        System.out.println("スキルの割り振りをしてくだいさい。");
        System.out.println("total skill point : " + point);
        System.out.println("上げたいスキルの番号と振りたいポイントを選んで！");
        System.out.println("スキルの番号>>　");
        Scanner scan = new Scanner(System.in);
        int skillnum = scan.nextInt();
        System.out.println("スキルのポイント>> ");
        int skillpoint = scan.nextInt();

        point = point - skillpoint;
        if(point<0){
            point = point + skillpoint;
            skillpoint = point;
            point = 0;
        }
        int preSkillpoint = skillList.get(skillnum);

        if(preSkillpoint+skillpoint>100){
            point = point + preSkillpoint+skillpoint-100;
            preSkillpoint=100;
            skillList.set(skillnum, preSkillpoint);
        }else {
            skillList.set(skillnum, preSkillpoint + skillpoint);
        }
        p1.printSkill();
    }

    public void play(){
        //debug
//        if(this.job==1){
//            System.out.println("i am doctor");
//        }else if(this.job==2){
//            System.out.println("i am student");
//        }else if(this.job==3){
//            System.out.println("i am police");
//        }
        printChooseNum();
        System.out.println("1:目星\n......");


    }

    void printChooseNum(){
        System.out.println("数字をえらんでね！");
    }
}


//        System.out.println(" 回避 "+avoid);
//        System.out.println(" キック "+kick);
//        System.out.println(" パンチ "+hit);
//        System.out.println(" 投擲 "+ThorowObject);
//        System.out.println(" 銃 "+gan);
//        System.out.println(" 応急手当 "+firstAid);
//        System.out.println(" 鍵開け "+unlockKey);
//        System.out.println(" 隠れる "+hide);
//        System.out.println(" 隠す "+hideIt);
//        System.out.println(" 聞き耳 "+listen);
//        System.out.println(" 忍び歩き "+stealth);
//        System.out.println(" 写真術 "+picture);
//        System.out.println(" 精神分析 "+psychoanalysis);
//        System.out.println(" 追跡 "+pursuit);
//        System.out.println(" 登攀（登る）"+climb);
//        System.out.println(" 図書館 "+library);
//        System.out.println(" 目星 "+EyeStar);
//        System.out.println(" 運転 "+drive);
//        System.out.println(" 機械修理 "+machineRepair);
//        System.out.println(" 重機械操作 "+machineryOperation);
//        System.out.println(" 乗馬 "+rideHorse);
//        System.out.println(" 水泳 "+swim);
//        System.out.println(" 制作 "+make);
//        System.out.println(" 操縦 "+operation);
//        System.out.println(" 跳躍 "+jump);
//        System.out.println(" 電気修理 "+electricalRepair);
//        System.out.println(" ナビゲート "+navigate);
//        System.out.println(" 変装 "+disguise);
//        System.out.println(" 言いくるめ "+tell);
//        System.out.println(" 信用 "+credit);
//        System.out.println(" 説得 "+persuasion);
//        System.out.println(" 母国語 "+NativeLang);
//        System.out.println(" 医学 "+medicine);
//        System.out.println(" オカルト "+occult);
//        System.out.println(" 科学 "+chemistry);
//        System.out.println(" クトゥルフ神話 "+cthulhuMythology);
//        System.out.println(" 芸術 "+art);
//        System.out.println(" 経理 "+accounting);
//        System.out.println(" 考古学 "+archeology);
//        System.out.println(" コンピュータ "+computer);
//        System.out.println(" 心理学 "+psychoanalysis);
//        System.out.println(" 薬学 "+pharmacy);
//        System.out.println(" 歴史 "+history);
//        System.out.println(" ナイフ "+knife);
//        System.out.println(" 杖 "+cane);
