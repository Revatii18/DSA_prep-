
class Solution 
{
    public int calPoints(String[] operations) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0 ;
        for (int i = 0 ; i < operations.length ; i++)
        {
           
            switch (operations[i])
            {

            case "C" :
            list.remove (list.size() - 1);
            break ;

            case "D":
           list.add( list.get(list.size() - 1) * 2 ) ;
            break ;

            case "+" :
             list.add( list.get(list.size() - 1) + list.get(list.size() - 2) );
             break ;
             
            default :
            list.add(Integer.parseInt(operations[i]));
        }
       
        }

        for (int i :list)
        {
            sum += i ;
        }
        return  sum ;
    }
}