package com.huyai.model;

/**
 * interface yang dibuat untuk mengimplementasikan class Person
 */
public interface PersonInterface {
    // fungsi bawaan selfIntroduce akan selalu ada didalam setiap child implemented class
    // sebagai penggambaran overriding polymorphism
    String selfIntroduce();
}
