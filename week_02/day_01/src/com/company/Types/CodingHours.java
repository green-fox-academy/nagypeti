package com.company.Types;

public class CodingHours {

    public static void main(String[] args) {

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        int numberOfWorkdays = 17 * 5;
        int avargeHoursSpentCoding = numberOfWorkdays * 6;

        System.out.println("Avarage hours spent coding: " + avargeHoursSpentCoding);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

//        int WorkHoursWeekly = 52;
//
//        int workHoursInSemester = WorkHoursWeekly * 17;
//        System.out.println("Work Hours In Semester: " + workHoursInSemester);
//
//        int codingHoursInSemester = (6 * 5) * 17;
//        System.out.println("Coding Hours  spent In Semester: " + codingHoursInSemester);


        double workDivCodingHourInPrec = (510. / 884.) * 100;

        System.out.println("Precentage of coding hours in the semester: " + workDivCodingHourInPrec + "%");

    }
}
