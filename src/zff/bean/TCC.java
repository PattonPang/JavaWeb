package zff.bean;

public class TCC {
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

    public TCC(){ }

    public TCC(String teaId,Integer classId,Integer courseId){
        this.teaId = teaId;
        this.classId = classId;
        this.courseId = courseId;
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

    @Override
    public String toString() {
        return "TCC{" + "teaId=" + teaId +
                ", classId=" + classId +
                ", courseId=" + courseId +
                "}";
    }
}
