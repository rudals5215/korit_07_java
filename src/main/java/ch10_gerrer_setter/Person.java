package ch10_gerrer_setter;

public class Person {
    String name;
    int age;

    // 기본 생성자, 매개변수가 하나인 생성자 두 개
    // 매개변수가 두 개인 생성자 하나 총 네개를 정의하시오.
    // Person1 / 김일  / -10 -> 기본 생성자로 생성
    // Person2 / 김이  / 201 -> 이름 매개변수 생성자로 생성
    // Person3 / 김삼  / 20 -> 나이 매개변수 생성자로 생성
    // Person4 / 김사  / 54 -> AllArgsConstructor로 생성


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 정의
    /*
        setName 메서드에 비지니스 로직을 추가핫기오.
        1. argument로 들어온 String 데이터의 글자수를 파악하여
        2. 4글자 초과라면 "변경할 수 없습니다." 를 출력한 후 메서드를 종료할 것
        3. 4글자 이라하면 "이름이 변경되었습니다."
        4.              "변경 전 : 디카프리고"
        5.              "변경 후 : 이일"
        6. 이 되도록 작성하고, PersonMain에서 person1.의 이름을 변셩하시오.
        7. main 에서의 코드라인
        8. person1.setName("노마드코더");
        9. person1.setName("이일");
        10. 이상의 코드라인을 붙여넣었을 때의 실행 예
        변셩할 수 없습니다.
        변경 전 : 디카프리오
        변경 후 : 이일
     */
    public void setName(String title) {
        if (title.length() < 1 || title.length() > 4){
            System.out.println("변경할 수 없습니다.");
        return;
        }
        System.out.println("변경 전 : " + name);
//        System.out.println("변경 후 : " + this.name);
//        System.out.println("변경 후 : " + this.getName());
        this.name = title;  // 자동 생성 하면 매개변수명과 필드명이 동일해서 일부러 다르게 썼습니다.
        System.out.println("변경 후 : " + this.name);

    }

    public void setAge(int birth){
        if (birth < 0 || birth > 200){
            System.out.println("불가능한 나이 입력입니다.");
            return;     // method 에서 return;은 method 즉시 종료 키워드입니다 즉 이 이하로는 아예 실행되지 않습니다.
        }
        System.out.println("변경 전 나이 : " + age);  // birth 대입 전이니까
        this.age = birth;
        System.out.println("변경 후 나이 : " + age); // 대입 후니까 동일한 코드라도 다른 결과값
    }
    // Getter 정의
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
