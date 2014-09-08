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
public interface treeInterface {
    BST empty();
    int cardinality(BST tree);
    boolean isEmptyHuh(BST tree);
    boolean member(BST tree, int elt);
    BST add(BST tree, int elt);
    BST remove(BST tree, int elt);
    BST union(BST firstTree, BST secondTree);
    BST inter(BST firstTree, BST secondTree);
    BST diff(BST firstTree, BST secondTree);
    boolean equal(BST firstTree, BST secondTree);
    boolean subset(BST firstTree, BST secondTree);
    
}
