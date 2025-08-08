package ch11_access_modifier.bank;

public class BankMain {

    public static void main(String[] args) {
        Bank bank1 = new Bank(123456,"홍길동",150000,1234);
        Bank bank2 = new Bank(987654,"신사임당",500000,9999);

        bank1.showAccountInfo();
        bank2.showAccountInfo();
        System.out.println();
        bank1.withdraw(100000,1234);
        bank1.deposit(-50000,1234);
        bank1.showAccountInfo();
        System.out.println();
        bank2.withdraw(500000,9999);
        bank2.deposit(6000,9999);
        bank2.showAccountInfo();

        // 잔액이 마이너스인 계좌 객체를 생성하는 방법
        Bank bank4 = new Bank(13579,"김사",-3000,789456);
        bank4.showAccountInfo();

    }

}
