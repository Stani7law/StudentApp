package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterable<StudentGroup>{
    /** Счетчик который отслеживает позицию в списке */
    private int count;

    /** Список по которому будем проходить счетчик*/
    private List<StudentGroup>  studentGroups;

    public StudentSteamIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    
    @Override
    public Iterator<StudentGroup> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}

    
    


    
   
    


