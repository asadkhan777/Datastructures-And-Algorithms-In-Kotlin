package com.asadkhan.algorithms.searching

import org.junit.jupiter.api.Test

class LinearSearchTest {
  
  private val listToSearch = arrayListOf(Node("A"), Node("B"), Node("C"), Node("D"))
  
  
  @Test
  fun `Element present && valid index returned`() {
    val nodeToFind = Node("C")
    val index = LinearSearch.run(nodeToFind, listToSearch)
    assert(index >= 0)
  }
  
  @Test
  fun `Element not present && -1 index returned`() {
    val nodeToFind = Node("E")
    val index = LinearSearch.run(nodeToFind, listToSearch)
    assert(index < 0)
  }
  
  @Test
  fun `List is empty && -1 index returned`() {
    val nodeToFind = Node("A")
    val index = LinearSearch.run(nodeToFind, arrayListOf())
    assert(index < 0)
  }
  
  @Test
  fun `Node is null && -1 index returned`() {
    val nodeToFind = Node(null)
    val index = LinearSearch.run(nodeToFind, listToSearch)
    assert(index < 0)
  }
  
  @Test
  fun `List is empty, Node is null && -1 index returned`() {
    val nodeToFind = Node(null)
    val index = LinearSearch.run(nodeToFind, arrayListOf())
    assert(index < 0)
  }
  
  @Test
  fun `First element re-searched && correct index returned`() {
    val indexOriginal = 0
    val nodeToFind = listToSearch[indexOriginal]
    val indexCalculated = LinearSearch.run(nodeToFind, listToSearch)
    assert(indexCalculated == indexOriginal)
  }
}