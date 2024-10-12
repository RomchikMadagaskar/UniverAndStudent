package org.example;

import org.example.comparator.*;
import org.example.enums.StudentComparatorType;
import org.example.enums.UiversityComparatorType;

public class UtilClassComparator {
    public static StudentInerfaceComparator getStudentComparator(StudentComparatorType studentComparatorType){
        switch(studentComparatorType) {
            case FULL_NAME: return new StudentFullNameComparator();
            case UNIVER_ID: return new StudentUniversityIdComparator();
            case COURSE: return new StudentCurrentCourseNumberComparator();
            case AVG_SCORE: return new StudentAvgExamScoreComparator();
        }
        return new StudentFullNameComparator();
    }
    public static UniversityInterfaceComparator getUniversityComparator(UiversityComparatorType uiversityComparatorType){
        switch (uiversityComparatorType){
            case ID: return new UniversityIdComparator();
            case FULL_NAME: return new UniversityFullNameComparator();
            case SHORT_NAME: return new UniversityShortNameComparator();
            case YEAR:return new UniversityYearOfFoundationComparator();
            case ST_PROFILE:return new UniversityStudyProfileComparator();
        }
        return new UniversityFullNameComparator();
    }
}
