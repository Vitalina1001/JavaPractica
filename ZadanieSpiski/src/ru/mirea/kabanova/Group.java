package ru.mirea.kabanova;

public class Group {
    private Student head;
    public static Group insert(Group list)
    {

        Student new_node = new Student();
        new_node.readStudent();
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Student last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public void printList(Group list)
    {
        Student currNode = list.head;
        System.out.print("Group: \n");
        while (currNode != null) {
            System.out.print(currNode.toString()+'\n');
            currNode = currNode.next;
        }
    }
}
