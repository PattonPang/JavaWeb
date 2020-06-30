package zff.bean;

/**
 * @ClassName 老师分数表
 */

public class TeaMark {
    /**
     * 老师用户名
     */
    private String teaId;
    /**
     * 班级id
     */
    private Integer classId;
    /**
     * 课程id
     */
    private Integer courseId;
    /**
     * 第一题平均分
     */
    private Integer q1Mark;
    /**
     * 第二题平均分
     */
    private Integer q2Mark;
    /**
     * 第三题平均分
     */
    private Integer q3Mark;
    /**
     * 第四题平均分
     */
    private Integer q4Mark;
    /**
     * 第五题平均分
     */
    private Integer q5Mark;
    /**
     * 总平均分
     */
    private Integer allMark;

    public TeaMark(){ }

    public TeaMark(String teaId,Integer classId,Integer courseId,Integer allMark,Integer q1Mark,Integer q2Mark,Integer q3Mark,Integer q4Mark,Integer q5Mark){
        this.teaId = teaId;
        this.classId = classId;
        this.courseId = courseId;
        this.q1Mark = q1Mark;
        this.q2Mark = q2Mark;
        this.q3Mark = q3Mark;
        this.q4Mark = q4Mark;
        this.q5Mark = q5Mark;
        this.allMark = allMark;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
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

    public Integer getQ1Mark() {
        return q1Mark;
    }

    public void setQ1Mark(Integer q1Mark) {
        this.q1Mark = q1Mark;
    }

    public Integer getQ2Mark() {
        return q2Mark;
    }

    public void setQ2Mark(Integer q2Mark) {
        this.q2Mark = q2Mark;
    }

    public Integer getQ3Mark() {
        return q3Mark;
    }

    public void setQ3Mark(Integer q3Mark) {
        this.q3Mark = q3Mark;
    }

    public Integer getQ4Mark() {
        return q4Mark;
    }

    public void setQ4Mark(Integer q4Mark) {
        this.q4Mark = q4Mark;
    }

    public Integer getQ5Mark() {
        return q5Mark;
    }

    public void setQ5Mark(Integer q5Mark) {
        this.q5Mark = q5Mark;
    }

    public Integer getAllMark() { return allMark; }

    public void setAllMark(Integer allMark) { this.allMark = allMark; }

    @Override
    public String toString() {
        return "TeaMark{" +
                "teaId='" + teaId + '\'' +
                ", classId=" + classId +
                ", courseId=" + courseId +
                ", allMark=" + allMark +
                ", q1Mark=" + q1Mark +
                ", q2Mark=" + q2Mark +
                ", q3Mark=" + q3Mark +
                ", q4Mark=" + q4Mark +
                ", q5Mark=" + q5Mark +
                "}";
    }
}