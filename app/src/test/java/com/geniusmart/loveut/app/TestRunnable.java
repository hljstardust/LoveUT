package com.geniusmart.loveut.app;

public class TestRunnable implements Runnable {
    public boolean wasRun = false;

    @Override
    public void run() {
        wasRun = true;
    }
}
