package cn.eaglefire.mybatis.service;

import cn.eaglefire.mybatis.entity.Student;
import cn.eaglefire.mybatis.mapper.StudentMapper;
import cn.eaglefire.mybatis.util.MyBatisSqlSessionFactory;
import cn.eaglefire.mybatis.util.Pagination;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by zhenghy on 2015/7/27.
 */
public class StudentService {

    public List<Student> findAllStudents(){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findAllStudents();
        }finally {
            sqlSession.close();
        }
    }

    public List<Student> findStudentsByPagination(Pagination pagination){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            RowBounds rowBounds = new RowBounds(pagination.getOffset(), pagination.getRows());
            return studentMapper.findStudentsByPagination(rowBounds);
        }finally {
            sqlSession.close();
        }
    }

    public Student findStudentById(Integer id){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findStudentById(id);
        }finally {
            sqlSession.close();
        }
    }

    public int insertStudent(Student student){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            int affectedRow = studentMapper.insertStudent(student);
            sqlSession.commit();
            return affectedRow;
        }finally {
            sqlSession.close();
        }
    }

}
