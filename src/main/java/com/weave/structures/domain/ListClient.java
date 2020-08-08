package com.weave.structures.domain;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class ListClient {

    private List list;

    public ListClient() {
        list = new LinkedList();
    }

}
