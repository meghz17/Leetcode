package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._98;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/17/17.
 */
public class _98Test {
    private static _98 test;
    private static TreeNode root;

    @BeforeClass
    public static void setup(){
        test = new _98();
    }

    @Test
    public void test1(){
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertEquals(true, test.isValidBST(root));
    }

    @Test
    public void test2(){
        root = new TreeNode(0);
        assertEquals(true, test.isValidBST(root));
    }

    @Test
    public void test3(){
        root = new TreeNode(1);
        root.left = new TreeNode(1);
        assertEquals(false, test.isValidBST(root));
    }
}
