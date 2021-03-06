package com.taosdata.taosdemo.domain;

import java.util.List;

import lombok.Data;

@Data
public class TableMeta {

    private String database;
    private String name;
    private List<FieldMeta> fields;
}
