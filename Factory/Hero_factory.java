package Factory;

import BaseAttack.BaseAttack;
import Defend.Defend;
import Hero.Mage;
import Hero.Role;
import Hero.Tank;
import Hero.Warrior;
import MagicAttack.MagicAttack;


public class Hero_factory implements Factory{
    Role role;
    @Override
    public Role createHero(String name, BaseAttack baseAttack, Defend defend, MagicAttack magicAttack) {
        if (name.equals("法师")){
            role = new Mage(baseAttack,magicAttack,defend);
        }
        else if (name.equals("战士")){
            role = new Warrior(baseAttack,magicAttack,defend);
        }
        else if (name.equals("坦克")){
            role = new Tank(baseAttack,magicAttack,defend);
        }
        return role;
    }
}
