void 
void balanceTree(TreeNode t1, TreeNode t2) {
    int t1Val = 0;
    int t2Val = 0;
    if (t1 != null) {
        t1Val = t1.val;
    }
    if (t2 != null) {
        t2Val = t2.val;
    }
    TreeNode m = new TreeNode():
    m.val = t1Val + t2Val;
    m.left = balanceTree(t1.left, t2.left);
    m.right = balanceTree(t1.right, t2.right);
}

