package cn.edu.whut.cst.Homework_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Scanner;

public class TicketMachine {
    //票价
    private int price;
    //客户给的钱总数
    private int balance;
    //机器中剩余的钱
    private int total;

    //构造方法
    public TicketMachine(int ticketCost) {
        this.price = ticketCost;
        this.balance = 0;
        this.total = 0;
        System.out.println("票价为："+this.price+"元");
    }

    //返回票价值
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("当前票价为"+price+"元");
    }

    //返回总金额
    public int getBalabce() {
        return this.balance;
    }

    ////顾客给的钱
    public void insertMoney(int amount) {
        if (amount < this.getPrice())
            System.out.println("购票失败：你投入的金额不够，无法买票");
        else {
            System.out.println("购票成功：返回余额：" + (amount-this.getPrice()));
            this.balance += amount;
        }
    }

    //判断
    public void judge() {

    }

    public void printTiket() {
    }

    public static void main(String[] args) {
        TicketMachine AMachine = new TicketMachine(0);
        AMachine.setPrice(150);
        AMachine.insertMoney(200);
    }
}
