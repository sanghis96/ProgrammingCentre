public Difference(int[] arr)
    {
        elements = arr;
    }
    public void computeDifference()
    {
        maximumDifference = 0;
        int difference = 0 ;
        for(int i=0; i<elements.length-1; i++)
            for(int j=i+1; j<elements.length; j++)
            {
                difference = Math.abs(elements[i] - elements[j]);
                if(difference > maximumDifference)
                    maximumDifference = difference;
            }
    }
