package State;

import Hero.Role;
import java.util.Random;

public class FightState extends State{
    public FightState(Role role) {
        super(role);
    }

    @Override
    public void starAttack() {
        System.out.println("开始进行攻击");
        int hp = role.getHp();
        Random random = new Random();
        int i = random.nextInt(20);
        System.out.println("小怪打了你"+i+"的血量");
        hp =hp-i;
        role.setHp(hp);
        if (role.getHp()<=0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("由[战斗状态]转化为[死亡状态]");
            role.curState = new DethState(role);
        }
        else if (hp<role.getDe()*0.1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("由[战斗状态]转化为[濒死状态]");
            role.curState = new DyingState(role);
        }
    }

    @Override
    public void move(String a) {
        //todo 什么都不做
    }

    @Override
    public void runAway() {
        System.out.println("打不过,选择逃跑");
        System.out.println("由[战斗状态]转化为[等待状态]");
        role.curState = new WaitState(role);
    }

    @Override
    public void resurrection() {
        //todo 什么都不做
    }

    @Override
    public void await() {

    }
}
