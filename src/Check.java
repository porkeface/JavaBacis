//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
//
//class Node<T>                             // 单链表结点类，T指定结点的元素类型
//{
//    public T data;                               // 数据域，存储数据元素
//    public Node<T> next;                         // 地址域，引用后继结点
//
//    public Node(T data, Node<T> next)            // 构造结点，data指定数据元素，next指定后继结点
//    {
//        this.data = data;                        // T对象引用赋值
//        this.next = next;                        // Node<T>对象引用赋值
//    }
//
//    public Node() {
//
//    }
//}
//class Check{
//    public void  h(){
//        Node<Integer> integerNode = new Node<>(1, new Node<>(1, null));
//        Node<Integer> integerNode2 = new Node<>(2,null);
//        Node<Integer> integerNode3 = new Node<>(1, null);
//        System.out.println(integerNode);
//        System.out.println(integerNode2);
//        System.out.println(integerNode3);
//        System.out.println("integerNode:"+integerNode.getClass().getName()+ "@" + Integer.toHexString(integerNode.hashCode()));
//        System.out.println("integerNode2:"+integerNode2.getClass().getName()+ "@" + Integer.toHexString(integerNode2.hashCode()));
//        System.out.println("integerNode3:"+integerNode3.getClass().getName()+ "@" + Integer.toHexString(integerNode3.hashCode()));
//        System.out.println("integerNodeInner:"+integerNode.getClass().getName()+ "@" + Integer.toHexString(integerNode.next.hashCode()));
//    }
//
//
//
//}
//class tect{
//    public static void main(String[] args) {
//        Check check = new Check();
//            check.h();
//    }
//}
class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node() {
        this(null, null);
    }

    //    @Override
//    public String toString() {
//        return "(" + this.data + "," + (this.next != null ? "0x" + Integer.toHexString(System.identityHashCode(this.next)) : "null") + ")";
//    }
    public String toString() {
        return "(" + this.data + "," + (this.next != null ? this.next.getClass().getName() + "@" + Integer.toHexString(this.next.hashCode()) : "null") + ")";
    }
//     public String toString() {
//         return "(" + this.data + "," + (this.next != null ? super.toString() : "null") + ")";
//     }
}


class Main {
    public static void main(String[] args) {
        Node<Integer> integerNode1 = new Node<>(2, null);
        Node<Integer> integerNode2 = new Node<>(1, integerNode1);
        Node<Integer> integerNode3 = new Node<>(3, new Node<>(5, null));
        Node<Integer> integerNode4 = new Node<>(1, integerNode3);
        Node<Integer> integerNode5 = new Node<>(2, integerNode4);
        Node<Integer> integerNode6 = new Node<>(1, integerNode5);
        System.out.println(integerNode1);
        System.out.println(integerNode2);
        System.out.println(integerNode3);
        System.out.println(integerNode4);
        System.out.println(integerNode5);
        System.out.println(integerNode6);
        System.out.println("__________________");
        System.out.println(
                "正确地址：\n" +
                        "Node@4554617c\n" +
                        "Node@74a14482\n" +
                        "Node@1540e19d\n" +
                        "Node@677327b6\n" +
                        "Node@14ae5a5\n" +
                        "Node@7f31245a");
    }
}
