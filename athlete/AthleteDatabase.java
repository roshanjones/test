import java.util.ArrayList;
/**
 * Write a description of class AthleteDatabase here.
 * 
 * @author Roshan Jones
 * @201006339
 * @mock exam
 * @version 1.0
 */
public class AthleteDatabase 
{
    private ArrayList<Athlete> athleteList; 

    /**
     * Constructor for objects of class AthleteDatabase
     */
    public AthleteDatabase()
    {

        athleteList = new ArrayList<Athlete>();

    }
    public void addTrackAthlete(String name,int ranking, float personalBest)
    {
        Athlete newAthlete =  new TrackAthlete(name,ranking,personalBest);
        athleteList.add(newAthlete);

    }

    public void addFieldAthlete(String name,int ranking, float personalBest)
    {
        Athlete newAthlete =  new FieldAthlete(name,ranking,personalBest);
        athleteList.add(newAthlete);

    }

    public void addAthlete(Athlete athlete)
    {

        athleteList.add(athlete);

    }

    public void printAllAthletes()
    {

        for (Athlete athlete : athleteList) {

            System.out.println("Name: "+athlete.getName()+" Ranking: "+athlete.getRanking()+"Personal Best: "+athlete.getPersonalBest());

        }

    }

    public void printAllAthletesUsingToString()
    {

        for (Athlete athlete : athleteList) {

            athlete.toString();

        }

    }

    public void printAllAthletesWithRank(int rank)
    {
        System.out.println("The rank is: "+rank);

        for (Athlete athlete : athleteList) {

            if (rank == athlete.getRanking()) {

                System.out.println("Name: "+athlete.getName()+" Ranking: "+athlete.getRanking()+"Personal Best: "+athlete.getPersonalBest());

            }

        }

    }

    public void updateAthleteInfo(String name, float newPersonalBest)
    {

        boolean isAthleteFound = false;

        for (Athlete athlete : athleteList) {

            if (athlete.getName().equals(name)) {

                athlete.setPersonalBest(newPersonalBest);
                isAthleteFound = true;
                break;

            }

        }

        if (isAthleteFound) {

        } else {

            System.out.println(name+" was not found in the database.");

        }

    }

    public void rankAll(ArrayList<Athlete> list, float points)
    {

        for (Athlete athlete : list) {

            athlete.updateRank(points);
            if (athlete.getPersonalBest() < points) {

                athlete.setPersonalBest(points);

            }

        }

    }

    public float allPersonalBestsOfAllAthletes()
    {
        float total = 0;

        for (Athlete athlete : athleteList) {

            total = total + athlete.getPersonalBest();

        }

        return total;
    }

    public void athleteWithHighestRank()
    {

        int highestRank = 0;
        int index = 0;
        int count = 0;

        for (Athlete athlete : athleteList) {

            if (athlete.getRanking() > highestRank) {

                highestRank = athlete.getRanking();
                index = count;
                count++;

            } else {
                
                count++;
                
            }
            
        }
        
        System.out.println("The athlete with the highest rank:\n "+athleteList.get(index).getName());
        
    }
}
