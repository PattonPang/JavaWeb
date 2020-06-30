package zff.bean;

/**
 * @ClassName Admins 管理员表
 */

public class Admins {

    /**
     * 主键，自增
     */
    private Integer id;
    /**
     * 用户名/唯一
     */
    private String username;
    /**
     * 密码
     */
    private String passWd;

    public Admins(){ }

    public Admins(Integer id,String username,String passWd){
        this.id = id;
        this.username = username;
        this.passWd = passWd;
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

    @Override
    public String toString(){
        return "Admin{" + "id=" + id +
                ", username='" + username + '\'' +
                ", passWd='" + passWd + '\'' +
                "}";
    }
}
