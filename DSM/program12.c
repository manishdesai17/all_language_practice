#include<stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *next;
};
struct node *insert(struct node *head)
{
    struct node *n,*c,*p;
    int ele;
    n=(struct node *)malloc(sizeof(struct node));
    printf("\nEnter element:");
    scanf("%d",&ele);
    n->data=ele;
    if(head==NULL)
    {
        n->next=NULL;
        head=n;
    }
    return head;
}
void dis(struct node *head)
{
    struct node *temp=head;
    if(head==NULL)
    {
        printf("Element not present is empty...!");
    }
    else
    {
     while(temp!=NULL)
     { 
        printf("%d",temp->data);
        temp=temp->next;
     }
    }
}
void main()
{
    struct node *head=NULL;
    int c;
    do{
        printf("\n1.insert");
        printf("\n2.exit");
        printf("\nEnter choice:");
        scanf("%d",&c);
        switch (c)
        {
        case 1:head=insert(head);
               dis(head);
               break;

        case 2:break;
        
        default:printf("Enter valid choice:");
            break;
        }
    }
    while(c!=2);
}