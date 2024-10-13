package org.example.comparator;

import org.apache.commons.lang3.StringUtils;
import org.example.Models.University;

public class UniversityFullNameComparator implements UniversityInterfaceComparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getFullName(),o2.getFullName());
    }
}
