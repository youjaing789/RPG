import BaseAttack.Hatchet;
import BaseAttack.Sceptre;
import BaseAttack.Sword;
import Defend.Cross_sword;
import Defend.Magic_shield;
import Defend.Shield;
import Factory.Hero_factory;
import Hero.Role;
import MagicAttack.Flying_shield;
import MagicAttack.Magic;
import MagicAttack.Wan_jian;
import State.WaitState;

import java.util.Scanner;

public class App {
    void person(){
        Hero_factory factory = new Hero_factory();
        int x;
        Role role = null;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入选择的角色:[0]法师,[1]坦克,[2]战士");
            x=scanner.nextInt();
            if (x==0||x==1||x==2){
                break;
            }
        }
        switch (x){
            case 0 :
                role = factory.createHero("法师", new Sceptre(), new Magic_shield(), new Magic());
                break;
            case 1 :
                role = factory.createHero("坦克", new Hatchet(), new Shield(), new Flying_shield());
                break;
            case 2 :
                role = factory.createHero("战士", new Sword(), new Cross_sword(), new Wan_jian());
                break;
        }
        System.out.println("您选择的角色的属性:"+'\n'+"角色名:"+'\t'+role.getName()+'\n'+
                "角色蓝条:"+'\t'+role.getMp()+'\n'+"角色攻击力:"+'\t'+role.getFighting()+'\n'+
                "角色防御力:"+'\t'+role.getDefence()+'\n'+
                "角色基本攻击:"+'\t'+ role.getBaseAttack().operation()+
                '\n'+ "角色魔法攻击:"+'\t'+role.getMagicAttack().operation()+
                '\n'+"角色防御方式:"+'\t'+role.getDefend().operation()
                );
        System.out.println();
        System.out.println("创建成功,请开始游戏:[0]准备移动寻找小怪,[1]继续等待");
        int y ,n;
        String a;
        y=scanner.nextInt();
        switch (y){
            case 0:
                while (true){
                    System.out.println("请输入操作:w,a,s,d,输入0退出程序");
                    a=scanner.next();
                    role.move(a);
                    if (a.equals("s")){
                        role.starAttack();
                        while (true){
                            n = role.getHp();
                            if (n<=0){
                                role.setHp(0);
                                System.out.println("血量为0");
                                role.resurrection();
                                break;
                            }
                            System.out.println("剩余血量还有"+n+",选择是否攻击,y/n");
                            a= scanner.next();
                            if (a.equals("y")){
                                role.starAttack();
                                if (n<=0){
                                    break;
                                }
                            }else if (a.equals("n")){
                                role.runAway();
                                break;
                            }
                        }
                    }
                    if (a.equals("0")){
                        break;
                    }
                }
            case 1 :
                role.curState = new WaitState(role);
                role.await();
        }
    }

}
