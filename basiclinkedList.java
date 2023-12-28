// basic linked list implementation using java


public class basiclinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedList{
        Node head=null;
        Node tail=null;

        void insertEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;    
            }
            else{
                tail.next=temp;
            }  
            tail=temp;   
        }

        void insertBegining(int val){
            Node temp=new Node(val);

            if(head==null){
                tail=temp;    
            }
            else{
                temp.next=head;
            }  
            head=temp;   
        }

        void insert(int pos,int val){
            Node temp=new Node(val);
            Node q=head;
            if(pos==size()){
                insertEnd(val);
                return;
            }  
            if(pos==0){
                insertBegining(val);
                return;
            } 
            for(int i=0;i<pos-2;i++)
                q=q.next;
            temp.next=q.next;
            q.next=temp;
        }

        int posFind(int pos){
            Node temp=head;
            for(int i=1;i<pos;i++)
                temp=temp.next;
            return temp.data;
        }

        void deleteEl(int pos){
            Node temp=head;

            if(pos==0){
                head=head.next;
                return;
            }
            else{
                for(int i=1;i<pos-1;i++)
                    temp=temp.next;
            
                if(temp.next.next==null)
                    tail=temp;
                temp.next=temp.next.next;
            }
        }

        void deleteVal(int val){
            Node temp=head;

            if(temp.data==val){
                head=head.next;
                return;
            }
            else{
                while(temp.next.next!=null){         
                    if(temp.next.data==val){
                        temp.next=temp.next.next;
                        return;
                    }
                    temp=temp.next;
                }
                if(temp.next.data==val){
                    tail=temp;
                    temp.next=temp.next.next;
                    return;
                }
            }
            
            System.out.println("Inavllid Input");
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        
    }


    public static void main(String[] args) {
        
        linkedList ll=new linkedList();

        ll.insertEnd(4);
        ll.insertEnd(9);
        ll.display();

        ll.insertBegining(1);
        ll.insertEnd(7);
        ll.insertBegining(10);
        ll.insertBegining(2);
        ll.display();
        
        ll.insert(0, 20);
        ll.display();

        //System.out.println(ll.posFind(3));
        ll.deleteEl(0);
        ll.display();

        ll.deleteVal(7);
        ll.display();
        
    }
}