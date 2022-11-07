package ru.mirea.kvbo_01;
import java.math.BigInteger;
import java.net.SocketTimeoutException;
import java.rmi.ServerError;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите номер ИНН");
            try{
                BigInteger inn =  new BigInteger(sc.nextLine());
                checkInn(inn);
                break;
            }catch (NumberFormatException eb) {
                System.out.println("Поддерживаются только цифры 0-9");

            }  catch (InnNotValidException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static boolean checkInn(BigInteger inn) throws InnNotValidException{
        int i = 0;
        BigInteger cInn = new BigInteger(inn.toByteArray());
        while (!cInn.equals(new BigInteger("0"))){
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray());
        }
        if(i != 10 && i != 12) throw new InnNotValidException(inn);
        return true;
    }
}