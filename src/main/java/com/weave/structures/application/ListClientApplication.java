package com.weave.structures.application;

import com.weave.structures.domain.ListClient;

import java.util.ArrayList;
import java.util.List;

public class ListClientApplication {

    public static void main(String[] args) {
        ListClient listClient = new ListClient();

        /**
         * 인텔리제이를 사용한다면 List 타입 부분에 아래와 같이 나온다.
         * Raw use of parameterized class 'List'
         * Raw Type은 타입 파라미터가 없는 제네릭 타입을 의미한다.
         * Raw Type은 자바에 제네릭이 도입되기 전(JDK 5.0 이전) 코드와 호환성을 보장하기 위한 것이다.
         *
         * Raw Type : https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.8
         */
        List list = listClient.getList();
        System.out.println(list);

        /**
         * 자바와 같은 정적 타입 언어의 강점은 프로그램을 실행하기 전에 컴파일 에러를 잡을 수 있다는 것이다.
         * 하지만 Raw Type을 부주의하게 사용하면 런타임 에러를 일으킬 수 있다.
         * 아래 코드는 런타임 에러를 발생시키는 예제이다.
         *
         * java.lang.ClassCastException
         */
        List<String> good = new ArrayList<>();
        List bad = good;
        // warning: unchecked call to add(E) as a member of the raw type List
        bad.add(1);
        for (String str : good) {
            System.out.println(str);
        }

    }

}
