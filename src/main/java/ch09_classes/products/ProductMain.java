package ch09_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 방법 클래스명 객체명 = new 생성자;
        // 기본 생성자를 통한 생성
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";
        // 매개변수 생성자를 통한 생성(RequiredArgsConstructor) 2번
        Product product2 = new Product(9876564);
        product2.productName = "다이소충전기";

        Product product3 = new Product("USB-C케이블");
        product3.productNum = 159357;
        // 매개변수 생성자를 통한 생성(AllArgsConstructor) 1번
        Product product4 = new Product(951753,"GFlip6");

        // 현재 상황에서도 showInfo()의 호출이 가능
        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }


}
