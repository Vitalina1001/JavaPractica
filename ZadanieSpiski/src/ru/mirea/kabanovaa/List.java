package ru.mirea.kabanovaa;

public class List<T> {
    private Node<T> head;
    private Node<T> tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    public void addNode(T data) { //вставка элемента
        Node<T> newNode = new Node<T>(data);

        if (head == null) { // проверяем есть ли уже элемент в списке
            head = newNode; //если нет, добавляем
        } else {
            tail.nextNode = newNode; //если есть, хвост указывает на новый узел        }
        }
        tail = newNode;//новый узел - хвост
        tail.nextNode = head; // tail указывает на head
    }
    public void print(int stop){ //выводит необходимое кол-во элементов с 1 и до stop
        Node<T> temp = head;
        while (stop!=0){
            System.out.println(temp.data);
            temp = temp.nextNode;
            stop--;
        }
    }

}
