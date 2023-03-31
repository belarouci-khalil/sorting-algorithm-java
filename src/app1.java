public class app1 {
    void sorttab(int tab[],int N)
    {
        int tmp;
        for (int i = 0; i<N; i++)
        {
            for(int j = i ; j<N; j++)
            {
                if (tab[i]>tab[j])
                {
                    tmp = tab[i]; 
                    tab[i]=tab[j]; 
                    tab[j]= tmp ; 

                }

            }
        }
        System.out.println("The matrix elements are arranged in the following way :");
        for(int i = 0; i<N; i++)
        {
            System.out.println("tab["+(i+1)+"]="+tab[i]);
        }
    }
    
}
