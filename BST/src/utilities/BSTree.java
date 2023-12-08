package utilities;

import adt.BSTreeADT;
import exceptions.TreeException;

public class BSTree<E extends Comparable<? super E>> implements BSTreeADT<E> {
    private BSTreeNode<E> root;

    public BSTree() {
        root = null;
    }

    public BSTree(BSTreeNode<E> root) {
        this.root = new BSTreeNode<E>(root.getElement(), null, null);
    }

    @Override
    public BSTreeNode<E> getRoot() throws TreeException {
        return root;
    }

    @Override
    public int getHeight() {
        if (root == null) {
            return 0;
        } else {
            return root.getHeight();
        }
    }

    @Override
    public int size() {
        if (root == null) {
            return 0;
        } else {
            return root.getNumberNodes();
        }
    }

    @Override
    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public boolean contains(E entry) throws TreeException {
        return contains(entry, root);
    }

    private boolean contains(E entry, BSTreeNode<E> node) {
        if (node == null) {
            return false;
        } else if (entry.compareTo(node.getElement()) == 0) {
            return true;
        } else if (entry.compareTo(node.getElement()) < 0) {
            return contains(entry, node.getLeft());
        } else {
            return contains(entry, node.getRight());
        }
    }

    @Override
    public BSTreeNode<E> search(E entry) throws TreeException {
        return search(entry, root);
    }

    private BSTreeNode<E> search(E entry, BSTreeNode<E> node) throws TreeException {
        if (node == null) {
            return null;
        } else if (entry.compareTo(node.getElement()) == 0) {
            return node;
        } else if (entry.compareTo(node.getElement()) < 0) {
            return search(entry, node.getLeft());
        } else if (entry.compareTo(node.getElement()) > 0) {
            return search(entry, node.getRight());
        } else {
            throw new TreeException("no such element in tree");
        }
    }

    @Override
    public boolean add(E newEntry) throws NullPointerException {
        if (newEntry == null) {
            throw new NullPointerException("Null entry passed to add method");
        } else {
            root = add(newEntry, root);
            return true;
        }
    }

    private BSTreeNode<E> add(E newEntry, BSTreeNode<E> node) {
        if (node == null) {
            node = new BSTreeNode<E>(newEntry, null, null);
        } else if (newEntry.compareTo(node.getElement()) < 0) {
            node.setLeft(add(newEntry, node.getLeft()));
        } else {
            node.setRight(add(newEntry, node.getRight()));
        }
        return node;
    }

    @Override
    public Iterator<E> inorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inorderIterator'");
    }

    @Override
    public Iterator<E> preorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preorderIterator'");
    }

    @Override
    public Iterator<E> postorderIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postorderIterator'");
    }
}
