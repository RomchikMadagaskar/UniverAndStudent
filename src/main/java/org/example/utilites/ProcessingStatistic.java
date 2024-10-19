package org.example.utilites;

import org.apache.commons.lang3.StringUtils;
import org.example.models.Statistics;
import org.example.models.Student;
import org.example.models.University;
import org.example.enums.StudyProfile;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class ProcessingStatistic {

    public static List<Statistics> createStatisticsList(List<Student> studentList, List<University> universityList){

        List<Statistics> statisticsList=new ArrayList<>();

        //
        Set<StudyProfile> profileSet=universityList.stream().map(University::getMainProfile).collect(Collectors.toSet());
        profileSet.forEach(profile-> {
            Statistics statistics=new Statistics();
            statisticsList.add(statistics);
            statistics.setProfile(profile);

            List<String> profileUniverId=universityList.stream()
                    .filter(university -> university.getMainProfile().equals(profile))
                    .map(University::getId)
                    .toList();
            statistics.setTotalUniverProf(profileUniverId.size());
            statistics.setUniverName((StringUtils.EMPTY));
            universityList.stream()
                    .filter(university -> profileUniverId.contains(university.getId()))
                    .map(University::getFullName)
                    .forEach(fullNameUniver->statistics.setUniverName(
                            statistics.getUniverName()+fullNameUniver+";"));

            List<Student> studentProfile=studentList.stream()
                    .filter(student->profileUniverId.contains(student.getUniversityID()))
                    .toList();
            statistics.setTotalStudProf((studentProfile.size()));
            OptionalDouble avgExamScore=studentProfile.stream()
                    .mapToDouble(Student::getAvgExamScore)
                    .average();
            statistics.setAvgExamScore(0);
            avgExamScore.ifPresent(rez->statistics.setAvgExamScore(
                    BigDecimal.valueOf(rez).setScale(2, RoundingMode.HALF_UP).doubleValue()));

        });
        return statisticsList;
    }
}
