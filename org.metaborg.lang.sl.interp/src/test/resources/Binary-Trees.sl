/* The Computer Language Benchmarks Game
   http://benchmarksgame.alioth.debian.org/
   contributed by Isaac Gouy */

function mkTreeNode(left, right, item){
  tree = new();
  tree.left = left;
  tree.right = right;
  tree.item = item;
}


function itemCheck(tree) {
  if(tree == null()) {
    return tree.item;
  } else {
    return tree.item + itemCheck(tree.left) - itemCheck(tree.right);
  }
}

function bottomUpTree(item,depth){
  if(depth > 0){
    return mkTreeNode(bottomUpTree(2 * item - 1, depth - 1), bottomUpTree(2 * item, depth - 1), item);
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
  n = 12; // 16 // 20
  maxDepth = max(minDepth + 2, n);
  stretchDepth = maxDepth + 1;
  
 
  check = (bottomUpTree(0,stretchDepth).itemCheck());
  print("stretch tree of depth " + stretchDepth + "\t check: " + check);
  
  longLivedTree = bottomUpTree(0, maxDepth);
  
  depth = minDepth;
  while(depth <= maxDepth) {
    // iterations = 1 << (maxDepth - depth + minDepth);
    iterations = (maxDepth - depth + minDepth) * 2;
    check = 0;
    i = 1;
    while(i <= iterations) {
      check = check + bottomUpTree(i,depth).itemCheck();
      check = check + bottomUpTree(i * -1,depth).itemCheck();
      i = i + 1;
    }
    depth = depth + 2;
  }
  
  print("long lived tree of depth " + maxDepth + "\t check: " + longLivedTree.itemCheck());
  
}

function null() {
}