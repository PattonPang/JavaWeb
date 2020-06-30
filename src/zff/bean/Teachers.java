package zff.bean;

/**
 * @ClassName 老师表
 */

public class Teachers {
    /**
     * 主键，自增
     */
    private Integer id;
    /**
     * 老师用户名/唯一
     */
    private String username;
    /**
     * 密码
     */
    private String passWd;
    /**
     * 老师姓名
     */
    private String teaName;

    public Teachers(){ }

    public Teachers(Integer id,String username,String passWd,String teaName){
        this.id = id;
        this.username = username;
        this.passWd = passWd;
        this.teaName = teaName;
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

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    @Override
    public String toString() {
        return "Teachers{" + "id=" + id +
                ", username='" + username + '\'' +
                ", passWd='" + passWd + '\'' +
                ", teaName='" + teaName + '\'' +
                "}";
    }
}
