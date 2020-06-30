package zff.bean;

/**
 * @ClassName SIstrue
 *            学生是否可以对该老师进行评教
 */

public class SIstrue {
    /**
     * 主键，自增
     */
    private  Integer id;
    /**
     * 学生用户名/学号
     */
    private String stuId;
    /**
     * 班级id
     */
    private Integer classId;
    /**
     * 课程id
     */
    private Integer courseId;
    /**
     * 老师用户名
     */
    private String teaId;
    /**
     * 是否可以进行评教
     */
    private Integer isTrue;

    public SIstrue(){ }

    public SIstrue(Integer id,String stuId,Integer classId,Integer courseId,String teaId,Integer isTrue){
        this.id = id;
        this.stuId = stuId;
        this.classId = classId;
        this.courseId = courseId;
        this.teaId = teaId;
        this.isTrue = isTrue;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public Integer getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Integer isTrue) {
        this.isTrue = isTrue;
    }

    @Override
    public String toString() {
        return "SIstrue{" + "id=" + id +
                ", stuId='" + stuId + '\'' +
                ", classId=" + classId +
                ", courseId=" + courseId +
                ", teaId='" + teaId + '\'' +
                ", isTrue=" + isTrue +
                "}";
    }
}
