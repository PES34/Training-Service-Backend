package com.inqoo.trainingservice.app.absence;

public class VacationLimitEndException extends RuntimeException{
    public VacationLimitEndException() {super("Vacation limit ended");}
}
