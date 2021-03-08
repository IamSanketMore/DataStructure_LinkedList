public class MyNode <S>
{
    public S key;
    public MyNode next;

    public MyNode(S key)
    {
        this.key =key;
        this.next=null;
    }

    public MyNode getNext()
    {
        return next;
    }

    public void setNext(MyNode next)
    {
        this.next = next;
    }
}
