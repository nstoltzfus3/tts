package TTT;// GUI driver for TicTacToe class
// 2007-09-18

// Graham Mitchell

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGUI extends Canvas implements MouseListener
{
    public static void main(String args[])
    {
        JFrame win = new JFrame("Tic Tac Toe");
        win.setSize(800,800);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new TicTacToeGUI() );
        win.setVisible(true);
    }

    private char player = 'X';
    private TicTacToeClass ttt;
    private boolean started = false;
    private boolean gameOver = false;

    public TicTacToeGUI()
    {
        addMouseListener(this);
        ttt = new TicTacToeClass();
    }

    public void paint( Graphics g )
    {
        g.setColor( Color.white );
        g.fillRect( 0, 0, 800, 800 );

        if ( ! started )
        {
            g.setColor( Color.black );
            g.setFont( new Font("Arial", Font.BOLD, 48) );
            g.drawString( "click to play", 275, 400 );
        }
        else
        {
            drawEmptyBoard(g);
            for ( int r=0; r<3; r++ )
                for ( int c=0; c<3; c++ )
                    if ( ttt.playerAt(r,c) != ' ' )
                        drawSymbol(g, ttt.playerAt(r,c), r, c);

            gameOver = ( ttt.isWinner('X') || ttt.isWinner('O') || ttt.isFull() );
            if ( gameOver )
            {
                g.setFont( new Font("Arial", Font.BOLD, 144) );
                g.setColor( Color.black );
                if ( ttt.isWinner('X') )
                    g.drawString("X wins!", 160, 400);
                if ( ttt.isWinner('O') )
                    g.drawString("O wins!", 160, 400);
                if ( ttt.isCat() )
                    g.drawString("TIE GAME", 50, 400);
            }
            else
            {
                g.setFont( new Font("Arial", Font.BOLD, 72) );
                g.setColor( Color.black );
                g.drawString( player + ", go.", 10, 730 );
            }
        }


    }

    public void drawEmptyBoard( Graphics g )
    {
        g.setColor(Color.black);
        // horizontal lines
        g.drawLine(100,250,700,250);
        g.drawLine(100,450,700,450);
        // vertical lines
        g.drawLine(300,50,300,650);
        g.drawLine(500,50,500,650);
        // labels
        g.drawString("(0,0)",102,62);
        g.drawString("(1,0)",102,262);
        g.drawString("(2,0)",102,462);

        g.drawString("(0,1)",302,62);
        g.drawString("(1,1)",302,262);
        g.drawString("(2,1)",302,462);

        g.drawString("(0,2)",502,62);
        g.drawString("(1,2)",502,262);
        g.drawString("(2,2)",502,462);
    }

    public void drawSymbol( Graphics g, char p, int r, int c )
    {
        int x = 200*c + 125;
        int y = 200*r + 85;
        if ( p == 'X' )
            drawX(g,x,y);
        else if ( p == 'O' )
            drawO(g,x,y);
        else
            drawError(g,x,y);
    }

    public void drawX( Graphics g, int x, int y )
    {
        g.setColor(Color.red);
        g.drawLine(x,y,x+150,y+150);
        g.drawLine(x+150,y,x,y+150);
    }

    public void drawO( Graphics g, int x, int y )
    {
        g.setColor(Color.blue);
        g.drawOval(x,y,150,150);
    }

    public void drawError( Graphics g, int x, int y )
    {
        // debugging code, in case drawSymbol is called with something other
        //   than 'X' or 'O'
        g.setColor(Color.red);
        g.fill3DRect(x-2,y-2,155,155,true);
        g.setColor(Color.yellow);
        g.fillArc(x,y,150,150,0,90);
        g.fillArc(x,y,150,150,180,90);
        g.setColor(Color.orange);
        g.fillArc(x,y,150,150,90,90);
        g.fillArc(x,y,150,150,270,90);
    }

    public void mouseClicked( MouseEvent evt )
    {
        int x = evt.getX();
        int y = evt.getY();

        if ( gameOver )
        {
            started = false;
            gameOver = false;
            ttt = new TicTacToeClass();
            repaint();
            return;
        }

        if ( ! started )
        {
            started = true;
            repaint();
            return;
        }

        int r = (y-85) / 200;
        int c = (x-125) / 200;

        if ( ttt.playerAt(r,c) == ' ' )
        {
            ttt.playMove(player,r,c);
            player = ( player == 'X' ? 'O' : 'X' );
        }
        repaint();
    }

    public void mousePressed ( MouseEvent evt ) {}
    public void mouseReleased( MouseEvent evt ) {}
    public void mouseEntered ( MouseEvent evt ) {}
    public void mouseExited  ( MouseEvent evt ) {}
}
