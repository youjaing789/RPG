package Hero;

import BaseAttack.BaseAttack;
import Defend.Defend;
import MagicAttack.MagicAttack;
import State.State;
import State.WaitState;

public class Warrior extends Role{
    String name="战士";//角色名字
    int hp=150;//角色血量
    int mp=100;//角色蓝条
    int fighting=70;//角色攻击力
    int defence=40;//角色防御力
    BaseAttack baseAttack;//角色基本攻击方式
    MagicAttack magicAttack;//角色基本防御方式
    private int de = 150;

    public int getDe() {
        return de;
    }

    public State getCurState() {
        return curState;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getMp() {
        return mp;
    }

    @Override
    public int getFighting() {
        return fighting;
    }

    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public BaseAttack getBaseAttack() {
        return baseAttack;
    }

    @Override
    public MagicAttack getMagicAttack() {
        return magicAttack;
    }

    @Override
    public Defend getDefend() {
        return defend;
    }

    Defend defend;//角色防御攻击方式

    public Warrior(BaseAttack baseAttack, MagicAttack magicAttack, Defend defend) {
        this.baseAttack = baseAttack;
        this.magicAttack = magicAttack;
        this.defend = defend;
        this.curState = new WaitState(this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void setMp(int mp) {
        this.mp = mp;
    }

    @Override
    public void setFighting(int fighting) {
        this.fighting = fighting;
    }

    @Override
    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setBaseAttack(BaseAttack baseAttack) {
        this.baseAttack = baseAttack;
    }

    @Override
    public void setMagicAttack(MagicAttack magicAttack) {
        this.magicAttack = magicAttack;
    }

    @Override
    public void setDefend(Defend defend) {
        this.defend = defend;
    }

    @Override
    public void Start() {
    }
}
