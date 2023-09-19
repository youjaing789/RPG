package Hero;

import BaseAttack.BaseAttack;
import Defend.Defend;
import MagicAttack.MagicAttack;
import State.WaitState;

public class Tank extends Role{
    String name="坦克";//角色名字
    int hp=250;//角色血量
    int mp=70;//角色蓝条
    int fighting=20;//角色攻击力
    int defence=70;//角色防御力
    BaseAttack baseAttack;//角色基本攻击方式
    MagicAttack magicAttack;//角色基本防御方式
    Defend defend;//角色防御攻击方式
    private int de = 250;

    public int getDe() {
        return de;
    }

    @Override
    public String getName() {
        return name;
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

    @Override
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

    public Tank(BaseAttack baseAttack, MagicAttack magicAttack, Defend defend){
        this.baseAttack = baseAttack;
        this.magicAttack = magicAttack;
        this.defend = defend;
        this.curState = new WaitState(this);
    }

    @Override
    public void Start() {
    }
}
