package ch4_factory.concreate;

import ch4_factory.framework.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복!!");
    }
}
