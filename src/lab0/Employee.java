package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    public static final String DAY_RANGE_MSG = "Only values from 0 to 28 "
            + "allowed for vacation.";
    public static final String NAME_REQ_MSG = "You must enter a value for name.";
    public static final String DATE_REQ_MSG = "You must enter a hire date.";
    public static final String SSN_REQ_MSG = "You must enter a social security number.";
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    /**
     * Sets the number of vacation days allowed for this Employee, or the number
     * remaining for this Employee.
     * @param daysVacation days of vacation allowed per year
     * @throws IllegalArgumentException if value not in range
     */
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS){
            throw new IllegalArgumentException(DAY_RANGE_MSG);
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the Employee's first name.
     * 
     * @param firstName Employee's first name
     * @throws IllegalArgumentException if first name is null or empty
     */
    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null || firstName.length() == 0){
            throw new IllegalArgumentException(NAME_REQ_MSG);
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) throws IllegalArgumentException {
        if (hireDate == null) {
            throw new IllegalArgumentException(DATE_REQ_MSG);
        }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the Employee's last name.
     * 
     * @param lastName Employee's last name
     * @throws IllegalArgumentException if last name is null or empty
     */
    public void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null || lastName.length() == 0){
            throw new MandatoryFieldException();
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) throws IllegalArgumentException {
        if (ssn == null || ssn.length() == 0) {
            throw new IllegalArgumentException(SSN_REQ_MSG);
        }
        this.ssn = ssn;
    }   
}
