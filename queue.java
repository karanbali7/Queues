class queue
{   int front,rear;
    int a[];
    int size=5;
    queue()
    { 
      a=new int[size];
      front=-1;
      rear=-1;
    }
    public void enqueue(int x)
    {
               if(rear==size-1)
               {
                   System.out.println("queue overflow");
               }
               else if(front==-1&& rear==-1)
                {
                       front=0;
                       a[++rear]=x;
                       System.out.println(x+"element inserted in queue");
                }
                else
                {
                     a[++rear]=x;
                     System.out.println(x+"element inserted in queue");
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
                 System.out.println(a[front]+"removed"+" now empty!");
                 
                 front=-1;
                 rear=-1;
        }
         else
         {
             System.out.println(a[front]+"element removed");
             front++;
         }
    }
    public void display()
    {      
        System.out.println("Elements of Queue:");
           for(int i=front;i<rear+1;i++)
           {
               System.out.println(a[i]);
           }
    }
    public void peek()
    {
        System.out.println(a[front]+" element at peek");
    }
    public static void main(String args[])
    {
        queue q=new queue();
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(5);
        q.enqueue(4);
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(7);
        q.enqueue(8);
    }
}