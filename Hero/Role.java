package Hero;

import BaseAttack.BaseAttack;
import Defend.Defend;
import MagicAttack.MagicAttack;
import State.State;


//创建角色
public abstract class Role {
    public State curState;
    private String name;//角色名字
    private int hp;//角色血量
    private int mp;//角色蓝量
    private int fighting;//角色攻击力
    private int defence;//角色防御力
    BaseAttack baseAttack;//角色基本攻击方式
    MagicAttack magicAttack;//角色基本防御方式
    Defend defend;//角色防御攻击方式
    private int de;

    public int getDe() {
        return de;
    }
    public abstract void Start();

    public MagicAttack getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(MagicAttack magicAttack) {
        this.magicAttack = magicAttack;
    }

    public Defend getDefend() {
        return defend;
    }

    public void setDefend(Defend defend) {
        this.defend = defend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getFighting() {
        return fighting;
    }

    public void setFighting(int fighting) {
        this.fighting = fighting;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    public void starAttack(){ curState.starAttack(); }
    public void move(String a){ curState.move(a); }
    public void runAway(){
        curState.runAway();
    }
    public void resurrection(){ curState.resurrection(); }
    public void await(){ curState.await(); }

    public abstract BaseAttack getBaseAttack();

    public void setBaseAttack(BaseAttack baseAttack) {
        this.baseAttack = baseAttack;
    }
}
