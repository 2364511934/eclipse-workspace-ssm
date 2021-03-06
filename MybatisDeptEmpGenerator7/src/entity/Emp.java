package entity;

import java.math.BigDecimal;
import java.util.Date;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.empno
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    private Integer empno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.ename
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    private String ename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.job
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    private String job;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.mgr
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    private Integer mgr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.hiredate
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    private Date hiredate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sal
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    private BigDecimal sal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.comm
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    private BigDecimal comm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.deptno
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    private Integer deptno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.empno
     *
     * @return the value of emp.empno
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.empno
     *
     * @param empno the value for emp.empno
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.ename
     *
     * @return the value of emp.ename
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.ename
     *
     * @param ename the value for emp.ename
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.job
     *
     * @return the value of emp.job
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.job
     *
     * @param job the value for emp.job
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.mgr
     *
     * @return the value of emp.mgr
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public Integer getMgr() {
        return mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.mgr
     *
     * @param mgr the value for emp.mgr
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.hiredate
     *
     * @return the value of emp.hiredate
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.hiredate
     *
     * @param hiredate the value for emp.hiredate
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sal
     *
     * @return the value of emp.sal
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public BigDecimal getSal() {
        return sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sal
     *
     * @param sal the value for emp.sal
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.comm
     *
     * @return the value of emp.comm
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public BigDecimal getComm() {
        return comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.comm
     *
     * @param comm the value for emp.comm
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.deptno
     *
     * @return the value of emp.deptno
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.deptno
     *
     * @param deptno the value for emp.deptno
     *
     * @mbggenerated Sat Feb 10 15:06:47 CST 2018
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}