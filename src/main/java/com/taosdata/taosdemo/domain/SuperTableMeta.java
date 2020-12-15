package com.taosdata.taosdemo.domain;

import java.util.List;

import lombok.Data;

@Data
public class SuperTableMeta {

    private String database;
    private String name;
    private List<FieldMeta> fields;
    private List<TagMeta> tags;
}