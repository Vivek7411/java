public class LL {

    node head;
    node tail;
    int size;

    LL(){
        this.size=0;
    }

    static class node{
        int val;
        node next;


        node(int val){
            this.val=val;
        }
    }

    public void ins(int val){
        node temp=new node(val);

        if(head==null){
            head=tail=temp;
            head.next=null;
        }

        else {
            temp.next=head;
            head=temp;
        }
        this.size++;
    }

    public void show(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        node curr=head;

        while(curr!=null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
    }

    












    public static void main(String[] args) {

        LL list1=new LL();

        list1.show();
        list1.ins(10);
        list1.ins(20);
        list1.ins(20);
        list1.ins(30);
        list1.ins(50);
        list1.show();


    }
}


