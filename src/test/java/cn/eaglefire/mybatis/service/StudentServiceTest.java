package cn.eaglefire.mybatis.service;

import cn.eaglefire.mybatis.entity.Student;
import cn.eaglefire.mybatis.util.Pagination;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by zhenghy on 2015/7/27.
 */
public class StudentServiceTest {

    private static StudentService studentService;

    @BeforeClass
    public static void setup(){
        studentService = new StudentService();
    }

    @AfterClass
    public static void tearDown(){
        studentService = null;
    }

    @Test
    public void testFindAllStudents(){
        //查询全部数据
        List<Student> students = studentService.findAllStudents();
        Assert.assertNotNull(students);
        for (Student student: students){
            System.out.println(student.getStudId()+" "+student.getName()+" "+student.getEmail());
        }
    }

    @Test
    public void testFindStudentsByPagination(){
        Pagination pagination = new Pagination(2, 2);
        List<Student> students = studentService.findStudentsByPagination(pagination);
        Assert.assertNotNull(students);
        for (Student student: students){
            System.out.println(student.getStudId()+" "+student.getName()+" "+student.getEmail());
        }
    }

    @Test
    public void testFindStudentById(){
        //查询数据
        Student student = studentService.findStudentById(1);
        Assert.assertNotNull(student);
        System.out.println(student.getStudId()+" "+student.getName()+" "+student.getEmail());
    }

    @Test
    public void testInsertStudent(){
        //插入数据
        Integer studId = 6;
        Student student = new Student.Builder()
                .studId(studId)
                .name("张雨绮")
                .email("mengmanzbh@gmail.com")
                .dob(new Date())
                .build();
        System.out.println("insertStudent affect rows: "+studentService.insertStudent(student));
        Student newStudent = studentService.findStudentById(studId);
        Assert.assertNotNull(student);
        System.out.println(newStudent.getStudId()+" "+newStudent.getName()+" "+newStudent.getEmail());
    }

}
