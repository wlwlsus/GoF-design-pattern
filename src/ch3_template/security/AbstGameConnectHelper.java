package ch3_template.security;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo){
        // 보안 작업 -> 암호화된 문자열 복호화
        String decodedInfo = doSecurity(encodedInfo);

        // 반환된 것으로 아이디, 암호 할당
        String id = "aaa";
        String password = "bbb";

        if(!authentication(id, password)){
            throw new Error("아이디, 암호 불일치");
        }

        String userName = "userName";

        int i = authorization(userName);

        switch (i){
            case -1:
                System.out.println("셧 다운");
                break;
            case 0: // 게임 매니저
                System.out.println("게임 매니저 입니다.");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }

        return connection(decodedInfo);
    }
}
