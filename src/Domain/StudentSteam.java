package Domain;

import java.util.Iterator;
import java.util.List;

/** Класс потока студентов содержащий в себе список учебных групп */
public class StudentSteam implements Iterable<StudentGroup>  {
    /** номер потока студентов */
    protected List<StudentGroup>  numberSteam;
    /** генерация номера студентов с 0 + ..... */
    private int idnnumberSteam;

    
    public StudentSteam(List<StudentGroup> numberSteam, int idnnumberSteam) {
        this.numberSteam = numberSteam;
        this.idnnumberSteam = idnnumberSteam;
    }


    public List<StudentGroup> getNumberSteam() {
        return numberSteam;
    }


    public void setNumberSteam(List<StudentGroup> numberSteam) {
        this.numberSteam = numberSteam;
    }


    public int getIdnnumberSteam() {
        return idnnumberSteam;
    }


    public void setIdnnumberSteam(int idnnumberSteam) {
        this.idnnumberSteam = idnnumberSteam;
    }


    @Override
    public String toString() {
        return "StudentSteam [numberSteam=" + numberSteam + ", idnnumberSteam=" + idnnumberSteam + "]";
    }


    @SuppressWarnings("unchecked")
    @Override
    public Iterator<StudentGroup> iterator() {
        return (Iterator<StudentGroup>) new StudentSteamIterator(numberSteam);
    }


    

    

  

}
