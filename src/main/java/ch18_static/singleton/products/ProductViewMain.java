package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();

        /*
            이상의 코드는 ProductView.Java를 확인했을 때 객체를 생성하는 method 입니다.
            생성자를 호출하지 않은 이유는 생성자가 private이기 때문이었습니다.
            하지만 이상의 코드를 실행 했을 때 1번째 객체가 생성되었습니다. 한줄만 출력되었습니다.
            그런데 그 전에 static 배웠을 때는 1,2,3,4,5 번째 객체가 생성되었습니다로
            튀어나왔었는데 차이가 뭐냐면
            저희는 생성자 내에 지역 변수로 int counter를 선언하고 초기화했었기 때문입니다.

            그래서 static 패키지 내부의 코드와 이번의 productView 코드를 비교/대조해서
            확인할 필요가 있습니다.

            그리고 기출문제 싱글톤도 확인하시면 더 좋습니다

            2024 1차 정보처리기사 기출문제
            class Connection {

                    private static Connection _inst = null;
                    private int count = 0;

                    static public Connection get() {
                        if(_inst == null) {
                            _inst = new Connection();
                            return _inst;
                        }
                        return _inst;
                    }

                    public void count() {
                         count++;
                    }

                    public int getCount() {
                         return count;
                    }
                }


                public class main {

                    public static void main(String[] args) {

                        Connection conn1 = Connection.get();
                        conn1.count();

                        Connection conn2 = Connection.get();
                        conn2.count();

                        Connection conn3 = Connection.get();
                        conn3.count();

                        conn1.count();
                        System.out.print(conn1.getCount());
                    }

                }


            싱글턴 프레임 예
            public class Samsung {
                private static Samsung instance;
                private static int count = 1;

                // private으로 생성자를 선언
                private Samsung(){

                }

                // static 메서드의 정의
                public static Samsung getInstance() {
                    if (instance == null){
                        instance = new Samsung();
                    }
                    return instance;
                }
            }
         */
    }
}
