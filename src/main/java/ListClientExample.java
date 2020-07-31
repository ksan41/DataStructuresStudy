import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    // 생성자를 제외하고는 어디에도 LinkedList나 ArrayList와 같은 특정 구현 클래스를 사용하지 않고
    // 가능한 한 List 인터페이스를 사용한다.
    // 즉, 마음을 바꿔 ArrayList 클래스를 사용하고자 한다면 생성자만 바꾸면 되는것이다.
    // => 인터페이스 기반 프로그래밍(Interface-based Programming), 인터페이스 프로그래밍이라 한다.


    // List를 캡슐화. 즉, List형의 인스턴스 변수 소유.
    private List list;
    public ListClientExample(){
        // 클래스 생성과 동시에 새로운 LinkedList 객체를 만들어 list를 초기화한다.
        list = new LinkedList();
    }

    private List getList(){
        // List 객체에 대한 참조를(인스턴스 변수) 반환
        return list;
    }

    public static void main(String[] args){
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);
    }
}
