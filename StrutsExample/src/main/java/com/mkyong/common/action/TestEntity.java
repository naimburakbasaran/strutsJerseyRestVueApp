package com.mkyong.common.action;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class TestEntity {
private  String title;

    public TestEntity() {
    }

    public TestEntity(String title) {

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

