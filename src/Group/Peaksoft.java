package Group;

import java.util.Arrays;

public class Peaksoft {
    private Group[] group;
    private Student[] student;
    private Mentor[] mentor;
    private Instruktor[] instruktor;
    public Peaksoft(){

    }

    public Peaksoft(Group[] group, Student[] student, Mentor[] mentor, Instruktor[] instruktor) {
        this.group = group;
        this.student = student;
        this.mentor = mentor;
        this.instruktor = instruktor;
    }

    @Override
    public String toString() {
        return "||<~~Peaksoft{" +
                "group=" + Arrays.toString(group) +
                ", student=" + Arrays.toString(student) +
                ", mentor=" + Arrays.toString(mentor) +
                ", instruktor=" + Arrays.toString(instruktor) ;
    }
}