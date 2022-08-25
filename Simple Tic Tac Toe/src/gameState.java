/*
public class gameState extends BoardX{

    boolean space=false;
    boolean Xwin=false;
    boolean Owin=false;
    int Impossible=0;
    int y=0;//规律数   step
    //分别计数  'X' and 'O' count
    int a = 0,b=0;
        for (String svalue:getBoard
             ) {
        if ("X".equals(svalue))
            a++;
        if ("O".equals(svalue))
            b++;
    }
    Impossible=a-b;

        for (int i = 0; i < getBoard.length; i+=3) {
        System.out.print("| ");
        System.out.print(getBoard[i]+" "+getBoard[i+1]+" "+getBoard[i+2]);
        System.out.print(" |");
        System.out.println();
        if ("_".equals(getBoard[i]) || "_".equals(getBoard[i+1])||"_".equals(getBoard[i+2]))
            space=true;
        //列判断 Column
        y=i/3;
        if ("X".equals(getBoard[y]) && "X".equals(getBoard[y+3]) && "X".equals(getBoard[y+6])){
            Xwin=true;
        }

        if ("O".equals(getBoard[y]) && "O".equals(getBoard[y+3]) && "O".equals(getBoard[y+6])){
            Owin=true;
        }

        //行判断 row
        if ("X".equals(getBoard[i])&&"X".equals(getBoard[i+1]) && "X".equals(getBoard[i+2])){
            Xwin=true;
        }

        if ("O".equals(getBoard[i])&&"O".equals(getBoard[i+1]) && "O".equals(getBoard[i+2])){
            Owin=true;
        }
    }
    //对角线判断  Diagonal line
        if ("X".equals(getBoard[0]) && "X".equals(getBoard[4]) && "X".equals(getBoard[8]))
    Xwin=true;
        if ("X".equals(getBoard[2]) && "X".equals(getBoard[4]) && "X".equals(getBoard[6]))
    Xwin=true;

        if ("O".equals(getBoard[0]) && "O".equals(getBoard[4]) && "O".equals(getBoard[8]))
    Owin=true;
        if ("O".equals(getBoard[2]) && "O".equals(getBoard[4]) && "O".equals(getBoard[6]))
    Owin=true;
        System.out.println("---------");

        if (Xwin == true && Owin == true || Math.abs(Impossible)>=2)
            System.out.println("Impossible");
        else {
        if (Xwin == true)
            System.out.println("X wins");
        else
        if (Owin == true)
            System.out.println("O wins");
        else
        if (space == true)
            System.out.println("Game not finished");
        else
            System.out.println("Draw");
    }
    
}
*/
