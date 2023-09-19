package State;


import Hero.Role;

public class MoveState extends State{
    public MoveState(Role role) {
        super(role);
    }

    @Override
    public void starAttack() {
        //todo 都不做
    }

    @Override
    public void move(String a) {
        if (a.equals("w")){
            System.out.println("向上移动");
            System.out.println("寻找小怪");
        }
        if (a.equals("a")){
            System.out.println("向左移动");
            System.out.println("寻找小怪");
        }
        if (a.equals("s")){
            System.out.println("向下移动");
            System.out.println("找到小怪");
            System.out.println("准备进入战斗");
            System.out.println("由[移动状态]转化为[战斗状态]");
            role.curState = new FightState(role);
        }if (a.equals("d")){
            System.out.println("向右移动");
            System.out.println("寻找小怪");
        }
    }

    @Override
    public void runAway() {

    }

    @Override
    public void resurrection() {

    }

    @Override
    public void await() {

    }
}
