public class MyLinkedList {
    public INode tail;
    public INode head;

    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void add(INode newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }
        else {
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode myNode){
        if(this.head==null){
            this.head=myNode;
        }
        if(this.tail==null){
            this.tail=myNode;
        }
        else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    //Insert Method
    public void insert(INode myNode, INode newNode)
    {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    //--------------For Pop First element
    public INode pop()
    {
        INode tempNode= this.head;
        this.head=head.getNext();
        return tempNode;
    }
    //---------------For Last element
    public INode popLast()
    {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail))
        {
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode.setNext(null);
        return tempNode;
    }

    //Print  the Nodes method
    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("my Nodes: ");
        INode tempNode=head;
        while (tempNode.getNext()!= null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}