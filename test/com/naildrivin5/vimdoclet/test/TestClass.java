package com.naildrivin5.vimdoclet.test;

import java.util.*;

/** This is a test Class.  This is the longer description.  You should
 * see the {@link java.lang.String} class or maybe
 * the {@link java.lang.String#indexOf(int)} method for more information.
 * @deprecated You should not use this class
 */
public class TestClass extends java.io.Serializable
{
    /** Default constructor.  This is what you use normally */
    public TestClass(){}
    /** String based constructor.  This is for when you have one string
     * @param s the string
     */
    public TestClass(String s) {}
    /** Array based constructor.  This is for when you have
     * an array of strings
     * @param s the array!
     */
    public TestClass(String[] s) {}
    /** List based constructor.  this is for when you have
     * a list
     * @param s the list
     */
    public TestClass(List<String> s) {}

    /** this is to get the array.
     * @return the array
     * @deprecated Don't use this
     * @exception RuntimeException whenever you want it
     * @exception NullPointerException whenever you use this
     */
    public String[] gimmeArray(){ return null; }
    public List<String>gimmeList() { return null; }
    public String gimmeString() { return null; }
}