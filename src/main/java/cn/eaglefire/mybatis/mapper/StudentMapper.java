package cn.eaglefire.mybatis.mapper;

import cn.eaglefire.mybatis.entity.Student;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by zhenghy on 2015/7/27.
 */
public interface StudentMapper {

    public List<Student> findAllStudents();

    public List<Student> findStudentsByPagination(RowBounds rowBounds);

    public Student findStudentById(Integer id);

    public int insertStudent(Student student);

}
