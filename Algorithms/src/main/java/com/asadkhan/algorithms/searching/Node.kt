package com.asadkhan.algorithms.searching

object LinearSearch {
  
  fun run(nodeToFind: Node<*>, list: List<Node<*>>): Int {
    if (nodeToFind.value == null || list.isNullOrEmpty()) {
      return -1
    } else {
      for (node in list) {
        if (nodeToFind == node) {
          return list.indexOf(node)
        }
      }
    }
    return -1
  }
}

data class Node<T : Any?>(val value: T?)
