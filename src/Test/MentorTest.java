package Test;

import oop.Mentor;
import oop.Student;

import java.util.ArrayList;

public class MentorTest {
    public static void main(String[] args) {
        Student t1=new Student(72,"Pran","pran@gmail.com","April-2022",99);
        Student t2=new Student(73,"Vysh","vysh@gmail.com","May-2022",80);
        ArrayList st=new ArrayList<>();
        st.add(t1);
        st.add(t2);
        Mentor mentor=new Mentor(7,"Tantia Tope","tantia@gmail.com",st);
    }
}
