package com.cursor;

public abstract class Account<N> {
    private N id;
    private double sum;

    public Account(N id, double sum) {
        this.id = id;
        this.sum = sum;
    }

    public N getId() {
        return id;
    }

    public void setId(N id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}