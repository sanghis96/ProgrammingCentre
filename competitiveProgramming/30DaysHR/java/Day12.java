class Student extends Person
{
	private int[] testScores;
    Student(String firstName, String lastName, int id, int[] scores)
    {
        super(firstName,lastName,id);
        testScores = scores;
    }
    public char calculate()
    {
        double avg = 0;
        for(int i=0; i<testScores.length; i++)
            avg += testScores[i];
        avg /= testScores.length;
        if(avg>=90 && avg<=100)
            return 'O';
        else if(avg>=80 && avg<90)
            return 'E';
        else if(avg>=70 && avg<80)
            return 'A';
        else if(avg>=55 && avg<70)
            return 'P';
        else if(avg>=40 && avg<55)
            return 'D';
        else
            return 'T';
    }
}
