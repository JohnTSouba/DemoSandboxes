package com.tsg.classroster.Daos;

import com.tsg.classroster.Models.Course;
import com.tsg.classroster.Models.Student;
import com.tsg.classroster.Models.Teacher;
import java.util.List;


public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);

    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
