package DesignPatters.adapter;

import java.util.List;

public class PupilAdapter implements Student{

    private final Pupil pupil;

    public PupilAdapter(final Pupil pupil) {
        this.pupil = pupil;
    }

    @Override
    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    @Override
    public String getContactDetails() {
        return pupil.getEmail();
    }

    @Override
    public boolean isAdult() {
        return pupil.getAge() >= 18;
    }

    @Override
    public List<Integer> getResults() {
        return pupil.getGrades();
    }

}
