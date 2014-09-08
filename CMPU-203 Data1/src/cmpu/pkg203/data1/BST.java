/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmpu.pkg203.data1;

/**
 *
 * @author michaelgoldman
 */
class BST <T extends Comparable<T>> implements treeInterface  {

    int here;
    BST left;
    BST right;
    BST root;


    BST(BST left, int here, BST right) {
        this.left = left;
        this.here = here;
        this.right = right;
    }
    public void main(String[] args) {
        System.out.println(empty());
        return;    }

    public BST empty() {
        root = null;
        return root;
    }

    public int cardinality(BST tree) {
        int counter;
        if (root == null) {
            return 0;
        } else {
             counter = 1;                //to count root.here
            while (root.left != null) {
                counter++;
                cardinality(root.left);
            }
            while (root.right != null) {
                counter++;
                cardinality(root.right);
            }
        }
        return counter;
    }

    public boolean isEmptyHuh(BST tree) {
        return root == null;
    }

    public boolean member(BST tree, int elt) {
        if (root.here == elt) {
            return true;
        } else if (root.here < elt) {
            member(root.left, elt);
        } else if (root.here > elt) {
            member(root.right, elt);
        }
        return false;

    }
}
//    public BST add(BST tree, int elt) {
//        if (isEmptyHuh(tree)) {
//            root = add(tree, elt);
//        } else {
//        }
//        return d;
//    }
//    BST remove(BST tree, int elt);
//    BST union(BST firstTree, BST secondTree);
//    BST inter(BST firstTree, BST secondTree);
//    BST diff(BST firstTree, BST secondTree);
//    boolean equal(BST firstTree, BST secondTree);
//    boolean subset(BST firstTree, BST secondTree);

