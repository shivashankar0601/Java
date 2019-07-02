//left view and level order traversal techniques

#include<bits/stdc++.h>
using namespace std;

struct node
{
    int data;
    struct node * left;
    struct node * right;
};

void levelOrderTraversal (struct node * root)
{
    if(root==NULL)
        return;
    if(root->left==NULL && root->right==NULL)
    {
        cout<<root->data<<endl;
        return;
    }
    
    std::queue<struct node *> st;
    st.push(root);
    struct node * temp;
    while(st.size())
    {
        temp=st.front();
        st.pop();
        cout<<temp->data<<" ";
        if(temp->left!=NULL)
            st.push(temp->left);
        if(temp->right!=NULL)
            st.push(temp->right);
    }
}

void treeLeftViewTraversal (struct node * root)
{
    if(root==NULL)
        return;
    if(root->left==NULL && root->right==NULL)
    {
        cout<<root->data<<endl;
        return;
    }
    
    queue <struct node *> s,t,p;
    s.push(root);
    struct node * temp;
    int c=0;
    while(s.size())
    {
        temp=s.front();
        if(c==0)
        {
            cout<<temp->data<<" ";
            c=1;
        }

        s.pop();
        if(temp->left!=NULL)
            t.push(temp->left);
        if(temp->right!=NULL)
            t.push(temp->right);
        if(s.size()==0)
        {
            c=0;
            p=s;
            s=t;
            t=p;
        }
    }
    
    
    
}


int main()
{
    struct node * root = (struct node *) malloc(sizeof(struct node));
    root->data=10;
    root->left = (struct node *) malloc(sizeof(struct node));
    root->left->data=20;
    root->right = (struct node *) malloc(sizeof(struct node));
    root->right->data=30;
    root->left->left = (struct node *) malloc(sizeof(struct node));
    root->left->left->data=40;
    root->right->left = (struct node *) malloc(sizeof(struct node));
    root->right->left->data=70;
    root->right->left->right = (struct node *) malloc(sizeof(struct node));
    root->right->left->right->data=50;
    
    levelOrderTraversal(root);
    cout<<endl<<endl;
    
    treeLeftViewTraversal(root);;
    return 0;
}
