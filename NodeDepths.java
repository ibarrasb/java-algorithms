import java.util.*;

import org.graalvm.compiler.graph.spi.Canonicalizable.Binary;

import jdk.nashorn.api.tree.BinaryTree;

class NodeDepths{   
    public static void main(String [] args){

    class Program{

        public static int nodeDepths(BinaryTree root){
            return NodeDepthsHelper(root, 0);
        }

        public static int NodeDepthsHelper(BinaryTree root){
            if(root == null) return 0;
            return depth + NodeDepthsHelper(root.left, depth + 1)  + NodeDepthsHelper(root.right, depth + 1);
        }
    }


}

}