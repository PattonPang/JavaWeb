package zff.bean;

/**
 * @ClassName Students学生表
 */

public class Students {
    /**
     * 主键，自增
     */
    private Integer id;
    /**
     * 学生用户名/学号/唯一
     */
    private String username;
    /**
     * 密码
     */
    private String passWd;
    /**
     * 学生姓名
     */
    private String stuName;
    /**
     * 班级id
     */
    private Integer classId;

    public Students(){ }

    public Students(Integer id,String username,String passWd,String stuName,Integer classId){
        this.id = id;
        this.username = username;
        this.passWd = passWd;
        this.stuName = stuName;
        this.classId = classId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Stuents{" + "id=" + id +
                ", username='" + username + '\'' +
                ", passWd='" + passWd + '\'' +
                ", stuName='" + stuName + '\'' +
                ", classId=" + classId +
                "}";
    }
}
