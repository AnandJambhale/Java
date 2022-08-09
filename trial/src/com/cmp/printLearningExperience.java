package com.cmp;

class printLearningExperience {
    static void print(){
        System.out.println("method created");
    }

    static void sayHelloWorld(int i){
        for(int j=0;j<i;j++){
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        print();
        sayHelloWorld(5);
    }
}
