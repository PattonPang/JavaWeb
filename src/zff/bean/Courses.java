package zff.bean;

/**
 * @ClassName Courses课程表
 */

public class Courses {
    /**
     * 主键，自增
     */
    private Integer id;
    /**
     * 课程id
     */
    private Integer courseId;
    /**
     * 课程名
     */
    private String courseName;

    public Courses(){ }

    public  Courses(Integer id,Integer courseId,String courseName){
        this.id = id;
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                "}";
    }
}
