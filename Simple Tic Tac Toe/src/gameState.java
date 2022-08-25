
public class gameState extends BoardX{
    char[][] board = BoardX.getBoard();
    boolean space=false;
    boolean Xwin=false;
    boolean Owin=false;
    int Impossible=0;
    int y=0;

    //step
    //'X' and 'O' count
    int a = 0, b = 0;
        for (String svalue : board) {
        if ("X".equals(svalue))
            a++;
        if ("O".equals(svalue))
            b++;
    }

    Impossible = a-b;

        for (int i = 0; i < board.length; i+=3) {
        System.out.print("| ");
        System.out.print(board[i]+" "+board[i+1]+" "+board[i+2]);
        System.out.print(" |");
        System.out.println();
        if ("_".equals(board[i]) || "_".equals(board[i+1])||"_".equals(board[i+2]))
            space=true;
        //Column
        y=i/3;
        if ("X".equals(board[y]) && "X".equals(board[y+3]) && "X".equals(board[y+6])){
            Xwin=true;
        }

        if ("O".equals(board[y]) && "O".equals(board[y+3]) && "O".equals(board[y+6])){
            Owin=true;
        }

        //行判断 row
        if ("X".equals(board[i])&&"X".equals(board[i+1]) && "X".equals(board[i+2])){
            Xwin=true;
        }

        if ("O".equals(board[i])&&"O".equals(board[i+1]) && "O".equals(board[i+2])){
            Owin=true;
        }
    }
        //Diagonal line
        if ("X".equals(board[0]) && "X".equals(board[4]) && "X".equals(board[8]))
            Xwin=true;
        if ("X".equals(board[2]) && "X".equals(board[4]) && "X".equals(board[6]))
            Xwin=true;

        if ("O".equals(board[0]) && "O".equals(board[4]) && "O".equals(board[8]))
            Owin=true;
        if ("O".equals(board[2]) && "O".equals(board[4]) && "O".equals(board[6]))
            Owin=true;
        System.out.println("---------");

        if (Xwin == true && Owin == true || Math.abs(Impossible) > = 2)
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
