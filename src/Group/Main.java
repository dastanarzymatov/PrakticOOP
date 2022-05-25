package Group;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Peaksoft");


        Group group=new Group("Java6","01.04.2022");
        Group group1=new Group("Java5","01.01.2022");
        Group group2=new Group("Java4","01.10.2021");

        Group[]groups1=new Group[]{group,group1,group2};
        System.out.println(Arrays.toString(groups1));
        System.out.println("||<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>||");


        Student student=new Student("Dastan",2002,20);
        Student student1=new Student("Jaulanbek",2000,22);
        Student student2=new Student("Datka",2001,21);

        Student[]students=new Student[]{student,student2,student1};
        System.out.println(Arrays.toString(students));
        System.out.println("||<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>||");


        Instruktor instruktor=new Instruktor("Muhamed",1998,24);
         Instruktor[]instruktors=new Instruktor[]{instruktor};
        System.out.println(Arrays.toString(instruktors));
        System.out.println("||<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>||");


        Mentor mentor=new Mentor("Aijamal eje",27,1995);
        Mentor mentor2=new Mentor("Maksat aka",33,1989);
        Mentor mentor3=new Mentor("Beksultan",18,2004);

        Mentor[]mentors=new Mentor[]{mentor,mentor2,mentor3};
        System.out.println(Arrays.toString(mentors));
        System.out.println("||<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>||");


    }
}
