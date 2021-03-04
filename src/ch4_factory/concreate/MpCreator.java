package ch4_factory.concreate;

import ch4_factory.framework.Item;
import ch4_factory.framework.ItemCreator;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("DB에서 MP회복 물약 호출");
    }

    @Override
    protected void createItemLog() {
        System.out.println("Mp 아이템 생성 로그 생성");
    }

    @Override
    protected Item createItem() {
        System.out.println("Mp 포션 생성");
        return new MpPotion();
    }
}
