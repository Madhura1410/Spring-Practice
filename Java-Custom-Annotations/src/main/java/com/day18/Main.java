package com.day18;

public class Main {

    public static void main(String[] args) {

        Class<Book> c=Book.class;

        BookInfo info=c.getAnnotation(BookInfo.class);

        System.out.println("Title :"+info.title());

        System.out.println("Author :"+info.author());

        System.out.println("Price :"+info.price());

    }

}