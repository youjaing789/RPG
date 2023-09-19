package Factory;

import BaseAttack.BaseAttack;
import Defend.Defend;
import Hero.Role;
import MagicAttack.MagicAttack;



public interface Factory {
    Role createHero(String name, BaseAttack baseAttack, Defend defend, MagicAttack magicAttack);
}
