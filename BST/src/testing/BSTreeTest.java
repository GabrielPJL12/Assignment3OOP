package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import exceptions.TreeException;
import utilities.BSTree;

class BSTreeTest {
	@Test
	public void testGetRoot() throws TreeException {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		assertEquals(5, tree.getRoot().getElement());
	}

	@Test
	public void testGetHeight() {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		assertEquals(3, tree.getHeight());
	}

	@Test
	public void testSize() {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		assertEquals(5, tree.size());
	}

	@Test
	public void testIsEmptyTrue() {
		BSTree<Integer> tree = new BSTree<Integer>();
		assertTrue(tree.isEmpty());
	}

	@Test
	public void testIsEmptyFalse() {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		assertFalse(tree.isEmpty());
	}

	@Test
	public void testClear() {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		tree.clear();
		assertTrue(tree.isEmpty());
	}

	@Test
	public void testContainsTrue() throws TreeException {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		assertTrue(tree.contains(7));
	}

	@Test
	public void testContainsFalse() throws TreeException {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		assertFalse(tree.contains(6));
	}

	@Test
	public void testSearchPresent() throws TreeException {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		assertEquals(7, tree.search(7).getElement());
	}

	@Test
	public void testSearchAbsent() throws TreeException {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		assertNull(tree.search(6));
	}

	@Test
	public void testAdd() throws TreeException {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		assertTrue(tree.contains(7));
	}

	@Test
	public void testAddNull() throws TreeException {
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(4);
		assertFalse(tree.contains(6));
	}

	@Test
	public void testInorderIterator() {
		// TODO: implement this test
		throw new UnsupportedOperationException();
	}

	@Test
	public void testPreorderIterator() {
		// TODO: implement this test
		throw new UnsupportedOperationException();
	}

	@Test
	public void testPostorderIterator() {
		// TODO: implement this test
		throw new UnsupportedOperationException();
	}
}
