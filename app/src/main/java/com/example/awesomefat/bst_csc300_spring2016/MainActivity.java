package com.example.awesomefat.bst_csc300_spring2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BST tree = new BST();
        String vals = "ghi";
        for(int i = 0; i < vals.length(); i++)
        {
            tree.add(vals.charAt(i));
        }

        if(tree.isOutOfBalance())
        {
            System.out.println("Out of balance: " + tree.isOutOfBalance());
            tree.howAreWeOutOfBalance('i');

        }
        tree.rebalance(BSTCore.outOfBalanceInitial, BSTCore.outOfBalanceSecondarily);
        System.out.println("Out of balance: " + tree.isOutOfBalance());
        //tree.visitPreOrder();
        //tree.visitPostOrder();
        //tree.visitInOrder();
        //tree.visitLevelOrder();
    }
}
