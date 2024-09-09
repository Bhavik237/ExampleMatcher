package com.api.examplematcher.serviceImpl;

import com.api.examplematcher.entity.CourseEntity;
import com.api.examplematcher.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl {

    @Autowired
    CourseRepository courseRepository;
    public List<CourseEntity> searchCourse(Optional<String> courseName, Optional<Long> courseStatus) {
        CourseEntity courseEntity = new CourseEntity();
        courseName.ifPresent(courseEntity::setCourseName);
        courseStatus.ifPresent(courseEntity::setCourseStatus);

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.exact())
                .withMatcher("status", ExampleMatcher.GenericPropertyMatchers.exact())
                ;

        Example<CourseEntity> example = Example.of(courseEntity, matcher);
        return courseRepository.findAll(example);
    }
}
