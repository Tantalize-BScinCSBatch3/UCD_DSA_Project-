/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.BinaryTree;
import Classes.BookItm;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void test() {
        BinaryTree Testtree = new BinaryTree();
       
        Testtree.insert(50);
        Testtree.insert(25);
        Testtree.insert(75);
        Testtree.insert(10);
        Testtree.insert(30);
        Testtree.insert(60);
        Testtree.insert(65);
        Testtree.insert(80);
        Testtree.insert(85);
        Testtree.insert(1);
        Testtree.insert(20);
       

       // Testtree.delete(60);
        Testtree.traverse();
      
        System.out.println(  Testtree.find(10).getKey());
//        DbConnection dbc=new DbConnection();
//        try {
//            dbc.getConnectiontosql();
//            System.out.println("System is updated");
//        }
//        catch(Exception e){
//            System.out.printf(e.getMessage());
//        }
//        
       
    }
}

   
