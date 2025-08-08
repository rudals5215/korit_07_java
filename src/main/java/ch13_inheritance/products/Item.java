package ch13_inheritance.products;
/*
    부모 클래스 Item
    자식 클래스 product
    실행 클래스 ProductMain 클래스 생성

    Item 클래스에
    1. field 선언 private String name / private String category
    2, AllArgsConstructor
    3. Setter / Getter
    4. Product 에 상속

 */
public class Item {
    // 필드 선언
    private String name;
    private String category;
    // AllArgsConstructor
    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }
    // Setter / Getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
