package utilities;

public class BSTreeNode<E> {
    private E element;
    private BSTreeNode<E> left;
    private BSTreeNode<E> right;

    public BSTreeNode(E element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public BSTreeNode(E element, BSTreeNode<E> left, BSTreeNode<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
    
    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public BSTreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(BSTreeNode<E> left) {
        this.left = left;
    }

    public BSTreeNode<E> getRight() {
        return right;
    }

    public void setRight(BSTreeNode<E> right) {
        this.right = right;
    }

    public boolean hasLeftChild() {
        if (left == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasRightChild() {
        if (right == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isLeaf() {
        return !hasLeftChild() && !hasRightChild();
    }

    public int getNumberNodes() {
        int leftCount = 0;
        int rightCount = 0;
        if (hasLeftChild()) {
            leftCount = left.getNumberNodes();
        }
        if (hasRightChild()) {
            rightCount = right.getNumberNodes();
        }
        return 1 + leftCount + rightCount;
    }

    public int getHeight() {
        int leftHeight = 0;
        int rightHeight = 0;
        if (hasLeftChild()) {
            leftHeight = left.getHeight();
        }
        if (hasRightChild()) {
            rightHeight = right.getHeight();
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int getHeight(BSTreeNode<E> node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }
}
