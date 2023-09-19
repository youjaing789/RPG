package State;

import Hero.Role;

public class WaitState extends State{
    public WaitState(Role role) {
        super(role);
    }

    @Override
    public void starAttack() {
        //todo 什么都不做
    }

    @Override
    public void move(String a) {
        System.out.println("准备移动");
        System.out.println("由[等待状态]转化为[移动状态]");
        role.curState= new MoveState(role);
    }

    @Override
    public void runAway() {
        //todo 什么都不做
    }

    @Override
    public void resurrection() {
        //todo 什么都不做
    }

    @Override
    public void await() {
        System.out.println("继续等待");
    }

}
