package edu.seg2105.assignment1.exercise2.entities;
public class TeachingAssistant extends Instructor {
    private int maxCourses = 3;

    public TeachingAssistant(String firstName, String lastName, String id, double salary) {
            super(firstName, lastName, id, salary);

        }

    /**
	 * Assigns a course to the TA if the maximum number of courses is not exceeded.
	 * 
	 * @param course the course to be assigned
	 * @return true if the course was successfully assigned, false otherwise
	 */
	@Override
	public boolean assignCourse(Course course) {
		if (courses.size() < maxCourses) {
			courses.add(course);
			return true;
		} else {
			return false;
		}
	}
	@Override
    public String toString() {
    	
    
        return "TA information:\n"
                + "\tFirst name: " + getFirstName() + "\n"
                + "\tLast name: " + getLastName() + "\n"
                + "\tEmployee ID: " + getId() + "\n"
                + "\tSalary: " + getSalary() + "\n"
                + (courses.size() > 0 ? "\tList of assigned courses:" + getCoursesTable() : "");
                
         
    }
}
