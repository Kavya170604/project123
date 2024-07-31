package com.examples;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int id;
    private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
   	public String toString() {
   		return "Student [id=" + id + ", name=" + name + "]";
   	}
}
public class Addstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<Student> li=new ArrayList<Student>();
  li.add(new Student(11,"arun"));
  li.add(new Student(12,"arivu"));
  li.add(new Student(13,"ajay"));
  //1 way
  for(int i=0;i<li.size();i++) {
	  System.out.println(li.get(i));
  }
  //2way
  for(Student s:li) {
	  System.out.println(s);
  }
  //3 way
  li.forEach(s->System.out.println(s));
	}


}
