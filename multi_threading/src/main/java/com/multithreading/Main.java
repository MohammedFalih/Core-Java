package com.multithreading;

/*
 * Implementing Runnabale will allow to you to extends a class because
 * java doesnt allow multiple inheritance..
 * 
 * If you want to extend other classes implement Runnable interface
 *
 */

class Book implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Book " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

/*
 * Extending thread to the class will stops you to inherit other classes
 * so better you use runnabel interface
 */

class Author extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Author " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Book book = new Book();
        Author author = new Author();
        Runnable sampleRunnable = () -> {
            for(int i=1; i<10; i++){
                System.out.println("count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        /*
         * If you are implementing Runnable you cannot use start
         * 
         * You need to create a thread object and pass the instance
         * to the thread object
         * 
         * By doing that you can use start() to execute the start
         */

        Thread book_thread = new Thread(book);
        Thread run_thread = new Thread(sampleRunnable);

        book_thread.start();

        try {
            book_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        author.start();
        try {
            author.join();
        } catch (InterruptedException e) {
        }

        run_thread.start();

        System.out.println("End of the main class"); // this is execute first
    }
}