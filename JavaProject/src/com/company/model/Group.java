package com.company.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private String groupname;

    private int course;

    //    private Student student;
    private List<Student> students;

    private Teacher teacher;

    private int admission;

    private int graduation;

    public Group(String groupname, int course, List<Student> students, Teacher teacher, int admission, int graduation) {
        this.groupname = groupname;
        this.course = course;
        //       this.student = student;
        this.students = students;
        this.teacher = teacher;
        this.admission = admission;
        this.admission = admission;

    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    //   public Student getStudent() {
    //       return student;
    //   }

//    public void setStudent(Student student) {
//        this.student = student;
    //   }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getAdmission() {
        return admission;
    }

    public void setAdmission(int admission) {
        this.admission = admission;
    }

    public int getGraduation() {
        return graduation;
    }

    public void setGraduation(int graduation) {
        this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupname='" + groupname + '\'' +
                ", course=" + course +
                ", students=" + students +
                ", teacher=" + teacher +
                ", admission=" + admission +
                ", graduation=" + graduation +
                '}';
    }

    // удалить метод изменения ученика в группе
//    public void changeStudent (Student student){
//        this.student = student;
//        System.out.println(student);
//    }
    public void changeTeacher(Teacher teacher) {
        this.teacher = teacher;
        System.out.println(teacher);
    }

}



