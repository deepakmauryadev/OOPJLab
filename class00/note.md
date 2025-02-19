# Super 
1. calling constructor of super class 
2. super.member 
    member - instance variable

```java
class A {
    int i;

    void show () {
        System.out.println("i: ", i);
    }
}

class B extends A {
    int i;
    int k;

    void show() {
        super.show();
        System.out.println("super i: " + super.i);
        System.out.println("i: " + i);
        System.out.println("k: " + k);
    }

}
```


