package model;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the model.Accessible interface? <- package private, so accessible for all classes in the model package!
// 2. the int variable SOME_CONSTANT? <- all interface variables are public static final!!!
// 3. methodA?
// 4. methodB and methodC? <- all interface methods are automatically public! so all methods here are public!
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible {

    int SOME_CONSTANT = 100; // <- public static final!

    public void methodA(); // <- public
    void methodB(); // <- public
    boolean methodC(); // <- public
}
