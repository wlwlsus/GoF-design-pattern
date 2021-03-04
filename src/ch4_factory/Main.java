package ch4_factory;

import ch4_factory.concreate.HpCreator;
import ch4_factory.concreate.MpCreator;
import ch4_factory.framework.Item;
import ch4_factory.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
