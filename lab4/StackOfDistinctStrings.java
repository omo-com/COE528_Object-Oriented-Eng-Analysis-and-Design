/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab4;
import java.util.*;
/**
 *
 * @author 
 * Oliver Mo
 * 500844905
 * COE 528 - 09
 */
public class StackOfDistinctStrings {
    // Overview: StacksOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // LIFO (Last-In-First-Out) order.
    //
    // The abstraction function is:
    // a) Write the abstraction function here
    //
    //AF(c) = A stack of distinct strings called items where
    //        {c.items.get(i) | 0 <= i < c.items.size()-1}
    //
    // The rep invariant is:
    // b) Write the rep invariant here
    //
    //RI(c) = returns true if c.customers != null && 
    //        there are no duplicates in c.items &&
    //        all elements of c.items are Strings
    //        false, otherwise
    
    //the rep
    private ArrayList<String> items;

    // constructor
    public StackOfDistinctStrings() {
        // EFFECTS: Creates a new StackOfDistinctStrings object
        items = new ArrayList<String>();

    }

    public void push(String element) throws Exception {
        // MODIFIES: this
        // EFFECTS: Appends the element at the top of the stack
        // if the element is not in the stack, otherwise
        // does nothing.
        if (element == null) 
        {
            throw new Exception();
        }
        if (false == items.contains(element)) 
        {
            items.add(element);
        }
    }
    
    public String pop() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the top of the stack
        if (items.size() == 0) {
            throw new Exception();
        }

        return items.remove(items.size() - 1);

    }
    
    public boolean repOK() {
        // EFFECTS: Returns true if the rep invariant holds for this
        // object; otherwise returns false
        //
        // c) Write the code for the repOK() here
        
        if(items == null)
        {
            return false;
        }
        for(int i = 0; i<items.size(); i++) 
        {
            Object p = items.get(i);
            if(!(p instanceof String))
            {
                return false;
            }
            for(int o = i + 1; o<items.size(); o++) 
            {
                if(items.get(i).equals(items.get(o)))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        // EFFECTS: Returns a string that contains the strings in the
        // stack and the top element. Implements the
        // abstraction function.
        //
        // d) Write the code for the toString() here
       
        String out = "AF(c) = ";
        for(int i = 0; i<items.size(); i ++) {
            out = out + items.get(i) + " ";
        }
        return out;
    }
}

