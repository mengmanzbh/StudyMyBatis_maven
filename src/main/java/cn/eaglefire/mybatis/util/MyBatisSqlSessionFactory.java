package cn.eaglefire.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;

/**
 * Created by zhenghy on 2015/7/27.
 */
public class MyBatisSqlSessionFactory {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSessionFactory getSqlSessionFactory(){

        if( null == sqlSessionFactory ){
            InputStream inputStream;
            try{
                inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }catch (IOException e){
                throw new RuntimeException(e.getCause());
            }
        }

        return sqlSessionFactory;
    }

    public static SqlSession openSession(){
        return getSqlSessionFactory().openSession();
    }

}
