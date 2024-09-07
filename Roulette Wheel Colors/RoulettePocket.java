public class RoulettePocket {
    private int pocketNum;

    public RoulettePocket(int num){
        pocketNum = num;
    }

    public void setPocketNum(int x)
    {
        pocketNum = x;
    }

    public String getPocketColor(){
        int i = pocketNum;
        //0
        if (i == 0) return "Green";
        //1-10
        else if (i >= 1 && i <= 10)
        {
            if ((i % 2) != 0) 
                return "Red";
            else
                return "Black";
        }
        //11-18
        else if (i >= 11 && i <= 18)
        {
            if ((i % 2) == 0) 
                return "Red";
            else
                return "Black";
        }
        //19-28
        else if (i >= 19 && i <= 28)
        {
            if ((i % 2) != 0) 
                return "Red";
             else
                return "Black";
        }
        //29-36
        else if (i >= 29 && i <= 36)
        {
            if ((i % 2) == 0) 
                return "Red";
            else
                return "Black";
        }
        else
        {
            return "ERROR";
        }
    }
}