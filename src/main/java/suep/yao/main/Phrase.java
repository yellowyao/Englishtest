package suep.yao.main;

public class Phrase {
    private Integer id;
    private String english;
    private String chinese;

    @Override
    public String toString() {
        return "Phrase{" +
                "id=" + id +
                ", english='" + english + '\'' +
                ", chinese='" + chinese + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }
}
