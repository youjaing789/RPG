package State;


import Hero.Role;

public class DyingState extends State{
    public DyingState(Role role) {
        super(role);
    }


    @Override
    public void starAttack() {
        System.out.println("我要放手一搏");
        int hp = role.getHp();
        hp -= 1;
        role.setHp(hp);
        if (role.getHp()<=0){
            System.out.println("由[濒死状态]转化为[死亡状态]");
            role.curState = new DethState(role);
        }
        else if (role.getHp()<role.getDe()*0.1){
            role.curState = new DyingState(role);
        }
    }

    @Override
    public void move(String a) {

    }

    @Override
    public void runAway() {
        System.out.println("血量不足");
        System.out.println("由[濒死状态]转化为[等待状态]");
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
