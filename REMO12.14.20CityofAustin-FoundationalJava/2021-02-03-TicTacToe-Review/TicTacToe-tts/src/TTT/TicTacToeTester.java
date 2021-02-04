package TTT;

import java.util.Arrays;

public class TicTacToeTester
{
    private static TicTacToeClass ttt;

    public static void main( String[] args )
    {
        // constructor
        System.out.print("Checking constructor....................................................");
        ttt = new TicTacToeClass();
        check( "numTurns()",    ttt.numTurns(),    0 );
        check( "isWinner('X')", ttt.isWinner('X'), false );
        check( "isWinner('O')", ttt.isWinner('O'), false );
        check( "isCat()",       ttt.isCat(),       false );
        check( "isFull()",      ttt.isFull(),      false );
        System.out.println("  [ok]");

        // is Valid
        int trials = 0;
        System.out.print("Checking isValid()...");
        for ( int r = -100; r<=100; r++ )
            for ( int c = -100; c<=100; c++ )
            {
                check( "isValid("+r+","+c+")", ttt.isValid(r,c), ( 0 <= r && r < 3 && 0 <= c && c < 3 ) );
                if ( ++trials % 777 == 0 ) System.out.print(".");
            }

        System.out.println("  [ok]");

        // play every possible game of Tic-Tac-Toe to make sure it's scoring right

        byte[] game = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] cells = { 0, 1, 2, 4, 8, 16, 32, 64, 128, 256 };
        int n = 0, i;
        boolean gameOver = false;
        char p = 'X';
        int r, c, winner = 3;
        int xTotal = 0, oTotal = 0;
        boolean xWin, oWin, gato;
        trials = 0;

        System.out.print("Checking isWinner()...");
        while ( game[0] < 10 )
        {
            // play a single game
            ttt = new TicTacToeClass();
            n = 0;
            xTotal = oTotal = 0;
            for ( byte b : game )
            {
                r = (b-1) / 3;
                c = (b-1) % 3;
                ttt.playMove(p,r,c);

                if ( p == 'X' )
                    xTotal += cells[b];
                else
                    oTotal += cells[b];

                n++;
                xWin = ( Arrays.binarySearch(winPatterns,xTotal) >= 0 );
                oWin = ( Arrays.binarySearch(winPatterns,oTotal) >= 0 );
                gato = ( ! xWin && ! oWin && n == 9 );

                check( "numTurns()",    ttt.numTurns(),    n );
                check( "isWinner('X')", ttt.isWinner('X'), xWin );
                check( "isWinner('O')", ttt.isWinner('O'), oWin );
                check( "isCat()",       ttt.isCat(),       gato );
                check( "isFull()",      ttt.isFull(),      n == 9 );

                p = ( p == 'X' ? 'O' : 'X' );

                if ( xWin || oWin )
                    break;
            }

            trials++;
            if ( trials % 7200 == 0 )
                System.out.print(".");

            next_permutation( game );
        }
        System.out.println("  [ok]");
        System.out.println("\nAll tests passed!\n");

    }

    private static void check( String property, boolean is, boolean shouldbe )
    {
        if ( is != shouldbe )
        {
            System.out.println("\n\tFATAL ERROR: " + property + " returns " + is + ", but should be " + shouldbe);
            ttt.displayBoard();
            System.exit(1);
        }
    }

    private static void check( String property, int is, int shouldbe )
    {
        if ( is != shouldbe )
        {
            System.out.println("\n\tFATAL ERROR: " + property + " returns " + is + ", but should be " + shouldbe);
            ttt.displayBoard();
            System.exit(1);
        }
    }


    private static boolean unique( byte[] a )
    {
        if ( a[0] == 10 ) return true;

        boolean[] used = new boolean[10];

        for ( int i=0; i<a.length; ++i )
            if ( used[ a[i] ] )
                return false;
            else
                used[ a[i] ] = true;

        return true;
    }


    private static void increment( byte[] a )
    {
        a[a.length-1]++;
        for ( int i=a.length-1; i>0; --i )
            if ( a[i] >= 10 )
            {
                a[i] = 1;
                a[i-1]++;
            }
    }


    private static void next_permutation( byte[] a )
    {
        do
        {
            increment( a );
        } while ( ! unique(a) );
    }

    private static int[] winPatterns = {
            7,  15,  23,  39,  56,  57,  58,  60,  71,  73,  75,  77,  79,
            84,  85,  86,  87,  89,  92,  93,  94, 103, 105, 107, 116, 117,
            118, 120, 121, 122, 124, 135, 143, 146, 147, 150, 151, 154, 158,
            167, 178, 179, 184, 185, 186, 188, 201, 205, 210, 212, 213, 214,
            220, 233, 242, 244, 263, 271, 273, 275, 277, 279, 281, 283, 285,
            292, 293, 294, 295, 300, 302, 305, 307, 308, 309, 312, 313, 314,
            316, 329, 331, 337, 339, 340, 341, 342, 345, 348, 356, 358, 369,
            372, 401, 402, 403, 405, 409, 410, 420, 421, 428, 433, 448, 449,
            450, 452, 456, 457, 458, 460, 464, 465, 466, 468, 480, 481, 482, 484
    };



}