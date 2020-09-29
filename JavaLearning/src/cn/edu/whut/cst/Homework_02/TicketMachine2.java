package cn.edu.whut.cst.Homework_02;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

public class TicketMachine2 {
    private int price;
    private int balance;
    private int total;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public void printPrice(){
        System.out.println();
        System.out.println("***********************");
        System.out.println("当前票价为：" + this.getPrice());
        System.out.println("请投入人民币用于购票");
        System.out.println("***********************");
        System.out.println();
    }
    public void printTicket(){
        System.out.println();
        System.out.println("====================");
        System.out.println("购票成功");
        System.out.println("票价为：" + this.getPrice());
        System.out.println("====================");
        System.out.println();
        System.out.println("找零："+this.balance);
    }
}

class User {
    public void buyTicket(int addMoney,TicketMachine2 ticketMachine2){
        ticketMachine2.printPrice();
        ticketMachine2.setBalance(addMoney);
        if (addMoney<ticketMachine2.getPrice()){
            System.out.println();
            System.out.println("==================");
            System.out.println("不好意思，您投入的人民币不够，无法购票");
            System.out.println("==================");
            System.out.println();
        }else{
            ticketMachine2.setBalance(ticketMachine2.getBalance()-ticketMachine2.getPrice());
            ticketMachine2.setTotal(ticketMachine2.getPrice()+ticketMachine2.getTotal()) ;
            ticketMachine2.printTicket();
        }

    }
}

class Manager {
    public void setPrice(int price,TicketMachine2 ticketMachine2){
        ticketMachine2.setPrice(price);
    }
    public void printTotal(TicketMachine2 ticketMachine2){
        System.out.println();
        System.out.println("=====================");
        System.out.println("机器中人民币数："+ticketMachine2.getTotal());
        System.out.println("=====================");
        System.out.println();
    }
}
class UsingTicketMachine{
    public static void main(String[] args) {
        TicketMachine2 AMachiane=new TicketMachine2();
        User user1=new User();
        Manager manager1=new Manager();
        manager1.setPrice(5,AMachiane);
        user1.buyTicket(10,AMachiane);
        User user2=new User();
        User user3=new User();
        User user4=new User();
        User user5=new User();
        user2.buyTicket(1,AMachiane);
        user3.buyTicket(20,AMachiane);
        user4.buyTicket(2,AMachiane);
        user5.buyTicket(100,AMachiane);
        manager1.printTotal(AMachiane);
    }
}