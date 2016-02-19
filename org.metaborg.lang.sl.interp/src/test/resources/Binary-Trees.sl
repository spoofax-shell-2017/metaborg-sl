/* The Computer Language Benchmarks Game
   http://benchmarksgame.alioth.debian.org/
   contributed by Isaac Gouy */

function mkTreeNode(left, right, item){
  tree = new();
  tree.left = left;
  tree.right = right;
  tree.item = item;
  return tree;
}

function itemCheck(tree) {
  if(tree.left == null()) {
    return tree.item;
  } else {
    return tree.item + itemCheck(tree.left) - itemCheck(tree.right);
  }
}

function bottomUpTree(item, depth){
  if(depth > 0) {
    return mkTreeNode(
      bottomUpTree(2 * item - 1, depth - 1),
      bottomUpTree(2 * item, depth - 1),
      item);
  } else {
    return mkTreeNode(null(), null(), item);
  }
}

function max(n1, n2){
  if(n1 > n2){
    return n1;
  } else {
    return n2;
  }
}

function main() {
  minDepth = 4;
  n = 12; // 16; // 20
  maxDepth = max(minDepth + 2, n);
  stretchDepth = maxDepth + 1;
  
 
  check = itemCheck(bottomUpTree(0, stretchDepth));
  println("stretch tree of depth " + stretchDepth + " check: " + check);
  
  longLivedTree = bottomUpTree(0, maxDepth);
  
  depth = minDepth;
  while(depth <= maxDepth) {
    iterations = (maxDepth - depth + minDepth) * 2;
    check = 0;
    i = 1;
    while(i <= iterations) {
      check = check + itemCheck(bottomUpTree(i, depth));
      check = check + itemCheck(bottomUpTree((0 - 1) * i, depth));
      i = i + 1;
    }
    println(iterations * 2 + " trees of depth " + depth + " check: " + check);
    
    depth = depth + 2;
  }
  
  println("long lived tree of depth " + maxDepth + " check: " + itemCheck(longLivedTree));
}

function null() {
}