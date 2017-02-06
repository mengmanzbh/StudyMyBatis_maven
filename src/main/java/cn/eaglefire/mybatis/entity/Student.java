package cn.eaglefire.mybatis.entity;

import java.util.Date;

/**
 * Created by zhenghy on 2015/7/27.
 */
public class Student {

    /**
     * 流水号
     */
    private Integer studId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 出生日期
     */
    private Date dob;
    /**
     *
     */
    public static class Builder{
        /**
         * 流水号
         */
        private Integer studId;
        /**
         * 姓名
         */
        private String name;
        /**
         * 电子邮件
         */
        private String email;
        /**
         * 出生日期
         */
        private Date dob;

        public Builder(){}

        public Builder studId(Integer studId){
            this.studId = studId;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder dob(Date dob){
            this.dob = dob;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
    /**
     *
     * @param builder
     */
    public Student(Builder builder){
        this.studId = builder.studId;
        this.name = builder.name;
        this.email = builder.email;
        this.dob = builder.dob;
    }
    /**
     * 空构造器
     */
    public Student(){}
    /**
     * 全属性构造器
     * @param studId
     * @param name
     * @param email
     * @param dob
     */
    public Student(Integer studId, String name, String email, Date dob) {
        this.studId = studId;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }
    //Getter and Setter
    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}