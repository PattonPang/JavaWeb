package zff.bean;

/**
 * @ClassName SCCTQM
 * Studnet
 * Class
 * Course
 * Teacher
 * QuesntionN
 * Mark
 */

public class SCCTQM {
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
     * 第一题得分
     */
    private Integer q1mark;
    /**
     * 第二题得分
     */
    private Integer q2mark;
    /**
     * 第三题得分
     */
    private Integer q3mark;
    /**
     * 第四题得分
     */
    private Integer q4mark;
    /**
     * 第五题得分
     */
    private Integer q5mark;
    /**
     * 总得分
     */
    private Integer qSum;

    public SCCTQM() {
    }

    public SCCTQM(Integer id,String stuId, Integer classId, Integer courseId, String teaId,Integer q1mark,Integer q2mark,Integer q3mark,Integer q4mark,Integer q5mark,Integer qSum) {
        this.id = id;
        this.stuId = stuId;
        this.classId = classId;
        this.courseId = courseId;
        this.teaId = teaId;
        this.q1mark = q1mark;
        this.q2mark = q2mark;
        this.q3mark = q3mark;
        this.q4mark = q4mark;
        this.q5mark = q5mark;
        this.qSum = qSum;
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

    public Integer getQ1mark() { return q1mark; }

    public void setQ1mark(Integer q1mark) { this.q1mark = q1mark; }

    public Integer getQ2mark() { return q2mark; }

    public void setQ2mark(Integer q2mark) { this.q2mark = q2mark; }

    public Integer getQ3mark() { return q3mark; }

    public void setQ3mark(Integer q3mark) { this.q3mark = q3mark; }

    public Integer getQ4mark() { return q4mark; }

    public void setQ4mark(Integer q4mark) { this.q4mark = q4mark; }

    public Integer getQ5mark() { return q5mark; }

    public void setQ5mark(Integer q5mark) { this.q5mark = q5mark; }

    public Integer getqSum() { return qSum; }

    public void setqSum(Integer qSum) { this.qSum = qSum; }

    @Override
    public String toString() {
        return "SCCTQM{" + "stuId='" + stuId + '\'' +
                ", classId=" + classId +
                ", courseId=" + courseId +
                ", teaId='" + teaId + '\'' +
                ", q1mark=" + q1mark +
                ", q2mark=" + q2mark +
                ", q3mark=" + q3mark +
                ", q4mark=" + q4mark +
                ", q5mark=" + q5mark +
                ", qSum=" + qSum +
                "}";
    }
}
