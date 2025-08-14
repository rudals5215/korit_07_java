package ch20_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        /*
            1. 학생의 수를 입력받아 해당 횟수만큼 반복문을 돌릴 것
            2. 1번 ~ 5번 학생의 응답을 fieldTrip List에 저장할 것
            3. 중복을 제거하기 위해 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
            4. 맨 마지막 출력문은 Set -> List로 재이동하여 finalFiendTrips List에서 element들을 추출하여 작성할 것.

            실행 예
            몇 명의 학생이 수학 여행지를 입력하시겠습니까? >>> 5명
            1 번 학생의 수학 여행지를 입력하세요 >>> 제주
            2 번 학생의 수학 여행지를 입력하세요 >>> 제주
            3 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            4 번 학생의 수학 여행지를 입력하세요 >>> 민속촌
            5 번 학생의 수학 여행지를 입력하세요 >>> 제주

            1 번 학생의 후보지 : 제주
            2 번 학생의 후보지 : 제주
            3 번 학생의 후보지 : 민속촌
            4 번 학생의 후보지 : 민속촌
            5 번 학생의 후보지 : 제주

            수학여행 후보지는
            제주
            민속촌
            입니다.
         */
        Scanner scanner = new Scanner(System.in);
        List<String> fieldTripList = new ArrayList<>();
        List<String> finalFiendTrips = new ArrayList<>();
        Set<String> fieldTripSet = new HashSet<>();
        int students = 0;
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? >>> ");
        students = scanner.nextInt();
        scanner.nextLine();
//        String fieldTrip = "";  // 최종 작성 결과 얘는 fieldTrips list 의 맨 마지막 element와 동일한 값을 가지게 됨


        for (int i = 0; i < students ; i++) {
            System.out.print((i+1) + " 번 학생의 수학 여행지를 입력하세요 >>> ");
            String fieldTrip = scanner.nextLine();
            fieldTripList.add(fieldTrip);
        }

//        System.out.println(fieldTrip);      // 이건 38번 코드라인이 주석처리 해제 되었을 때만 오류발생 x
        // 최초 list에서의 element 추출
        for (int i = 0; i < students ; i++){
            System.out.println((i+1) + " 번 학생의 후보지 : " + fieldTripList.get(i));
        }

        // 최초 List에서 set으로 element를 옮깁니다 -> 중복 제거를 위해
        fieldTripSet.addAll(fieldTripList);
        // 이제 또 set에서 list로 옮깁니다 -> 중복 제거된 element들을 추후 추출하기 위해서
        finalFiendTrips.addAll(fieldTripSet);

        System.out.println("수학 여행 후보지는");
        for (String trip : finalFiendTrips){
            System.out.println(trip);
        }
        System.out.println("입니다.");
    }
}
