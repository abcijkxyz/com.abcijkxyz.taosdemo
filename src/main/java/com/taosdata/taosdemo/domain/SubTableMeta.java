package com.taosdata.taosdemo.domain;

import java.util.List;

import lombok.Data;

@Data
public class SubTableMeta {

    private String database;
    private String supertable;
    private String name;
    private List<TagValue> tags;
    private List<FieldMeta> fields;
}
