package ch16_objects;

public class ObjectTest {
    private String name;
    private String address;

    // 기본 생성자 / AllArgsConstructor를 정의하시오.

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getter / setter를 정의하시오.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo(){
        System.out.println("이름 : " + name + "\n주소 : " + address);
    }
    // showInfo()를 call1()형식으로 정의하시오
    /*
        실행 예
        이름 : 이경민
        주소 : 부산광역시 연제구

        Main으로 가서 ObjectTest1에
        이름 이경민 주소 부산광역시 연제구를 set하고
        showInfo()를 호출하시오
     */

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
