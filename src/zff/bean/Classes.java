package zff.bean;

/**
 * @ClassName Classes 班级表
 */

public class Classes {
    /**
     * 主键，自增
     */
    private Integer id;
    /**
     * 班级id
     */
    private Integer classId;
    /**
     * 班级名称
     */
    private String className;

    public Classes() {
    }

    public Classes(Integer id, Integer classId, String className) {
        this.id = id;
        this.classId = classId;
        this.className = className;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Classes{" + "id=" + id +
                ", classId=" + classId +
                ", className='" + className + '\'' +
                "}";
    }
}
