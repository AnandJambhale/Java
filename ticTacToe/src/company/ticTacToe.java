//package company;
//
//import java.util.Scanner;
//
//public class ticTacToe {
//    public static void printGameBoard(char[][] gameBoard){
//        for (char [] row: gameBoard){
//            for (char c:row){
//                System.out.print(c);
//            }
//            System.out.println();
//        }
//    }
//    public static void placePiece(char[][]gameBoard, int pos, String user){
//        if (user.equals("X")){
//            switch (pos){
//                case 1:
//                    gameBoard[0][0]='X';
//                    break;
//                case 2:
//                    gameBoard[0][2]='X';
//                    break;
//                case 3:
//                    gameBoard[0][4]='X';
//                    break;
//                case 4:
//                    gameBoard[2][0]='X';
//                    break;
//                case 5:
//                    gameBoard[2][2]='X';
//                    break;
//                case 6:
//                    gameBoard[2][4]='X';
//                    break;
//                case 7:
//                    gameBoard[4][0]='X';
//                    break;
//                case 8:
//                    gameBoard[4][2]='X';
//                    break;
//                case 9:
//                    gameBoard[4][4]='X';
//                    break;
//            }
//        }
//        if (user.equals("Y")){
//            switch (pos){
//                case 1:
//                    gameBoard[0][0]='Y';
//                    break;
//                case 2:
//                    gameBoard[0][2]='Y';
//                    break;
//                case 3:
//                    gameBoard[0][4]='Y';
//                    break;
//                case 4:
//                    gameBoard[2][0]='Y';
//                    break;
//                case 5:
//                    gameBoard[2][2]='Y';
//                    break;
//                case 6:
//                    gameBoard[2][4]='Y';
//                    break;
//                case 7:
//                    gameBoard[4][0]='Y';
//                    break;
//                case 8:
//                    gameBoard[4][2]='Y';
//                    break;
//                case 9:
//                    gameBoard[4][4]='Y';
//                    break;
//            }
//        }
//    }
//
//    public static void runner(char[][]gameBoard){
//        boolean isLine=false;
//        if (gameBoard[0][0]=='X' && gameBoard[1][2]=='X' && gameBoard[2][3]=='X'){
//            isLine=true;
//        }
//        else if (gameBoard[0][0]=='X' && gameBoard[1][0]=='X' && gameBoard[2][0]=='X'){
//            isLine=true;
//        }
//        else if (gameBoard[0][1]=='X' && gameBoard[1][1]=='X' && gameBoard[2][1]=='X'){
//            isLine=true;
//        }
//        else if (gameBoard[0][2]=='X' && gameBoard[1][2]=='X' && gameBoard[2][2]=='X'){
//            isLine=true;
//        }
//        else if (gameBoard[0][0]=='X' && gameBoard[0][1]=='X' && gameBoard[0][2]=='X'){
//            isLine=true;
//        }
//        else if (gameBoard[1][0]=='X' && gameBoard[1][1]=='X' && gameBoard[1][2]=='X'){
//            isLine=true;
//        }
//        else if (gameBoard[2][0]=='X' && gameBoard[2][1]=='X' && gameBoard[2][2]=='X'){
//            isLine=true;
//        }
//        else if (gameBoard[2][0]=='X' && gameBoard[1][1]=='X' && gameBoard[0][2]=='X'){
//            isLine=true;
//        }
//
//        if (gameBoard[0][0]=='Y' && gameBoard[1][2]=='Y' && gameBoard[2][3]=='Y'){
//            isLine=true;
//        }
//        else if (gameBoard[0][0]=='Y' && gameBoard[1][0]=='Y' && gameBoard[2][0]=='Y'){
//            isLine=true;
//        }
//        else if (gameBoard[0][1]=='Y' && gameBoard[1][1]=='Y' && gameBoard[2][1]=='Y'){
//            isLine=true;
//        }
//        else if (gameBoard[0][2]=='Y' && gameBoard[1][2]=='Y' && gameBoard[2][2]=='Y'){
//            isLine=true;
//        }
//        else if (gameBoard[0][0]=='Y' && gameBoard[0][1]=='Y' && gameBoard[0][2]=='Y'){
//            isLine=true;
//        }
//        else if (gameBoard[1][0]=='Y' && gameBoard[1][1]=='Y' && gameBoard[1][2]=='Y'){
//            isLine=true;
//        }
//        else if (gameBoard[2][0]=='Y' && gameBoard[2][1]=='Y' && gameBoard[2][2]=='Y'){
//            isLine=true;
//        }
//        else if (gameBoard[2][0]=='Y' && gameBoard[1][1]=='Y' && gameBoard[0][2]=='Y'){
//            isLine=true;
//        }
//        if (!isLine){
//            placePiece(gameBoard,);
//        }
//    }
//    public static void main(String[] args) {
//        char[][] gameBoard={{' ','|',' ','|',' '},
//                {'-','+','-','+','-'},
//                {' ','|',' ','|',' '},
//                {'-','+','-','+','-'},
//                {' ','|',' ','|',' '}};
//
//        printGameBoard(gameBoard);
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("ENter your placement (1-9): ");
//        int pos=sc.nextInt();
//
//        placePiece(gameBoard,pos,"X");
//
//
//        printGameBoard(gameBoard);
//    }
//
//
//}
