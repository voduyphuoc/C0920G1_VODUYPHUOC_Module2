package Java_collection_framework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SapXepStudent implements Comparable <SapXepStudent>{
    private String name;
    private Integer age;
    private String address;
    public SapXepStudent(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(SapXepStudent student) {
        return this.getName().compareTo(student.getName());
    }

    public static class AgeComparator implements Comparator<SapXepStudent> {
        @Override
        public int compare(SapXepStudent o1, SapXepStudent o2) {
            if(o1.getAge() > o2.getAge()){
                return 1;
            }else if(o1.getAge() == o2.getAge()){
                return 0;
            }else{
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        SapXepStudent student = new SapXepStudent("Kien", 30, "HT");
        SapXepStudent student1 = new SapXepStudent("Nam", 26, "HN");
        SapXepStudent student2 = new SapXepStudent("Anh", 38, "HT" );
        SapXepStudent student3 = new SapXepStudent("Tung", 38, "HT" );

        List<SapXepStudent> lists = new ArrayList<SapXepStudent>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(SapXepStudent st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(SapXepStudent st : lists){
            System.out.println(st.toString());
        }
        String str = "16/01/1999";
        System.out.println("aaaaaaaaaaaaaaa");
        String year = str.substring(str.lastIndexOf("/")+1,str.length());
        System.out.println(year);
    }

}
