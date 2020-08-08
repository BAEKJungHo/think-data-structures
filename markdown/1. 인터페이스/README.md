# 인터페이스

## 인터페이스 기반 프로래밍(interface-based programming)

```java
public class ListClient {
  
  private List list;
  
  public ListClient() {
    list = new LinkedList();
  }
  
  public getList() {
    return list;
  }

}
```

```java
public class TestExample {
  
  public static void main(String[] args) {
    ListClient listClient = new ListClient();
    List list = listClient.getList();
    System.out.println(list); 
  }
  
}
```

이 예제에서 가장 중요한 내용은 필요한 경우가 아니면 LinkedList 나 ArrayList 와 같은 구현 클래스를 사용하지 않고 가능한 List 인터페이스를 사용한다는 점이다.
TestExample 에서 인스턴스 변수는 List 인터페이스로 선언하고 getList 메서드도 List 형을 반환하지만 `구체적인 클래스는 언급하지 않는다.` 만약에 List 구현체를 바꿔서 사용하고싶으면
생성자 부분의 코드만 바꾸면 되고, 인터페이스를 사용하는쪽의 코드는 바꾸지 않아도 된다. 

__즉, 라이브러리를 사용할 때 인터페이스에 의존해야하지 특정 구현에 의존하면 안된다. 이런 방식으로 하면 나중에 구현이 변경되어도, 클라이언트쪽 코드는 변경할 필요가 없어진다.__

변수명도 마찬가지이다. 변수명은 특정인터페이스나 구현체에 의존되지 않게 만드는게 좋다. 아래 예제를 보자

```java
@Getter @Setter
public class Employee {
  private String name;
  private String position;
}
```

```java
public class TestExample {

  public static void main(String[] args) {
    // 특정 인터페이스나 구현체에 의존하는 변수명
    List<Employee> employeeList = findAllEmployee();
    
    // 특정 인터페이스나 구현체에 의존하지 않는 변수명
    List<Employee) employees = findAllEmployee();
  }
  
}
```

변수명이 특정 인터페이스나 구현체에 의존하게되면, 만약 `Map<String, Employee>` 이런식으로 타입이 변경된다고하면 변수명도 분명히 바뀌어야 할 것이다. 따라서 변수명 타입이 바뀌어도
변수명에는 변경이 없게끔 네이밍을 잘 하는것이 좋다.
