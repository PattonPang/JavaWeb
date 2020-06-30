package zff.bean;

/**
 * @ClassName Questions 问卷表
 */

public class Questions {
    /**
     * 主键，自增
     */
    private  Integer id;
    /**
     * 问题
     */
    private String question;
    /**
     * 20分选项
     */
    private  String mark20;
    /**
     * 15分选项
     */
    private  String mark15;
    /**
     * 10分选项
     */
    private  String mark10;
    /**
     * 5分选项
     */
    private  String mark5;
    /**
     * 0分选项
     */
    private  String mark0;

    public Questions(){ }

    public Questions(Integer id,String question,String mark20,String mark15,String mark10,String mark5,String mark0){
        this.id = id;
        this.question = question;
        this.mark20 = mark20;
        this.mark15 = mark15;
        this.mark10 = mark10;
        this.mark5 = mark5;
        this.mark0 = mark0;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getQuestion() { return question; }

    public void setQuestion(String question) { this.question = question; }

    public String getMark20() { return mark20; }

    public void setMark20(String mark20) { this.mark20 = mark20; }

    public String getMark15() { return mark15; }

    public void setMark15(String mark15) { this.mark15 = mark15; }

    public String getMark10() { return mark10; }

    public void setMark10(String mark10) { this.mark10 = mark10; }

    public String getMark5() { return mark5; }

    public void setMark5(String mark5) { this.mark5 = mark5; }

    public String getMark0() { return mark0; }

    public void setMark0(String mark0) { this.mark0 = mark0; }

    @Override
    public String toString() {
        return "Questions{" + "id=" + id +
                ", question='" + question + '\'' +
                ", mark20='" + mark20 + '\'' +
                ", mark15='" + mark15 + '\'' +
                ", mark10='" + mark10 + '\'' +
                ", mark5='" + mark5 + '\'' +
                ", mark0='" + mark0 + '\'' +
                "}";
    }
}
