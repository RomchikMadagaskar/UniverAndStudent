package org.example.comparator;

import org.apache.commons.lang3.StringUtils;
import org.example.Models.University;

public class UniversityIdComparator implements UniversityInterfaceComparator {
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getId(),o2.getId());
    }
}
