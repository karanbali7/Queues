class circular_queue
{
    int front,rear;
    int a[];
    int size=5;
    circular_queue()
    { a=new int[size];
      front=-1;
      rear=-1;
    }
    public void enqueue(int x)
    {
               if(front==-1&& rear==-1)
                {
                       front=0;
                       a[++rear]=x;
                       System.out.println(x+"element inserted in queue");
                }
                else if((rear+1)%size==front)
                {
                     System.out.println("queue overflow");
                }
                else
                {
                    rear =(rear+1)%size;
                    a[rear]=x;
                }
    }
    public void dequeue()
    {
          if(front==-1&&rear==-1)
          {
              System.out.println("queue is empty");
          }
          else if(front==rear)
        {
                 System.out.println(a[front]+"element isremoved");
                 
                 front=-1;
                 rear=-1;
        }
         else
         {
             System.out.println(a[front]+"element is removed");
             front=(front+1)%size;
         }
    }
    public void display()
    {      
        System.out.println("Elements of Queue:");
        if(front==-1&&rear==-1)
        {
            System.out.println("queue is empty");
        }
        else{int i=front;
           while(i!=rear)
           {
               System.out.println(a[i]);
               i=(i+1)%size;
           }
           System.out.println(a[rear]);
        }
    }
    public void peek()
    {
        System.out.println(a[front]+" element at peek");
    }
    public static void main(String args[])
    {
        queue q=new queue();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(5);
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(7);
        q.enqueue(8);
    }
}