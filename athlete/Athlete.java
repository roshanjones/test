
/**
 * Write a description of class Athlete here.
 * 
 * @author Roshan Jones
 * @201006339
 * @mock exam
 * @version 1.0
 */
public abstract class  Athlete implements Competitor
{
    private String name;
    private int ranking;
    private float personalBest;

    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String name,int ranking,float personalBest)
    {

        this.name = name;
        this.ranking = ranking;
        this.personalBest = personalBest;

    }

    public String getName()
    {

        return name;

    }

    public int getRanking()
    {

        return ranking;

    }

    public float getPersonalBest()
    {

        return personalBest; 

    }
    
    public void setRanking(int newRanking)
    {

        ranking = newRanking;

    }

    public void setPersonalBest(float newPersonalBest)
    {

        personalBest = newPersonalBest;

    }

    @Override
    public String toString()
    {
        return "Name: "+name+" Ranking: "+ranking+" Personal Best: "+personalBest;
    }
    
    
    public abstract void updateRank(float points);

}
