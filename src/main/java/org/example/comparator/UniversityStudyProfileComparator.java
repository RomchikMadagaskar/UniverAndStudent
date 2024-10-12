package org.example.comparator;

import org.apache.commons.lang3.StringUtils;
import org.example.University;

public class UniversityStudyProfileComparator implements UniversityInterfaceComparator{
    @Override
    public int compare(University o1, University o2) {
       //
        return StringUtils.compare(o1.getMainProfile().name(),o2.getMainProfile().name());
    }
}
