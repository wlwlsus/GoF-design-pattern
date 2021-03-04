package ch3_template.security;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String string) {
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인");
        // 성인x 10시 이후 인 경우 권한 X

        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계!");
        return info;
    }
}
