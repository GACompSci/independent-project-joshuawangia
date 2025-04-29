import java.util.ArrayList;


public class Guess {
 public ArrayList <Teacher> Teachers = new ArrayList<>();
 int countQ = 0;
 
    public Guess(){
        //Art
        Teachers.add(new Teacher(false, "Art", "Truesdell", true, "Black", false, false, "Sara Ritz"));
        Teachers.add(new Teacher(true, "Art", null, false, null, false, true, "David Love"));
        Teachers.add(new Teacher(true, "Art", null, true, "Black", false, true, "Dainis Roman"));
        Teachers.add(new Teacher(true, "Art", "Kershaw", true, "Brown", false, true, "Nicholas Wynia"));
        //Chinese
        Teachers.add(new Teacher(false, "Chinese", "Alcott Day", true, "Black", true, false, "Tsung Tsai"));
        //Classics
        Teachers.add(new Teacher(true, "Classics", "Osbourn", true, "Gray", false, false, "Adam Leven"));
        Teachers.add(new Teacher(false, "Classics", "Truesdell", true, "Brown", false, false, "Lindsey Stamer"));
        //English
        Teachers.add(new Teacher(false, "English", "Galloway", true, "Blonde", false, false, "Claire Barwise"));
        Teachers.add(new Teacher(false, "English", null, true, "Brown", false, false, "Rebecca Burnett"));
        Teachers.add(new Teacher(false, "English", "Kershaw", true, "Brown", true, false, "Alicia Evans"));
        Teachers.add(new Teacher(true, "English", "Roberts", true, "Brown", false, false, "Michael Ferrier"));
        Teachers.add(new Teacher(false, "English", null, true, "Brown", false, false, "Michelle Friedman"));
        Teachers.add(new Teacher(false, "English", "Osbourn", true, "Gray", true, false, "Robyn Graffam"));
        Teachers.add(new Teacher(true, "English", "Osbourn", true, "Gray", false, false, "Daniel Keefe"));
        Teachers.add(new Teacher(false, "English", "Alcott Day", true, "Brown", true, false, "Kara McPhillips"));
        Teachers.add(new Teacher(false, "English", "Roberts", true, "Black", true, false, "Antoinette Peters"));
        Teachers.add(new Teacher(true, "English", "Galloway", true, "Brown", false, false, "Michael Torrey"));
        Teachers.add(new Teacher(false, "English", "Truesdell", true, "Brown", true, false, "Helga Vutz"));
        //History
        Teachers.add(new Teacher(true, "History", "Galloway", false, null, false, false, "Roxie Bratton"));
        Teachers.add(new Teacher(true, "History", "Osbourn", true, "Brown", false, true, "Kyle Donahue"));
        Teachers.add(new Teacher(false, "History", "Kershaw", true, "Brown", true, false, "Julie Kimmel"));
        Teachers.add(new Teacher(false, "History", "Osbourn", true, "Blonde", false, false, "Sarah Lloyd"));
        Teachers.add(new Teacher(false, "History", "Roberts", true, "Brown", false, false, "Maggie May"));
        Teachers.add(new Teacher(true, "History", "Alcott Day", true, "Blonde", true, false, "Robert Moyer"));
        Teachers.add(new Teacher(true, "History", "Truesdell", true, "Gray", false, false, "Jamie Murray"));
        Teachers.add(new Teacher(true, "History", "Washington", true, "Gray", true, true, "Mark Rabuck"));
        Teachers.add(new Teacher(true, "History", "Osbourn", true, "Brown", true, false, "Adam Wilsman"));
        //Mathematics
        Teachers.add(new Teacher(false, "Math", "Alcott Day", true, "Blonde", false, false, "Peggy Bradley"));
        Teachers.add(new Teacher(false, "Math", "Galloway", true, "Black", false, false, "Diana Caramanico"));
        Teachers.add(new Teacher(true, "Math", "Truesdell", true, "Gray", false, true, "Paul Henry"));
        Teachers.add(new Teacher(false, "Math", "Galloway", true, "Brown", true, false, "Lauren Lesch"));
        Teachers.add(new Teacher(true, "Math", null, true, "Brown", false, true, "Steven Moll"));
        Teachers.add(new Teacher(true, "Math", "Kershaw", true, "Gray", true, false, "Kevin Mylod"));
        Teachers.add(new Teacher(true, "Math", "Washington", true, "Brown", false, false, "Chris Nelson"));
        Teachers.add(new Teacher(false, "Math", "Roberts", true, "Brown", false, false, "Allison Rader"));
        Teachers.add(new Teacher(true, "Math", "Galloway", false, null, false, false, "Jason Straub"));
        Teachers.add(new Teacher(true, "Math", "Washington", true, "Black", false, false, "Joe Taylor"));
        Teachers.add(new Teacher(true, "Math", "Osbourn", true, "Brown", false, false, "Henry Wadsworth"));
        Teachers.add(new Teacher(true, "Math", "Washington", true, "Brown", false, true, "Peter Winsniewski"));
        //Spanish
        Teachers.add(new Teacher(true, "Spanish", "Galloway", true, "Brown", false, true, "Carlos Chubb"));
        Teachers.add(new Teacher(true, "Spanish", "Washington", true, "Black", false, false, "Axel Galeano"));
        Teachers.add(new Teacher(false, "Spanish", "Kershaw", true, "Black", false, false, "Angela Gonzales"));
        Teachers.add(new Teacher(true, "Spanish", "Kershaw", true, "Black", false, false, "Juan Leon"));
        Teachers.add(new Teacher(true, "Spanish", "Washington", true, "Black", false, false, "Axel Galeano"));
        Teachers.add(new Teacher(false, "Spanish", "Osbourn", true, "Black", false, false, "Jedi Dudurich"));
        //French
        Teachers.add(new Teacher(true, "French", "Alcott Day", false, null, false, true, "Adam Fisher"));
        Teachers.add(new Teacher(false, "French", "Galloway", true, "Brown", false, false, "Sonia Robin"));
        //Phys. Ed.
        Teachers.add(new Teacher(true, "P.E.", "Kershaw", false, null, false, true, "Matthew Dence"));
        Teachers.add(new Teacher(true, "P.E.", "Alcott Day", false, null, false, true, "Brian Grady"));
        Teachers.add(new Teacher(true, "P.E.", "Truesdell", true, "Gray", false, false, "David Martin"));
        //Science
        Teachers.add(new Teacher(true, "Science", null, true, "Blonde", false, true, "James Anderson"));
        Teachers.add(new Teacher(false, "Science", "Galloway", true, "Blonde", false, false, "Elizabeth Cravero"));
        Teachers.add(new Teacher(false, "Science", "Alcott Day", true, "Brown", true, false, "Julia Downs"));
        Teachers.add(new Teacher(false, "Science", "Washington", true, "Brown", false, false, "Diane Goldstein"));
        Teachers.add(new Teacher(false, "Science", "Washington", true, "Blonde", false, false, "Sarah Kesten"));
        Teachers.add(new Teacher(true, "Science", "Roberts", true, "Brown", false, false, "Matthew Kraynak"));
        Teachers.add(new Teacher(true, "Science", "Roberts", true, "Gray", false, false, "Victor Montemayor"));
        Teachers.add(new Teacher(false, "Science", "Osbourn", true, "Blonde", true, false, "Kimberly O'Brien"));
        Teachers.add(new Teacher(true, "Science", "Washington", true, "Gray", false, false, "Richard O'Hern"));
        Teachers.add(new Teacher(false, "Science", "Osbourn", true, "Gray", true, false, "Rebecca Pizzino"));
        Teachers.add(new Teacher(true, "Science", "Truesdell", true, "Brown", true, false, "Michael Ream"));
        //Fine Arts
        Teachers.add(new Teacher(false, "Fine Arts", "Galloway", true, "Brown", false, false, "Ann Esposito"));
        Teachers.add(new Teacher(true, "Fine Arts", "Osbourn", true, "Brown", false, false, "Sean Gibbons"));
        Teachers.add(new Teacher(true, "Fine Arts", "Kershaw", false, null, true, true, "Jon Timmons"));
        //Best department
        Teachers.add(new Teacher(true, "Comp. Sci.", null, true, "Brown", false, false, "Ryan Baber"));
    }

    public int getNextQuestion(){
        return countQ;
    }


    public void removeTeachers(Answer a){
//if this is a string answer    
    if(a.isBoolean == false){
            for (int i=0; i<Teachers.size(); i++){
                String teacherValue = Teachers.get(i).getS(a.getKey());
            if ((teacherValue == null && a.getSval() != null) || 
            (teacherValue != null && !teacherValue.equals(a.getSval()))) {
                    Teachers.remove(i);
                    i--;
                }  
            }
        }
//if this is a boolean answer
        else if (a. isBoolean == true){
             for (int i=0; i<Teachers.size(); i++){
                if(!(Teachers.get(i).getB(a.getKey()) == a.getBval())){
                    Teachers.remove(i);
                    i--;
                }  
            }
        }
        countQ++;
    }

    public int getLength(){
        return Teachers.size();
    }

    public Teacher guessTeacher(){
        return Teachers.get(0);
    }
}
