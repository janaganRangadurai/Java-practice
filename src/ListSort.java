/*
 * You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
 */
package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListSort {

	public static void main(String[] args) {

		List<Student> students = getListIO();

		Comparator<Student> sortStudent = studentCompare();

		Collections.sort(students, sortStudent);

		students.forEach(s -> System.out.println(s.getFirstName()));

	}

	public static Comparator<Student> studentCompare() {
		Comparator<Student> sortStudent = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {

				if (Double.compare(o2.getCGPA(), o1.getCGPA()) != 0) {
					return Double.compare(o2.getCGPA(), o1.getCGPA());
				} else if (!o1.getFirstName().equals(o2.getFirstName())) {
					return o1.getFirstName().compareTo(o2.getFirstName());
				} else {
					return o1.getID() - o2.getID();
				}
			}
		};
		return sortStudent;
	}

	public static List<Student> getListIO() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			students.add(new Student(sc.nextInt(), sc.next(), sc.nextDouble()));
		}
		sc.close();
		return students;
	}

	static class Student {
		int ID;
		String FirstName;
		double CGPA;

		Student(int ID, String FirstName, double CGPA) {
			this.ID = ID;
			this.FirstName = FirstName;
			this.CGPA = CGPA;
		}

		public int getID() {
			return ID;
		}

		public String getFirstName() {
			return FirstName;
		}

		public double getCGPA() {
			return CGPA;
		}
	}

}
