#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node 
{
    int data;
    struct node *next;
};
struct node *insert(struct node *head,int ele)
{
    struct node *c,*p,*n;
    n=(struct node *)malloc(sizeof(struct node ));
    c=head;
    p=NULL;
    n->data=ele;
    if(head==NULL)
    {
      n->next=n;
      head=n;
    }
    else
    {
        while(c->data<ele)
        {
            p=c;
            c=c->next;
        }
        if(c==head)
        {
            n->next=head;
            head->next=n;
        }
    }
    return head;
}
void display(struct node *head)
{
    struct node *temp;
    temp=head->next;
    printf("%d",head->data);
    while(temp!=head)
    {
        printf(" %d ",temp->data);
        temp=temp->next;
    }
}
int main()
{
     int c, ele;
    struct node *head = NULL;
    do
    {
        printf("\n1.push");
        printf("\n2.remove");
        printf("\n3.modify");
        printf("\n4.Display");
        printf("\n5.exit");
        printf("\nEnter choice:");
        scanf("%d", &c);
        switch(c)
        {
         case 1:printf("Enter element:");
                scanf("%d",&ele);
                head=insert(head,ele);
                display(head);
                break;
        case 2:break;
        }
    }while(c!=2);
    return 0;
}