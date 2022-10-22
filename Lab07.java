public class Lab7 {
    /**
     * Definition of a LinkedList*
     */
    public static class LLN {
        int val;
        LLN next;

        LLN() {
        }

        LLN(int val) {
            this.val = val;
        }

        LLN(int val, LLN next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * head of the LinkedList*
     */
    private LLN head;

    /**
     * Initialize a new head*
     */
    public Lab7() {
        head = new LLN();
    }

    /**
     * Helper function to quickly add a new node to the end of the list*
     *
     * @param value new node's value
     */
    public void add(int value) {
        LLN node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new LLN(value);
    }

    /**
     * Print out the head LinkedList*
     */
    private void print() {
        print(head);
    }

    /**
     * Helper function to print out given LinkedList*
     *
     * @param node given node containing the LinkedList info
     */
    public void print(LLN node) {
        StringBuilder result = new StringBuilder();
        LLN temp = node;
        while (temp != null) {
            result.append(temp.val).append("->");
            temp = temp.next;
        }
        result.append("NULL");
        System.out.println(result);
    }

    /**
     * Calls the public version of listOps(LLN head, int[] operations) function*
     *
     * @param operations array of operations number
     * @return the LinkedList after performed given ops
     */
    private LLN listOps(int[] operations) {
        return listOps(head, operations);
    }

    /**
     * TODO *
     *
     * @param head
     * @param operations
     * @return
     */
    public LLN listOps(LLN head, int[] operations) {
        //TODO complete this function, remove this line when you start
        throw new UnsupportedOperationException("Not yet implemented, remove this line when you start");
    }

    /**
     * TODO*
     *
     * @param head
     * @return
     */
    public LLN opsZero(LLN head) {
        //TODO complete this function, remove this line when you start
        throw new UnsupportedOperationException("Not yet implemented, remove this line when you start");

    }

    /**
     * TODO*
     *
     * @param head
     * @return
     */
    public LLN opsOne(LLN head) {
        //TODO complete this function, remove this line when you start
        throw new UnsupportedOperationException("Not yet implemented, remove this line when you start");

    }

    /**
     * TODO*
     *
     * @param head
     * @return
     */
    public LLN opsTwo(LLN head) {
        //TODO complete this function, remove this line when you start
        throw new UnsupportedOperationException("Not yet implemented, remove this line when you start");

    }

    public static void main(String[] args) {
        Lab7 lln = new Lab7();
        lln.add(1);
        lln.add(2);
        lln.add(3);
        lln.add(4);
        lln.add(5);
        lln.print();// 0->1->2->3->4->5->NULL

        //Reverse whole list
        LLN ret;
        ret = lln.listOps(new int[]{1});
        lln.print(ret);//5->4->3->2->1->0->NULL

        //Test your code here
        //......

    }
}
