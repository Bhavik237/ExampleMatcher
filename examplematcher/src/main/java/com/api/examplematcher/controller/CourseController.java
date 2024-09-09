package com.api.examplematcher.controller;

import com.api.examplematcher.entity.CourseEntity;
import com.api.examplematcher.serviceImpl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(produces = "application/json", value = "/api/v1")
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;

    @PostMapping("/course/search")
    public List<CourseEntity> searchCourse(@RequestParam Optional<String> courseName,
                                           @RequestParam Optional<Long> courseStatus) {
        return courseService.searchCourse(courseName, courseStatus);
    }
}
