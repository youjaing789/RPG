package State;

import Hero.Role;

public class DethState extends State{

    public DethState(Role role) {
        super(role);
    }

    @Override
    public void starAttack() {
        System.out.println("已经死亡");
        System.out.println("只能结束,0退出");
        return ;
    }

    @Override
    public void move(String a) {
        //todo 不做任何事
    }

    @Override
    public void runAway() {
        //todo 不做任何事
    }

    @Override
    public void resurrection() {
        System.out.println("复活,进入待命状态");
        role.setHp(role.getDe());
        role.curState = new WaitState(role);
    }

    @Override
    public void await() {

    }
}
