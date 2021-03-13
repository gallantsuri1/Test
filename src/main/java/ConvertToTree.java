public class ConvertToTree {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        Node h = loadTree(arr, 0);
        System.out.println(h.toString());

    }
    private static Node loadTree(int[] arr, int index){
        Node n=null;
        if (index < arr.length) {
            n = new Node(arr[index]);
            n.setLeft(loadTree(arr, 2 * index + 1));
            n.setRight(loadTree(arr,  2 * index + 2));
        }
        return n;
    }
}
//{value=1, left={value=2, left={value=4, left=null, right=null}, right={value=5, left=null, right=null}}, right={value=3, left={value=6, left=null, right=null}, right=null}}
//{value=1, left={value=2, left={value=4, left=null, right=null}, right={value=5, left=null, right=null}}, right={value=3, left={value=6, left=null, right=null}, right=null}}

class Node{
    private int value;
    private Node left;
    private Node right;

    public Node(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                "}";
    }
}

