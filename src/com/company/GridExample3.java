package com.company;

import java.awt.*;
import java.util.Scanner;

class GridExample3 extends Frame
{
    GridExample3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of grid: ");
        int row = sc.nextInt();
        int col= sc.nextInt();
        Button[] button =new Button[12];
        setLayout(new  GridLayout(row,col));
        for(int i=0; i<row*col;i++)
        {
            button[i]=new Button("Button ");
            add(button[i]);
        }
    }
}
class GridLayoutJavaExample
{
    public static void main(String args[])
    {
        GridExample3 frame = new GridExample3();
        frame.setTitle("GridLayout in Java Example");
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}