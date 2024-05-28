public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int allowedFails;

    public StudyProgramme(String name, String description, int numberOfSemesters, int allowedFails) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.allowedFails = allowedFails;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getAllowedFails() {
        return allowedFails;
    }
}
