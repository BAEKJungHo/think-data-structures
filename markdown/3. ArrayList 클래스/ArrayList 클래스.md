# ArrayList 클래스

- get 메서드

```java
public E get(int index) {
  if(index < 0 || index >= size) {
    throw new IndexOutOfBoundsException();
  }
  return array[index];
}
```

get 메서드에서는 index 의 범위가 유효하지 않으면 예외를 던진다. get 메서드의 모든 부분은 상수 시간이므로 get 메서드는 상수 시간이다.

- set 메서드

```java
public E set(int index, E element) {
  E old = get(index);
  array[index] = element;
  return old;
}
```

이 해법에서 약간 똑똑한 부분은 명시적으로 배열의 범위를 검사하지 않는다는 것이다. set 메서드는 인덱스가 유효하지 않으면 예외를 던지는 get 메서드를 호출한다. 따라서 set 메서드도 상수 시간이다.

- indexOf 메서드

```java
public int indexOf(Object target) {
  for(int i=0; i<size; i++) {
    if(equals(target, array[i]) {
      return i;
    }
  }
  return -1;
}
```

- equals 메서드

```java
private boolean equals(Object target, Object element) {
  if(target == null) {
    return element == null;
  } else {
    return target.equals(element);
  }
}
```

이 메서드의 실행시간은 target 또는 element 의 크기에 의존한다. 하지만 배열의 크기에는 의존하지 않으므로 equals 메서드는 상수 시간이다.

indexOf 메서드는 선형이다.

- remove 메서드

```java
public E remove(int index) {
  E element = get(index);
  for(int i=index; i<size-1; i++) {
    array[i] = array[i+1];
  }
  size--;
  return element;
}
```

remove 메서드는 선형이다.

