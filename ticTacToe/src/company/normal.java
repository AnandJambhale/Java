package company;

import java.util.Scanner;

public class normal {
    public static void printer(char[][]gameBoard){
        for (char[] row: gameBoard){
            for (char c:row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static boolean condition(char[][]gameBoard){
        if (gameBoard[0][0]=='X' && gameBoard[2][2]=='X' && gameBoard[4][4]=='X' || gameBoard[0][0]=='Y' && gameBoard[2][2]=='Y' && gameBoard[4][4]=='Y'){
            return true;
        }
        if (gameBoard[0][0]=='X' && gameBoard[0][2]=='X' && gameBoard[0][4]=='X' || gameBoard[0][0]=='Y' && gameBoard[0][2]=='Y' && gameBoard[0][4]=='Y'){
            return true;
        }
        if (gameBoard[2][0]=='X' && gameBoard[2][2]=='X' && gameBoard[2][4]=='X' || gameBoard[2][0]=='Y' && gameBoard[2][2]=='Y' && gameBoard[2][4]=='Y'){
            return true;
        }
        if (gameBoard[4][0]=='X' && gameBoard[4][2]=='X' && gameBoard[4][4]=='X' || gameBoard[4][0]=='Y' && gameBoard[4][2]=='Y' && gameBoard[4][4]=='Y'){
            return true;
        }
        if (gameBoard[0][4]=='X' && gameBoard[2][2]=='X' && gameBoard[4][0]=='X' || gameBoard[0][4]=='Y' && gameBoard[2][2]=='Y' && gameBoard[4][0]=='Y'){
            return true;
        }
        if (gameBoard[0][0]=='X' && gameBoard[2][0]=='X' && gameBoard[4][0]=='X' || gameBoard[0][0]=='Y' && gameBoard[2][0]=='Y' && gameBoard[4][0]=='Y'){
            return true;
        }
        if (gameBoard[0][2]=='X' && gameBoard[2][2]=='X' && gameBoard[4][2]=='X' || gameBoard[0][2]=='Y' && gameBoard[2][2]=='Y' && gameBoard[4][2]=='Y'){
            return true;
        }
        if (gameBoard[0][4]=='X' && gameBoard[2][4]=='X' && gameBoard[4][4]=='X' || gameBoard[0][4]=='Y' && gameBoard[2][4]=='Y' && gameBoard[4][4]=='Y'){
            return true;
        }
        if (gameBoard[0][0]!=' ' && gameBoard[0][2]!=' ' && gameBoard[0][4]!=' ' && gameBoard[2][0]!=' ' && gameBoard[2][2]!=' ' && gameBoard[2][4]!=' ' && gameBoard[4][0]!=' ' && gameBoard[4][2]!=' ' && gameBoard[4][4]!=' '){
            System.out.println("Game over");
            return true;
        }
        return false;
    }
//    public static boolean emptyBlock(char[][]gameBoard, int pos){
//        if (pos)
//        return false;
//    }
    public static void played(char[][]gameBoard,int pos,char user){
        if (user=='X'){
            switch (pos){
                case 1:
                    if (gameBoard[0][0]==' ') {
                        gameBoard[0][0] = 'X';
                    }
                    else {

                    }
                    break;
                case 2:
                    gameBoard[0][2]='X';
                    break;
                case 3:
                    gameBoard[0][4]='X';
                    break;
                case 4:
                    gameBoard[2][0]='X';
                    break;
                case 5:
                    gameBoard[2][2]='X';
                    break;
                case 6:
                    gameBoard[2][4]='X';
                    break;
                case 7:
                    gameBoard[4][0]='X';
                    break;
                case 8:
                    gameBoard[4][2]='X';
                    break;
                case 9:
                    gameBoard[4][4]='X';
                    break;
            }
        }
        if (user=='Y'){
            switch (pos){
                case 1:
                    gameBoard[0][0]='Y';
                    break;
                case 2:
                    gameBoard[0][2]='Y';
                    break;
                case 3:
                    gameBoard[0][4]='Y';
                    break;
                case 4:
                    gameBoard[2][0]='Y';
                    break;
                case 5:
                    gameBoard[2][2]='Y';
                    break;
                case 6:
                    gameBoard[2][4]='Y';
                    break;
                case 7:
                    gameBoard[4][0]='Y';
                    break;
                case 8:
                    gameBoard[4][2]='Y';
                    break;
                case 9:
                    gameBoard[4][4]='Y';
                    break;
            }
        }
        printer(gameBoard);
    }
    public static void players(char[][]gameBoard){
        while (!condition(gameBoard)){
            Scanner scanner=new Scanner(System.in);
            System.out.println("X's turn");
            int pos=scanner.nextInt();
            played(gameBoard,pos,'X');

            if (condition(gameBoard)){
                System.out.println("X won");
                break;
            }

            System.out.println("Y's turn");
            pos=scanner.nextInt();
            played(gameBoard,pos,'Y');

            if (condition(gameBoard)){
                System.out.println("Y won");
                break;
            }

            players(gameBoard);
        }
    }
    public static void main(String[] args) {
        char[][] gameBoard={{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};
        players(gameBoard);
    }
}
