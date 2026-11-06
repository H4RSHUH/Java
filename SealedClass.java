// Sealed classes are a feature in Java that allows you to restrict which classes can extend or implement a particular class or interface.
// if a class is extended by a sealed class, it must be declared as either final, sealed, or non-sealed.
sealed class A permits B, C{

}

non-sealed class B extends A{

}

final class C extends A{

}

class D{

}
public class SealedClass {
    public static void main(String[] args){

    }
}
