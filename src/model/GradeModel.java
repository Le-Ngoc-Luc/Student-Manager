
package model;

public class GradeModel {
    private int id_grade, id_student;
    private String code_student, full_name;
    private float math, physics, chemistry, literature, english, history;
    private float medium ;

    public GradeModel() {
    }

    public GradeModel(int id_student, String code_student,String fullname, float math, float physics, float chemistry, float literature, float english, float history) {
        this.id_student = id_student;
        this.code_student = code_student;
        this.full_name = fullname;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.literature = literature;
        this.english = english;
        this.history = history;
    }

    public GradeModel(int id_grade, int id_student, String code_student,String fullname, float math, float physics, float chemistry, float literature, float english, float history) {
        this.id_grade = id_grade;
        this.id_student = id_student;
        this.code_student = code_student;
        this.full_name = fullname;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.literature = literature;
        this.english = english;
        this.history = history;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public int getId_grade() {
        return id_grade;
    }

    public int getId_student() {
        return id_student;
    }

    public String getCode_student() {
        return code_student;
    }

    public float getMath() {
        return math;
    }

    public float getPhysics() {
        return physics;
    }

    public float getChemistry() {
        return chemistry;
    }

    public float getLiterature() {
        return literature;
    }

    public float getEnglish() {
        return english;
    }

    public float getHistory() {
        return history;
    }

    public float getMedium() {
        return (math + physics + chemistry + literature + english + history) / 6;
    }

    public void setId_grade(int id_grade) {
        this.id_grade = id_grade;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public void setCode_student(String code_student) {
        this.code_student = code_student;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public void setLiterature(float literature) {
        this.literature = literature;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public void setHistory(float history) {
        this.history = history;
    }
    
    
    
    
}
