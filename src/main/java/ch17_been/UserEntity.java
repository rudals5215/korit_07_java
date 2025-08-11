package ch17_been;

import lombok.Getter;
/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |    -> 컬럼명 / Header
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
//@Entity   -> 이건 springboot 설치 시에 사용됩니다.
@Getter

public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    /*
         기본생성자로  user1 객체를 생성하고,
         알아서 method 정의하여
         username / 1
         password / 9876
         email / a@test.com
         name / 각자 이름 입력한 후
         toString()을 이용하여 콘솔에 다음과 같이 출력하시오

         실행 예
         username : 1
         email : a@test.com
         name : 각자 이름
         비밀번호는 보안상 제공하지 않습니다.
     */
    // 기본생성자 생성
    public UserEntity() {
    }
    // getter / setter 생성
    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "username = " + username +
                "\nemail = " + email +
                "\nname = " + name +
                "\n비밀번호는 보안상 제공되지 않습니다.";
    }

    // 설정에서 Lombok 설치
}
