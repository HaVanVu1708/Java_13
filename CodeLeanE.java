package com.codelean.access.util;
import com.codelean.access.CodeLeanB;
public class CodeLeanE  extends CodeLeanB{
    public static void main(String[] args) {
        new CodeLeanB().methodPublic();
        new CodeLeanE().methodProtected();//compile time error
//works , accessing super class protected method using subclass
        new CodeLeanE().methodProtected();
    }
}
