class Course {
    private String courseName;
    private String courseCode;
    private int duration;

    // Constructor
    public Course(String courseName, String courseCode, int duration) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.duration = duration;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getDuration() {
        return duration;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // toString() method
    public String toString() {
        return "Course [Course Name=" + courseName + ", Course Code=" + courseCode + ", Duration=" + duration + " months]";
    }
}
