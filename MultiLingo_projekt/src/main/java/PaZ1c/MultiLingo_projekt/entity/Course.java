package PaZ1c.MultiLingo_projekt.entity;

import java.time.LocalDate;

public class Course {

	private String languageTaught;
	private String taughtIn;
	private String level;
	private LocalDate startOfCourse;
	private LocalDate endOfCourse;
	private String timeOfLectures;
	private String information;

	public String getLanguageTaught() {
		return languageTaught;
	}

	public void setLanguageTaught(String languageTaught) {
		this.languageTaught = languageTaught;
	}

	public String getTaughtIn() {
		return taughtIn;
	}

	public void setTaughtIn(String taughtIn) {
		this.taughtIn = taughtIn;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public LocalDate getStartOfCourse() {
		return startOfCourse;
	}

	public void setStartOfCourse(LocalDate startOfCourse) {
		this.startOfCourse = startOfCourse;
	}

	public LocalDate getEndOfCourse() {
		return endOfCourse;
	}

	public void setEndOfCourse(LocalDate endOfCourse) {
		this.endOfCourse = endOfCourse;
	}

	public String getTimeOfLectures() {
		return timeOfLectures;
	}

	public void setTimeOfLectures(String timeOfLectures) {
		this.timeOfLectures = timeOfLectures;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "Language: " + languageTaught + ", Taught in: " + taughtIn + ", Level: " + level + ", Start of course: "
				+ startOfCourse + ", End of course: " + endOfCourse + ", Time of lectures: " + timeOfLectures
				+ ", Information: " + information;
	}
}
