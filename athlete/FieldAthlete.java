
/**
 * Write a description of class FieldAthlete here.
 * 
 * @author Roshan Jones
 * @id 201006339
 * @mock exam
 * @version 1.0
 */
public class FieldAthlete extends Athlete 
{
   
    /**
     * Constructor for objects of class FieldAthlete
     */
    public FieldAthlete(String name, int ranking, float personalBest)
    {
       
        super(name,ranking,personalBest);
        
    }

   public void updateRank(float points)
    {

        if (((points/getPersonalBest()) >= 1.1 )){

            int newRanking = 2 + getRanking();
            setRanking(newRanking);

        } else {

            int newRanking = 1 + getRanking();
            setRanking(newRanking);

        }

    }

}

