package ch4_factory.framework;

public abstract class ItemCreator {
    public Item create(){
        Item item;
        requestItemsInfo();
        item = createItem();
        createItemLog();

        return item;
    }

//    아이템 생성하기 전 DB에서 아이템 정보 요청
    protected abstract void requestItemsInfo();
//  아이템 생성 후 아이템 복제 방지를 이한 DB에 아이템 생성
    protected abstract void createItemLog();
//  아이템 생성 알고리즘
    protected abstract Item createItem();

}
