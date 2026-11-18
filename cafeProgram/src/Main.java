import java.util.Scanner;

public class Main {
    public static void main() {
        Barista barista1 = new Barista(3000, 1);

        Customer customer1 = new Customer("홍길동", 10000, false);
        customer1.order(barista1,"아메리카노");
        System.out.println("---");
        customer1.order(barista1,"아메리카노");

        System.out.println("---");
        customer1.checkMoney();
    }
}

//


// 중간고사
// zip, svn(Repository 1개), git(Repository 2개)
// 깃 체계 git 소스코드 관리체계 프로그램 src O, out X
// Remote Respository {{{ MS(git hub) -> coplit, (git Lab {회사}), (자체 구축) }}}
// Local Respository Working directory "commit" ==> Local repository "push" ==> Remote Repository
// Remote Repository "pull" ==> Local repository || Local repository "pull" ==> Working directory
// 최초 Remote Repository "clone" ==> Local repository


// 기말고사 문제

//상태, 행위, 구조 부모->자식 순으로 계층을 이루고 자식에서 부모로 올라가는 개념은 추상화이고 부모에서 자식으로 내려가는 개념은 decombogition 상세적이 된다.
// 상세적으로 나뉘는 기준은 목적이다.

// 입력 출력 알고리즘 and 입 출력 4개 형태 1method => 1goal
// 상수 => 전역변수, 변수 => 지역변수 (유지보수) 2번 방법 선호
// what, how 는 있지만 why는 없고 주석을 단다. 주석은 중요하다.
//객체 2가지 요소     1. 상태, 2. 행위


// 피드백 :
// 좋은점: 주문내역을 전역변수로 설정한 부분은 잘했다. arrayList가 좋을 수 있다.
// 입력받는 부분을 개선 그룹으로 뭉쳐서, 끼리끼리 출력, 입력 끼리 둔다 (가독성)
// public class Main 이란?: A Class B No Class 차이
// 클래스가 있는것은 객체지향방식이다. OOP
// 클래스가 없는것은 그냥 파이썬처럼 짠 것이다.
// 한글 주석을 프로그램코드로 바꾸는 연습을 많이해야한다.
// 중간과정 꾸준히 스스로 기록많이.