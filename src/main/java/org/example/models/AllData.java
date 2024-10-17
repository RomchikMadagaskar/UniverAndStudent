package org.example.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.Date;
import java.util.List;

public class AllData {

    @XmlElementWrapper(name="studentInfo")
    @XmlElement(name = "studentEntry")
    private List<Student> studentList;

    @XmlElementWrapper(name="universitiesInfo")
    @XmlElement(name = "universitiesEntry")
    private List<University> universityList;

    @XmlElementWrapper(name="statisticalInfo")
    @XmlElement(name = "statisticalEntry")
    private List<Statistics> statisticsList;

    @XmlElement(name = "processedAt")
    private Date dateToFile;

    public AllData() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    public List<Statistics> getStatisticsList() {
        return statisticsList;
    }

    public Date getDateToFile() {
        return dateToFile;
    }

    public AllData setStudentList(List<Student> studentList) {
        this.studentList = studentList;
        return this;
    }

    public AllData setUniversityList(List<University> universityList) {
        this.universityList = universityList;
        return this;
    }

    public AllData setStatisticsList(List<Statistics> statisticsList) {
        this.statisticsList = statisticsList;
        return this;
    }

    public AllData setDateToFile(Date dateToFile) {
        this.dateToFile = dateToFile;
        return this;
    }

}
