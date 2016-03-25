package com.thoughtworks.java8;

import com.thoughtworks.java8.functionalInterfaces.FromStringBuilder;
import com.thoughtworks.java8.functionalInterfaces.MyFunctionalInterface;

import java.util.*;
import java.util.function.*;

public class MyClass implements MyFunctionalInterface {

    // Implement abstract as expected
    @Override
    public int ungaBungaInt(int a) {
        return 0;
    }

    // Override default methods
    @Override
    public int doSomething() {
        System.out.println("Hi Again");
        return 1;
    }

    // Implement single abstract method of @FunctionalInterface
    public void sorting() {
        List<Integer> nums = null;
        Collections.sort(nums, (Integer a, Integer b) -> {
            return a.compareTo(b);
        });
        Collections.sort(nums, (a,b) -> {
            return a.compareTo(b);
        });
        Collections.sort(nums, (a, b) -> a.compareTo(b));
    }


    // Can supply a function with lambda expression
    // as an implementation of the interface
    private static void doInterfaceTest(MyFunctionalInterface ti) {}
    public void myInterfaceTest() {
        doInterfaceTest((a) -> 4);
    }

    // Therefore can create an implementation of interface
    // and refer to it using a local variable
    public void createInterfaceImplementationWithLambdaExperession() {
        MyFunctionalInterface ti = (a) -> 4;
        ti.ungaBungaInt(1);
    }

    // Can reference a method as implementation
    // of a @FunctionalInterface
    public static int refStaticMethod(int a) {
        return a;
    }
    public void referringAStaticMethod() {
        MyFunctionalInterface mfi = MyClass::refStaticMethod;
        mfi.ungaBungaInt(1);
    }
    public int refInstanceMethod(int a) {
        return a;
    }
    public void referringAnInstanceMethod() {
        MyClass c = new MyClass();
        MyFunctionalInterface mfi = c::refInstanceMethod;
        mfi.ungaBungaInt(1);
    }

    // Can refer to constructors as @FunctionalInterface representations
    private static class MyInteger {

        int a;

        MyInteger(String a) {
            this.a = Integer.valueOf(a);
        }
    }
    public void contructorRefExample() {
        FromStringBuilder<MyInteger> fsb = MyInteger::new;
        MyInteger mi = fsb.create("1");
    }

    // Referencing local variables outside the lambda scope (closures?)
    // Referenced local variables are final. They cannot be changed from
    // within the lambda expression as well;
    public void outsideLambdaScopeExample() {
        final int a = 1;
        int b = 2; // implicitly final due to reference in lambda expression
        MyFunctionalInterface mfi = (c) -> a + b + c;
//        b = 4;
    }

    // Referencing instance and static variables. These do not have
    // to be final and can be changed from within a lambda expression.
    public void referencingInstanceVariablesExample() {
        MyFunctionalInterface mfi = (c) -> {
            MyClassExtended mce = new MyClassExtended();
            mce.a++;
            mce.setC("hello");
            return mce.a;
        };
    }

    // default interface methods cannot be accessed through lambda implementations
    public void cannotReferenceDefaultmethodsExample() {
//        Formula formula = (a) -> sqrt( a * 100);
    }

    /** Built-in Functional Interfaces */

    // Predicates
    // Predicates are boolean-valued functions of one argument. The interface contains various default methods for
    // composing predicates to complex logical terms (and, or, negate)
    public void predicateExample() {
        Predicate<String> p = s -> false;
        p.test("haha");

        p = Objects::nonNull;
        p = new MyClass()::preddy;
        p.negate();
    }

    // Functions
    // Functions accept one argument and produce a result. Default methods can be used to chain multiple functions
    // together (compose, andThen).
    public void functionExample() {
        Function<String, Integer> toInteger = Integer::valueOf;
        toInteger.andThen(i -> "s").apply("ss");

    }

    // Suppliers
    // Suppliers produce a result of a given generic type. Unlike Functions, Suppliers don't accept arguments.
    public void supplierExample() {
        Supplier<MyClass> s = MyClass::new;
        s.get();
        s = MyClass::producer;
    }

    // Consumers
    // Consumers represents operations to be performed on a single input argument.
    public void consumerExample() {
        Consumer<MyClass> c = mc -> mc.preddy("a");
        c.accept(new MyClass());
    }

    // Comparators
    // Comparators are well known from older versions of Java. Java 8 adds various default methods to the interface.
    public void comparatorExample() {
        Comparator<MyClass> c = (c1, c2) -> c1.ungaBungaInt(1) > c2.ungaBungaInt(2) ? 1 : 0;
        c.reversed();
    }

    // Optionals
    // Optionals are not functional interfaces, instead it's a nifty utility to prevent NullPointerException. It's an
    // important concept for the next section, so let's have a quick look at how Optionals work.
    // Optional is a simple container for a value which may be null or non-null. Think of a method which may return a
    // non-null result but sometimes return nothing. Instead of returning null you return an Optional in Java 8.
    public void optionalExample() {
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();
        optional.get();
        optional.orElse("fallback");

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));
    }

    // Streams
    // A java.util.Stream represents a sequence of elements on which one or more operations can be performed. Stream
    // operations are either intermediate or terminal.
    public void streamExample() {
        List<String> strings = Arrays.asList("a", "b");
        strings
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 0)
                .sorted((s1, s2) -> s1.compareTo(s2)) // original collection unchanged
                .forEach(s -> System.out.println(s));

        // Matcher
        boolean matches =
                strings
                        .stream()
                        .allMatch(s -> s.endsWith("a"));

        // Reduce
        Optional<String> reduced =
                strings
                        .stream()
                        .reduce(((s1, s2) -> s1 + "|" + s2));

        // parallel streams are quicker. Use additional threads
        strings
                .parallelStream()
                .filter(s -> s.length() > 0)
                .forEach(System.out::println);

        String myString = "asd";
        instanceMethod(myString::toLowerCase);
    }

    // Maps
    public void mapExample() {
        Map<Integer, String> mappy = new HashMap<>();

        mappy.putIfAbsent(1, "One");
        mappy.forEach((i, s) -> System.out.println(i + s));
        mappy.remove(1, "One");
        mappy.getOrDefault(1, "Arrgg");

    }


    /**
     * Helper stuff
     */
    public static class MyClassExtended extends MyClass {
        int a = 1;
        final int b = 2;
        private String c = "hello";

        public void setC(String c) {
            this.c = c;
        }
    }

    public boolean preddy(String a) {
        return a.length() > 4;
    }

    public static MyClass producer() {
        return new MyClass();
    }

    public void instanceMethod(Supplier<String> a) {}
}
