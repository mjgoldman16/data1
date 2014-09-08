/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cmpu.pkg203.data1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michaelgoldman
 */
public class CMPU203Data1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> tester = createSet();
        System.out.println(tester);
        add(tester, 3);
        add(tester, 5);
        add(tester, 9);
        add(tester, 3);
        add(tester, (int) (Math.random()*100));
        System.out.println(member(tester, 3));
        System.out.println(member(tester, 4));
        System.out.println(tester);
        
        return;    }
             
    public static List<Integer> createSet() {
        List<Integer> set = new ArrayList<Integer>();
        return set;
    }

    public static int cardinality(int[] args) {
        return args.length;
    }

    public static boolean isEmptyHuh(int[] args) {
        return args.length == 0;
    }

    public static boolean member(List<Integer> args, int elt) {
        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) == elt) {
                return true;
            }
        }
        return false;
    }

    public static List<Integer> add(List<Integer> args, int elt) {
        if (args.lastIndexOf(elt) == -1) {
            args.add(elt);
        }
        return args;
    }

    public static List<Integer> remove(List<Integer> args, int elt) {
        if (args.lastIndexOf(elt) != -1) {
            args.remove(elt);
        }
        return args;
    }

    public static List<Integer> union(List<Integer> argsx, List<Integer> argsy) {
        List<Integer> finalUnion = new ArrayList<Integer>();
        List<Integer> duplicates = new ArrayList<Integer>();
        finalUnion.addAll(argsx);
        finalUnion.addAll(argsy);
        for (int i = 0; i < argsx.size(); i++) {
            for (int j = 0; j < argsy.size(); j++) {
                if (argsx.get(i) == argsy.get(j)) {
                    duplicates.add(argsx.get(i));
                }
            }
        }
        for (int i = 0; i < duplicates.size(); i++) {
            remove(finalUnion, duplicates.get(i));
        }
        return finalUnion;
    }

    public static List<Integer> inter(List<Integer> argsx, List<Integer> argsy) {
        List<Integer> finalUnion = new ArrayList<Integer>();
        for (int i = 0; i < argsx.size(); i++) {
            for (int j = 0; j < argsy.size(); j++) {
                if (argsx.get(i) == argsy.get(j)) {
                    finalUnion.add(argsx.get(i));
                }
            }
        }
        return finalUnion;
    }
}

