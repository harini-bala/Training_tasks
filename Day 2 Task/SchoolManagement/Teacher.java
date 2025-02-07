class Teacher {
    private String teacherName;
    private String subject;
    private int experience;

    // Constructor
    public Teacher(String teacherName, String subject, int experience) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.experience = experience;
    }

    // Getters
    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperience() {
        return experience;
    }

    // Setters
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // toString() method
    public String toString() {
        return "Teacher [Name=" + teacherName + ", Subject=" + subject + ", Experience=" + experience + " years]";
    }
}
