package State;


import Hero.Role;

public abstract class State {
    Role role;

    public State(Role role) {
        this.role = role;
    }

    public abstract void starAttack();
    public abstract void move(String a);
    public abstract void runAway();
    public abstract void resurrection();
    public abstract void await();
}
