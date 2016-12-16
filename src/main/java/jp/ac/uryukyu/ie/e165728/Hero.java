package jp.ac.uryukyu.ie.e165728;

public class Hero extends LivingThing{

    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void attack(LivingThing opponent){
        if(isDead() == false) {
            int damage = (int) (Math.random() * (getAttack() + 1));
            if(damage >= 1 ) {
                int critical = (int) (Math.random() * 10) + 1;
                if (critical % 3 == 0) {
                    System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage * 2);
                    opponent.wounded(damage * 2);
                } else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                    opponent.wounded(damage);
                }
            }else{
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName(), damage);
            }
        }
    }
}
