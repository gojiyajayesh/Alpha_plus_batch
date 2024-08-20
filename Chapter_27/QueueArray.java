public class QueueArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(34);
        q.dequeue();
        q.add(4);
        q.add(5);
        q.add(6);
        q.dequeue();
        q.add(45);
        System.out.println("Front = "+q.front);
        System.out.println("Rear = "+q.rear);
    }
}

class Queue {
    int[] queue;
    int front = -1, rear = -1;
    Queue(int size){
        queue=new int[size];
    }

    public void add(int data) {
        if (isEmpty()) {
            front=0;
            rear=0;
            queue[0] = data;
            System.out.println("Add data in Queue "+data);
            return;
        }
        if ((rear+1) % queue.length == front) {
            System.out.println("Queue is full !");
            return;
        }
        rear=(rear+1)%queue.length;
        queue[rear] = data;
        System.out.println("Add data in Queue "+data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return Integer.MAX_VALUE;
        }
        int val = queue[front];
        System.out.println("Remove data on Queue "+val);
        if(rear==front){
            front=-1;
            rear=-1;
        }
        else
        front=(front+1)%queue.length;
        return val;
    }

    public boolean isEmpty() {
        return front==-1;
    }
}