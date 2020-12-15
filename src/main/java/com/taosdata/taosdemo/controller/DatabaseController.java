package com.taosdata.taosdemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taosdata.taosdemo.service.DatabaseService;

@RestController
@RequestMapping
public class DatabaseController {

    @Autowired
    private DatabaseService databaseService;

    /**
     * create database
     ***/
    @PostMapping
    public int create(@RequestBody Map<String, String> map) {
        return databaseService.createDatabase(map);
    }


    /**
     * drop database
     **/
    @DeleteMapping("/{dbname}")
    public int delete(@PathVariable("dbname") String dbname) {
        return databaseService.dropDatabase(dbname);
    }

    /**
     * use database
     **/
    @GetMapping("/{dbname}")
    public int use(@PathVariable("dbname") String dbname) {
        return databaseService.useDatabase(dbname);
    }
}
