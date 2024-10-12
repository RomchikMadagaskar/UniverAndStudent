package org.example.comparator;

import org.example.University;

public class UniversityYearOfFoundationComparator implements UniversityInterfaceComparator{
    @Override
    public int compare(University o1, University o2) {
        return Integer.compare(o1.getYearOfFoundation(), o2.getYearOfFoundation());
    }
}
